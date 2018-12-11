package com.geekerstar.test;

import com.geekerstar.config.MainConfigOfAutowired;
import com.geekerstar.dao.BookDao;
import com.geekerstar.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author geekerstar
 * @date 2018/12/11
 * description
 */
public class IOCTest_Autowired {

    @Test
    public void test01(){
        //1.创建IOC容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);

        BookDao bean = applicationContext.getBean(BookDao.class);
        System.out.println(bean);


        applicationContext.close();
    }
}
