package Tema1;
import lombok.Data;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Data

public class Motor {
    private int putere;
    private String nume;
    private int numarCilindri;
    public Motor() {

    }
    public Motor(int putere, String nume, int numarCilindri) {
        this.putere = putere;
        this.nume = nume;
        this.numarCilindri = numarCilindri;
    }
}


