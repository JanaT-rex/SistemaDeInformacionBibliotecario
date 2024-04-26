
package Clases;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class CLectores {
    //Mostrar datos 
    public void mostrar (JTable tabla_lectores){
        Clases.conexion_bd con= new Clases.conexion_bd();
        DefaultTableModel modelo= new DefaultTableModel();
         TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modelo);
        tabla_lectores.setRowSorter(OrdenaTabla);
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Aprellidos");
        modelo.addColumn("Grado");
        modelo.addColumn("Grupo");
        modelo.addColumn("Turno");
        modelo.addColumn("Categoria");
        
        tabla_lectores.setModel(modelo);
        String sql= "select id_lector, nombre, apellido, grado, grupo, turno, asignacion from lectores";
     try{
         Statement st= con.establecerConexion().createStatement();
         ResultSet rs= st.executeQuery(sql);
         while (rs.next()){
           String id_lector= rs.getString("id_lector");
           String nombre= rs.getString("nombre");
           String apellido= rs.getString("apellido");
           String grado= rs.getString("grado");
           String grupo= rs.getString("grupo");
           String turno= rs.getString("turno");
           String asignacion= rs.getString("asignacion");
           modelo.addRow(new Object[] {id_lector, nombre,apellido, grado, grupo, turno, asignacion});                   
         }
         tabla_lectores.setModel(modelo);
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Error al mostrar datos del lector");
              }
       finally {
           con.cerrarConexion();
       }
    }
    //Agregar alumno
       public void agregarLector (JTextField txtNombre,JTextField txtApellido, JComboBox cbGrado, JComboBox cbGrupo, JComboBox cbTurno, JComboBox cbAsignacion){
     conexion_bd conex= new conexion_bd();
     String consulta="insert into lectores (nombre,apellido,grado, grupo,turno, asignacion) values (?,?,?,?,?,?)";
     try{
     CallableStatement cs = conex.establecerConexion().prepareCall(consulta);
      cs.setString(1, txtNombre.getText());
      cs.setString(2, txtApellido.getText());
     cs.setString(3, (String) cbGrado.getSelectedItem());
      cs.setString(4, (String) cbGrupo.getSelectedItem());
       cs.setString(5, (String) cbTurno.getSelectedItem());
          cs.setString(6, (String) cbAsignacion.getSelectedItem());
     cs.execute();
           JOptionPane.showMessageDialog(null, "Se guardo el registro del lector");           
     }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar");            
     }
     
 }
       //Seleccionar libro de la tabla :3
       public void SeleccionarLector (JTable tabla_lectores,JTextField txtId, JTextField txtNombre, JTextField txtApellido, JComboBox cbGrado, JComboBox cbGrupo, JComboBox cbTurno, JComboBox cbAsignacion){
      
        int fila= tabla_lectores.getSelectedRow();
        if (fila>=0){
            txtId.setText(tabla_lectores.getValueAt(fila,0).toString());
            txtNombre.setText(tabla_lectores.getValueAt(fila,1).toString());
            txtApellido.setText(tabla_lectores.getValueAt(fila,2).toString());
            cbGrado.setSelectedItem(tabla_lectores.getValueAt(fila,3).toString());
            cbGrupo.setSelectedItem(tabla_lectores.getValueAt(fila,4).toString());
            cbTurno.setSelectedItem(tabla_lectores.getValueAt(fila,5).toString());
            cbAsignacion.setSelectedItem(tabla_lectores.getValueAt(fila,6).toString());

                }
        }
       //Boton de actualizar :D
       public void ModificarLector(JTextField txtId,JTextField txtNombre, JTextField txtApellido,JComboBox cbGrado, JComboBox cbGrupo, JComboBox cbTurno, JComboBox cbAsignacion ){
    Clases.conexion_bd objetoConexion= new Clases.conexion_bd ();
    String consulta= "UPDATE lectores set nombre=?, apellido=?,grado=?,grupo=?, turno=?, asignacion=? Where id_lector=?";
    try{
        CallableStatement cs= objetoConexion.establecerConexion().prepareCall(consulta);
        cs.setString(1,txtNombre.getText() );
        cs.setString(2,txtApellido.getText() );
        cs.setString(3, (String) cbGrado.getSelectedItem());
        cs.setString(4, (String) cbGrupo.getSelectedItem());
        cs.setString(5, (String) cbTurno.getSelectedItem());
        cs.setString(6, (String) cbAsignacion.getSelectedItem());
        cs.setInt(7, Integer.parseInt(txtId.getText()));
        cs.execute();
     JOptionPane.showMessageDialog(null, "Se actualizo el registro correctamente");
    }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error al actualizar el registro");
    }
    finally{
        objetoConexion.cerrarConexion();
    }
}
       //Boton eliminar
       public void EliminarLector(JTextField txtId){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "delete from lectores where id_lector=?";
    try{
        CallableStatement cs= conexion.establecerConexion().prepareCall(consulta);
        cs.setInt(1, Integer.parseInt(txtId.getText()));
        cs.execute();
        JOptionPane.showMessageDialog(null, "Se elimino correctamente");
        
    }catch (Exception e){
         JOptionPane.showMessageDialog(null, "Error al eliminar"); 
    }
    finally{
        conexion.cerrarConexion();
    }
}
          public void BuscarIdLector(JTextField txtId){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "select*from lectores where id_lector=?";
    try{
        CallableStatement cs= conexion.establecerConexion().prepareCall(consulta);
        cs.setInt(1, Integer.parseInt(txtId.getText()));
        cs.execute();
        JOptionPane.showMessageDialog(null, "Se encontro el lector correctamente");
        
    }catch (Exception e){
         JOptionPane.showMessageDialog(null, "Error al buscar"); 
    }
    finally{
        conexion.cerrarConexion();
    }
          }
         public void BuscarNombreLector(JTextField txtNombre, JTable tabla_lectores){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "select*from lectores  where nombre= ?";
    try{
        PreparedStatement ps= conexion.establecerConexion().prepareStatement(consulta);
        ps.setString(1, (txtNombre.getText()));
        ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
           TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modeloTabla);
        tabla_lectores.setRowSorter(OrdenaTabla);
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Apellido");
             modeloTabla.addColumn("Grado");
              modeloTabla.addColumn("Grupo");
            modeloTabla.addColumn("Turno");
            modeloTabla.addColumn("Categoria");
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
                tabla_lectores.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontró el lector correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No se encontró el lector con el nombre proporcionado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar al lector");
        } finally {
            conexion.cerrarConexion();
        }
              
}
          public void BuscarApellidoLector(JTextField txtApellido, JTable tabla_lectores){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "select*from lectores  where apellido= ?";
    try{
        PreparedStatement ps= conexion.establecerConexion().prepareStatement(consulta);
        ps.setString(1, (txtApellido.getText()));
        ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
           TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modeloTabla);
        tabla_lectores.setRowSorter(OrdenaTabla);
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Apellido");
             modeloTabla.addColumn("Grado");
              modeloTabla.addColumn("Grupo");
            modeloTabla.addColumn("Turno");
            modeloTabla.addColumn("Categoria");
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
                tabla_lectores.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontró el lector correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No se encontró el lector con el apellido proporcionado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el lector");
        } finally {
            conexion.cerrarConexion();
        }
              
}
  public void BuscarGradoLector(JComboBox cbGrado, JTable tabla_lectores){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "SELECT*FROM lectores WHERE grado = ? ";
    try{
        PreparedStatement ps= conexion.establecerConexion().prepareStatement(consulta);
         String gradoSeleccionado = (String) cbGrado.getSelectedItem();
         ps.setString(1, gradoSeleccionado);
       ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
           TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modeloTabla);
        tabla_lectores.setRowSorter(OrdenaTabla);
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
           modeloTabla.addColumn("Apellidos");
           modeloTabla.addColumn("Grado");
           modeloTabla.addColumn("Grupo");
            modeloTabla.addColumn("Turno");
            modeloTabla.addColumn("Categoria");
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
                tabla_lectores.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontró el lector correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No se encontró el lector");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el lector");
        } finally {
            conexion.cerrarConexion();
        }
              
}
     public void BuscarGrupoLector(JComboBox cbGrupo, JTable tabla_lectores){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "SELECT*FROM lectores WHERE grupo = ? ";
    try{
        PreparedStatement ps= conexion.establecerConexion().prepareStatement(consulta);
         String grupoSeleccionado = (String) cbGrupo.getSelectedItem();
         ps.setString(1, grupoSeleccionado);
       ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
           TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modeloTabla);
        tabla_lectores.setRowSorter(OrdenaTabla);
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
           modeloTabla.addColumn("Apellidos");
           modeloTabla.addColumn("Grado");
           modeloTabla.addColumn("Grupo");
            modeloTabla.addColumn("Turno");
            modeloTabla.addColumn("Categoria");
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
                tabla_lectores.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontraron lectores correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No se encontraron lectores");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar");
        } finally {
            conexion.cerrarConexion();
        }
              
}          
   public void BuscarTurnoLector(JComboBox cbTurno, JTable tabla_lectores){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "SELECT*FROM lectores WHERE turno = ? ";
    try{
        PreparedStatement ps= conexion.establecerConexion().prepareStatement(consulta);
         String turnoSeleccionado = (String) cbTurno.getSelectedItem();
         ps.setString(1, turnoSeleccionado);
       ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
           TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modeloTabla);
        tabla_lectores.setRowSorter(OrdenaTabla);
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
           modeloTabla.addColumn("Apellidos");
           modeloTabla.addColumn("Grado");
           modeloTabla.addColumn("Grupo");
            modeloTabla.addColumn("Turno");
            modeloTabla.addColumn("Categoria");
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
                tabla_lectores.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontraron los lectores correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No se encontraron lectores");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el lector");
        } finally {
            conexion.cerrarConexion();
        }
              
}     
     public void BuscarCategoriaLector(JComboBox cbAsignacion, JTable tabla_lectores){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "SELECT*FROM lectores WHERE asignacion = ? ";
    try{
        PreparedStatement ps= conexion.establecerConexion().prepareStatement(consulta);
         String categoriaSeleccionada = (String) cbAsignacion.getSelectedItem();
         ps.setString(1, categoriaSeleccionada);
       ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
           TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modeloTabla);
        tabla_lectores.setRowSorter(OrdenaTabla);
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
           modeloTabla.addColumn("Apellidos");
           modeloTabla.addColumn("Grado");
           modeloTabla.addColumn("Grupo");
            modeloTabla.addColumn("Turno");
            modeloTabla.addColumn("Categoria");
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
                tabla_lectores.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontraron los lectores correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No se encontraron lectores");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el lector");
        } finally {
            conexion.cerrarConexion();
        }
              
}  
     public void BuscarIdLector(JTextField txtId, JTable tabla_lectores){
    Clases.conexion_bd conexion= new Clases.conexion_bd();
    String consulta= "select* from lectores where id_lector= ?";
    try{
        PreparedStatement ps= conexion.establecerConexion().prepareStatement(consulta);
        ps.setInt(1, Integer.parseInt(txtId.getText()));
        ResultSet rs = ps.executeQuery();
         DefaultTableModel modeloTabla = new DefaultTableModel();
           TableRowSorter< TableModel>OrdenaTabla= new TableRowSorter<TableModel>(modeloTabla);
        tabla_lectores.setRowSorter(OrdenaTabla);
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Apellidos");
            modeloTabla.addColumn("Grado");
            modeloTabla.addColumn("Grupo");
            modeloTabla.addColumn("Turno");
             modeloTabla.addColumn("Categoria");
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
                tabla_lectores.setModel(modeloTabla);
                
                JOptionPane.showMessageDialog(null, "Se encontró el lector correctamente");
            } else {
                   JOptionPane.showMessageDialog(null, "No se encontró el lectro con el ID proporcionado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el lector");
        } finally {
            conexion.cerrarConexion();
        }
              
}
     
       //Limpiar formulario UwU
        public void Limpiar(JTextField txtId, JTextField txtNombre,JTextField txtApellido, JComboBox cbGrado, JComboBox cbGrupo, JComboBox cbTurno, JComboBox cbAsignacion) {
      txtId.setText("");
      txtNombre.setText("");
      txtApellido.setText("");
      cbGrado.setSelectedItem(null);
      cbGrupo.setSelectedItem(null);
      cbTurno.setSelectedItem(null);
       cbAsignacion.setSelectedItem(null);
    }
}
