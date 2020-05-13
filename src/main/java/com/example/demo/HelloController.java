package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: rqxiao
 * @Date: 2019-9-5 09:21
 * @Description:
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(String a) {
        return "AAAb" + a;

    }

}
