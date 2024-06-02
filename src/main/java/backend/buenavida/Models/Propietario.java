package backend.buenavida.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "propietarios")
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int consecutivo;
    private int id;
    private String nombre;
    private String apellido;
    private String apellido2;

    public Propietario(int id, String nombre, String apellido, String apellido2) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public String toString() {
        return "Propietario [consecutivo=" + consecutivo + ", id=" + id + ", nombre=" + nombre + ", apellido="
                + apellido + ", apellido2=" + apellido2 + "]";
    }    
}