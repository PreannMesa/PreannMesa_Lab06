package com.example.exercise5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Exercise5Application {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(ApplicationConfiguration.class, args);
        Product product1 = (Product) ac.getBean("product1");
        Product product2 = (Product) ac.getBean("product2");
        Product product3 = (Product) ac.getBean("product3");

        System.out.println("Product1: " + product1);
        System.out.println("Product2: " + product2);
        System.out.println("Product3: " + product3);
    }

}
