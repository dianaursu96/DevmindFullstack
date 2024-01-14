package annotationSetter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringAnnotationApp {
    public static void main(String[] args) {

        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationSetter/applicationContext.xml");

        // incercam sa obtinem bean din clasa WebDevTeacher.java:
        WebDevTeacher2 teacher = context.getBean("webDevTeacher2", WebDevTeacher2.class);
        teacher.printKnowledge();
        teacher.getHomework();
        teacher.printTip();
        context.close();
    }
}