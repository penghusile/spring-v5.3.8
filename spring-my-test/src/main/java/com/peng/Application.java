package com.peng;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName : com.peng.Application
 * @Description :
 * @Author : eve
 * @Date: 2023-11-29 22:00
 */
public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ApplicationContext();
		System.out.println(applicationContext.getBean(MyEntity.class));
		//AnnotationConfigApplicationContext context =
		//		new AnnotationConfigApplicationContext(JavaConfig.class);
		//System.out.println(context.getBean(MyEntity.class));
	}

}
