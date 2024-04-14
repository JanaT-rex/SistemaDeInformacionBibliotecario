
package Clases;


import com.toedter.calendar.JDateChooser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PrestamosYDevoluciones {
   public void BuscarPrestamo(JTextField txtId, JTextField txtAlumno, JTextField txtIdLibro, JDateChooser prestado, JDateChooser devolver) {
    ConexionDB conexion = new ConexionDB();
    String consulta = "SELECT * FROM prestamos WHERE id_prestamo=?";
    try {
        PreparedStatement ps = conexion.establecerConexion().prepareStatement(consulta);
        ps.setInt(1, Integer.parseInt(txtId.getText()));
        ResultSet rs = ps.executeQuery();
   
           
        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "Se encontró el registro correctamente");
            
             String id_lector = rs.getString("id_lector");
            txtAlumno.setText(id_lector);
            String id_lib = rs.getString("id_lib");
            txtIdLibro.setText(id_lib);
    try {
    java.sql.Date fecha_prestamo = rs.getDate("fecha_prestamo");
    prestado.setDate(fecha_prestamo);
    java.sql.Date fecha_devolucion = rs.getDate("fecha_devolucion");
    devolver.setDate(fecha_devolucion);
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "No se puede ajustar la fecha: " + e.getMessage());
}
          
       
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el registro con el Id proporcionado");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar el registro, error: " + e.toString());
    } finally {
        conexion.cerrarConexion();
    }
}

}
