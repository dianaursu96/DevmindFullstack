import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        // retrieve bean from Spring container
        IAnimal theAnimal1 = context.getBean("myDog", IAnimal.class);
        IAnimal theAnimal2 = context.getBean("myCat", IAnimal.class);
        // IAnimal theAnimal2 = context.getBean("myAnimal", IAnimal.class);

        // call methods on the bean
        System.out.println(theAnimal1.makeSound());
        System.out.println(theAnimal2.makeSound());
        //  System.out.println(theAnimal2.makeSound());

        // close the context
        context.close();
        System.out.println("hey");
    }
}