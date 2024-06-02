package backend.buenavida.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pais")
public class País {

    @Id
    @GeneratedValue
    private int conescutivo;
    private String nombre;

    public País(int consecutivo, String nombre) {
        this.conescutivo = consecutivo;
        this.nombre = nombre;
    }

    public int getConsecutivo() {
        return conescutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.conescutivo = consecutivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}