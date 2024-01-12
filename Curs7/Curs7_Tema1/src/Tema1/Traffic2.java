package Tema1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// injectare prin constructor

@Component
public class Traffic2 {
    Motocicleta motocicleta;
    Masina masina;
    Autocar autocar;

    @Autowired
    public void setMotocicleta(Motocicleta motocicleta) {
        this.motocicleta = motocicleta;
    }
    @Autowired
    public void setMasina(Masina masina) {
        this.masina = masina;
    }
    @Autowired
    public void setAutocar(Autocar autocar) {
        this.autocar = autocar;
    }
    public void hello() {
        System.out.println("Hello from traffic1");
    }
    public void travelMotocicleta() {
        motocicleta.travel();
    }

}
