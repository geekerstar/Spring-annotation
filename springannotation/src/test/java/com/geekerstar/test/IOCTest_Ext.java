package com.geekerstar.test;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.geekerstar.aop.MathCalculator;
import com.geekerstar.bean.Boss;
import com.geekerstar.bean.Car;
import com.geekerstar.bean.Color;
import com.geekerstar.bean.Red;
import com.geekerstar.config.MainConfigOfAOP;
import com.geekerstar.dao.BookDao;
import com.geekerstar.ext.ExtConfig;
import com.geekerstar.service.BookService;

public class IOCTest_Ext {

	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext  = new AnnotationConfigApplicationContext(ExtConfig.class);


		//发布事件；
		applicationContext.publishEvent(new ApplicationEvent(new String("我发布的时间")) {
		});

		applicationContext.close();
	}
}
