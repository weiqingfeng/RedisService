package com.redis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weiqingfeng on 2017/12/1.
 */
@RestController
@RequestMapping(value = "Api")
public class ApiController {

    @RequestMapping(value = "index")
    public String index(){
        return "hello this is redis service ";
    }
}
