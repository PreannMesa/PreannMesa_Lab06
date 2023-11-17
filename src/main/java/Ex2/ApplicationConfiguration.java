package Ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfiguration {
    @Bean
    @Scope ("prototype")
     public Product product1() {
        Product product1 = new Product(1, "Iphone", 100);
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
        Product product3 = new Product(3, "Xiaomi", 200);
        return product3;
    }
}
