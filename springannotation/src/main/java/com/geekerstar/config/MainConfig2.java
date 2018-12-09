package com.geekerstar.config;

import com.geekerstar.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @author geekerstar
 * @date 2018/12/9
 * description
 */
@Configuration
public class MainConfig2 {

    /**
     * 默认是单实例的
     *
     * prototype  多实例  IOC容器启动并不会去调用方法创建对象放在容器中，而是每次获取的时候才会调用方法创建对象，获取几次就调几次，
     * singleton  单实例（默认） IOC启动会调用方法创建对象放到IOC容器中，以后每次获取直接从容器（map.get())中拿
     * request  同义词请求创建一个实例
     * session  同一个session创建一个实例
     *
     * 单实例Bean,默认在容器启动的时候创建对象
     * 懒加载：容器启动不创建对象，第一次使用（获取）Bean创建对象，并初始化，并且以后每次获取不创建，因为是单实例的
     */
//    @Scope("prototype")
    @Lazy
    @Bean("person")
    public Person person(){
        return new Person("geekerstar",22);
    }
}
