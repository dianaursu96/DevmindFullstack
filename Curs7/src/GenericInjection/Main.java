package GenericInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("GenericInjection/applicationContext.xml");

        // incercam sa obtinem bean din clasa WebDevTeacher.java:
        WebDevTeacher teacher = context.getBean("webDevTeacher", WebDevTeacher.class);
        teacher.printKnowledge();

        context.close();
    }
}
