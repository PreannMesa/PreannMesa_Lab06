package com.example.exercise5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfiguration {
    @Value("${id}")
    private String id;
    @Value("${name}")
    private String name;
    @Value("${quantity}")
    private String quantity;
    @Bean
    @Scope ("prototype")
     public Product product1() {
        Product product1 = new Product(Integer.valueOf(id), name, Integer.valueOf(quantity));
        return product1;
    }

    @Bean
    @Scope ("prototype")
    public Product product2() {
        return new Product(product1());
    }

    @Bean
    @Scope ("singleton")
    public Product product3() {
        Product product3 = new Product(3, "Iphone", 100);
        return product3;
    }
}
