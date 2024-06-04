package backend.buenavida.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import backend.buenavida.Repositories.InmuebleRepo;
import org.springframework.web.bind.annotation.GetMapping;
import backend.buenavida.Models.Inmueble;

@Controller
@RequestMapping
public class InmuebleController {
    
    @Autowired
    InmuebleRepo inmuebleRepo;

    // @GetMapping("/listarInventario")
    // public String listarInventario(Model model) {
    //     List<Inmueble> inmbueles = (List<Inmueble>)inmuebleRepo.findAll();
    //     model.addAttribute("inmuebles", inmbueles);
    //     return "redirect:inventario#inventario";
    // }

    @GetMapping("/inventario.html/inventario#inventario")
    public String mostrarInventario(Model model) {
        List<Inmueble> inmuebles = inmuebleRepo.findAll();
        model.addAttribute("inmuebles", inmuebles);
        return "inventario";
    }
}
