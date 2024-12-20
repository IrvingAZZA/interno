/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sistemas03
 */
public class CRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UsuarioDAO usuariodao = new UsuarioDAO();
        Scanner scanner  = new Scanner(System.in);
        
        int opcion;
        do {            
            System.out.println("\n--- Menú CRUD ---");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Ver usuarios");
            System.out.println("3. Actualizar usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    System.out.print("NOMBRE: ");
                    String nombre = scanner.nextLine();
                    System.out.print("country: ");
                    String countr = scanner.nextLine();
                    System.out.print("CODE: ");
                    String code = scanner.nextLine();
                    System.out.print("WEB: ");
                    String web = scanner.nextLine();
                    
                    if (usuariodao.agregarLinea(id,nombre,countr,code,web)) 
                    {
                        System.out.println("INGRESADO CORRECTAMENTE ");
                    }
                    break;
                case 2:
                    List<String> usuarios = usuariodao.Mostrar_Tabla();
                    if(usuarios.isEmpty())
                    {
                        System.out.println("NO hay usuario registrados. ");
                    }else
                    {
                        System.out.println("\n---la lista es: ----");
                        usuarios.forEach(System.out::println);
                    }
                    break;
                case 3:
                    System.out.println("el ID a actualizar es: ");
                    String idactualizar = scanner.nextLine();
                    
                default:
                    throw new AssertionError();
            }
        } while (true);
    }
    
}
