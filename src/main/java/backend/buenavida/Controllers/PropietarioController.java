package backend.buenavida.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import backend.buenavida.Models.Propietario;
import backend.buenavida.Repositories.PropietarioRepo;

@Controller
class PropietarioController {

    @Autowired
    PropietarioRepo propietarioRepo;    

    @PostMapping("/registrar")
    public String postMethodName(@ModelAttribute Propietario propietario) {
        System.out.println(propietario.toString());
        propietarioRepo.save(propietario);
        System.out.println();

        return "index";
    }
}