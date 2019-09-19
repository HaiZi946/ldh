package edu.haizi.springboot_mybatis_annotations.mapper;

import edu.haizi.springboot_mybatis_annotations.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> queryUserList();
}