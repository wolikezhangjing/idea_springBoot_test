package com.example.springboot_template_demo.interceptor;

import com.example.springboot_template_demo.controller.TemplateViewController;
import com.example.springboot_template_demo.util.LogUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.UrlPathHelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Title: DemoInterceptor
 * @Description:
 * @author: TC20014
 * @date: 2018/11/9 13:36
 * @Version: 1.0
 */
public class DemoInterceptor extends HandlerInterceptorAdapter {

    //Logger  log = LoggerFactory.getLogger(DemoInterceptor.class);
    private Logger log = LogUtils.getBussinessLogger();
    private UrlPathHelper urlPathHelper = new UrlPathHelper();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("日志记录：用户未登录，跳转至登录页面", handler);
        response.sendRedirect("login");
        return true;
    }
}
