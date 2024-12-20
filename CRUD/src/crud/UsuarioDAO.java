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
    
    // MOSTRAR
    public List<String> Mostrar_Tabla()
    {
        String query = "SELECT * FROM list_of_universities";
        List<String> usuarios = new ArrayList<>();
        try 
           (Connection conecion = conexion.getConnection();
           Statement stat = conecion.createStatement();
           ResultSet rs = stat.executeQuery(query)){
           
           while (rs.next())
           {
               System.out.println(" EL ID ES: " + rs.getString("COL 1"));
               System.out.println(" EL NOMBRE ES: " + rs.getString("COL 2"));
               System.out.println(" EL COUNTRY ES: " + rs.getString("COL 3"));
               System.out.println(" EL CODE ES: " + rs.getString("COL 4"));
               System.out.println(" EL WEB ES: " + rs.getString("COL 5"));
               System.out.println("----------------------------------------");
           }
        } catch (Exception e) {
            System.err.println("error al mostrar: " + e.getMessage());
        }
        return usuarios;
    }
    //ACTUALIZAR
    public boolean actualizar_lista(String id, String name, String country, String code, String web)
    {
        String query = "UPDATE list_of_universities SET COL 1 = ?,COL 2 = ?, COL 3 = ?, COL 4 = ?, COL 5 = ? WHERE COL 1 = ?";
        
        try (Connection conecion = conexion.getConnection();
                PreparedStatement pst = conecion.prepareStatement(query)) 
        {
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, country);
            pst.setString(4, code);
            pst.setString(5, web);
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("no se puedo actualizar la lista: "+ e.getMessage());
            return false;
        }
    }
    //BORRAR
    public boolean Eliminar_registro(String id)
    {
        String query = "DELETE FROM list_of_universities WHERE COL 1 = ?";
        try (Connection conecion = conexion.getConnection();
                PreparedStatement pst = conecion.prepareStatement(query))
        {
            pst.setString(1, id);
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("nO SE PUDO BORRAR EL REGISTRO: "+e.getMessage());
            return false;
        }
    }
    
}
