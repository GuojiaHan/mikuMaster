package com.bone.miku.test.controller;

import com.bone.miku.common.password.MD5;
import com.bone.miku.test.model.SysUsers;
import com.bone.miku.test.service.SysUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLOutput;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SysUsersService service;

    private static String PREFIX = "/";

    @RequestMapping("/login")
    @ResponseBody
    public Object loginPage() {
        List<SysUsers> list = service.list();
        return list;
    }

    @RequestMapping("turn2Login")
    public String lginPage2() {
        return "login.html";
    }

    @RequestMapping(value = "testSMS4")
    @ResponseBody
    public Object testSmS4() {
        try {
            String result = MD5.md5("GuojiaHan", "");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return "失败，" + e.getMessage();
        }
    }
}
