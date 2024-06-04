package backend.buenavida.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.buenavida.Models.Venta;

@Repository
public interface VentaRepo extends JpaRepository <Venta, Integer>{
}
