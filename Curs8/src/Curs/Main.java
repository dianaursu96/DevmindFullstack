package Curs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        System.out.println(" ----- Before context initialization ----- ");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TeacherConfiguration.class);

        ITeacher teacher = context.getBean(JavaTeacher.class); // optional "javaTeacher", JavaTeacher.class
        System.out.println(teacher.getWisdom());

        // close the context
        context.close();
        System.out.println(" ----- After context closed ----- ");
    }
}
