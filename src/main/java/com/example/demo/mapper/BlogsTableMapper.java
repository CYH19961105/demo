package com.example.demo.mapper;

import com.example.demo.pojo.BlogsTable;
import com.example.demo.pojo.BlogsTableExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BlogsTableMapper {
    int countByExample(BlogsTableExample example);

    int deleteByExample(BlogsTableExample example);

    int deleteByPrimaryKey(Integer blogsId);

    int insert(BlogsTable record);

    int insertSelective(BlogsTable record);

    List<BlogsTable> selectByExampleWithBLOBs(BlogsTableExample example);

    List<BlogsTable> selectByExample(BlogsTableExample example);

    BlogsTable selectByPrimaryKey(Integer blogsId);

    int updateByExampleSelective(@Param("record") BlogsTable record, @Param("example") BlogsTableExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogsTable record, @Param("example") BlogsTableExample example);

    int updateByExample(@Param("record") BlogsTable record, @Param("example") BlogsTableExample example);

    int updateByPrimaryKeySelective(BlogsTable record);

    int updateByPrimaryKeyWithBLOBs(BlogsTable record);

    int updateByPrimaryKey(BlogsTable record);
}