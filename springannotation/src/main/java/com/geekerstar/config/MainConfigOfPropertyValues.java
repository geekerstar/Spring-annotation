package com.geekerstar.config;

import com.geekerstar.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author geekerstar
 * @date 2018/12/11
 * description 属性赋值
 */

@Configuration
public class MainConfigOfPropertyValues {

    @Bean
    public Person person(){
        return new Person();
    }
}
