package Tema1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// injectare prin constructor

@Component
public class Traffic1 {
    Motocicleta motocicleta;
    Masina masina;
    Autocar autocar;

    @Autowired (required = false)
    public Traffic1(Motocicleta motocicleta) {
        this.motocicleta = motocicleta;
    }

    @Autowired (required = false)
    public Traffic1(Motocicleta motocicleta, Masina masina, Autocar autocar) {
        this.motocicleta = motocicleta;
        this.masina = masina;
        this.autocar = autocar;
    }
    public void hello() {
        System.out.println("Hello from traffic1");
    }
    public void travelMotocicleta() {
        motocicleta.travel();
    }

}
