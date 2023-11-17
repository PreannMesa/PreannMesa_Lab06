package com.example.exercise3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class Exercise3Application {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        TextEditor textEditor = (TextEditor) ac.getBean("textEditor");
        textEditor.input("Spring is coming!");
        try {
            textEditor.save("spring.txt");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
