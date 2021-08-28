package com.example.mapper;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {

    Map getUser(String id);

    void save(Map<String,Object> paramMap);
}
