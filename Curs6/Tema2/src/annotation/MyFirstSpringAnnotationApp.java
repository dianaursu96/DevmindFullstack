package annotation;

import annotation.ITeacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringAnnotationApp {
    public static void main(String[] args) {

        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation/applicationContext.xml");
        ITeacher teacher = context.getBean("springTeacher", ITeacher.class);
        // foloseste functionalitatile bean-ului
        System.out.println(teacher.getHomework());

        context.close();
    }
}
