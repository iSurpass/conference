package com.youkeda.web.controller;

import com.youkeda.web.result.Result;
import com.youkeda.web.utils.HandleData;
import com.youkeda.web.vo.DataVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Juniors
 */
@RestController
public class Hello {

    @RequestMapping(path = "/hello")
    public ModelAndView hello(){

        return new ModelAndView("redirect:head.html");
    }

    @RequestMapping(path = "/compute")
    @ResponseBody
    public Result compute(DataVo vo){

        String code = vo.getCode();
        Result result = new Result();

        System.out.println(code);
        int des = HandleData.handle(code);

        result.setStatus("成功");
        result.setData(String.valueOf(des));


        return result;
    }

    @RequestMapping(path = "/success")
    public ModelAndView success(){
        return new ModelAndView("redirect:success.html");
    }
}
