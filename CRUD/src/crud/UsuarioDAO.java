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
public class UsuarioDAO 
{
    // CREAR
    public boolean agregarLinea(String name, String country, String code, String web)
    {
        String query = "INSERT INTO list_of_universities (name, country, code, web) VALUES (?, ?, ?, ?)";
        try (Connection conecion = conexion.getConnection();
                PreparedStatement stata = conecion.prepareStatement(query)){
            stata.setString(1, name);
            stata.setString(2, country);
            stata.setString(3, code);
            stata.setString(4, web);
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
        String query = "SELECT * FROM `list_of_universities`";
        List<String> usuarios = new ArrayList<>();
        try 
           (Connection conecion = conexion.getConnection();
           Statement stat = conecion.createStatement();
           ResultSet rs = stat.executeQuery(query)){
           
           while (rs.next())
           {
                      usuarios.add("ID: "+rs.getInt("ID")+
                      ", Nombre: " + rs.getString("name")+
                      ", Country: " + rs.getString("country")+
                      ", Codigo: " + rs.getString("code")+
                      ", Web: " + rs.getString("web"));
           }
        } catch (Exception e) {
            System.err.println("error al mostrar: " + e.getMessage());
        }
        return usuarios;
    }
    //ACTUALIZAR
    public boolean actualizar_lista(int id, String name, String country, String code, String web)
    {
        String query = "UPDATE list_of_universities SET name = ?, country = ?, code = ?, web = ? WHERE ID = ?";
        
        try (Connection conecion = conexion.getConnection();
                PreparedStatement pst = conecion.prepareStatement(query)) 
        {
            pst.setString(1, name);
            pst.setString(2, country);
            pst.setString(3, code);
            pst.setString(4, web);
            pst.setInt(5, id);
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
        String query = "DELETE FROM list_of_universities WHERE ID = ?";
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
    public String buscarUser(int id)
    {
        String query = "SELECT * FROM list_of_universities WHERE ID = ?";
        try (Connection concceion = conexion.getConnection();
                PreparedStatement pst = concceion.prepareStatement(query))
        {
            pst.setInt(1, id);
            try (ResultSet rs = pst.executeQuery())
            {
                if(rs.next())
                {
                    return "ID: " + rs.getInt("ID")+
                            ", NAME: " + rs.getString("name")+
                            ", COUNTRY: " + rs.getString("country")+
                            ", CODE: " + rs.getString("code")+
                            ", WEB: "+rs.getString("code");
                }
                else
                {
                    System.out.println("USUARIO NO ENCONTRADO: " + id);
                }
            } 
        } 
        catch (Exception e) 
        {
            System.out.println("Error al buscar " + e.getMessage());
            
        }
        return "Error al hacer la busqeda";
    }
}
