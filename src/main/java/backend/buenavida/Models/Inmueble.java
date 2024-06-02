package backend.buenavida.Models;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "inmuebles")
public class Inmueble {

    @Id
    @GeneratedValue
    private int consecutivo;
    private String matricula;
    private int tipo;
    private int pais;
    private String direccion;
    private int precio;
    private Date fecha;
    private String descripcion;

    public Inmueble(String matricula, int tipo, int pais, String direccion,
            int precio, Date fecha, String descripcion) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.pais = pais;
        this.direccion = direccion;
        this.precio = precio;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getmatricula() {
        return matricula;
    }

    public void setmatricula(String matricula) {
        this.matricula = matricula;
    }

    public int gettipo() {
        return tipo;
    }

    public void settipo(int tipo) {
        this.tipo = tipo;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getprecio() {
        return precio;
    }

    public void setprecio(int precio) {
        this.precio = precio;
    }

    public Date getfecha() {
        return fecha;
    }

    public void setfecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
