import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String args[]) {
        // load the Spring configuration file

        System.out.println("----- Before context initialization");
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config2.class);

        System.out.println("----- Before getBean calls");

        context.getBean(MyBean.class);
        context.getBean(MyBean.class);
        context.getBean(MyBean.class);

        System.out.println("----- After getBean calls");
        System.out.println("Current number of instances: " + MyBean.objectCounter);

        // close the context
        context.close();
        System.out.println("----- After context closed");
    }
}
