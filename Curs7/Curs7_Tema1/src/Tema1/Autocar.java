package Tema1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Autocar implements IAutomobil {

    //injectare bean Motor prin constructor
     Motor motor;
    @Autowired
    public Autocar(Motor motor) {
        this.motor = motor;
    }

    public void travel() {
        System.out.println("I travel on many wheels");
    }
    public void maxDrivingSpeed() {
        System.out.println("My max speed is low");
    }
}
