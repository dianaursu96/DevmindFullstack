package testPostConstruct;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Test {
    @PreDestroy
    public void doDestructionThings() {
      //...
    }
}
