package com.Exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @date 2020/9/25 0:26
 */
public class CutomExcptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        // 解析出异常类型
        CustomExcption customExcption;
        // 若该异常类型是系统自定义的异常，直接取出异常信息在错误页面展示即可。
        if(e instanceof CustomExcption){
            customExcption = (CustomExcption)e;
        }else{
            // 如果不是系统自定义异常，构造一个系统自定义的异常类型，信息为“未知错误”
            customExcption = new CustomExcption("未知错误");
        }
        //错误信息
        String message = customExcption.getMessage();
        ModelAndView modelAndView = new ModelAndView();
        //将错误信息传到页面
        modelAndView.addObject("message",message);
        //指向错误页面
        modelAndView.setViewName("showerror");
        return modelAndView;
    }
}
