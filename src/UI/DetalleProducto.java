/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BL.BL_Producto;
import BL.BL_TallaZapato;
import java.util.ArrayList;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author oscal
 */
public class DetalleProducto extends javax.swing.JFrame {

    ArrayList<BL_Producto> lista;
    int posicion;

    /**
     * Creates new form AgregarProducto
     */
    public DetalleProducto() {
        initComponents();
    }

    public DetalleProducto(int ventana, ArrayList<BL_Producto> listaProductos, int id) {
        initComponents();
        lista = listaProductos;
        this.posicion = id;
        verificarVentana(ventana);
    }

    private void verificarVentana(int ventana) {
        if (ventana == 1) {
            habilitarCampos(true);
            labInstruccion.setText("Ingrese los datos del nuevo producto:");
            rdbZapato.setSelected(true);
            btnAgregar.setText("Agregar");
            btnAgregar.setVisible(true);
            btnGenerarCodigo.setVisible(true);
        } else if (ventana == 2) {
            labInstruccion.setText("Modifique los datos necesarios:");
            btnAgregar.setVisible(true);
            btnAgregar.setText("Modificar");
            btnGenerarCodigo.setVisible(false);

            habilitarCampos(true);
            cargarProducto();
        } else {
            labInstruccion.setText("Detalles del producto:");
            btnAgregar.setVisible(false);
            btnGenerarCodigo.setVisible(false);
            habilitarCampos(false);
            cargarProducto();
        }
    }

    private void habilitarCampos(boolean valor) {
        txtColor.setEditable(valor);
        txtDescripcion.setEditable(valor);
        txtFechaIngreso.setEnabled(valor);
        cmbGenero.setEnabled(valor);
        cmbCategoria.setEnabled(valor);
        txtTalla.setEditable(valor);
        txtCantidad.setEnabled(valor);
        txtEmpresa.setEditable(valor);
        txtImpuesto.setEditable(valor);
        txtMarca.setEditable(valor);
        txtPrecioCosto.setEditable(valor);
        txtPrecioVenta.setEditable(valor);
        rdbBolso.setEnabled(valor);
        rdbZapato.setEnabled(valor);
    }

    private void cargarProducto() {
        if (lista.get(posicion).isEsZapato()) {
            rdbZapato.setSelected(true);

            cmbCategoria.setSelectedItem(lista.get(posicion).getTallaZapato().getCategoriaZapato());
            if (lista.get(posicion).getTallaZapato().getGeneroZapato().equals("1")) {
                cmbGenero.setSelectedItem("M");
            } else {
                cmbGenero.setSelectedItem("F");
            }

            txtTalla.setText(lista.get(posicion).getTallaZapato().getTalla() + "");
        } else {
            rdbBolso.setSelected(true);

        }
        txtCodigo.setText(lista.get(posicion).getCodigoUnico());
        txtFechaIngreso.setDate(lista.get(posicion).getFechaIngreso());
        txtDescripcion.setText(lista.get(posicion).getDescripcion());
        txtCantidad.setValue(lista.get(posicion).getCantidad());
        txtMarca.setText(lista.get(posicion).getMarca());
        txtColor.setText(lista.get(posicion).getColor());
        txtEmpresa.setText(lista.get(posicion).getEmpresa());
        txtImpuesto.setText(lista.get(posicion).getPrecioImpuesto() + "");
        txtPrecioCosto.setText(lista.get(posicion).getPrecioCosto() + "");
        txtPrecioVenta.setText(lista.get(posicion).getPrecioGanancia() + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grup1 = new javax.swing.ButtonGroup();
        labInstruccion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtPrecioCosto = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtImpuesto = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtFechaIngreso = new com.toedter.calendar.JDateChooser();
        rdbBolso = new javax.swing.JRadioButton();
        rdbZapato = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        btnGenerarCodigo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Agregar Producto");
        setMinimumSize(new java.awt.Dimension(590, 430));
        setPreferredSize(new java.awt.Dimension(590, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labInstruccion.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        labInstruccion.setText("Ingrese los datos del nuevo producto:");
        getContentPane().add(labInstruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setText("Descripción:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setText("Fecha de Ingreso:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel5.setText("Color:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel6.setText("Marca:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel7.setText("Precio a costo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel8.setText("Precio de venta:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel9.setText("Empresa:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel10.setText("Impuesto:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        txtDescripcion.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 93, 480, -1));

        txtColor.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        getContentPane().add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 80, -1));

        txtPrecioCosto.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        txtPrecioCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCostoKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecioCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 109, -1));

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        txtCodigo.setEnabled(false);
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 45, 220, 30));

        txtMarca.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 130, -1));

        txtPrecioVenta.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        txtPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioVentaKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 130, -1));

        txtImpuesto.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        txtImpuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpuestoKeyTyped(evt);
            }
        });
        getContentPane().add(txtImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 80, -1));

        txtEmpresa.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        getContentPane().add(txtEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 346, -1));

        btnAtras.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 329, -1, 40));

        btnAgregar.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 328, -1, 40));
        getContentPane().add(txtFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 45, 170, 30));

        grup1.add(rdbBolso);
        rdbBolso.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        rdbBolso.setText("Bolso");
        rdbBolso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbBolsoActionPerformed(evt);
            }
        });
        getContentPane().add(rdbBolso, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 11, -1, -1));

        grup1.add(rdbZapato);
        rdbZapato.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        rdbZapato.setText("Zapato");
        rdbZapato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbZapatoActionPerformed(evt);
            }
        });
        getContentPane().add(rdbZapato, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 11, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel1.setText("Género:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, -1));

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        getContentPane().add(cmbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 132, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel11.setText("Categoría:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninos", "Jovenes", "Adulto" }));
        getContentPane().add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 115, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel12.setText("Talla:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        txtTalla.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        txtTalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTallaKeyTyped(evt);
            }
        });
        getContentPane().add(txtTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 80, -1));

        txtCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 70, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel13.setText("Cantidad:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 179, -1, -1));

        btnGenerarCodigo.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnGenerarCodigo.setText("Generear código");
        btnGenerarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel2.setText("Código:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, -1));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        new Inventario(lista).setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtTallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTallaKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtTallaKeyTyped

    private void txtImpuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpuestoKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtImpuestoKeyTyped

    private void txtPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioVentaKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtPrecioVentaKeyTyped

    private void txtPrecioCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCostoKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtPrecioCostoKeyTyped

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (txtDescripcion.getText().trim().equals("") || txtTalla.getText().trim().equals("")
                || txtMarca.getText().trim().equals("") || txtColor.getText().trim().equals("") || txtEmpresa.getText().trim().equals("")
                || txtImpuesto.getText().trim().equals("") || txtPrecioCosto.getText().trim().equals("") || txtPrecioVenta.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null, "Debe completar los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!rdbZapato.isSelected() && !rdbBolso.isSelected()) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar el tipo de producto", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                BL_Producto producto = new BL_Producto();
                producto.setIdProducto(producto.obtenerSiguienteCodigo());
                producto.setCodigoUnico(txtCodigo.getText());
                producto.setFechaIngreso(new java.sql.Date(txtFechaIngreso.getDate().getTime()));
                producto.setColor(txtColor.getText().trim());
                producto.setMarca(txtMarca.getText().trim());
                producto.setEmpresa(txtEmpresa.getText().trim());
                producto.setPrecioImpuesto(Double.parseDouble(txtImpuesto.getText().trim()));
                producto.setPrecioCosto(Double.parseDouble(txtPrecioCosto.getText().trim()));
                producto.setPrecioGanancia(Double.parseDouble(txtPrecioVenta.getText().trim()));
                producto.setDescripcion(txtDescripcion.getText().trim());
                producto.setCantidad(Integer.parseInt(txtCantidad.getValue().toString()));
                producto.setCodigoUnico(txtColor.getText().charAt(0) + "" + txtMarca.getText().charAt(0) + "" + txtEmpresa.getText().charAt(0) + "-" + new BL_Producto().obtenerSiguienteCodigo());
                if (rdbZapato.isSelected()) {
                    producto.setEsZapato(true);
                } else {
                    producto.setEsZapato(false);
                }
                producto.setTallaZapato(new BL_TallaZapato(cmbGenero.getSelectedItem().toString(), cmbCategoria.getSelectedItem().toString(), Double.parseDouble(txtTalla.getText().toString())));

                if (btnAgregar.getText().equals("Agregar")) {
                    if (producto.insertarProducto()) {
                        txtCodigo.setText("");
                        txtDescripcion.setText("");
                        txtFechaIngreso.setDate(null);
                        txtTalla.setText("");
                        txtCantidad.setValue(1);
                        txtMarca.setText("");
                        txtColor.setText("");
                        txtEmpresa.setText("");
                        txtImpuesto.setText("");
                        txtPrecioCosto.setText("");
                        txtPrecioVenta.setText("");
                        JOptionPane.showMessageDialog(null, "Producto insertado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        lista.add(producto);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al insertar el producto", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    producto.setIdProducto(lista.get(posicion).getIdProducto());
                    if (producto.modificarProducto(posicion, lista)) {
                        lista.set(posicion, producto);
                        JOptionPane.showMessageDialog(null, "Datos modificados", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        txtCodigo.setText(producto.getCodigoUnico());
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al modificar el producto", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGenerarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCodigoActionPerformed
        if (txtMarca.getText().trim().equals("") || txtColor.getText().trim().equals("") || txtEmpresa.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe completar los datos para generar el código", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            txtCodigo.setText(txtColor.getText().charAt(0) + "" + txtMarca.getText().charAt(0) + "" + txtEmpresa.getText().charAt(0) + "");
            txtCodigo.setText(txtCodigo.getText() + "-" + new BL_Producto().obtenerSiguienteCodigo());
        }
    }//GEN-LAST:event_btnGenerarCodigoActionPerformed

    private void rdbBolsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbBolsoActionPerformed
        cmbGenero.setEnabled(false);
        cmbCategoria.setEnabled(false);
        txtTalla.setEnabled(false);
        txtTalla.setText("");
    }//GEN-LAST:event_rdbBolsoActionPerformed

    private void rdbZapatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbZapatoActionPerformed
        cmbGenero.setEnabled(true);
        cmbCategoria.setEnabled(true);
        txtTalla.setEnabled(true);
    }//GEN-LAST:event_rdbZapatoActionPerformed

    private void validarNumeros(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();

        if ((c < '0' || c > '9') && c != '.' && c != evt.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Este campo solo admite valores numericos y ' . '", "Tipo de dato incorrecto", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGenerarCodigo;
    private javax.swing.JComboBox cmbCategoria;
    private javax.swing.JComboBox cmbGenero;
    private javax.swing.ButtonGroup grup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labInstruccion;
    private javax.swing.JRadioButton rdbBolso;
    private javax.swing.JRadioButton rdbZapato;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEmpresa;
    private com.toedter.calendar.JDateChooser txtFechaIngreso;
    private javax.swing.JTextField txtImpuesto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPrecioCosto;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtTalla;
    // End of variables declaration//GEN-END:variables
}
