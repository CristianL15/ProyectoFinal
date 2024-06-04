package backend.buenavida.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import backend.buenavida.Models.Venta;
import backend.buenavida.Repositories.VentaRepo;

@Controller
@RequestMapping
public class VentaController {

    @Autowired
    VentaRepo ventaRepo;
    
    // @GetMapping("/inventario.html#inventario")
    // public String listar(Model model) {
    //     List<Venta> ventas = (List<Venta>)ventaRepo.findAll();
    //     model.addAttribute("ventas", ventas);
    //     return "redirect:/";
    // }
    
}
