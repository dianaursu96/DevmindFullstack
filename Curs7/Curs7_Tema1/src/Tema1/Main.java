package Tema1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Tema1/applicationContext.xml");

        Traffic traffic = context.getBean("traffic", Traffic.class);
        traffic.hello();
        traffic.travelMotocicleta();

        Traffic5 traffic5 = context.getBean("traffic5", Traffic5.class);
        traffic5.travel();

        Motor motor = new Motor(5, "lala", 9);
        motor.setNume("TSI");
        System.out.println(motor.getNume());
    }
}