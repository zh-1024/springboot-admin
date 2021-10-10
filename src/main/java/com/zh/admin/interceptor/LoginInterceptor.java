package com.zh.admin.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName LoginInterceptor
 * @Date 2021/10/10 14:29
 * @Author zhang hui
 * @Description 登陆检查 在此之前需要配置好以下几点：
 *  1、配置好拦截器要拦截哪些请i去
 *  2、把这些配置放在容器中
 */

public class LoginInterceptor  implements HandlerInterceptor {
    /**
     * @Description: 目标方法执行以前进行的处理
     * @author zhanghui
     * @date 2021/10/10 14:31
     * @param request
     * @param response
     * @param handler
     * @return boolean
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登陆检查逻辑
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        if(user!=null)
            //用户已经登陆则放行
            return true;

        //拦截住，未登陆，跳转到登录页
        request.setAttribute("msg","请先登陆");
        request.getRequestDispatcher("/").forward(request,response);
        return false;
    }

    /**
     * @Description: 目标方法执行以后
     * @author zhanghui
     * @date 2021/10/10 14:31
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @return void
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    /**
     * @Description: 页面渲染之后
     * @author zhanghui
     * @date 2021/10/10 14:32
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return void
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
