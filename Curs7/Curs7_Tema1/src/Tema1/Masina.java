package Tema1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Masina implements IAutomobil {

    // injectare bean motor prin setter
     Motor motor;
    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    }




    public void travel() {
        System.out.println("I travel on 4 wheels");
    }
    public void maxDrivingSpeed() {
        System.out.println("My max speed is high");
    }
}
