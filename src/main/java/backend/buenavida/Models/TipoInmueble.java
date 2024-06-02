package backend.buenavida.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_inmueble")
public class TipoInmueble {

    @Id
    @GeneratedValue
    private int consecutivo;
    private String nombre;

    public TipoInmueble(String nombre) {
        this.nombre = nombre;
    }

    public int getConsecutivo() {
        return this.consecutivo;
    }
    
    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
