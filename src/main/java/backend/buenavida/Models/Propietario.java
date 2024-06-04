package backend.buenavida.Models;

import jakarta.persistence.*;

@Entity
@Table (name = "propietarios")
public class Propietario {

    @Id
    @Lob
    @Column (name="id")
    private long id;

    @Column (name="nombre")
    private String nombre;

    @Column (name="apellido")
    private String apellido;

    @Column (name="apellido2")
    private String apellido2;

    public Propietario() {}

    public Propietario(long id, String nombre, String apellido, String apellido2) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    
}