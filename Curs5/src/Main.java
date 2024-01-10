import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConext.xml");
        context.getBean("myPrototypeTask", Task.class);
        context.getBean("myPrototypeTask", Task.class);
        context.getBean("myPrototypeTask", Task.class);
        context.getBean("myPrototypeTask", Task.class);

        System.out.println(Task.numberOfTasks);
        context.close();
        System.out.println(Task.numberOfTasks);
    }
}
