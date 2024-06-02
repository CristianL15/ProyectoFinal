package backend.buenavida.Models;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "inmuebles")
public class Inmueble {

    @Id
    @GeneratedValue
    private int consecutivo;
    private String matricula_inmueble;
    private int tipo_inmueble;
    private int pais;
    private String direccion;
    private int precio_venta;
    private Date fecha_compra;
    private String descripcion;

    public Inmueble(String matricula_inmueble, int tipo_inmueble, int pais, String direccion,
            int precio_venta, Date fecha_compra, String descripcion) {
        this.matricula_inmueble = matricula_inmueble;
        this.tipo_inmueble = tipo_inmueble;
        this.pais = pais;
        this.direccion = direccion;
        this.precio_venta = precio_venta;
        this.fecha_compra = fecha_compra;
        this.descripcion = descripcion;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getMatricula_inmueble() {
        return matricula_inmueble;
    }

    public void setMatricula_inmueble(String matricula_inmueble) {
        this.matricula_inmueble = matricula_inmueble;
    }

    public int getTipo_inmueble() {
        return tipo_inmueble;
    }

    public void setTipo_inmueble(int tipo_inmueble) {
        this.tipo_inmueble = tipo_inmueble;
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

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
