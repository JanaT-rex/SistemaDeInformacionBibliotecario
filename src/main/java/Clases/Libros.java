package Clases;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Libros {
    public void agregarLibro(JTextField txtTitulo, JTextField txtAutor, JTextField txtEditorial, JComboBox cbCategoria, JSpinner spCantidad, JSpinner spEjemplares) {
        ConexionDB conex = new ConexionDB();
        String consulta = "insert into libros (titulo, autor, editorial, categoria,cantidad, ejemplares) values (?,?,?,?,?,?);";
        try {
            CallableStatement cs = conex.establecerConexion().prepareCall(consulta);
            cs.setString(1, txtTitulo.getText());
            cs.setString(2, txtAutor.getText());
            cs.setString(3, txtEditorial.getText());
            cs.setString(4, (String) cbCategoria.getSelectedItem());
            cs.setInt(5, (int) spCantidad.getValue());
            cs.setInt(6, (int) spEjemplares.getValue());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se guardo el libro correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar, error:" + e.toString());
        }

    }

    public void mostrar(JTable tabla_libros) {
        ConexionDB tablacx = new ConexionDB();

        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> OrdenaTabla = new TableRowSorter<TableModel>(modelo);
        tabla_libros.setRowSorter(OrdenaTabla);
        modelo.addColumn("Id");
        modelo.addColumn("Titulo");
        modelo.addColumn("Autor");
        modelo.addColumn("Editorial");
        modelo.addColumn("Categoria");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Ejemplares");
        tabla_libros.setModel(modelo);
        String sql = "select id_lib, titulo, autor,editorial, categoria, cantidad, ejemplares from libros";

        try {
            Statement st = tablacx.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String id_lib = rs.getString("id_lib");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                String editorial = rs.getString("editorial");
                String categoria = rs.getString("categoria");
                String cantidad = rs.getString("cantidad");
                String ejemplares = rs.getString("ejemplares");
                modelo.addRow(new Object[]{id_lib, titulo, autor, editorial, categoria, cantidad, ejemplares});
            }
            tabla_libros.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar libros, error; " + e.toString());
        } finally {
            tablacx.cerrarConexion();
        }
    }

    public void SeleccionarLibro(JTable tabla_libros, JTextField txtId, JTextField txtTitulo, JTextField txtAutor, JTextField txtEditorial, JComboBox cbCategoria, JSpinner spCantidad, JSpinner spEjemplares) {

        int fila = tabla_libros.getSelectedRow();
        if (fila >= 0) {
            txtId.setText(tabla_libros.getValueAt(fila, 0).toString());
            txtTitulo.setText(tabla_libros.getValueAt(fila, 1).toString());
            txtAutor.setText(tabla_libros.getValueAt(fila, 2).toString());
            txtEditorial.setText(tabla_libros.getValueAt(fila, 3).toString());
            cbCategoria.setSelectedItem(tabla_libros.getValueAt(fila, 4).toString());
            spCantidad.setValue(Integer.valueOf(tabla_libros.getValueAt(fila, 5).toString()));
            spEjemplares.setValue(Integer.valueOf(tabla_libros.getValueAt(fila, 6).toString()));

        }
    }

    public void ModificarLibro(JTextField txtId, JTextField txtTitulo, JTextField txtAutor, JTextField txtEditorial, JComboBox cbCategoria, JSpinner spCantidad, JSpinner spEjemplares) {
        ConexionDB objetoConexion = new ConexionDB();
        String consulta = "UPDATE libros set titulo=?, autor=?, editorial=?,categoria=?, cantidad=?, ejemplares=? Where id_lib=?";
        try {

            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, txtTitulo.getText());
            cs.setString(2, txtAutor.getText());
            cs.setString(3, txtEditorial.getText());
            cs.setString(4, (String) cbCategoria.getSelectedItem());
            cs.setInt(5, (int) spCantidad.getValue());
            cs.setInt(6, (int) spEjemplares.getValue());
            cs.setInt(7, Integer.parseInt(txtId.getText()));

            cs.execute();
            JOptionPane.showMessageDialog(null, "Se actualizo el registro correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro, error: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    public void EliminarLibro(JTextField txtId) {
        ConexionDB conexion = new ConexionDB();
        String consulta = "delete from libros where id_lib=?";
        try {
            CallableStatement cs = conexion.establecerConexion().prepareCall(consulta);
            cs.setInt(1, Integer.parseInt(txtId.getText()));
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se elimino el registro correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro, error: " + e.toString());
        } finally {
            conexion.cerrarConexion();
        }
    }

    public void BuscarIdLibro(JTextField txtId, JTable tabla_libros) {
        ConexionDB conexion = new ConexionDB();
        String consulta = "select* from libros where id_lib= ?";
        try {
            PreparedStatement ps = conexion.establecerConexion().prepareStatement(consulta);
            ps.setInt(1, Integer.parseInt(txtId.getText()));
            ResultSet rs = ps.executeQuery();
            DefaultTableModel modeloTabla = new DefaultTableModel();
            TableRowSorter<TableModel> OrdenaTabla = new TableRowSorter<TableModel>(modeloTabla);
            tabla_libros.setRowSorter(OrdenaTabla);
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
                tabla_libros.setModel(modeloTabla);

                JOptionPane.showMessageDialog(null, "Se encontró el libro correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el libro con el Id proporcionado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el libro, error: " + e.toString());
        } finally {
            conexion.cerrarConexion();
        }

    }

    public void BuscarTitulo(JTextField txtTitulo, JTable tabla_libros) {
        ConexionDB conexion = new ConexionDB();
        String consulta = "select*from libros where titulo= ?";
        try {
            PreparedStatement ps = conexion.establecerConexion().prepareStatement(consulta);
            ps.setString(1, (txtTitulo.getText()));
            ResultSet rs = ps.executeQuery();
            DefaultTableModel modeloTabla = new DefaultTableModel();
            TableRowSorter<TableModel> OrdenaTabla = new TableRowSorter<TableModel>(modeloTabla);
            tabla_libros.setRowSorter(OrdenaTabla);
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
                tabla_libros.setModel(modeloTabla);

                JOptionPane.showMessageDialog(null, "Se encontró el libro correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el libro con el titulo proporcionado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el libro, error: " + e.toString());
        } finally {
            conexion.cerrarConexion();
        }

    }

    public void BuscarAutor(JTextField txtAutor, JTable tabla_libros) {
        ConexionDB conexion = new ConexionDB();
        String consulta = "select*from libros where autor= ?";
        try {
            PreparedStatement ps = conexion.establecerConexion().prepareStatement(consulta);
            ps.setString(1, (txtAutor.getText()));
            ResultSet rs = ps.executeQuery();
            DefaultTableModel modeloTabla = new DefaultTableModel();
            TableRowSorter<TableModel> OrdenaTabla = new TableRowSorter<TableModel>(modeloTabla);
            tabla_libros.setRowSorter(OrdenaTabla);
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
                tabla_libros.setModel(modeloTabla);

                JOptionPane.showMessageDialog(null, "Se encontró el libro correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el libro con el nombre del autor proporcionado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el libro, error: " + e.toString());
        } finally {
            conexion.cerrarConexion();
        }

    }

    public void BuscarEditorial(JTextField txtEditorial, JTable tabla_libros) {
        ConexionDB conexion = new ConexionDB();
        String consulta = "select*from libros where editorial= ?";
        try {
            PreparedStatement ps = conexion.establecerConexion().prepareStatement(consulta);
            ps.setString(1, (txtEditorial.getText()));
            ResultSet rs = ps.executeQuery();
            DefaultTableModel modeloTabla = new DefaultTableModel();
            TableRowSorter<TableModel> OrdenaTabla = new TableRowSorter<TableModel>(modeloTabla);
            tabla_libros.setRowSorter(OrdenaTabla);
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
                tabla_libros.setModel(modeloTabla);

                JOptionPane.showMessageDialog(null, "Se encontró el libro correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el libro con la editorial proporcionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el lector, error: " + e.toString());
        } finally {
            conexion.cerrarConexion();
        }

    }

    public void BuscarCategoria(JComboBox cbCategoria, JTable tabla_libros) {
        ConexionDB conexion = new ConexionDB();
        String consulta = "SELECT*FROM libros WHERE categoria = ? ";
        try {
            PreparedStatement ps = conexion.establecerConexion().prepareStatement(consulta);
            String categoriaSeleccionada = (String) cbCategoria.getSelectedItem();
            ps.setString(1, categoriaSeleccionada);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel modeloTabla = new DefaultTableModel();
            TableRowSorter<TableModel> OrdenaTabla = new TableRowSorter<TableModel>(modeloTabla);
            tabla_libros.setRowSorter(OrdenaTabla);
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
                            rs.getInt("cantidad"),
                            rs.getInt("ejemplares")
                    };
                    modeloTabla.addRow(fila);
                } while (rs.next());
                tabla_libros.setModel(modeloTabla);

                JOptionPane.showMessageDialog(null, "Se encontraron los libros correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron libros");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar la categoria, error: " + e.toString());
        } finally {
            conexion.cerrarConexion();
        }

    }


    public void Limpiar(JTextField txtId, JTextField txtTitulo, JTextField txtAutor, JTextField txtEditorial, JComboBox cbCategoria, JSpinner spCantidad, JSpinner spEjemplares) {
        txtId.setText("");
        txtTitulo.setText("");
        txtAutor.setText("");
        txtEditorial.setText("");
        cbCategoria.setSelectedItem(null);
        spCantidad.setValue(0);
        spEjemplares.setValue(0);
    }

    public void BuscarCantidad(JSpinner spCantidad, JTable tabla_libros) {
        ConexionDB conexion = new ConexionDB();
        String consulta = "select* from libros where cantidad= ?";
        try {
            PreparedStatement ps = conexion.establecerConexion().prepareStatement(consulta);
            ps.setInt(1, Integer.parseInt(spCantidad.getValue().toString()));
            ResultSet rs = ps.executeQuery();
            DefaultTableModel modeloTabla = new DefaultTableModel();
            TableRowSorter<TableModel> OrdenaTabla = new TableRowSorter<TableModel>(modeloTabla);
            tabla_libros.setRowSorter(OrdenaTabla);
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
                tabla_libros.setModel(modeloTabla);

                JOptionPane.showMessageDialog(null, "Se encontró el libro correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron libros con la cantidad indicada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el libro, error: " + e.toString());
        } finally {
            conexion.cerrarConexion();
        }

    }

    public void BuscarEjemplares(JSpinner spEjemplares, JTable tabla_libros) {
        ConexionDB conexion = new ConexionDB();
        String consulta = "select* from libros where ejemplares= ?";
        try {
            PreparedStatement ps = conexion.establecerConexion().prepareStatement(consulta);
            ps.setInt(1, Integer.parseInt(spEjemplares.getValue().toString()));
            ResultSet rs = ps.executeQuery();
            DefaultTableModel modeloTabla = new DefaultTableModel();
            TableRowSorter<TableModel> OrdenaTabla = new TableRowSorter<TableModel>(modeloTabla);
            tabla_libros.setRowSorter(OrdenaTabla);
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
                tabla_libros.setModel(modeloTabla);

                JOptionPane.showMessageDialog(null, "Se encontró el libro correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron libros con la cantidad indicada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el libro, error: " + e.toString());
        } finally {
            conexion.cerrarConexion();
        }

    }
}

