/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package crud;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author sistemas03
 */
public class conexion {
    
    private static final String URL = "jdbC:mysql://localhost:3306/csv_db 6";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection()
    {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("CONEXION EXITOSA!!!!");
        } catch (Exception e) {
            System.err.println("error de conexion " + e.getMessage());
        }
        return conexion;
    }
}
