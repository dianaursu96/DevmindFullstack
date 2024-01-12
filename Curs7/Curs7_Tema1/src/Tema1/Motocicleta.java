package Tema1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Motocicleta implements IAutomobil {

    // injectare bean motor prin field

    @Autowired
    Motor motor;


    public void travel() {
        System.out.println("I travel on 2 wheels");
    }
    public void maxDrivingSpeed() {
        System.out.println("My max speed is medium");
    }
}
