/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author sistemas03
 */
public class PruebaMysql {
//DATOS PARA LA CONEXION
    private static final String URL = "jdbC:mysql://localhost:3306/csv_db 6";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection connexion = null;
        try {
            // aqui es donde se conecta 
            connexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa a BD ");
            
            //CONSULTA A LA BASE DE DATOS PARA PROBAR
            String query = "SELECT * FROM list_of_universities";
            PreparedStatement statment = connexion.prepareStatement(query);
            ResultSet resultset = statment.executeQuery();
            
            while (resultset.next())
            {
                System.out.println("ID: " + resultset.getString("COL 1"));
                System.out.println("NAME: " + resultset.getString("COL 2"));
                System.out.println("COUNTRY: " + resultset.getString("COL 3"));
                System.out.println("CODE: " + resultset.getString("COL 4"));
                System.out.println("WEB: " + resultset.getString("COL 5"));
                System.out.println("-------------------------------");
            }
            //cerrar los recursos 
            resultset.close();
            statment.close();
        } catch (Exception e) {
            System.err.println("Error en la conexion de BD. " +e.getMessage() );
        }finally{
            if(connexion != null){
                try{
                    connexion.close();
                    System.out.println("Conneccion cerrada");
                }catch (Exception EX){
                    System.err.println("Error al cerrar la aplicacion "+ EX.getMessage());
                }
            }
        }   
    }
}
