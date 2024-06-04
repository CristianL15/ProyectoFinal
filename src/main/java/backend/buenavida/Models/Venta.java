package backend.buenavida.Models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ventas")
public class Venta {
    @Id
    @GeneratedValue
    private int consecutivo;

    @Column (name="fecha_compra")
    private Date fechaCompra;

    @Column (name="precio")
    private double precio;

    @Column (name="comision")
    private double comision;

    @Column (name="impuesto")
    private double impuesto;

    public Venta() {}

    public Venta(int consecutivo, Date fechaCompra, double precio, double comision, double impuesto) {
        this.consecutivo = consecutivo;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
        this.comision = comision;
        this.impuesto = impuesto;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    
}
