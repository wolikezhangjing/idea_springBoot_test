package com.example.springboot_template_demo.controller;

import com.example.springboot_template_demo.util.LogUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title: TemplateViewController
 * @Description: web项目模板视图。视图返回必须使用@Controller注解。使用@RestController注解会返回JSON数据。而不是视图
 * @author: TC20014
 * @date: 2018/11/8 18:39
 * @Version: 1.0
 */
@Controller
public class TemplateViewController {

    //Logger  log = LoggerFactory.getLogger(TemplateViewController.class);
    private Logger log = LogUtils.getBussinessLogger();

    /**
     * 主页请求
     *
     * @param map
     * @return
     */
    @RequestMapping("/index")
    public String ModelAndView(ModelMap map) {
        log.info("****日志记录：请求了index***");
        map.addAttribute("host", "http://springboot.io.com");
        return "index";
    }

    /**
     * 登录页请求
     *
     * @param map
     * @return
     */
    @RequestMapping("/login")
    public String login(ModelMap map) {
        log.info("****日志记录：请求了login***");
        return "login";
    }
}
