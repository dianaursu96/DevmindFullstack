import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        context.getBean(Task.class);
        context.getBean(Task.class);
        context.getBean(Task.class);
        context.getBean(Task.class);

        System.out.println(Task.numberOfTasks);
        context.close();
        System.out.println(Task.numberOfTasks);
    }
}
