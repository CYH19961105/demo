package com.example.demo.mapper;

import com.example.demo.pojo.UserTable;
import com.example.demo.pojo.UserTableExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserTableMapper {
    int countByExample(UserTableExample example);

    int deleteByExample(UserTableExample example);

    int insert(UserTable record);

    int insertSelective(UserTable record);

    List<UserTable> selectByExample(UserTableExample example);

    int updateByExampleSelective(@Param("record") UserTable record, @Param("example") UserTableExample example);

    int updateByExample(@Param("record") UserTable record, @Param("example") UserTableExample example);
}