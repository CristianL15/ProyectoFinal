package backend.buenavida.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.buenavida.Models.TipoInmueble;

@Repository
public interface TipoInmuebleRepo extends JpaRepository <TipoInmueble, Integer> {
}
