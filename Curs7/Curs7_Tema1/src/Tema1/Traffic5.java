package Tema1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// implementare concreta travel() prin intermediul interfetei
@Component
public class Traffic5 {
    @Autowired
    @Qualifier("masina")
    IAutomobil automobil;
    public void travel() {
        automobil.travel();
    }


}
