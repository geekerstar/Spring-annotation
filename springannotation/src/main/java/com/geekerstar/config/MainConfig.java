package com.geekerstar.config;

import com.geekerstar.bean.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author geekerstar
 * @date 2018/12/8
 * description 等同于配置文件
 * @ComponentScan value:指定要扫描的包
 * excludeFilter = Filter[]，指定扫描的时候按照扫描规则排除那些组件
 * includeFilter = Filter[]，指定扫描的时候只需要包含哪些组件
 */
@Configuration  //告诉Spring这是个配置类
@ComponentScans(
        value = {
                @ComponentScan(value = "com.geekerstar", includeFilters = {
                        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
                }, useDefaultFilters = false)
        }
)

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
