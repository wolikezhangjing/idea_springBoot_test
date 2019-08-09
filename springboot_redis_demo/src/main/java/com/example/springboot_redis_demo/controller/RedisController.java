package com.example.springboot_redis_demo.controller;

import com.example.springboot_redis_demo.domain.PhoneVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: RedisController
 * @Description: redis控制层操作类。
 * springboot对jedis客户端中大量api进行了归类封装,将同一类型操作封装为operation接口
 * @author: TC20014
 * @date: 2018/11/7 15:07
 * @Version: 1.0
 * 注解：@RestController ：spring4.1以上框架提供，主要是针对方法返回值默认返回json格式数据，不在需要添加@ResponeBody注解
 */
@RestController
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 通过key获取redis缓存的value值
     *
     * @param key
     * @return
     */
    @RequestMapping("/get/{key}")
    public String getValueByKey(@PathVariable(name = "key") String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    /**
     * 存储请求的key与value到redis中
     *
     * @param key
     * @param value
     * @return
     */
    @RequestMapping("/set/{key}/{value}")
    public String setRedisKeyAndValue(@PathVariable(name = "key") String key, @PathVariable(name = "value") String value) {
        stringRedisTemplate.opsForValue().set(key, value);
        return "SUCCESS";
    }

    /**
     * 存储redis对象
     *
     * @return
     */
    @RequestMapping("/setPojo")
    public String setRedisEntity() {
        PhoneVO phoneVO = new PhoneVO();
        phoneVO.setId("1");
        phoneVO.setName("apple");
        phoneVO.setPrice("8999");
        phoneVO.setColor("red");
        redisTemplate.opsForValue().set(phoneVO.getId(), phoneVO);
        return "SUCCESS";
    }

    /**
     * 获取存储在redis中的entity对象
     *
     * @param key
     * @return
     */
    @RequestMapping("/getPojo/{key}")
    public Object getRedisEntity(@PathVariable(name = "key") String key) {
        return redisTemplate.opsForValue().get(key);
    }
}