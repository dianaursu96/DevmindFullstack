package Tema2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]) {
        // load the Spring configuration file

        System.out.println("----- Before context initialization");
     //   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Tema2/appContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("----- Before getBean calls");

        context.getBean("myBean", MyBean.class);
        context.getBean("myBean", MyBean.class);
        context.getBean("myBean", MyBean.class);

        System.out.println("----- After getBean calls");
        System.out.println("Current number of instances: " + MyBean.objectCounter);

        // close the context
        context.close();
        System.out.println("----- After context closed");
    }
}