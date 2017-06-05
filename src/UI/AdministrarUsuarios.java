/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BL.BL_ManejadorUsuario;
import BL.BL_Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author oscal
 */
public class AdministrarUsuarios extends javax.swing.JFrame {
    ArrayList<BL_Usuario> listaTotalUsuarios = new ArrayList<BL_Usuario>();
    BL_ManejadorUsuario manejador = new BL_ManejadorUsuario();
    DefaultTableModel modelo;
    /**
     * Creates new form AdministrarUsuarios
     */
    public AdministrarUsuarios() {
        initComponents();
        modelo = (DefaultTableModel) tablaUsuarios.getModel();
        
        manejador.CargarUsuarios();
        listaTotalUsuarios = manejador.ObtenerListaUsuarios();
        cargarUsuariosEnTabla(listaTotalUsuarios);
        ocultarColumnaID();
        btnAccion.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 100), new java.awt.Dimension(32767, 100));
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        cmbAccion = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        labTituloAccion = new javax.swing.JLabel();
        labMensajeAlUsuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        checkAdministrador = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        btnAccion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Buscar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, -1, -1));

        txtBuscar.setBackground(new java.awt.Color(237, 237, 237));
        txtBuscar.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 49, 323, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Usuarios registrados en el sistema:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, -1, -1));

        filler1.setBackground(new java.awt.Color(0, 0, 0));
        filler1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 0));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 16, -1, 402));

        tablaUsuarios.setBackground(new java.awt.Color(244, 244, 244));
        tablaUsuarios.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        tablaUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Nombre Usuario", "Contraseña", "Admin", "HiddenID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);
        if (tablaUsuarios.getColumnModel().getColumnCount() > 0) {
            tablaUsuarios.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 81, 463, 275));

        btnRegresar.setBackground(new java.awt.Color(177, 177, 177));
        btnRegresar.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnRegresar.setText("Atrás");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 367, 70, 40));

        cmbAccion.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        cmbAccion.setForeground(new java.awt.Color(102, 102, 102));
        cmbAccion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mostrar", "Agregar", "Modificar", "Eliminar" }));
        cmbAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAccionActionPerformed(evt);
            }
        });
        getContentPane().add(cmbAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 370, 94, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Acción:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 372, -1, -1));

        labTituloAccion.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        labTituloAccion.setForeground(new java.awt.Color(102, 102, 102));
        labTituloAccion.setText("Agregar usuario al sistema");
        getContentPane().add(labTituloAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 16, -1, -1));

        labMensajeAlUsuario.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labMensajeAlUsuario.setForeground(new java.awt.Color(102, 102, 102));
        labMensajeAlUsuario.setText(" ");
        getContentPane().add(labMensajeAlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 49, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Nombre completo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 111, -1, -1));

        txtNombreCompleto.setBackground(new java.awt.Color(237, 237, 237));
        txtNombreCompleto.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        getContentPane().add(txtNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 109, 135, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Nombre de usuario:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 165, -1, -1));

        txtNombreUsuario.setBackground(new java.awt.Color(237, 237, 237));
        txtNombreUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        getContentPane().add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 165, 132, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Contraseña:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 228, -1, -1));

        txtContrasena.setBackground(new java.awt.Color(237, 237, 237));
        txtContrasena.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        getContentPane().add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 226, 175, -1));

        checkAdministrador.setBackground(new java.awt.Color(237, 237, 237));
        checkAdministrador.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        getContentPane().add(checkAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 291, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Administrador:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 296, -1, -1));

        btnAccion.setBackground(new java.awt.Color(177, 177, 177));
        btnAccion.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnAccion.setText("Agregar");
        btnAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccionActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 369, -1, 40));

        jPanel1.setBackground(new java.awt.Color(175, 201, 201));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAccionActionPerformed
        if(cmbAccion.getSelectedIndex() != 1){
            if(tablaUsuarios.getSelectedRow() >= 0){
                validarAccion();
            }else{
                cmbAccion.setSelectedIndex(0);
                validarAccion();
                JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente de la tabla");
            }
        }else{
            validarAccion();
        }
    }//GEN-LAST:event_cmbAccionActionPerformed

    private void validarAccion(){
        if(cmbAccion.getSelectedIndex() == 0){
                labTituloAccion.setText("Información del usuario");
                labMensajeAlUsuario.setText("");
                habilitarCampos(false);
                btnAccion.setVisible(false);
            }else if(cmbAccion.getSelectedIndex() == 1){
                labTituloAccion.setText("Agregar usuario al sistema");
                labMensajeAlUsuario.setText("Complete los siguientes datos:");
                habilitarCampos(true);
                btnAccion.setVisible(true);
                btnAccion.setText("Agregar");
                
                txtNombreCompleto.setText("");
                txtNombreUsuario.setText("");
                txtContrasena.setText("");
                checkAdministrador.setSelected(false);
                
                tablaUsuarios.clearSelection();
            }else if(cmbAccion.getSelectedIndex() == 2){
                labTituloAccion.setText("Modificar usuario seleccionado");
                labMensajeAlUsuario.setText("Modifique los datos del usuario:");
                habilitarCampos(true);
                btnAccion.setVisible(true);
                btnAccion.setText("Modificar");
            }else{
                labTituloAccion.setText("Eliminar usuario del sistema");
                labMensajeAlUsuario.setText("");
                habilitarCampos(false);
                btnAccion.setVisible(true);
                btnAccion.setText("Eliminar");
            }
    }
    private void cargarUsuarioSeleccionado(){
        if(cmbAccion.getSelectedIndex() != 1){
            txtNombreCompleto.setText(tablaUsuarios.getModel().getValueAt(tablaUsuarios.getSelectedRow(), 0).toString());
            txtNombreUsuario.setText(tablaUsuarios.getModel().getValueAt(tablaUsuarios.getSelectedRow(), 1).toString());
            txtContrasena.setText(tablaUsuarios.getModel().getValueAt(tablaUsuarios.getSelectedRow(), 2).toString());

            if(tablaUsuarios.getModel().getValueAt(tablaUsuarios.getSelectedRow(), 3).toString().equals("true")){
                checkAdministrador.setSelected(true);
            }else{
                checkAdministrador.setSelected(false);
            }
        }
    }
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        new Menu_Principal().setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtro(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        if(tablaUsuarios.getSelectedRow() >= 0){
            validarAccion();
            cargarUsuarioSeleccionado();
        }
    }//GEN-LAST:event_tablaUsuariosMouseClicked

    private void btnAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccionActionPerformed
        int identificador;
        if(txtNombreCompleto.getText().trim().equals("") || txtNombreUsuario.getText().trim().equals("") || txtContrasena.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            BL_Usuario usuario = new BL_Usuario(txtNombreCompleto.getText().trim(),txtNombreUsuario.getText().trim(),txtContrasena.getText().trim(),checkAdministrador.isSelected());
            switch(btnAccion.getText()){
                case "Agregar":
                    if(usuario.agregarUsuario()){
                        JOptionPane.showMessageDialog(null, "El nuevo usuario se agregó correctamente en el sistema","Ingreso exitoso",JOptionPane.INFORMATION_MESSAGE);
                        manejador.Agregar(usuario);
                        txtNombreCompleto.setText("");
                        txtNombreUsuario.setText("");
                        txtContrasena.setText("");
                        checkAdministrador.setSelected(false);
                        listaTotalUsuarios = manejador.ObtenerListaUsuarios();
                        cargarUsuariosEnTabla(listaTotalUsuarios);
                    }else{
                        JOptionPane.showMessageDialog(null, "Ya existe un usuario con el mismo nombre de usuario","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "Modificar":
                    identificador = Integer.parseInt(tablaUsuarios.getModel().getValueAt(tablaUsuarios.getSelectedRow(), 4).toString());
                    usuario.setIdUsuario(listaTotalUsuarios.get(Integer.parseInt(tablaUsuarios.getModel().getValueAt(tablaUsuarios.getSelectedRow(), 4).toString())).getIdUsuario());
                    if(usuario.modificarUsuario()){
                        JOptionPane.showMessageDialog(null, "El nuevo usuario se modificó correctamente ","Modificación exitosa",JOptionPane.INFORMATION_MESSAGE);
                        manejador.Modificar(identificador, usuario);
                        listaTotalUsuarios = manejador.ObtenerListaUsuarios();
                        cargarUsuariosEnTabla(listaTotalUsuarios);
                    }else{
                        JOptionPane.showMessageDialog(null, "Error al modificar el usuario seleccionado","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "Eliminar":
                    identificador = Integer.parseInt(tablaUsuarios.getModel().getValueAt(tablaUsuarios.getSelectedRow(), 4).toString());
                    usuario.setIdUsuario(listaTotalUsuarios.get(Integer.parseInt(tablaUsuarios.getModel().getValueAt(tablaUsuarios.getSelectedRow(), 4).toString())).getIdUsuario());
                    if(usuario.eliminarUsuario()){
                        JOptionPane.showMessageDialog(null, "El usuario seleccionado se eliminó correctamente del sistema","Eliminación exitosa",JOptionPane.INFORMATION_MESSAGE);
                        manejador.Eliminar(identificador);
                        listaTotalUsuarios = manejador.ObtenerListaUsuarios();
                        cargarUsuariosEnTabla(listaTotalUsuarios);
                    }else{
                        JOptionPane.showMessageDialog(null, "Error al eliminar el usuario seleccionado","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                    
            }
        }
    }//GEN-LAST:event_btnAccionActionPerformed

    private void cargarUsuariosEnTabla(ArrayList<BL_Usuario> listaParaMostrar) {

        limpiarTabla(modelo);
        Object[] fila = new Object[modelo.getColumnCount()];

        for (int i = 0; i < listaParaMostrar.size(); i++) {
            fila[0] = listaParaMostrar.get(i).getNombreCompleto();
            fila[1] = listaParaMostrar.get(i).getNombreUsuario();
            fila[2] = listaParaMostrar.get(i).getContrasena();
            if(listaParaMostrar.get(i).isAdministrador()){
                fila[3] = "Si";
            }else{
                fila[3] = "No";
            }
            fila[4] = i;

            modelo.addRow(fila);
        }
        listaTotalUsuarios = listaParaMostrar;
    }
    
    private void habilitarCampos(boolean valor){
        txtNombreCompleto.setEditable(valor);
        txtNombreUsuario.setEditable(valor);
        txtContrasena.setEditable(valor);
        checkAdministrador.setEnabled(valor);
    }

    private void limpiarTabla(DefaultTableModel modelo) {
        int filas = tablaUsuarios.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
    }
    
    private void ocultarColumnaID() {
        tablaUsuarios.getColumn("HiddenID").setMaxWidth(0);
        tablaUsuarios.getColumn("HiddenID").setMinWidth(0);
        tablaUsuarios.getColumn("HiddenID").setPreferredWidth(0);
        tablaUsuarios.getColumn("HiddenID").setWidth(0);
        tablaUsuarios.getColumn("HiddenID").setResizable(false);
    }
    
    private void filtro(String filtro) {
        TableRowSorter<DefaultTableModel> trsFiltro = new TableRowSorter<>(modelo);
        tablaUsuarios.setRowSorter(trsFiltro);
        trsFiltro.setRowFilter(RowFilter.regexFilter("(?i)" + filtro));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccion;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JCheckBox checkAdministrador;
    private javax.swing.JComboBox cmbAccion;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labMensajeAlUsuario;
    private javax.swing.JLabel labTituloAccion;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
