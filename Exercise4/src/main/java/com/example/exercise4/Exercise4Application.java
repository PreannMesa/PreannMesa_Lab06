package com.example.exercise4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @SpringBootApplication đã áp dụng cho @ComponentScan
// Chỉ khai báo 1 trong 2

//@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = {"com.example.exercise4"})
public class Exercise4Application {
    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(Exercise4Application.class, args);
        TextEditor textEditor = (TextEditor) ac.getBean("textEditor");
        textEditor.input("Spring is coming!");
        try {
            textEditor.save("spring_Ex4.txt");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
