package com.lgh.controller;

import com.lgh.entity.PageBean;
import com.lgh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/UserController")
public class UserController {
    @Autowired
    private IUserService iUserService;

    /*TODO A6 接收请求查询数据*/
    @RequestMapping("/selectPage")
    public String selectPage(PageBean pageBean, ModelMap map){
        PageBean pageBean1 = iUserService.selectPage(pageBean);
        pageBean1.setUrl("UserController/selectPage");
        map.put("page",pageBean1);
        System.out.println(pageBean1.toString());
    return "userList";
    }
}
