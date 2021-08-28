package com.example.service.impl;

import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public Map getUser(String id){
        Map rsultMap= userMapper.getUser(id);
        return   rsultMap;
    }

//    @Override
//    public void save() {
//        this.save1();
//        this.save2();
//    }
//
//    @Override
//    public void save1() {
//        Map<String,Object> paramMap =new HashMap();
//        paramMap.put("UPID","112731");
//        paramMap.put("UPASS","XXXXX");
//        userMapper.save(paramMap);
//    }
//
//    @Override
//    public void save2() {
//        Map<String,Object> paramMap =new HashMap();
//        paramMap.put("UPID","119893");
//        paramMap.put("UPASS","YYYYY");
//        userMapper.save(paramMap);
//    }
}
