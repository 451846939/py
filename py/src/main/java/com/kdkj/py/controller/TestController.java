package com.kdkj.py.controller;

import com.kdkj.py.dao.LogMapper;
import com.kdkj.py.entity.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lin
 * @create 2018-04-27 13:20
 **/
@RestController
public class TestController {
    @Resource
    LogMapper logMapper;
    @GetMapping("/test")
    public String test(){
        logMapper.insert(new Log());
        return "11111";
    }
}
