package annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringAnnotationApp {
    public static void main(String[] args) {

        // load the Spring configuration file
       // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation/applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ITeacher teacher = context.getBean("springTeacher", ITeacher.class);
        // foloseste functionalitatile bean-ului
        System.out.println(teacher.getHomework());
        ITeacher teacher2 = context.getBean("webDevTeacher", ITeacher.class);
        teacher2.getHomework();
        context.close();
    }
}
