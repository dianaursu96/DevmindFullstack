package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;

@Configuration
public class Config {
    @Bean
    public SpringTeacher springTeacher() {
        return new SpringTeacher();
    }
    @Bean
    public WebDevTeacher webDevTeacher() {
        return new WebDevTeacher();
    }
}
