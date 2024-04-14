
package Clases;

import com.toedter.calendar.JDateChooser;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class CActividades {
    
     public void prestamo(JTextField txtAlumno, JTextField txtIdLibro, JDateChooser prestado) {
        Clases.conexion_bd con = new Clases.conexion_bd();
        String consulta = "insert into actividadprestamo (id_lector, id_lib, fecha_prestamo) values (?,?,?)";
        try {
            CallableStatement cs = con.establecerConexion().prepareCall(consulta);
            cs.setString(1, txtAlumno.getText());
            cs.setString(2, txtIdLibro.getText());
           try {
            java.sql.Date fechaPrestamo = new java.sql.Date(prestado.getDate().getTime());
            cs.setDate(3, fechaPrestamo);

          //   JOptionPane.showMessageDialog(null, "Se agrego el prestamo a la base de datos" );
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "No se puede ajustar la fecha: " + e.getMessage());
}
            cs.execute();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar actividad" + e.toString());
        } finally {
            con.cerrarConexion();
        }
    }
   
     public void devolucion(JTextField txtAlumno, JTextField txtIdLibro, JDateChooser devolver) {
        Clases.conexion_bd con = new Clases.conexion_bd();
        String consulta = "insert into actividaddevolucion (id_lector, id_lib, fecha_devolucion) values (?,?,?)";
        try {
            CallableStatement cs = con.establecerConexion().prepareCall(consulta);
            cs.setString(1, txtAlumno.getText());
            cs.setString(2, txtIdLibro.getText());
           try {
            java.sql.Date fechaDevolucion = new java.sql.Date(devolver.getDate().getTime());
            cs.setDate(3, fechaDevolucion);

} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "No se puede ajustar la fecha: " + e.getMessage());
}
            cs.execute();
             //   JOptionPane.showMessageDialog(null, "Se agrego la devolucion a la base de datos" );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar actividad" + e.toString());
        } finally {
            con.cerrarConexion();
        }
    }
     
        public void mostrarAPrestamos (JTable tabla_info){
       conexion_bd tablacx= new conexion_bd();
        DefaultTableModel modelo= new DefaultTableModel();
        TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modelo);
        tabla_info.setRowSorter(OrdenaTabla);
        modelo.addColumn("Id");
         modelo.addColumn("Id_lector");
          modelo.addColumn("Rol");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Grado");
        modelo.addColumn("Grupo");
        modelo.addColumn("Turno");
        modelo.addColumn("Id_libro");
        modelo.addColumn("Titulo");
        modelo.addColumn("Fecha_prestamo");
               tabla_info.setModel(modelo);
 String sql= "select actividadprestamo.id_APrestamo, actividadprestamo.id_lector, lectores.nombre, lectores.apellido, lectores.grado, lectores.grupo, lectores.turno, lectores.asignacion, actividadprestamo.id_lib, libros.titulo, actividadprestamo.fecha_prestamo from actividadprestamo\n" +
"inner join lectores on actividadprestamo.id_lector = lectores.id_lector\n" +
"inner join libros on actividadprestamo.id_lib = libros.id_lib;";  
       try{
           Statement st = tablacx.establecerConexion().createStatement();
           ResultSet rs= st.executeQuery(sql);
           
           while (rs.next()){
           String id_APrestamo= rs.getString("id_APrestamo");
           String id_lector= rs.getString("id_lector");
              String asignacion= rs.getString("asignacion");
            String nombre= rs.getString("nombre");
           String apellido= rs.getString("apellido");
           String grado= rs.getString("grado");
           String grupo= rs.getString("grupo");
           String turno= rs.getString("turno");
           String id_lib= rs.getString("id_lib");
           String titulo= rs.getString("titulo");
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date fechaSQLPrestamo = rs.getDate("fecha_prestamo");
            String presFecha = (fechaSQLPrestamo != null) ? sdf.format(fechaSQLPrestamo) : "";
            

          modelo.addRow(new Object[]{id_APrestamo,id_lector,asignacion,nombre,apellido,grado, grupo,turno,id_lib,titulo, presFecha});
      }
        tabla_info.setModel(modelo);
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error al mostrar prestamo, error; " +e.toString());
       }
        finally {
           tablacx.cerrarConexion();
       }
    }
           public void mostrarADevoluciones (JTable tabla_info){
       conexion_bd tablacx= new conexion_bd();
        DefaultTableModel modelo= new DefaultTableModel();
        TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modelo);
        tabla_info.setRowSorter(OrdenaTabla);
        modelo.addColumn("Id");
         modelo.addColumn("Id_lector");
          modelo.addColumn("Rol");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Grado");
        modelo.addColumn("Grupo");
        modelo.addColumn("Turno");
        modelo.addColumn("Id_libro");
        modelo.addColumn("Titulo");
        modelo.addColumn("Fecha_devolucion");
               tabla_info.setModel(modelo);
 String sql= "select actividaddevolucion.id_ADevolucion, actividaddevolucion.id_lector, lectores.nombre, lectores.apellido, lectores.grado, lectores.grupo, lectores.turno, lectores.asignacion, actividaddevolucion.id_lib, libros.titulo, actividaddevolucion.fecha_devolucion from actividaddevolucion\n" +
"inner join lectores on actividaddevolucion.id_lector = lectores.id_lector\n" +
"inner join libros on actividaddevolucion.id_lib = libros.id_lib;";  
       try{
           Statement st = tablacx.establecerConexion().createStatement();
           ResultSet rs= st.executeQuery(sql);
           
           while (rs.next()){
           String id_ADevolucion= rs.getString("id_ADevolucion");
           String id_lector= rs.getString("id_lector");
              String asignacion= rs.getString("asignacion");
            String nombre= rs.getString("nombre");
           String apellido= rs.getString("apellido");
           String grado= rs.getString("grado");
           String grupo= rs.getString("grupo");
           String turno= rs.getString("turno");
           String id_lib= rs.getString("id_lib");
           String titulo= rs.getString("titulo");
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date fechaSQLPrestamo = rs.getDate("fecha_devolucion");
            String presFecha = (fechaSQLPrestamo != null) ? sdf.format(fechaSQLPrestamo) : "";
            

          modelo.addRow(new Object[]{id_ADevolucion,id_lector,asignacion,nombre,apellido,grado, grupo,turno,id_lib,titulo, presFecha});
      }
        tabla_info.setModel(modelo);
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error al mostrar prestamo, error; " +e.toString());
       }
        finally {
           tablacx.cerrarConexion();
       }
    }
           //CRUD PRESTAMOS          
 
}
