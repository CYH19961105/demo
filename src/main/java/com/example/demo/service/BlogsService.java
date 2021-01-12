package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.BlogsTableMapper;
import com.example.demo.pojo.BlogsTable;
import com.example.demo.pojo.BlogsTableExample;
import com.example.demo.pojo.UserTable;

@Service
public class BlogsService {
	@Autowired
	BlogsTableMapper mapper;
	
	//新增博客
	public int insertblogs(BlogsTable blogs,int i) {
		blogs.setBlogsCreattime(new Date());
		blogs.setBlogsUserid(i);
		return mapper.insertSelective(blogs);
	}
	//删除博客
	public int deleteblogs(int blogsId) {
		return mapper.deleteByPrimaryKey(blogsId);
	}
	//更新博客
	public int updateblogs(BlogsTable blogs) {
		return mapper.updateByPrimaryKeySelective(blogs);
	}
	//查询用户的全部博客
	public List<BlogsTable> selectuserall(UserTable user){
		BlogsTableExample example=new BlogsTableExample();
		example.createCriteria().andBlogsUseridEqualTo(user.getUserId());
		return mapper.selectByExample(example);
	}
	//根据博客类型查询用户博客
	public List<BlogsTable> selecttypeall(UserTable user,String type){
		BlogsTableExample example=new BlogsTableExample();
		example.createCriteria().andBlogsUseridEqualTo(user.getUserId()).andBlogsTypeEqualTo(type);
		return mapper.selectByExample(example);
	}
	//根据ID查询博客
	public BlogsTable selectone(int id) {
		return mapper.selectByPrimaryKey(id);
	}
	//根据姓名模糊查询博客
	public List<BlogsTable> selectlikename(UserTable user,String name){
		BlogsTableExample example=new BlogsTableExample();
		example.createCriteria().andBlogsUseridEqualTo(user.getUserId()).andBlogsTitleLike(name);
		return mapper.selectByExample(example);
	}
	
}
