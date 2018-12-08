package com.geekerstar.config;

import com.geekerstar.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author geekerstar
 * @date 2018/12/8
 * description 等同于配置文件
 */
@Configuration  //告诉Spring这是个配置类
public class MainConfig {
    /**
     * 给容器注册一共Bean，类型为返回值的类型，id默认用方法名作为id
     *
     * @return
     */
    @Bean(value = "person01")
    public Person person() {
        return new Person("geek", 20);
    }
}
