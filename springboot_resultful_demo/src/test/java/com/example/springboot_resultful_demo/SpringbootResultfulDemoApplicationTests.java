package com.example.springboot_resultful_demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc   // 注入MockMvc对象
@WebAppConfiguration
public class SpringbootResultfulDemoApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(SpringbootResultfulDemoApplicationTests.class);
    @Autowired
    private MockMvc mvc;

    @Test
    public void contextLoads() throws Exception {
        // post请求
        //准备请求url  不用带ip、端口、项目名称等 直接写接口的映射地址就可以了
        String postUrl = "/user/add/zhangsan/0001/18";
        /* 构建request 发送请求请求
         * MockMvcRequestBuilders 中有很多 请求方式。像get、post、put、delete等等
         */
        MockHttpServletResponse response = mvc.perform(MockMvcRequestBuilders.post(postUrl)
                .accept(MediaType.APPLICATION_JSON)) // 断言返回结果是json
                .andReturn().getResponse();// 得到返回结果

        //拿到请求返回码
        int status = response.getStatus();
        //拿到结果
        String contentAsString = response.getContentAsString();
        logger.info("请求的url:" + postUrl);
        logger.info("请求的结果:" + status + "，返回的结果：" + contentAsString);


        // get请求
        String getUrl = "/user/get/user/zhangsan";
        response = mvc.perform(MockMvcRequestBuilders.get(getUrl).accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn().getResponse();
        //拿到请求返回码
        status = response.getStatus();
        //拿到结果
        contentAsString = response.getContentAsString();
        logger.info("请求的url:" + getUrl);
        logger.info("请求的结果:" + status + "，返回的结果：" + contentAsString);


        // put请求
        String putUrl = "/user/put/user/zhangsan/10086";
        response = mvc.perform(MockMvcRequestBuilders.put(putUrl).accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();
        //拿到请求返回码
        status = response.getStatus();
        //拿到结果
        contentAsString = response.getContentAsString();
        logger.info("请求的url:" + putUrl);
        logger.info("请求的结果:" + status + "，返回的结果：" + contentAsString);


        // delete请求
        String deleteUrl = "/user/delete/user/zhangsan";
        response = mvc.perform(MockMvcRequestBuilders.delete(deleteUrl).accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();
        //拿到请求返回码
        status = response.getStatus();
        //拿到结果
        contentAsString = response.getContentAsString();
        logger.info("请求的url:" + deleteUrl);
        logger.info("请求的结果:" + status + "，返回的结果：" + contentAsString);


    }

}

