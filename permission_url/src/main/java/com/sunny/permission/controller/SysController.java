package com.sunny.permission.controller;

import com.sunny.permission.entry.ActiveUser;
import com.sunny.permission.exception.BaseException;
import com.sunny.permission.service.SysService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class SysController {
    @Autowired
    private SysService sysService;
    /**
     * 用户登录
     * @param session
     * @param usercode
     * @param password
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpSession session,String randomcode,String usercode,String password){
        //从session中获取验证码，防止恶意攻击
       /*  String validate = session.getAttribute("validate").toString();
        if(!StringUtils.equals(randomcode,validate)){
            throw new BaseException("验证码错误");
        }*/
        ActiveUser activeUser = sysService.authenticat(usercode, password);
        session.setAttribute("activeUser",activeUser);

        return  "redirect:/first.html";
    }

    @RequestMapping("/logintest")
    public String loginTest(String usercode,String password){
        System.out.println(usercode);
        System.out.println(password);
        return  "redirect:/first.html";
    }

}
