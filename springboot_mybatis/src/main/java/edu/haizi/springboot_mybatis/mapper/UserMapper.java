package edu.haizi.springboot_mybatis.mapper;

import edu.haizi.springboot_mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}