package backend.buenavida.Models;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "inmuebles")
public class Inmueble {

    @Id
    @GeneratedValue
    private int consecutivo;

    @Column (name="matricula")
    private String matricula;

    @Column (name="tipo")
    private String tipo;

    @Column (name="pais")
    private int pais;

    @Column (name="direccion")
    private String direccion;

    @Column (name="propietario_id")
    private long propietario;

    @Column (name="precio")
    private int precio;

    @Column (name="fecha")
    private Date fecha;
    
    @Lob
    @Column (name="descripcion", length = 16777216)
    private String descripcion;

    @Column (name="prop_anterior")
    private long propAnterior;

    public Inmueble(){}

    public Inmueble(String matricula, String tipo, int pais, String direccion, int propietario,
            int precio, Date fecha, String descripcion) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.pais = pais;
        this.direccion = direccion;
        this.propietario = propietario;
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

    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
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

    public long getPropietario() {
        return propietario;
    }

    public void setPropietario(long propietario) {
        this.propietario = propietario;
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

    
    public long getPropAnterior() {
        return propAnterior;
    }

    public void setPropAnterior(long propAnterior) {
        this.propAnterior = propAnterior;
    }

}
