package com.example.springboot_resultful_demo;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {

    /**
     *  初始化SWAGGER_2扫描路径
     * @return
     */
    public Docket createClassRestfulApiDoc(){
        /*Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.springboot_resultful_demo"))
                .paths(PathSelectors.any())
                .build();*/

        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket = docket.apiInfo(apiInfo());
        ApiSelectorBuilder apis = docket.select();
        apis = apis.apis(RequestHandlerSelectors.basePackage("com.example.springboot_resultful_demo"));
        apis = apis.paths(PathSelectors.any());
        docket = apis.build();
        return docket;
    }

    /**
     * 创建关于项目的API信息
     * @return
     */
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("更多Spring Boot测试案例请关注：https://gitee.com/didispace/SpringBoot-Learning/tree/master")
                .termsOfServiceUrl("http://blog.didispace.com/")
                .contact("小胖纸")
                .version("1.0")
                .build();
    }
}
