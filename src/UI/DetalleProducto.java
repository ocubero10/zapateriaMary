/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BL.BL_Producto;
import BL.BL_TallaZapato;
import javax.swing.JOptionPane;

/**
 *
 * @author oscal
 */
public class DetalleProducto extends javax.swing.JFrame {

    /**
     * Creates new form AgregarProducto
     */
    public DetalleProducto() {
        initComponents();
    }

    public DetalleProducto(int ventana) {
        initComponents();
        if(ventana == 1){
            habilitarCampos(true);
            labInstruccion.setText("Ingrese los datos del nuevo producto:");
            rdbZapato.setSelected(true);
        }else if(ventana == 2){
            habilitarCampos(true);
            labInstruccion.setText("Modifique los datos necesarios:");
            btnAgregar.setText("Modificar");
        }else{
            habilitarCampos(false);
            labInstruccion.setText("Detalles del producto:");
            btnAgregar.setVisible(false);
        }
    }
    
    public void habilitarCampos(boolean valor){
        txtColor.setEnabled(valor);
        txtDescripcion.setEnabled(valor);
        txtFechaIngreso.setEnabled(valor);
        cmbGenero.setEnabled(valor);
        cmbCategoria.setEnabled(valor);
        txtTalla.setEnabled(valor);
        txtCantidad.setEnabled(valor);
        txtEmpresa.setEnabled(valor);
        txtImpuesto.setEnabled(valor);
        txtMarca.setEnabled(valor);
        txtPrecioCosto.setEnabled(valor);
        txtPrecioVenta.setEnabled(valor);
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Producto");

        labInstruccion.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labInstruccion.setText("Ingrese los datos del nuevo producto:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel3.setText("Descripción:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel4.setText("Fecha de Ingreso:");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel5.setText("Color:");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel6.setText("Marca:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel7.setText("Precio a costo:");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel8.setText("Precio de venta:");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel9.setText("Empresa:");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel10.setText("Impuesto:");

        txtDescripcion.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        txtColor.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        txtPrecioCosto.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtPrecioCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCostoKeyTyped(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtCodigo.setEnabled(false);

        txtMarca.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        txtPrecioVenta.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioVentaKeyTyped(evt);
            }
        });

        txtImpuesto.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtImpuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpuestoKeyTyped(evt);
            }
        });

        txtEmpresa.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        btnAtras.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        grup1.add(rdbBolso);
        rdbBolso.setText("Bolso");
        rdbBolso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbBolsoActionPerformed(evt);
            }
        });

        grup1.add(rdbZapato);
        rdbZapato.setText("Zapato");
        rdbZapato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbZapatoActionPerformed(evt);
            }
        });

        jLabel1.setText("Género:");

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));

        jLabel11.setText("Categoría:");

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninos", "Jovenes", "Adulto" }));

        jLabel12.setText("Talla:");

        txtTalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTallaKeyTyped(evt);
            }
        });

        txtCantidad.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel13.setText("Cantidad:");

        jButton1.setText("Generear código");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Código:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labInstruccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbZapato)
                        .addGap(1, 1, 1)
                        .addComponent(rdbBolso))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(4, 4, 4)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmpresa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtImpuesto)
                            .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                        .addComponent(btnAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(52, 52, 52)
                        .addComponent(txtDescripcion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labInstruccion)
                    .addComponent(rdbZapato)
                    .addComponent(rdbBolso))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
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
        if(txtDescripcion.getText().trim().equals("") || txtTalla.getText().trim().equals("") ||
            txtMarca.getText().trim().equals("") || txtColor.getText().trim().equals("") || txtEmpresa.getText().trim().equals("") ||
                txtImpuesto.getText().trim().equals("") || txtPrecioCosto.getText().trim().equals("") || txtPrecioVenta.getText().trim().equals("")){
            
            JOptionPane.showMessageDialog(null, "Debe completar los datos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            if(!rdbZapato.isSelected() && !rdbBolso.isSelected()){
                JOptionPane.showMessageDialog(null, "Debe seleccionar el tipo de producto","ERROR",JOptionPane.ERROR_MESSAGE);
            }else{
                BL_Producto producto = new BL_Producto();
                producto.setCodigoUnico(txtCodigo.getText());
                producto.setFechaIngreso(new java.sql.Date(txtFechaIngreso.getDate().getYear(), txtFechaIngreso.getDate().getMonth(), txtFechaIngreso.getDate().getDay()));
                producto.setColor(txtColor.getText().trim());
                producto.setMarca(txtMarca.getText().trim());
                producto.setEmpresa(txtEmpresa.getText().trim());
                producto.setPrecioImpuesto(Double.parseDouble(txtImpuesto.getText().trim()));
                producto.setPrecioCosto(Double.parseDouble(txtPrecioCosto.getText().trim()));
                producto.setPrecioGanancia(Double.parseDouble(txtPrecioVenta.getText().trim()));
                producto.setDescripcion(txtDescripcion.getText().trim());
                producto.setCantidad(Integer.parseInt(txtCantidad.getValue().toString()));
                producto.setCodigoUnico(txtColor.getText().charAt(0) + "" + txtMarca.getText().charAt(0) + "" + txtEmpresa.getText().charAt(0) + "-" + new BL_Producto().obtenerSiguienteCodigo());
                if(rdbZapato.isSelected()){
                    producto.setEsZapato(true);
                }else{
                    producto.setEsZapato(false);
                }
                producto.setTallaZapato(new BL_TallaZapato(cmbGenero.getSelectedItem().toString(),cmbCategoria.getSelectedItem().toString(),Double.parseDouble(txtTalla.getText().toString())));
            
                if(producto.insertarZapato()){
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
                }else{
                    JOptionPane.showMessageDialog(null, "Error al insertar el producto","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtMarca.getText().trim().equals("") || txtColor.getText().trim().equals("") || txtEmpresa.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Debe completar los datos para generar el código","Aviso",JOptionPane.WARNING_MESSAGE);
        }else{
            txtCodigo.setText(txtColor.getText().charAt(0) + "" + txtMarca.getText().charAt(0) + "" + txtEmpresa.getText().charAt(0) + "");
            txtCodigo.setText(txtCodigo.getText() + "-" + new BL_Producto().obtenerSiguienteCodigo());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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

    
    private void validarNumeros(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        
        if((c < '0' || c > '9') && c != '.' && c != evt.VK_BACK_SPACE){
            evt.consume();
            JOptionPane.showMessageDialog(null,"Este campo solo admite valores numericos y ' . '", "Tipo de dato incorrecto", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JComboBox cmbCategoria;
    private javax.swing.JComboBox cmbGenero;
    private javax.swing.ButtonGroup grup1;
    private javax.swing.JButton jButton1;
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
