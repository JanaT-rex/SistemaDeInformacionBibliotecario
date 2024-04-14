package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConexionDB {
    Connection conectar= null;
    String usuario= "root";
    String contraseña= "misuperclave";
    String bd= "biblioteca";
    String ip= "localhost";
    String puerto= "3306";
    String cadena= "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    public Connection establecerConexion (){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar= DriverManager.getConnection(cadena,usuario,contraseña);
   //         JOptionPane.showMessageDialog(null, "Se conecto con la base de datos");
        }catch (Exception e){
         //     JOptionPane.showMessageDialog(null, "No se conecto con la base de datos");
        }
        return conectar;
    }
    public void cerrarConexion(){
        try{
            if (conectar != null && !conectar.isClosed()){
                conectar.close();
            //    JOptionPane.showMessageDialog(null, "Conexion cerrada");
            }   
        }catch (Exception e){
         //    JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexion");
        }    
    }  
}
