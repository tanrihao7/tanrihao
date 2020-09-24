package com.controller;

import com.Exception.CustomExcption;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class testController {
    @RequestMapping("/test")
    public String test() throws CustomExcption {
        try{
           int a = 2/0;
        }catch (Exception e){
            throw new CustomExcption("未知错误");
        }
        return null;
    }
}
