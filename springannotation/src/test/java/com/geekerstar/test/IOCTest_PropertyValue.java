package com.geekerstar.test;

import com.geekerstar.bean.Person;
import com.geekerstar.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author geekerstar
 * @date 2018/12/11
 * description
 */
public class IOCTest_PropertyValue {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);


    @Test
    public void test01(){
        printBeans(applicationContext);
        Person person = (Person)applicationContext.getBean("person");
        System.out.println(person);

        applicationContext.close();
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}
