package backend.buenavida.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.buenavida.Models.País;

@Repository
public interface PaísRepo extends JpaRepository <País, Integer> {
    
}
