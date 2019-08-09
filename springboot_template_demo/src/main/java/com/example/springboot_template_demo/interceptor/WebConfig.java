package com.example.springboot_template_demo.interceptor;

import com.example.springboot_template_demo.util.LogUtils;
import org.slf4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Title: WebConfig
 * @Description: 登录拦截器
 * @author: TC20014
 * @date: 2018/11/9 11:39
 * @Version: 1.0
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    /**
     * Logger  log = LoggerFactory.getLogger(WebConfig.class);
     **/
    private Logger log = LogUtils.getBussinessLogger();
    private DemoInterceptor demoInterceptor = new DemoInterceptor();

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        log.info("日志记录：初始化了WebConfig类的addInterceptors方法", registry);
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用于过滤排除拦截
        registry.addInterceptor(demoInterceptor).addPathPatterns("/index").excludePathPatterns("/static/**", "login");
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        log.info("日志记录：初始化了WebConfig类的addResourceHandlers方法", registry);
        // addResourceLocations指的是文件放置的目录，addResoureHandler指的是对外暴露的访问路径
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
