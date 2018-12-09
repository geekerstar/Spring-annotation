package com.geekerstar.config;

import com.geekerstar.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author geekerstar
 * @date 2018/12/9
 * description
 *
 * bean的生命周期：Bean创建--初始化--销毁的过程
 * 容器管理Bean的生命周期
 * 我们可以自定义初始化和销毁方法，容器在bean进行到当前生命周期的时候来调用我们自定义的初始化和销毁方法
 *
 * 构造（对象创建）
 *      单实例：容器启动的时候创建对象
 *      多实例：在每次获取的时候创建对象
 *
 * 初始化：对象创建完成，并赋值好，调用初始化方法
 *
 * 销毁：
 *      单实例：容器关闭的时候
 *      多实例：容器不会管理这个Bean，容器不会调用销毁方法
 *
 * 1、指定初始化和销毁方法
 *      配置的方式：通过@Bean指定init-method和destroy-method
 */
@Configuration
public class MainConfigOfLifeCycle {

//    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }
}
