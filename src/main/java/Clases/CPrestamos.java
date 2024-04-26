
package Clases;

import Interfaz.CRUD_prestamos;
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.Component;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class CPrestamos {
       //Agregar prestamo
      
        //Mostrar
       public void mostrar (JTable tabla_info){
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
        modelo.addColumn("Fecha_devolución");
               tabla_info.setModel(modelo);
 String sql= "select prestamos.id_prestamo, prestamos.id_lector, lectores.nombre, lectores.apellido, lectores.grado, lectores.grupo, lectores.turno, lectores.asignacion, prestamos.id_lib, libros.titulo, prestamos.fecha_prestamo, prestamos.fecha_devolucion from prestamos \n" +
"inner join lectores on prestamos.id_lector = lectores.id_lector\n" +
"inner join libros on prestamos.id_lib = libros.id_lib;";  
       try{
           Statement st = tablacx.establecerConexion().createStatement();
           ResultSet rs= st.executeQuery(sql);
           
           while (rs.next()){
           String id_prestamo= rs.getString("id_prestamo");
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
            
            java.sql.Date fechaSQLDevolucion = rs.getDate("fecha_devolucion");
            String devoFecha = (fechaSQLDevolucion != null) ? sdf.format(fechaSQLDevolucion) : "";

          modelo.addRow(new Object[]{id_prestamo,id_lector,asignacion,nombre,apellido,grado, grupo,turno,id_lib,titulo, presFecha, devoFecha});
      }
        tabla_info.setModel(modelo);
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error al mostrar los prestamos");
       }
        finally {
           tablacx.cerrarConexion();
       }
    }
       //seleccionar datos
        public void SeleccionarPrestamo (JTable tabla_info, JTextField txtId, JTextField txtAlumno, JTextField txtIdLibro, JDateChooser prestado, JDateChooser devolver){
        int fila= tabla_info.getSelectedRow();
        if (fila>=0){
            txtId.setText(tabla_info.getValueAt(fila,0).toString());
            txtAlumno.setText(tabla_info.getValueAt(fila,1).toString());
            txtIdLibro.setText(tabla_info.getValueAt(fila,8).toString());
            
              try{
               SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaPrestamo = formatoFecha.parse(tabla_info.getValueAt(fila, 10).toString());
            prestado.setDate(fechaPrestamo);
            Date fechaDevolucion = formatoFecha.parse(tabla_info.getValueAt(fila, 11).toString());
            devolver.setDate(fechaDevolucion);          
          }catch (Exception e){
              JOptionPane.showMessageDialog(null,"No se puede ajustar la fecha");
          }
          
                }
        }
       public void ModificarPrestamo(JTextField txtId, JTextField txtAlumno, JTextField txtIdLibro, JDateChooser prestado, JDateChooser devolver) {
    Clases.conexion_bd objetoConexion = new Clases.conexion_bd();
    String consulta = "UPDATE prestamos SET id_lector=?, id_lib=?, fecha_prestamo=?, fecha_devolucion=? WHERE id_prestamo=?";
    
    try {
        CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);

        cs.setString(1, txtAlumno.getText());
         cs.setString(2, txtIdLibro.getText());
        Date fprestamo = prestado.getDate();
        java.sql.Date fechaPrestamo = new java.sql.Date(fprestamo.getTime());
        cs.setDate(3, fechaPrestamo); 
        Date fdevolucion = devolver.getDate();
        java.sql.Date fechaDevolucion = new java.sql.Date(fdevolucion.getTime());
        cs.setDate(4, fechaDevolucion);
        int idPrestamo = Integer.parseInt(txtId.getText());
        cs.setInt(5, idPrestamo);
        cs.execute();
        JOptionPane.showMessageDialog(null, "Se actualizó el registro correctamente");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar el registro");
    } finally {
        objetoConexion.cerrarConexion();
    }
}
public void EliminarPrestamo(JTextField txtId){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "delete from prestamos where id_prestamo=?";
    try{
        CallableStatement cs= conexion.establecerConexion().prepareCall(consulta);
        cs.setInt(1, Integer.parseInt(txtId.getText()));
        cs.execute();
        JOptionPane.showMessageDialog(null, "Se elimino el registro correctamente");
        
    }catch (Exception e){
         JOptionPane.showMessageDialog(null, "Error al eliminar el registro"); 
    }
    finally{
        conexion.cerrarConexion();
    }
}
//Buscar ALUMNO
 public void BuscarLector(JTextField txtAlumno, JTable tabla_prestamos){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "select*from lectores where id_lector= ?";
    try{
        PreparedStatement ps= conexion.establecerConexion().prepareStatement(consulta);
        ps.setInt(1, Integer.parseInt(txtAlumno.getText()));
        ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Apellido");
            modeloTabla.addColumn("Grado");
            modeloTabla.addColumn("Grupo");
            modeloTabla.addColumn("Turno");
            modeloTabla.addColumn("Rol");
              if (rs.next()) {
                do {
                    Object[] fila = {
                        rs.getInt("id_lector"),   
                        rs.getString("nombre"),
                         rs.getString("apellido"),
                        rs.getString("grado"),
                        rs.getString("grupo"),
                        rs.getString("turno"),
                        rs.getString("asignacion")
                    };
                    modeloTabla.addRow(fila);
                } while (rs.next());
                tabla_prestamos.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontró el lector correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No se encontró el lector con el ID proporcionado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el lector");
        } finally {
            conexion.cerrarConexion();
        }
              
}
  public void BuscarLibro(JTextField txtIdLibro, JTable tabla_prestamos){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "select*from libros where id_lib= ?";
    try{
        PreparedStatement ps= conexion.establecerConexion().prepareStatement(consulta);
        ps.setInt(1, Integer.parseInt(txtIdLibro.getText()));
        ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Titulo");
            modeloTabla.addColumn("Autor");
            modeloTabla.addColumn("Editorial");
            modeloTabla.addColumn("Categoria");
            modeloTabla.addColumn("Cantidad");
              modeloTabla.addColumn("Ejemplares");
              if (rs.next()) {
                do {
                    Object[] fila = {
                        rs.getInt("id_lib"),   
                        rs.getString("titulo"),
                         rs.getString("autor"),
                        rs.getString("editorial"),
                        rs.getString("categoria"),
                        rs.getInt("cantidad"),
                         rs.getInt("ejemplares")
                        
                    };
                    modeloTabla.addRow(fila);
                } while (rs.next());
                tabla_prestamos.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontró el libro correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No se encontró el libro con el ID proporcionado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el libro");
        } finally {
            conexion.cerrarConexion();
        }
              
}
              public void BuscarPrestamo(JTextField txtId, JTable tabla_prestamos){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "select prestamos.id_prestamo, prestamos.id_lector, lectores.nombre, lectores.apellido, lectores.grado, lectores.grupo, lectores.turno, lectores.asignacion, prestamos.id_lib, libros.titulo, prestamos.fecha_prestamo, prestamos.fecha_devolucion  from prestamos\n" +
"inner join lectores on prestamos.id_lector = lectores.id_lector\n" +
"inner join libros on prestamos.id_lib = libros.id_lib\n" +
"where prestamos.id_prestamo= ?;";
    try{
        PreparedStatement ps= conexion.establecerConexion().prepareStatement(consulta);
        ps.setInt(1, Integer.parseInt(txtId.getText()));
        ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("ID");
             modeloTabla.addColumn("Id_Lector");
            modeloTabla.addColumn("Nombre");
             modeloTabla.addColumn("Apellidos");
              modeloTabla.addColumn("Grado");
               modeloTabla.addColumn("Grupo");
                modeloTabla.addColumn("Turno");
                modeloTabla.addColumn("Rol");
                 modeloTabla.addColumn("Id_Libro");
                 modeloTabla.addColumn("Titulo");
                 modeloTabla.addColumn("Fecha_prestamo");
                  modeloTabla.addColumn("Fecha_devolucion");
                 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
              if (rs.next()) {
                do {
                    Object[]
                    fila = {   
                        rs.getInt("id_prestamo"),
                        rs.getInt("id_lector"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("grado"),
                        rs.getString("grupo"),
                        rs.getString("turno"),
                        rs.getString("asignacion"),
                        rs.getInt("id_lib"),
                        rs.getString("titulo"),
                        sdf.format(rs.getDate("fecha_prestamo")),
                sdf.format(rs.getDate("fecha_devolucion"))
                    };
              if (rs.next()) {
                    };
                    modeloTabla.addRow(fila);
                } while (rs.next());
                tabla_prestamos.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontró el prestamo correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No se encontró el prestamo con el ID proporcionado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el prestamo");
        } finally {
            conexion.cerrarConexion();
        }
              
}
  
public void Devolucion(JTextField txtId, JTextField txtIdLibro) {
    Clases.conexion_bd conexion = new Clases.conexion_bd();
    String ejemplar = "UPDATE libros SET ejemplares = ejemplares+1 WHERE id_lib = ?;";
    String consulta = "DELETE FROM prestamos WHERE id_prestamo=?";

    int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro de realizar la devolución del libro?", "Confirmar devolución", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        try {
            PreparedStatement psLibro = conexion.establecerConexion().prepareStatement(ejemplar);
            psLibro.setInt(1, Integer.parseInt(txtIdLibro.getText()));
            psLibro.executeUpdate();

            CallableStatement cs = conexion.establecerConexion().prepareCall(consulta);
            cs.setInt(1, Integer.parseInt(txtId.getText()));
            cs.execute();
            JOptionPane.showMessageDialog(null, "El libro se devolvió exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No fue posible devolver el libro solicitado");
        } finally {
            conexion.cerrarConexion();
        }
    } else {
        JOptionPane.showMessageDialog(null, "Operación abortada");
    }
}


    
     public void BuscarLibroPrestado(JTextField txtIdLibro, JTable tabla_prestamos){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "select prestamos.id_prestamo, prestamos.id_lector, lectores.nombre, lectores.apellido, lectores.grado, lectores.grupo, lectores.turno, lectores.asignacion, prestamos.id_lib, libros.titulo, prestamos.fecha_prestamo, prestamos.fecha_devolucion from prestamos \n" +
"inner join lectores on prestamos.id_lector = lectores.id_lector\n" +
"inner join libros on prestamos.id_lib = libros.id_lib\n" +
"where prestamos.id_lib = ? ;";
    try{
        PreparedStatement ps= conexion.establecerConexion().prepareStatement(consulta);
        ps.setInt(1, Integer.parseInt(txtIdLibro.getText()));
        ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("ID");
             modeloTabla.addColumn("Id_Lector");
             modeloTabla.addColumn("Rol");
            modeloTabla.addColumn("Nombre");
             modeloTabla.addColumn("Apellidos");
              modeloTabla.addColumn("Grado");
               modeloTabla.addColumn("Grupo");
                modeloTabla.addColumn("Turno");
                   modeloTabla.addColumn("Id_Libro");
               modeloTabla.addColumn("Titulo");
            modeloTabla.addColumn("Fecha_prestamo");
                  modeloTabla.addColumn("Fecha_devolucion");
                   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
              if (rs.next()) {
                do {
                    Object[] fila = {
                        rs.getInt("id_prestamo"),  
                        rs.getInt("id_lector"),
                        rs.getString("asignacion"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                          rs.getString("grado"),
                            rs.getString("grupo"),
                              rs.getString("turno"),
                                rs.getInt("id_lib"),
                         rs.getString("titulo"),
                                 sdf.format(rs.getDate("fecha_prestamo")),
                           sdf.format(rs.getDate("fecha_devolucion"))
                    };
                    modeloTabla.addRow(fila);
                } while (rs.next());
                tabla_prestamos.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontró el libro prestado correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No se encontró el prestamo con el ID proporcionado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el prestamo");
        } finally {
            conexion.cerrarConexion();
            
        } 

}
       public void BuscarLectorDelPrestamo(JTextField txtAlumno, JTable tabla_prestamos){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "select prestamos.id_prestamo, prestamos.id_lector, lectores.nombre, lectores.apellido, lectores.grado, lectores.grupo, lectores.turno, lectores.asignacion, prestamos.id_lib, libros.titulo, prestamos.fecha_prestamo, prestamos.fecha_devolucion from prestamos \n" +
"inner join lectores on prestamos.id_lector = lectores.id_lector\n" +
"inner join libros on prestamos.id_lib = libros.id_lib\n" +
"where prestamos.id_lector = ? ;";
    try{
        PreparedStatement ps= conexion.establecerConexion().prepareStatement(consulta);
        ps.setInt(1, Integer.parseInt(txtAlumno.getText()));
        ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("ID");
             modeloTabla.addColumn("Id_Lector");
             modeloTabla.addColumn("Rol");
            modeloTabla.addColumn("Nombre");
             modeloTabla.addColumn("Apellidos");
              modeloTabla.addColumn("Grado");
               modeloTabla.addColumn("Grupo");
                modeloTabla.addColumn("Turno");
                 modeloTabla.addColumn("Id_Libro");
               modeloTabla.addColumn("Titulo");
            modeloTabla.addColumn("Fecha_prestamo");
                  modeloTabla.addColumn("Fecha_devolucion");
                   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
              if (rs.next()) {
                do {
                    Object[] fila = {
                        rs.getInt("id_prestamo"),  
                        rs.getInt("id_lector"),
                        rs.getString("asignacion"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                          rs.getString("grado"),
                            rs.getString("grupo"),
                              rs.getString("turno"),
                                 rs.getInt("id_lib"),
                         rs.getString("titulo"),
                                 sdf.format(rs.getDate("fecha_prestamo")),
                           sdf.format(rs.getDate("fecha_devolucion"))
                    };
                    modeloTabla.addRow(fila);
                } while (rs.next());
                tabla_prestamos.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontró el libro prestado correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No se encontró el prestamo con el ID proporcionado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el prestamo");
        } finally {
            conexion.cerrarConexion();
        }
      
       }
         public void BuscarFechaPrestamos(JDateChooser prestamo, JTable tabla_prestamos){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "select prestamos.id_prestamo, prestamos.id_lector, lectores.nombre, lectores.apellido, lectores.grado, lectores.grupo, lectores.turno, lectores.asignacion, prestamos.id_lib, libros.titulo, prestamos.fecha_prestamo, prestamos.fecha_devolucion from prestamos \n" +
"inner join lectores on prestamos.id_lector = lectores.id_lector\n" +
"inner join libros on prestamos.id_lib = libros.id_lib\n" +
"where prestamos.fecha_prestamo = ? ;";
   try {
        java.util.Date fechaSeleccionada = prestamo.getDate();
        java.sql.Date fechaPrestamo = new java.sql.Date(fechaSeleccionada.getTime());

        PreparedStatement ps = conexion.establecerConexion().prepareStatement(consulta);
        ps.setDate(1, fechaPrestamo);
        ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("ID");
             modeloTabla.addColumn("Id_Lector");
             modeloTabla.addColumn("Rol");
            modeloTabla.addColumn("Nombre");
             modeloTabla.addColumn("Apellidos");
              modeloTabla.addColumn("Grado");
               modeloTabla.addColumn("Grupo");
                modeloTabla.addColumn("Turno");
                 modeloTabla.addColumn("Id_Libro");
               modeloTabla.addColumn("Titulo");
            modeloTabla.addColumn("Fecha_prestamo");
                  modeloTabla.addColumn("Fecha_devolucion");
                   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
              if (rs.next()) {
                do {
                    Object[] fila = {
                        rs.getInt("id_prestamo"),  
                        rs.getInt("id_lector"),
                        rs.getString("asignacion"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                          rs.getString("grado"),
                            rs.getString("grupo"),
                              rs.getString("turno"),
                                 rs.getInt("id_lib"),
                         rs.getString("titulo"),
                                 sdf.format(rs.getDate("fecha_prestamo")),
                           sdf.format(rs.getDate("fecha_devolucion"))
                    };
                    modeloTabla.addRow(fila);
                } while (rs.next());
                tabla_prestamos.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontraron los prestamos correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No hay prestamos con la fecha indicada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el prestamo");
        } finally {
            conexion.cerrarConexion();
        }
      
       }
           public void BuscarFechaDevoluciones(JDateChooser devolver, JTable tabla_prestamos){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "select prestamos.id_prestamo, prestamos.id_lector, lectores.nombre, lectores.apellido, lectores.grado, lectores.grupo, lectores.turno, lectores.asignacion, prestamos.id_lib, libros.titulo, prestamos.fecha_prestamo, prestamos.fecha_devolucion from prestamos \n" +
"inner join lectores on prestamos.id_lector = lectores.id_lector\n" +
"inner join libros on prestamos.id_lib = libros.id_lib\n" +
"where prestamos.fecha_devolucion = ? ;";
   try {
        java.util.Date fechaSeleccionada = devolver.getDate();
        java.sql.Date fechaDevolucion = new java.sql.Date(fechaSeleccionada.getTime());

        PreparedStatement ps = conexion.establecerConexion().prepareStatement(consulta);
        ps.setDate(1, fechaDevolucion);
        ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("ID");
             modeloTabla.addColumn("Id_Lector");
             modeloTabla.addColumn("Rol");
            modeloTabla.addColumn("Nombre");
             modeloTabla.addColumn("Apellidos");
              modeloTabla.addColumn("Grado");
               modeloTabla.addColumn("Grupo");
                modeloTabla.addColumn("Turno");
                 modeloTabla.addColumn("Id_Libro");
               modeloTabla.addColumn("Titulo");
            modeloTabla.addColumn("Fecha_prestamo");
                  modeloTabla.addColumn("Fecha_devolucion");
                   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
              if (rs.next()) {
                do {
                    Object[] fila = {
                        rs.getInt("id_prestamo"),  
                        rs.getInt("id_lector"),
                        rs.getString("asignacion"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                          rs.getString("grado"),
                            rs.getString("grupo"),
                              rs.getString("turno"),
                                 rs.getInt("id_lib"),
                         rs.getString("titulo"),
                                 sdf.format(rs.getDate("fecha_prestamo")),
                           sdf.format(rs.getDate("fecha_devolucion"))
                    };
                    modeloTabla.addRow(fila);
                } while (rs.next());
                tabla_prestamos.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontraron los datos correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No hay devoluciones con la fecha indicada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el prestamo");
        } finally {
            conexion.cerrarConexion();
        }
      
       }
 public void Limpiar(JTextField txtId, JTextField txtAlumno,JTextField txtIdLibro, JDateChooser prestado, JDateChooser devolver) {
      txtId.setText("");
      txtAlumno.setText("");
      txtIdLibro.setText("");
      prestado.setCalendar(null);
      devolver.setCalendar(null);
    }
  
public void eliminarPrestamoTabla(JTable tabla_info) {
    Clases.conexion_bd con = new Clases.conexion_bd();
    String consulta = "DELETE FROM prestamos WHERE id_prestamo = ?";
    int fila = tabla_info.getSelectedRow();
    
    int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el registro?", "Confirmar operación", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
    if (fila >= 0) {
        try {
            int idPrestamo = Integer.parseInt((String) tabla_info.getValueAt(fila, 0));
            CallableStatement cs = con.establecerConexion().prepareCall(consulta);
            cs.setInt(1, idPrestamo);
            int filasAfectadas = cs.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Se eliminó el registro correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el registro con ID: " + idPrestamo);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el ID del registro");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
        } finally {
            con.cerrarConexion(); // Cerrar la conexión después de su uso
        }
    } else {
        JOptionPane.showMessageDialog(null, "No se seleccionó ninguna fila para eliminar");
    } 
}else {
           JOptionPane.showMessageDialog(null, "Operación abortada"); 
            }
}

public void editarPrestamoTabla (JTable tabla_info) {
      Clases.conexion_bd con = new Clases.conexion_bd();
    String sql = "UPDATE prestamos SET id_lector=?, id_lib=?, fecha_prestamo=?, fecha_devolucion=? WHERE id_prestamo=?";
    String actividad = "UPDATE actividadprestamo SET id_lector=?, id_lib=?, fecha_prestamo=? WHERE id_APrestamo=?";

    int fila = tabla_info.getSelectedRow();
    if (fila >=0) {
    try {
        String Prestamo = tabla_info.getValueAt(fila, 0).toString();
        String Lector = tabla_info.getValueAt(fila, 1).toString();
        String Libro = tabla_info.getValueAt(fila, 8).toString();
        String FechaPrestamo = tabla_info.getValueAt(fila, 10).toString();
        String FechaDevolucion = tabla_info.getValueAt(fila, 11).toString();

       CallableStatement  cs = con.establecerConexion().prepareCall(sql);
       CallableStatement  csAct = con.establecerConexion().prepareCall(actividad);
       
        String idLector = JOptionPane.showInputDialog(null, "Id del Lector: ", "Lector del prestamo " + Prestamo, JOptionPane.PLAIN_MESSAGE, null, null, Lector).toString();
        String idLibro = JOptionPane.showInputDialog(null, "Id del Libro: ", "Libro del prestamo " + Prestamo, JOptionPane.PLAIN_MESSAGE, null, null, Libro).toString();
    
        String fechaPrestamo = JOptionPane.showInputDialog(null, "Ingrese la fecha de prestamo:", "Fecha de prestamo del prestamo " + Prestamo, JOptionPane.PLAIN_MESSAGE, null, null, FechaPrestamo).toString();
        
        String fechaDevolucion = JOptionPane.showInputDialog(null, "Fecha de devolucion: ", "Fecha de devolucion del prestamo " + Prestamo, JOptionPane.PLAIN_MESSAGE, null, null, FechaDevolucion).toString();
      
       
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date FechaP = sdf.parse(fechaPrestamo);
        Date FechaD = sdf.parse(fechaDevolucion);
        SimpleDateFormat FormatoSalida = new SimpleDateFormat("yyyy/MM/dd");
        String fechaNuevaP = FormatoSalida.format(FechaP);
        String fechaNuevaD = FormatoSalida.format(FechaD);

        cs.setString(1, idLector);
    
       cs.setString(2, idLibro);
        cs.setString(3, fechaNuevaP);
        cs.setString(4, fechaNuevaD);    
        cs.setString(5, Prestamo);

          csAct.setString(1, idLector);
          csAct.setString(2, idLibro);
          csAct.setString(3, fechaNuevaP);
          csAct.setString(4, Prestamo);
          
           cs.execute();
          csAct.execute();

        JOptionPane.showMessageDialog(null, "Se actualizaron los datos del prestamo " + Prestamo + " de manera exitosa.");
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "No se modifico el prestamo");
    } catch (Exception e) {  
           //   JOptionPane.showMessageDialog(null, "No se  pudo ajustar la fecha");
          }  
    finally {
        con.cerrarConexion();
    }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una fila");
        return;
    }
}
 public void Prestar(JTextField txtAlumno, JTextField txtIdLibro, JDateChooser prestado, JDateChooser devolver) {
    conexion_bd conex = new conexion_bd();
    String consulta = "INSERT INTO prestamos (id_lector, id_lib, fecha_prestamo, fecha_devolucion) VALUES (?, ?, ?, ?)";
    String disponible = "UPDATE libros SET ejemplares = ejemplares -1 WHERE id_lib = ? AND ejemplares > 0";

    try {
        Connection conn = conex.establecerConexion();
        conn.setAutoCommit(false);

        // Verificar la cantidad de libros disponibles
        PreparedStatement psVerificarCantidad = conn.prepareStatement("SELECT ejemplares FROM libros WHERE id_lib = ? AND ejemplares > 0");
        psVerificarCantidad.setInt(1, Integer.parseInt(txtIdLibro.getText()));
        ResultSet rs = psVerificarCantidad.executeQuery();

        if (rs.next()) {
            PreparedStatement psPrestamo = conn.prepareStatement(consulta);
            psPrestamo.setString(1, txtAlumno.getText());
            psPrestamo.setString(2, txtIdLibro.getText());

            java.sql.Date fechaPrestamo = new java.sql.Date(prestado.getDate().getTime());
            psPrestamo.setDate(3, fechaPrestamo);

            java.sql.Date fechaDevolucion = new java.sql.Date(devolver.getDate().getTime());
            psPrestamo.setDate(4, fechaDevolucion);
            int filasInsertadas = psPrestamo.executeUpdate();

            // Si se agregó el préstamo correctamente, actualizar la cantidad de libros prestados
            if (filasInsertadas > 0) {
                PreparedStatement psEjemplares = conn.prepareStatement(disponible);
                psEjemplares.setInt(1, Integer.parseInt(txtIdLibro.getText()));

                int actualizarCantidad = psEjemplares.executeUpdate();

                if (actualizarCantidad > 0) {
                    conn.commit(); // Confirmar la transacción
                    JOptionPane.showMessageDialog(null, "El libro se prestó exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No hay existencias disponibles para este libro");
                    conn.rollback(); // Deshacer la transacción
                }
            } else {
                JOptionPane.showMessageDialog(null, "No fue posible prestar el libro solicitado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay existencias disponibles para este libro");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al realizar el préstamo");
    } finally {
        conex.cerrarConexion();
    }
}
}   