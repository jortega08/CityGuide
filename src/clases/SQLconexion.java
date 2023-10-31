package clases;


import java.sql.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
        
public class SQLconexion {
     
    public static String UrL = "jdbc:mysql://localhost:3306/login_guit?useSSL=false&serverTimezone=America/Los_Angeles";
    public static String Usuario = "root";
    public static String Contraseña = "1234";
 
    public static Connection conectar(){
        Connection conexion = null;
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(UrL, Usuario, Contraseña);
            System.out.println("Conexion establecida");
        }catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println("Error: "+e);
        }
        return conexion;
    }
    
    public static void desconectar(){
        Connection conexion = null;
        if (conexion==null) {
            System.out.println("La variable de conexion ha sido puesta nula");
        }
    }
}
