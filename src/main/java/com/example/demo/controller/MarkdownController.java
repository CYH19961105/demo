package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.util.DateUtils;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MarkdownController {
    
	 //文件上传的物理保存路径，大家根据自己实际情况设置就行 C:/Users/czj/Desktop/dipImage/
    //注意：如果不是保存在项目默认的静态资源目录，需要设置项目静态资源目录哦 比如我这里就要设置，否则会显示不出来图片的，如何设置见下文
//    @Value("${upload.filePath}")
    public static String filePath="E:/图片存储/";
    //文件显示的项目路径  http://localhost:${server.port}/ 如果有域名就改成http://域名/
//    @Value("${project.path}")
    public String projectPath="http://localhost:8080/";

    //editorMd上传图片 需要说明的是，返回值不能乱写，只能是Map，Map里面也不能乱写，包括数据类型
    //甚至editormd-image-file也不能乱写，除非修改editor.md的源码，是可以改的，我没去找哪儿改，嫌麻烦，有兴趣的小伙伴改完告诉我最好了 哼哼...
    @RequestMapping(value = "/uploadImg")
    public @ResponseBody
    Map<String, Object> upload(@RequestParam(value = "editormd-image-file", required = false) MultipartFile file) {
        return this.uploadImg(file);
    }

    //具体的返回值Map请看这里
    public Map<String, Object> uploadImg(MultipartFile file) {
        String filename = file.getOriginalFilename();
        if (null == filename) {
            throw new RuntimeException("图片不存在");
        }
        // 定义上传文件保存路径 年份 + 月份 + 日期 + 文件名 我这里是将图片重命名了，并且每天的图片分开保存在不同的目录，防止同一目录图片过多导致卡顿，但是没有做图片去重，md5 base64啥的小伙伴们自己去搞哈
        int year = DateUtils.year(Calendar.getInstance());
        int month = DateUtils.month(Calendar.getInstance());
        int date = DateUtils.day(Calendar.getInstance());
        String newPath = year + "/" + month + "/" + date + "/";
//        String path = filePath + newPath;
        String path = filePath;

        // 新建文件目录
        File uploadFile = new File(path, filename);
        // 判断路径是否存在，如果不存在就创建一个
        if (!uploadFile.getParentFile().exists()) {
            uploadFile.getParentFile().mkdirs();
        }

        Map<String, Object> resultMap = new HashMap<String, Object>();
        //文件上传
        try {
            file.transferTo(uploadFile);
            resultMap.put("success", 1);//这里还不能返回"1"，即字符串1，好坑啊，不知道为什么...
            resultMap.put("message", "上传成功！");
        } catch (IOException e) {
            e.printStackTrace();
            resultMap.put("success", 0);
            resultMap.put("message", "文件上传失败！");
        }
        int success = Integer.parseInt(resultMap.get("success").toString());
        if (success == 1) {
            //文件重命名 时间戳 新的名字大家随意取，我这儿图简单
            long l;
            synchronized (MarkdownController.class) {
                l = System.currentTimeMillis();
            }
            String newName = l + filename.substring(filename.lastIndexOf("."));
            boolean b = uploadFile.renameTo(new File(path + newName));
            if (b) {
//                resultMap.put("url", projectPath + newPath + newName);
                resultMap.put("url", projectPath + newName);
            } else {
//                resultMap.put("url", projectPath + newPath + filename);
                resultMap.put("url", projectPath  +filename);
            }
        }
        return resultMap;
    }
}
