package com.xss.design_patterns_demo.gongChang.common;

import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;

@Component
public class PhoneFactoryPatterUtil {

    public <T> T getFactoryBean(Class<? extends T> clazz){

        try {
            return (T)Class.forName(clazz.getName()).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
