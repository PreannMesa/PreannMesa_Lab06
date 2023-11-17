package com.example.Exercise2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Exercise2Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Product prototypeBean1 = context.getBean("prototypeBean1", Product.class);
		Product prototypeBean2 = context.getBean("prototypeBean2", Product.class);
		Product singletonBean = context.getBean("singletonBean", Product.class);

		System.out.println("Prototype Bean 1: " + prototypeBean1);
		System.out.println("Prototype Bean 2: " + prototypeBean2);
		System.out.println("Singleton Bean: " + singletonBean);
		context.close();
	}
}
