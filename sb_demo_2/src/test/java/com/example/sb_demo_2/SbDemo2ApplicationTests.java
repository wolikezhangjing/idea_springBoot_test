package com.example.sb_demo_2;

import com.example.sb_demo_2.domain.DemoProperties;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbDemo2ApplicationTests {

    @Test
    public void contextLoads() {

    }

    @Autowired
    private DemoProperties demoProperties;

    @Test
    public void testOne() {
        System.out.println("test hello 1");
        System.out.println(demoProperties.toString());
        Assert.assertEquals(demoProperties.getName(), "spirngboot");
    }

    @Test
    public void testTwo() {
        System.out.println("test hello 2");
        TestCase.assertEquals(1, 1);
    }

    @Before
    public void testBefore() {
        System.out.println("before");
    }

    @After
    public void testAfter() {
        System.out.println("after");
    }
}
