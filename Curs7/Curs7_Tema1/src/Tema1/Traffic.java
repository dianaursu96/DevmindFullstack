package Tema1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// injectare prin toate cele 3 modalitati
@Component
public class Traffic {
    Motocicleta motocicleta;
    Masina masina;
    @Autowired
    Autocar autocar;

    @Autowired
    public Traffic(Motocicleta motocicleta) {
        this.motocicleta = motocicleta;
    }


    @Autowired
    public void setMasina(Masina masina) {
        this.masina = masina;
    }
    public void hello() {
        System.out.println("Hello from traffic1");
    }
    public void travelMotocicleta() {
        motocicleta.travel();
    }
}
