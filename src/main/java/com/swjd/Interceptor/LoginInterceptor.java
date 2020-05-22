package com.swjd.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri=request.getRequestURI();
        if (uri.indexOf("login")>0||uri.indexOf("Login")>0){
            return true;
        }
        if (uri.indexOf("main")>0||uri.indexOf("Main")>0){
            return true;
        }

        HttpSession session=request.getSession();
        if (session.getAttribute("activeName")!=null){
            return true;
        }

        request.getRequestDispatcher("toLogin").forward(request,response);
        return false;
    }
}
