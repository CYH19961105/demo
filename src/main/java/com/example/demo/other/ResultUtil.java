package com.example.demo.other;

public class ResultUtil {
	
	//提示信息
	private String msg;
	//具体内容
	private Object data;
	//返回状态码
	private int code;
	
	public static final int SUCCESS = 1;
	public static final int FAIL = 0;
	
	public static ResultUtil success(Object object){
		ResultUtil resultUtil=new ResultUtil();
		resultUtil.setData(object);
		resultUtil.setCode(SUCCESS);
		resultUtil.setMsg("success");
		return resultUtil;
	}
	public static ResultUtil success(){	
		return success(null);
	}
	
	public static ResultUtil fail(){
		ResultUtil resultUtil=new ResultUtil();
		resultUtil.setCode(FAIL);
		resultUtil.setMsg("fail");
		return resultUtil;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
}
