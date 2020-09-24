package com.controller;

import com.Exception.CustomExcption;
import com.entiy.Msg;
import com.entiy.Staff;
import com.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * @date 2020/9/25 0:28
 */
@Controller
public class StaffController {
    @Autowired
    StaffService staffService;

    //统一处理异常
    @RequestMapping("/test")
    public String testError() throws CustomExcption {
        try{
            int a = 2/0;
        }catch (Exception e){
            throw new CustomExcption("未知错误");
        }
        return null;
    }
    //插入员工信息
    @RequestMapping(value = "/insertStaff",method = RequestMethod.POST)
    @ResponseBody
    public Msg insertStaff(@Valid Staff staff, BindingResult result){
        if(result.hasErrors()){
            System.out.println("输入的用户名不符合要求，请重新输入！");
            return Msg.fail();
        }else{
            staffService.saveStaff(staff);
            return Msg.success();
        }
    }
    //根据id删除员工数据
    @RequestMapping(value = "/delete/{id}")
    @ResponseBody
    public Msg deleteStaff(@PathVariable("id") String id){
        Integer staff_id = Integer.parseInt(id);
        staffService.deleteStaff(staff_id);
        return Msg.success();
    }
    //修改员工信息
    @RequestMapping(value = "/updateStaff/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public Msg updateStaff(Staff staff, HttpServletRequest request){
        staffService.updateStaff(staff);
        return Msg.success();
    }
    //根据id查询员工信息测试
    @RequestMapping(value = "/selectStaff/{id}",method=RequestMethod.GET)
    @ResponseBody
    public Msg selectStaff(@PathVariable("id") Integer id) {
        Staff staff = staffService.getStaff(id);
        return Msg.success().add("enp",staff);
    }

}
