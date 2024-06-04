package backend.buenavida.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import backend.buenavida.Models.Inmueble;
import backend.buenavida.Models.Propietario;
import backend.buenavida.Repositories.PropietarioRepo;

@Controller
class PropietarioController {

    @Autowired
    PropietarioRepo propietarioRepo;    

    @PostMapping("/registrar")
    public ResponseEntity<Propietario> postMethodName(@ModelAttribute Propietario propietario) {
        System.out.println(propietario.toString());
        propietarioRepo.save(propietario);
        System.out.println();
        return new ResponseEntity<>(null, null, HttpStatus.CREATED);
    }   
}