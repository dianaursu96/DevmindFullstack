import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean("myDog")
    public Dog dog() {
        return new Dog();
    }
    @Bean("myCat")
    public Cat cat() {
        return new Cat();
    }
    @Bean("myMouse")
    public Mouse mouse() {
        return new Mouse();
    }
}
