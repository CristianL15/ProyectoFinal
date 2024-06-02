package backend.buenavida.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.buenavida.Models.Propietario;

@Repository
public interface PropietarioRepo extends JpaRepository<Propietario, Integer>{}
