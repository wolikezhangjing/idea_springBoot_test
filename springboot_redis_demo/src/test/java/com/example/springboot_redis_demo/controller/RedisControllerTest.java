package com.example.springboot_redis_demo.controller;

import com.example.springboot_redis_demo.domain.PhoneVO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Title: RedisControllerTest
 * @Description: redisController类的单元测试，基于springboot2.1
 * @author: TC20014
 * @date: 2018/11/7 17:08
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisControllerTest {

    @Autowired
    private WebApplicationContext ctx;

    private MockMvc mockMvc;

    /**
     * 初始化 MVC 的环境
     */
    @Before
    public void before() {
        mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
    }

    @Test
    public void getValueByKey() throws Exception {
        String url = "/get/10";
        String rsp = mockMvc.perform(MockMvcRequestBuilders.get(url)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn().getResponse().getContentAsString();
        System.out.println("请求了getValueByKey方法的返回值是=" + rsp);
    }

    @Test
    public void setRedisKeyAndValue() throws Exception {
        String url = "/set/10/aaaaa";
        String rsp = mockMvc.perform(MockMvcRequestBuilders.get(url)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn().getResponse().getContentAsString();
        System.out.println("请求了setRedisKeyAndValue方法的返回值是=" + rsp);
    }

    @Test
    public void setRedisEntity() throws Exception {
        String url = "/setPojo";
        String rsp = mockMvc.perform(MockMvcRequestBuilders.get(url)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn().getResponse().getContentAsString();
        System.out.println("请求了setRedisEntity方法的返回值是=" + rsp);
    }

    @Test
    public void getRedisEntity() throws Exception {
        String url = "/getPojo/1";
        Object rsp = mockMvc.perform(MockMvcRequestBuilders.get(url)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn().getResponse().getContentAsString();
        System.out.println("请求了getRedisEntity方法的返回值是=" + rsp);
    }
}