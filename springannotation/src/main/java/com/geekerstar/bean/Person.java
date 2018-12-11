package com.geekerstar.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author geekerstar
 * @date 2018/12/8
 * description
 */
public class Person {

    /**
     * 使用@Value赋值
     * 1、基本数值
     * 2、SpEL #{}
     * 3、${} 取出配置文件的值（在运行环境变量里面的值）
     */

    @Value("哈哈")
    private String name;
    @Value("#{20-2}")
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
