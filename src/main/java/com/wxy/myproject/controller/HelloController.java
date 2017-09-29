package com.wxy.myproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaoyu on 2017/8/31.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String getHello(){
        return "Hello World";
    }

}
