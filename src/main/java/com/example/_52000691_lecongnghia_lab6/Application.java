package com.example._52000691_lecongnghia_lab6;

import Ex1.Product;
import Ex2.ApplicationConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        Ex1
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Product product1 = (Product) ac.getBean("product1");
        Product product2 = (Product) ac.getBean("product2");
        Product product3 = (Product) ac.getBean("product3");

        System.out.println("Ex1...");
        System.out.println("Name of the bean 1: " + product1.getName());
        System.out.println("Name of the bean 2: " + product3.getName());
        System.out.println("Name of the bean 3: " + product2.getName());

//        Ex2
        ApplicationContext ac2 = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Ex2.Product _product1 = (Ex2.Product) ac2.getBean("product1");
        Ex2.Product _product2 = (Ex2.Product) ac2.getBean("product2");
        Ex2.Product _product3 = (Ex2.Product) ac2.getBean("product3");

        System.out.println("Ex2...");
        System.out.println("The bean 1: " + _product1);
        System.out.println("The bean 2: " + _product3);
        System.out.println("The bean 3: " + _product2);
    }
}
