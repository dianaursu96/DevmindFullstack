package Curs2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TeacherConfiguration.class);

        ITeacher teacher = context.getBean("javaTeacher", JavaTeacher.class);
        System.out.println(teacher.getWisdom());

        //context.getBean("myBean", MyBean.class).sayHello();

        context.close();
    }
}
