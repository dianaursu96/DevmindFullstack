package Tema2;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// @Component
@Scope("prototype")
public class MyBean {
    static int objectCounter = 0;
    public MyBean() {
        objectCounter++;
        System.out.println("Current number of instances: " + objectCounter);
    }
    @PostConstruct
    private void init() {
        System.out.println("This method is called at initialization");
    }
    @PreDestroy
    private void destroy() {
        System.out.println("This method is called at destruction. Use this to free resources.");
    }
}
