package annotationConstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringAnnotationApp {
    public static void main(String[] args) {

        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationConstructor/applicationContext.xml");

        // incercam sa obtinem bean din clasa WebDevTeacher.java:
        WebDevTeacher teacher = context.getBean("webDevTeacher", WebDevTeacher.class);

        context.close();
    }
}
