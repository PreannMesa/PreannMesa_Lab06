package com.example.Exercise2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    public Product prototypeBean1() {
        Product product = new Product();
        product.setId(1);
        product.setName("Prototype Bean 1");
        product.setPrice(10.0);
        product.setDescription("Prototype Bean 1 Description");
        return product;
    }

    @Bean
    @Scope("prototype")
    public Product prototypeBean2() {
        Product product = new Product();
        product.setId(2);
        product.setName("Prototype Bean 2");
        product.setPrice(20.0);
        product.setDescription("Prototype Bean 2 Description");
        return product;
    }

    @Bean
    @Scope("singleton")
    public Product singletonBean() {
        Product product = new Product();
        product.setId(3);
        product.setName("Singleton Bean");
        product.setPrice(30.0);
        product.setDescription("Singleton Bean Description");
        return product;
    }
}
