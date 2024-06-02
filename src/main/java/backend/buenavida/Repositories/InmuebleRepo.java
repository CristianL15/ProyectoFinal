package backend.buenavida.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.buenavida.Models.Inmueble;

@Repository
public interface InmuebleRepo extends JpaRepository<Inmueble, Integer> {
}