package com.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author wangzihang
 * @createTime 2019/2/19
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, Integer age) {
        jdbcTemplate.update("insert into wzh_user(NAME, AGE) value (?, ?)",name, age);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("delete from wzh_user where NAME = ?", name);
    }

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from wzh_user", Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("truncate table wzh_user");
    }
}
