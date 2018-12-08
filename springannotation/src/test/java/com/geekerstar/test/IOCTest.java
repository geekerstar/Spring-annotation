package com.geekerstar.test;

import com.geekerstar.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author geekerstar
 * @date 2018/12/8
 * description
 */
public class IOCTest {

    @SuppressWarnings("resource")
    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames){
            System.out.println(name);
        }

    }
}
