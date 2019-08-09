package com.example.springboot_resultful_demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.springboot_resultful_demo.domain.Person;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Title: UserController
 * @Description: result控制层
 * @author: TC20014
 * @date: 2018/12/20 15:29
 * @Version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 使用框架内部集成日志
     */
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    // 创建一个线程安全的Map
    static Map<String, Person> users = new ConcurrentHashMap<>();

    /**
     * 保存人员
     *
     * @param name
     * @param code
     * @param age
     * @return
     */
    @ApiOperation(value = "新增用户", notes = "向redis中存入一条新用户数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "names",value = "人员名称", paramType = "path", required = true, dataType = "String"),
            @ApiImplicitParam(name = "codes",value = "编号", paramType = "path", required = true, dataType = "String"),
            @ApiImplicitParam(name = "ages",value = "年龄", paramType = "path", required = true, dataType = "String")
    })
    @PostMapping("/add/{names}/{codes}/{ages}")
    public Person addUser(@PathVariable(name = "names") String name, @PathVariable(name = "codes") String code, @PathVariable(name = "ages") Integer age) {
        logger.info("addUser方法请求参数为：" + "name=" + name + "，code=" + code + "，age=" + age);
        Person person = new Person();
        person.setName(name);
        person.setCode(code);
        person.setAge(age);
        redisTemplate.opsForValue().set("user", person);
        users.put(name, person);
        return person;
    }

    /**
     * 查询人员
     *
     * @param cacheKey
     * @param name
     * @return
     */
    @ApiOperation(value = "查询用户", notes = "从redis中获取存入的用户数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key",value = "rides中存储人员的Key", paramType = "path", required = true, dataType = "String"),
            @ApiImplicitParam(name = "name",value = "人员名称", paramType = "path", required = true, dataType = "String")
    })
    @GetMapping("/get/{key}/{name}")
    public Person getUser(@PathVariable(name = "key") String cacheKey, @PathVariable(name = "name") String name) {
        logger.info("getUser方法请求参数为：" + "cacheKey=" + cacheKey + "，name" + name);
        Person perosn = new Person();
        BeanUtils.copyProperties(redisTemplate.opsForValue().get(cacheKey), perosn);
        logger.info(perosn.toString());
        return users.get(name);
    }

    /**
     * 修改人员
     *
     * @param cacheKey
     * @param name
     * @param code
     * @return
     */
    @ApiOperation(value = "修改用户", notes = "从redis中获取存入的用户数据进行修改并在此存入")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key",value = "rides存储用户数据的Key", paramType = "path", required = true, dataType = "String"),
            @ApiImplicitParam(name = "name",value = "人员名称", paramType = "path", required = true, dataType = "String"),
            @ApiImplicitParam(name = "code",value = "编号", paramType = "path", required = true, dataType = "String")
    })
    @PutMapping("/put/{key}/{name}/{code}")
    public Person putUser(@PathVariable(name = "key") String cacheKey, @PathVariable(name = "name") String name, @PathVariable(name = "code") String code) {
        logger.info("putUser方法请求参数为：" + "cacheKey=" + cacheKey + "，name" + name + "，code" + code);
        Person person = JSONObject.parseObject(JSONObject.toJSONString(redisTemplate.opsForValue().get(cacheKey)), Person.class);
        person.setName(name);
        person.setCode(code);
        logger.info("修改后的person对象数据为：" + JSONObject.toJSONString(person));
        redisTemplate.opsForValue().set("user", person);
        users.put(name, person);
        return users.get(name);
    }

    /**
     * 删除人员
     *
     * @param cacheKey
     * @param name
     * @return
     */
    @ApiOperation(value = "删除用户", notes = "从redis中删除用户数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key",value = "rides存储用户数据的Key", paramType = "path", required = true, dataType = "String"),
            @ApiImplicitParam(name = "name",value = "人员名称", paramType = "path", required = true, dataType = "String")
    })
    @DeleteMapping("/delete/{key}/{name}")
    public Person deleteUser(@PathVariable(name = "key") String cacheKey, @PathVariable(name = "name") String name) {
        logger.info("deleteUser方法请求参数为：" + "cacheKey=" + cacheKey + "，name" + name);
        Boolean flag = redisTemplate.hasKey(cacheKey);
        logger.info("去redis中查询的结果：" + flag);
        if (flag) {
            redisTemplate.delete(cacheKey);
            logger.info("执行删除成功");
        }
        Person person = users.remove(name);
        return person;
    }

}
