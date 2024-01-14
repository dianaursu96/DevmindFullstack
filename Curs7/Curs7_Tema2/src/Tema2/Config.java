package Tema2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Tema2")
public class Config {
    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}
