package Tema1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(MotorConfig.class)
@Configuration
@ComponentScan("Tema1")
public class Config {
    @Autowired
    Motor motor;
    @Bean
    public Autocar autocar() {
            return new Autocar(motor);
    }
    @Bean
    public Masina masina() {
        Masina masina = new Masina();
        masina.setMotor(motor);
        return masina;
    }
    @Bean
    public Motocicleta motocicleta() {
        return new Motocicleta();
    }

}
