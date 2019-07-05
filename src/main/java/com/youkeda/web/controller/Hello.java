package com.youkeda.web.controller;

import com.youkeda.web.result.Result;
import com.youkeda.web.service.HandleService;
import com.youkeda.web.utils.HandleData;
import com.youkeda.web.vo.DataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Juniors
 */
@RestController
public class Hello {

    @Autowired
    HandleService handleService;

    @RequestMapping(path = "/hello")
    public ModelAndView hello(){

        return new ModelAndView("redirect:head.html");
    }

    @RequestMapping(path = "/compute")
    @ResponseBody
    public Result compute(DataVo vo){

        String code = vo.getCode();
        String capacities = vo.getCapacities();
        Result result = new Result();

        String name = handleService.task(code,capacities);
        //String name = HandleData.skr(des);

        result.setStatus("成功");
        result.setData(name);

        return result;
    }

    @RequestMapping(path = "/success")
    public ModelAndView success(){
        return new ModelAndView("redirect:success.html");
    }
}
