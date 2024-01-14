package Tema1;

import org.springframework.context.annotation.Bean;

public class MotorConfig {
    @Bean
    public Motor motor() {
        return new Motor();
    }
}
