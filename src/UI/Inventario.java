/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BL.BL_ManejadorProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author oscal
 */
public class Inventario extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public Inventario() {
        initComponents();
        jpanBusquedaAvanzada.setVisible(false);
        
        cbx_TipoProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbx_TipoProducto.getSelectedIndex() == 1) {
                    lbl_Categoria.setVisible(false);
                    lbl_Genero.setVisible(false);
                    lbl_Talla.setVisible(false);
                    txt_Talla.setVisible(false);
                    cbx_Categoria.setVisible(false);
                    cbx_Genero.setVisible(false);
                }else{
                    lbl_Categoria.setVisible(true);
                    lbl_Genero.setVisible(true);
                    lbl_Talla.setVisible(true);
                    txt_Talla.setVisible(true);
                    cbx_Categoria.setVisible(true);
                    cbx_Genero.setVisible(true);
                }
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnVerDetalle = new javax.swing.JButton();
        labBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnBusquedaAvanzada = new javax.swing.JButton();
        jpanBusquedaAvanzada = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_Genero = new javax.swing.JLabel();
        lbl_Talla = new javax.swing.JLabel();
        cbx_Genero = new javax.swing.JComboBox();
        txt_color = new javax.swing.JTextField();
        txt_Talla = new javax.swing.JTextField();
        txt_Marca = new javax.swing.JTextField();
        txt_Empresa = new javax.swing.JTextField();
        txt_Precio = new javax.swing.JTextField();
        lbl_Categoria = new javax.swing.JLabel();
        cbx_Categoria = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbx_TipoProducto = new javax.swing.JComboBox<>();
        txt_Fecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inventario Zapateria Mary");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                volverAlMenu(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnRegresar.setText("Atrás");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        tablaInventario.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaInventario);

        btnAgregar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar producto");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar producto");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnModificar.setText("Modificar producto");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnVerDetalle.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnVerDetalle.setText("Ver detalles");
        btnVerDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDetalleActionPerformed(evt);
            }
        });

        labBuscar.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        labBuscar.setText("Buscar:");

        txtBuscar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBusquedaAvanzada.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnBusquedaAvanzada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/dropdown.png"))); // NOI18N
        btnBusquedaAvanzada.setText("Busqueda Avanzada");
        btnBusquedaAvanzada.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnBusquedaAvanzada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBusquedaAvanzadaMouseClicked(evt);
            }
        });
        btnBusquedaAvanzada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaAvanzadaActionPerformed(evt);
            }
        });

        jpanBusquedaAvanzada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel2.setText("Marca:");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel1.setText("Precio:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel3.setText("Color:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel4.setText("Empresa: ");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel5.setText("Fecha Ingreso:");

        lbl_Genero.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lbl_Genero.setText("Género:");

        lbl_Talla.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lbl_Talla.setText("Talla:");

        cbx_Genero.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cbx_Genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hombre", "Mujer", " " }));

        lbl_Categoria.setText("Categoria:");

        cbx_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Tipo Producto:");

        cbx_TipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zapato", "Bolso" }));

        javax.swing.GroupLayout jpanBusquedaAvanzadaLayout = new javax.swing.GroupLayout(jpanBusquedaAvanzada);
        jpanBusquedaAvanzada.setLayout(jpanBusquedaAvanzadaLayout);
        jpanBusquedaAvanzadaLayout.setHorizontalGroup(
            jpanBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanBusquedaAvanzadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Genero)
                    .addComponent(jLabel3)
                    .addComponent(lbl_Talla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbx_Genero, 0, 149, Short.MAX_VALUE)
                    .addComponent(txt_color)
                    .addComponent(txt_Talla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanBusquedaAvanzadaLayout.createSequentialGroup()
                        .addGroup(jpanBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Precio)
                            .addComponent(txt_Empresa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Categoria)
                            .addComponent(jLabel9))
                        .addGroup(jpanBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpanBusquedaAvanzadaLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(cbx_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanBusquedaAvanzadaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbx_TipoProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(33, 33, 33))
                    .addGroup(jpanBusquedaAvanzadaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpanBusquedaAvanzadaLayout.setVerticalGroup(
            jpanBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanBusquedaAvanzadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Genero)
                        .addComponent(cbx_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txt_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Categoria)
                        .addComponent(cbx_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jpanBusquedaAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Talla)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Talla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cbx_TipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jpanBusquedaAvanzada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBusquedaAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labBuscar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBusquedaAvanzada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jpanBusquedaAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(34, 34, 34)
                        .addComponent(btnEliminar)
                        .addGap(38, 38, 38)
                        .addComponent(btnModificar)
                        .addGap(36, 36, 36)
                        .addComponent(btnVerDetalle))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        Menu_Principal mp = new Menu_Principal();
        mp.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void volverAlMenu(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_volverAlMenu
        this.dispose();
        new Menu_Principal().setVisible(true);
    }//GEN-LAST:event_volverAlMenu

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        new DetalleProducto(1).setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        boolean tipoProducto = false;
        if (cbx_TipoProducto.getSelectedIndex() == 0) {
            tipoProducto = true;
        }
        BL.BL_ManejadorProducto listaProductos = new BL_ManejadorProducto();
        listaProductos.BuscarPorFiltro(cbx_Genero.getSelectedItem().toString(), txt_color.getText(), Double.parseDouble(txt_Talla.getText()), txt_Marca.getText(), txt_Empresa.getText(), Double.parseDouble(txt_Precio.getText()), txt_Fecha.getDate(), cbx_Categoria.getSelectedItem().toString(), tipoProducto);
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBusquedaAvanzadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaAvanzadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBusquedaAvanzadaActionPerformed

    private void btnBusquedaAvanzadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaAvanzadaMouseClicked
        if(jpanBusquedaAvanzada.isVisible()){
            jpanBusquedaAvanzada.setVisible(false);
        }else{
            jpanBusquedaAvanzada.setVisible(true);
        }
    }//GEN-LAST:event_btnBusquedaAvanzadaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        DetalleProducto modificar = new DetalleProducto(2);
        modificar.setTitle("Modificar Producto");
        modificar.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVerDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDetalleActionPerformed
        DetalleProducto detalle = new DetalleProducto(3);
        detalle.setTitle("Mostrar Producto");
        detalle.setVisible(true);
    }//GEN-LAST:event_btnVerDetalleActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBusquedaAvanzada;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerDetalle;
    private javax.swing.JComboBox<String> cbx_Categoria;
    private javax.swing.JComboBox cbx_Genero;
    private javax.swing.JComboBox<String> cbx_TipoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanBusquedaAvanzada;
    private javax.swing.JLabel labBuscar;
    private javax.swing.JLabel lbl_Categoria;
    private javax.swing.JLabel lbl_Genero;
    private javax.swing.JLabel lbl_Talla;
    private javax.swing.JTable tablaInventario;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txt_Empresa;
    private com.toedter.calendar.JDateChooser txt_Fecha;
    private javax.swing.JTextField txt_Marca;
    private javax.swing.JTextField txt_Precio;
    private javax.swing.JTextField txt_Talla;
    private javax.swing.JTextField txt_color;
    // End of variables declaration//GEN-END:variables
}
