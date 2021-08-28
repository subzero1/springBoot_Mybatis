package com.example.service.impl;

import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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

    @Override
    public void save() throws Exception {
        this.save1();
        this.save2();
    }

    @Override
    public void save1() throws Exception{
        Map<String,Object> paramMap =new HashMap();
        paramMap.put("UPID","2035");
        paramMap.put("UPASS","aaaa");
        userMapper.save(paramMap);
    }

    @Override
    public void save2() throws Exception {
        Map<String,Object> paramMap =new HashMap();
        paramMap.put("UPID","2036");
        paramMap.put("UPASS","bbbb");
        userMapper.save(paramMap);
        throw new Exception("事务抛出异常测试");
    }
}
