package com.example.Exercise1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Exercise1Application {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");

		Product prototypeBean1 = context.getBean("prototypeBean1", Product.class);
		Product prototypeBean2 = context.getBean("prototypeBean2", Product.class);
		Product singletonBean = context.getBean("singletonBean", Product.class);

		System.out.println("Prototype Bean 1: " + prototypeBean1);
		System.out.println("Prototype Bean 2: " + prototypeBean2);
		System.out.println("Singleton Bean: " + singletonBean);
	}

}
