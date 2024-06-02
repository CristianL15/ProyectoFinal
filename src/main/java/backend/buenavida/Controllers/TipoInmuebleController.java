package backend.buenavida.Controllers;

import java.sql.*;
import backend.buenavida.Models.*;

public class TipoInmuebleController {

    public void agregarTipoInmueble(String nombre) {
        Connection connection = ConecciónDB.getConnection();
		try {
			String query1 = "select * from tipo_inmueble";
			String query2 = "insert into tipo_inmueble (nombre) values (?)";
			PreparedStatement stmt = connection.prepareStatement(query1);
			// stmt.setString(0, "casa");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1) + ", " + rs.getString(2));
			}

			connection.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
		}
    }
}
