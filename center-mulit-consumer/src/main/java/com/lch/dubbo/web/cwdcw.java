package com.lch.dubbo.web;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.file.spi.FileSystemProvider;

/**
 * @author wanghu
 * @date 2022/1/2 17:00
 */
public class cwdcw {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        String[] beanDefinitionNames = classPathXmlApplicationContext.getBeanDefinitionNames();
        for(String b:beanDefinitionNames){
            System.out.println(b);
        }

    }
}
