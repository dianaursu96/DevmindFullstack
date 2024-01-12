package Tema1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// injectare prin field

@Component
public class Traffic3 {
    @Autowired
    Motocicleta motocicleta;
    @Autowired
    Masina masina;
    Autocar autocar;
    public void hello() {
        System.out.println("Hello from traffic1");
    }
    public void travelMotocicleta() {
        motocicleta.travel();
    }

}
