package com.geekerstar.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.geekerstar.aop.MathCalculator;
import com.geekerstar.bean.Boss;
import com.geekerstar.bean.Car;
import com.geekerstar.bean.Color;
import com.geekerstar.bean.Red;
import com.geekerstar.config.MainConfigOfAOP;
import com.geekerstar.dao.BookDao;
import com.geekerstar.service.BookService;
import com.geekerstar.tx.TxConfig;
import com.geekerstar.tx.UserService;

public class IOCTest_Tx {

	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(TxConfig.class);

		UserService userService = applicationContext.getBean(UserService.class);

		userService.insertUser();
		applicationContext.close();
	}

}
