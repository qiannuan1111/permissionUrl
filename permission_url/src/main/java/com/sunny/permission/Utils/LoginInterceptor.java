package com.sunny.permission.Utils;

import com.sunny.permission.entry.ActiveUser;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.InvocationHandler;
import java.net.URL;

/*@Component*/
public class LoginInterceptor extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取请求路径
        String requestURI = request.getRequestURI();
        //判断是否是公开地址
        //实际开发中需要将公开地址配置在配置文件中
        //从配置文件中取出可以匿名访问的URL
        //URL anonymousURL = ResourceUtils.getURL("anonymousURL");

        HttpSession session = request.getSession();
        /*String usercode = (String) session.getAttribute("usercode");
        String password = (String) session.getAttribute("password");
        if(StringUtils.isEmpty(usercode) || StringUtils.isEmpty(password)){
            request.getRequestDispatcher("/login.html").forward(request,response);
            return false;
        }*/
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        if(activeUser == null){
            return false;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
}
