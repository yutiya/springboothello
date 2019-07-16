package com.zasoft.springboothello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String defaultContent() {
        return "Default Index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/index")
    public String index() {
        return "Hello index";
    }

    @RequestMapping("/getMap")
    public Map<String, Object> getMap() {
        Map<String , Object> result = new HashMap<String, Object>();
        result.put("errorCode","200");
        result.put("errorMsg","成功");
        return result;

    }
}
