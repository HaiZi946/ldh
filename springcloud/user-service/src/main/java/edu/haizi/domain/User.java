package edu.haizi.domain;

import lombok.Data;

import javax.persistence.Id;

@Data
public class User {
    // 主键
    @Id
    private Long id;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 姓名
    private String name;
}
