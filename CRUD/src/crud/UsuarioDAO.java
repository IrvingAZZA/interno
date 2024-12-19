/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author sistemas03
 */
public class UsuarioDAO {
    // CREAR
    public boolean agregarLinea(String id, String name, String country, String code, String web)
    {
        String query = "INSERT INTO list_of_universities(COL 1, COL 2, COL 3,COL 4,COL 5) VALUES (?, ?, ?, ?, ?)";
        try (Connection conecion = conexion.getConnection();
                PreparedStatement stata = conecion.prepareStatement(query)){
            stata.setString(1, id);
            stata.setString(2, name);
            stata.setString(3, country);
            stata.setString(4, code);
            stata.setString(5, web);
            stata.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("Error al agregar el usuario" +e.getMessage());
            return false;
        }
    }
}
