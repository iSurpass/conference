package com.youkeda.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Juniors
 */
@Controller
public class Hello {

    @RequestMapping("/hello")
    public String hello(){

        return "hello Juniors!";
    }
}
