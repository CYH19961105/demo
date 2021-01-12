package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.other.ResultUtil;
import com.example.demo.pojo.BlogsTable;
import com.example.demo.pojo.UserTable;
import com.example.demo.service.BlogsService;

@RestController
public class BlogsController {
	
	@Autowired
	BlogsService service; 
	//发布博客
	@PostMapping("/blogs/addone")
	public ResultUtil addBlogs(BlogsTable blogs,HttpSession session) {	
//		(UserTable)session.getAttribute("user")
		int result = service.insertblogs(blogs,1 );
		return (result==0)?(ResultUtil.fail()):(ResultUtil.success());
	}

}
