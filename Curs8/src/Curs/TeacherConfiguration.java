package Curs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Curs")
public class TeacherConfiguration {
    @Bean
    public JavaTeacher javaTeacher() {
        return new JavaTeacher(wisdomWordsService());
    }

    @Bean
    public WisdomWordsService wisdomWordsService() {
        return new WisdomWordsService();
    }

    @Bean
    public MathTeacher mathTeacher() {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.setWisdomService(wisdomWordsService());
        return mathTeacher;
    }

}
