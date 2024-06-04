package backend.buenavida.Controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import backend.buenavida.Repositories.InmuebleRepo;

import org.springframework.web.bind.annotation.GetMapping;

import backend.buenavida.Models.ConecciónDB;

@Controller
public class InmuebleController {
    
    @Autowired
    InmuebleRepo inmuebleRepo;

    public InmuebleController(InmuebleRepo inmuebleRepo){
        this.inmuebleRepo = inmuebleRepo;
    }

    @GetMapping("/api/inventario")
    public String obtenerInmuebles() throws SQLException {
        try {
            Statement stm = ConecciónDB.getConnection().createStatement();
            ResultSet rs = stm.executeQuery("select * from inmuebles");
            ResultSet propietario = stm.executeQuery("select nombre from propietarios where id = " + rs.getInt(9));
            ResultSet prop_anterior = stm.executeQuery("select nombre from propietarios where id = " + rs.getInt(10));
            rs.next();
            rs.next();
            while (rs.next()) {
                int i = 1;
                while (true) {
                    System.out.print(rs.getString(i) + ", ");
                    i++;
                }
            }
            System.out.print(propietario.getString(2) + ", " + prop_anterior.getString(2));
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

        return "/inventario.html";
    }
}
