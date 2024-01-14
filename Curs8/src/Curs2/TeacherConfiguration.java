package Curs2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(WisdomWordsServiceConfiguration.class)

@Configuration
@ComponentScan("Curs2")
public class TeacherConfiguration {
    @Autowired
    WisdomWordsService wisdomWordsService;

    @Bean
    public JavaTeacher javaTeacher() {
        return new JavaTeacher(wisdomWordsService);
    }

    @Bean
    public MathTeacher mathTeacher() {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.setWisdomService(wisdomWordsService);
        return mathTeacher;
    }

}
