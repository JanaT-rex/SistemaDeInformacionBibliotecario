package Clases;
import java.awt.BorderLayout;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class CUsuarios {
    public boolean iniciarSesion(JTextField usu, JPasswordField pwd) {
 Clases.conexion_bd conn = new Clases.conexion_bd();
 String query = "SELECT * FROM usuarios WHERE nombre_usu = ? AND contraseña = ?";
 
try {
 PreparedStatement ps = conn.establecerConexion().prepareStatement(query);
 String usuario = usu.getText();
 String pass = String.valueOf(pwd.getPassword());
 ps.setString(1, usuario);
 ps.setString(2, pass);
 ResultSet rs = ps.executeQuery();
 
if (rs.next()) {
 //Si se encuentra un usuario con las credenciales proporcionadas
 //JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
 return true;
 } else {
 //Si no se encuentra ningún usuario con las credenciales proporcionadas
 //JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
 return false;
 }
 } catch (SQLException e) {
 //Manejo de excepciones
 JOptionPane.showMessageDialog(null, "Error al iniciar sesión: " + e.getMessage());
 return false;
 } finally {
 //Cerrar la conexión
 conn.cerrarConexion();
 }
}
public void limpiarLogin (JTextField usu, JPasswordField pwd){
    usu.setText(" ");
   pwd.setText("");

}
   
    
    //Agregar usuario
    public void agregarUsuario (JTextField txtNombre,JTextField txtContraseña, JComboBox cbTurno){
     Clases.conexion_bd conex= new Clases.conexion_bd();
     String consulta="insert into usuarios (nombre_usu,contraseña,turno) values (?,?,?)";
     try{
     CallableStatement cs = conex.establecerConexion().prepareCall(consulta);
      cs.setString(1, txtNombre.getText());
      cs.setString(2, txtContraseña.getText());
       cs.setString(3, (String) cbTurno.getSelectedItem());
     cs.execute();
           JOptionPane.showMessageDialog(null, "Se guardo el registro del usuario");           
     }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar, error:" +e.toString());            
     }
     
 }
  public void Mostrar(JTable tabla_usuarios){
      Clases.conexion_bd tabla= new Clases.conexion_bd();
        DefaultTableModel modelo= new DefaultTableModel();
        TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modelo);
        tabla_usuarios.setRowSorter(OrdenaTabla);
        modelo.addColumn("Id");
        modelo.addColumn("Nombre_usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Turno");
               tabla_usuarios.setModel(modelo);
         tabla_usuarios.setModel(modelo);
        String sql= "select*from usuarios";
        
       try{
           Statement st = tabla.establecerConexion().createStatement();
           ResultSet rs= st.executeQuery(sql);
           
           while (rs.next()){
           String id_usu= rs.getString("id_usu");
           String nombre_usu= rs.getString("nombre_usu");
           String contraseña= rs.getString("contraseña");
           String turno= rs.getString("turno");
          modelo.addRow(new Object[]{id_usu, nombre_usu, contraseña, turno});
       }
          tabla_usuarios.setModel(modelo);
           }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error al mostrar libros, error; " +e.toString());
       }
        finally {
           tabla.cerrarConexion();
       }
    
    }
  public void BuscarUsuario(JTextField txtId, JTable tabla_usuarios){     //Buscar Usuario
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "select id_usu, nombre_usu, contraseña,turno from usuarios where id_usu= ?";
    try{
        PreparedStatement ps= conexion.establecerConexion().prepareStatement(consulta);
        ps.setInt(1, Integer.parseInt(txtId.getText()));
        ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
           TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modeloTabla);
        tabla_usuarios.setRowSorter(OrdenaTabla);
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Contraseña");
            modeloTabla.addColumn("Turno");
              if (rs.next()) {
                do {
                    Object[] fila = {
                        rs.getInt("id_usu"),
                        rs.getString("nombre_usu"),
                        rs.getString("contraseña"),
                        rs.getString("turno")
                    };
                    modeloTabla.addRow(fila);
                } while (rs.next());
                tabla_usuarios.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontró el usuario correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No se encontró el usuario con el ID proporcionado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el usuario, error: " + e.toString());
        } finally {
            conexion.cerrarConexion();
        }  }
  
  //Modificar usuario
  public void ModificarUsuario(JTextField txtId,JTextField txtNombre, JTextField txtContraseña, JComboBox cbTurno, JTable tabla_usuarios){
    Clases.conexion_bd objetoConexion= new Clases.conexion_bd (); 
    String consulta= "UPDATE usuarios set nombre_usu=?, contraseña=?, turno=? where id_usu= ? ";
    try{
        PreparedStatement ps= objetoConexion.establecerConexion().prepareStatement(consulta);
        ps.setString(1,txtNombre.getText());
        ps.setString(2,txtContraseña.getText());
        ps.setString(3, (String) cbTurno.getSelectedItem());
        ps.setInt(4, Integer.parseInt(txtId.getText()));
    int filasAfectadas = ps.executeUpdate();           
 if (filasAfectadas > 0) {
      DefaultTableModel modeloTabla = new DefaultTableModel();
        TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modeloTabla);
        tabla_usuarios.setRowSorter(OrdenaTabla);
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Contraseña");
            modeloTabla.addColumn("Turno");
             tabla_usuarios.setModel(modeloTabla);
 JOptionPane.showMessageDialog(null, "Se modificó el usuario con éxito");
    } else {
        JOptionPane.showMessageDialog(null, "No se modificó el usuario");
    }      
    }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error al actualizar el usuario, error: " +e.toString());
    }
    finally{
        objetoConexion.cerrarConexion();
    }
}

    public void SeleccionarUsuario (JTable tabla_usuarios,JTextField txtId, JTextField txtNombre, JTextField txtContraseña, JComboBox cbTurno){
      
        int fila= tabla_usuarios.getSelectedRow();
        if (fila>=0){
            txtId.setText(tabla_usuarios.getValueAt(fila,0).toString());
            txtNombre.setText(tabla_usuarios.getValueAt(fila,1).toString());
            txtContraseña.setText(tabla_usuarios.getValueAt(fila,2).toString());
            cbTurno.setSelectedItem(tabla_usuarios.getValueAt(fila,3).toString());       
                }
        }
 public void mostrarUsuAgregado (JTable tabla_usuarios){
        Clases.conexion_bd con= new Clases.conexion_bd();
        DefaultTableModel modelo= new DefaultTableModel();
          TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modelo);
        tabla_usuarios.setRowSorter(OrdenaTabla);
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Turno");       
        tabla_usuarios.setModel(modelo);
        String sql= "select id_usu, nombre_usu, contraseña, turno from usuarios";
     try{
         Statement st= con.establecerConexion().createStatement();
         ResultSet rs= st.executeQuery(sql);
         while (rs.next()){
           String id_usu= rs.getString("id_usu");
           String nombre_usu= rs.getString("nombre_usu");
           String contraseña= rs.getString("contraseña");
           String turno= rs.getString("turno");
           modelo.addRow(new Object[] {id_usu, nombre_usu,contraseña, turno});                   
         }
         tabla_usuarios.setModel(modelo);
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Error al mostrar datos del usuario: "+e.toString());
              }
       finally {
           con.cerrarConexion();
       }
    }
 
 //Eliminar usuario
     public void EliminarUsuario(JTextField txtId){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "delete from usuarios where id_usu=?";
    try{
        CallableStatement cs= conexion.establecerConexion().prepareCall(consulta);
        cs.setInt(1, Integer.parseInt(txtId.getText()));
        cs.execute();
        JOptionPane.showMessageDialog(null, "Se elimino el usuario correctamente");
        
    }catch (Exception e){
         JOptionPane.showMessageDialog(null, "Error al eliminar, error: " +e.toString()); 
    }
    finally{
        conexion.cerrarConexion();
    }
}
     public void BuscarNombreUsuario(JTextField txtNombre, JTable tabla_usuarios){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "select id_usu, nombre_usu, contraseña,turno from usuarios where nombre_usu= ?";
    try{
        PreparedStatement ps= conexion.establecerConexion().prepareStatement(consulta);
        ps.setString(1, (txtNombre.getText()));
        ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
           TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modeloTabla);
        tabla_usuarios.setRowSorter(OrdenaTabla);
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Contraseña");
            modeloTabla.addColumn("Turno");
              if (rs.next()) {
                do {
                    Object[] fila = {
                        rs.getInt("id_usu"),
                        rs.getString("nombre_usu"),
                        rs.getString("contraseña"),
                        rs.getString("turno")
                    };
                    modeloTabla.addRow(fila);
                } while (rs.next());
                tabla_usuarios.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontró el usuario correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No se encontró el usuario con el ID proporcionado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el usuario, error: " + e.toString());
        } finally {
            conexion.cerrarConexion();
        }
              
}
         public void BuscarTurnoUsuario(JComboBox cbTurno, JTable tabla_usuarios){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "SELECT id_usu, nombre_usu, contraseña, turno FROM usuarios WHERE turno = ? ";
    try{
        PreparedStatement ps= conexion.establecerConexion().prepareStatement(consulta);
         String turnoSeleccionado = (String) cbTurno.getSelectedItem();
         ps.setString(1, turnoSeleccionado);
       ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
           TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modeloTabla);
        tabla_usuarios.setRowSorter(OrdenaTabla);
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Contraseña");
            modeloTabla.addColumn("Turno");
              if (rs.next()) {
                do {
                    Object[] fila = {
                        rs.getInt("id_usu"),
                        rs.getString("nombre_usu"),
                        rs.getString("contraseña"),
                        rs.getString("turno")
                    };
                    modeloTabla.addRow(fila);
                } while (rs.next());
                tabla_usuarios.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontró el usuario correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No se encontró el usuario con el turno proporcionado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el usuario, error: " + e.toString());
        } finally {
            conexion.cerrarConexion();
        }
              
}
      
            public void Limpiar(JTextField txtId, JTextField txtNombre, JComboBox cbTurno, JTextField txtContraseña) {
      txtId.setText("");
      txtNombre.setText("");
       txtContraseña.setText("");
      cbTurno.setSelectedItem(null);
    }
          
            
    public void accederInfo() {
    Clases.conexion_bd con = new Clases.conexion_bd();
    String consulta = "SELECT * FROM usuarios WHERE contraseña = ?";
    
    try {
        String pass = JOptionPane.showInputDialog(null, "Introduzca la contraseña");
        PreparedStatement pst = con.establecerConexion().prepareStatement(consulta);
        pst.setString(1, pass); 
        
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            // Si hay resultados en el ResultSet, la contraseña es correcta
            // Aquí puedes realizar alguna acción apropiada, como abrir una nueva ventana o mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(null, "Contraseña correcta");
        } else {
            // Si no hay resultados en el ResultSet, la contraseña es incorrecta
            // Aquí puedes mostrar un mensaje de error
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta SQL: " + e.getMessage());
    }
}
  
    }



