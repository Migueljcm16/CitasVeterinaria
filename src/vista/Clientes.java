/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import dao.ClienteDao;
import dao.impl.ClienteDaoImpl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

/**
 *
 * @author Miguel Casa
 */
public class Clientes extends javax.swing.JInternalFrame {
    
    Cliente cliente = new Cliente();
    ClienteDao clienteDAO = new ClienteDaoImpl();
    DefaultTableModel modeloTable =  new DefaultTableModel();
    int id = 0;
    int deuda = 0;
    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
        this.listarCliente();
        this.verificarDeuda();
        this.buscarcliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtfono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        btnregister = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablacli = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtbuscador = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("CLIENTES");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel3.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 140, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("DNI:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel3.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 140, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Telefono:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        jPanel3.add(txtfono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 140, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nombre: ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel3.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 140, -1));

        btnregister.setText("GUARDAR");
        btnregister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel3.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 90, -1));

        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 80, -1));

        btneliminar.setText("ELIMINAR");
        btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        btnmodificar.setText("MODIFICAR");
        btnmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ID:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtId.setEditable(false);
        txtId.setEnabled(false);
        jPanel3.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 50, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tablacli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "DNI", "TELEFONO", "MASCOTAS", "DEUDAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablacli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablacliMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablacli);
        if (tablacli.getColumnModel().getColumnCount() > 0) {
            tablacli.getColumnModel().getColumn(0).setResizable(false);
            tablacli.getColumnModel().getColumn(0).setPreferredWidth(5);
            tablacli.getColumnModel().getColumn(1).setResizable(false);
            tablacli.getColumnModel().getColumn(1).setPreferredWidth(40);
            tablacli.getColumnModel().getColumn(2).setResizable(false);
            tablacli.getColumnModel().getColumn(2).setPreferredWidth(40);
            tablacli.getColumnModel().getColumn(3).setResizable(false);
            tablacli.getColumnModel().getColumn(3).setPreferredWidth(5);
            tablacli.getColumnModel().getColumn(4).setResizable(false);
            tablacli.getColumnModel().getColumn(4).setPreferredWidth(5);
            tablacli.getColumnModel().getColumn(5).setResizable(false);
            tablacli.getColumnModel().getColumn(5).setPreferredWidth(5);
            tablacli.getColumnModel().getColumn(6).setResizable(false);
            tablacli.getColumnModel().getColumn(6).setPreferredWidth(5);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Buscador");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtbuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private  void listarCliente(){
            List<Cliente> listarCliente = clienteDAO.listarCliente();
            modeloTable = (DefaultTableModel)tablacli.getModel();
            Object[] object = new Object[7];
            
            for(Cliente cli :listarCliente){
                object[0]= cli.getId();
                object[1]= cli.getNombre();
                object[2]= cli.getApellido();
                object[3]= cli.getDni();
                object[4]= cli.getTelefono();
                object[5]= cli.getMascotas();
                object[6]= cli.getDeudas();
                modeloTable.addRow(object);
            }
            tablacli.setModel(modeloTable);
            tablacli.revalidate();
    }
    
    private void verificarDeuda(){
        for (int i = 0; i < tablacli.getColumnCount(); i++) {
            tablacli.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }
    
    private void limpiarTabla(){
            modeloTable = (DefaultTableModel) tablacli.getModel();
            modeloTable.setRowCount(0);
            tablacli.revalidate();
    }
    
    private void limpiarCajas(){
        
        int selectedRow = tablacli.getSelectedRow();

        if (selectedRow != -1) {
            tablacli.clearSelection();
        }
        txtId.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtdni.setText("");
        txtfono.setText("");
        this.id = 0;
        this.deuda = 0;
    }
    
    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        // TODO add your handling code here:
        if(this.id == 0){
            if (!"".equals(txtnombre.getText())  && !"".equals(txtapellido.getText())  && !"". equals(txtdni.getText())
                       && !"".equals(txtfono.getText())){
                
                if(txtdni.getText().length()==8){
                    if(txtfono.getText().length() == 9){
                        cliente.setNombre(txtnombre.getText());
                        cliente.setApellido(txtapellido.getText());
                        cliente.setDni(txtdni.getText());
                        cliente.setTelefono(txtfono.getText());

                        if(this.verificarDNI()){
                            if(  clienteDAO.registrarCliente(cliente)){
                            this.limpiarCajas();
                            this.limpiarTabla();
                            this.listarCliente();
                            JOptionPane.showMessageDialog(this, "Se registro correctamente ", "OK",JOptionPane.INFORMATION_MESSAGE);

                            }else {
                                JOptionPane.showMessageDialog(this, "Error al registrar Cliente", "ERROR",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Numero de telefono invalido (Cantidad de caracteres invalido)", "ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                } else{
                    JOptionPane.showMessageDialog(this, "DNI invalido (Cantidad de caracteres invalido)", "ERROR",JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Faltan datos a llenar", "Datos faltantes",JOptionPane.ERROR_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(this, "Tiene un cliente seleccionado, para registrar uno nuevo limpie las cajas", "Cliente seleccionado",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnregisterActionPerformed

    private void tablacliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacliMouseClicked
        // TODO add your handling code here:
        int fila = tablacli.rowAtPoint(evt.getPoint());
        String id = tablacli.getValueAt(fila, 0).toString();
        String nombre = tablacli.getValueAt(fila, 1).toString();
        String apellido = tablacli.getValueAt(fila, 2).toString();
        String dni = tablacli.getValueAt(fila,3).toString();
        String telefono = tablacli.getValueAt(fila, 4).toString();
        this.deuda = Integer.parseInt(tablacli.getValueAt(fila, 4).toString());
        
        this.id = Integer.parseInt(id);
        txtId.setText(Integer.toString(this.id));
        txtnombre.setText(nombre);
        txtapellido.setText(apellido);
        txtdni.setText(dni);
        txtfono.setText(telefono); 
    }//GEN-LAST:event_tablacliMouseClicked

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        this.limpiarCajas();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        if(this.id != 0){
            int option = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar el registro incluyendo las mascotas registradas?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (option ==  JOptionPane.YES_OPTION){
                if(this.deuda == 0){
                    if( clienteDAO.vaciarMascotasCli(this.id) && clienteDAO.eliminarCliente(this.id)){
                        JOptionPane.showMessageDialog(this, "Se elimino correctamente ", "OK",JOptionPane.INFORMATION_MESSAGE);
                        this.id = 0;
                        this.limpiarCajas();
                        this.limpiarTabla();
                        this.listarCliente();
                    }else {
                        JOptionPane.showMessageDialog(this, "Error al eliminar Cliente   ", "ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                } else{
                    JOptionPane.showMessageDialog(this, "El cliente tiene deudas pendientes", "ERROR",JOptionPane.ERROR_MESSAGE);
                }
            } else{
                this.limpiarCajas();
            }
        }else {
            JOptionPane.showMessageDialog(this, "No hay cliente seleccionado", "Seleccione de la tabla",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        if(this.id != 0){
            if (!"".equals(txtnombre.getText())  && !"".equals(txtapellido.getText())  && !"". equals(txtdni.getText())
                       && !"".equals(txtfono.getText())){
                if(txtdni.getText().length()==8){
                    if(txtfono.getText().length() == 9){
                        cliente.setNombre(txtnombre.getText());
                        cliente.setApellido(txtapellido.getText());
                        cliente.setDni(txtdni.getText());
                        cliente.setTelefono(txtfono.getText());
                        cliente.setId(id);

                        if(  clienteDAO.modificarCliente(cliente)){
                            this.limpiarCajas();
                            this.limpiarTabla();
                            this.ActualizarMascotas();
                            this.listarCliente();

                            JOptionPane.showMessageDialog(this, "Se edito correctamente ", "OK",JOptionPane.INFORMATION_MESSAGE);

                        }else {
                            JOptionPane.showMessageDialog(this, "Error al editar Cliente   ", "ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Numero de telefono invalido (Cantidad de caracteres invalido)", "ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                } else{
                    JOptionPane.showMessageDialog(this, "DNI invalido (Cantidad de caracteres invalido)", "ERROR",JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Faltan datos a llenar", "Datos faltantes",JOptionPane.ERROR_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(this, "No hay cliente seleccionado", "Seleccione de la tabla",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnmodificarActionPerformed
    
    public void iniciarbusqueda(){
        if (!"".equals(txtbuscador.getText())){
            this.limpiarTabla();
            List<Cliente> listarCliente = clienteDAO.buscarCliente(txtbuscador.getText());
            modeloTable = (DefaultTableModel)tablacli.getModel();
            Object[] object = new Object[7];

            for(Cliente cli :listarCliente){
                object[0]= cli.getId();
                object[1]= cli.getNombre();
                object[2]= cli.getApellido();
                object[3]= cli.getDni();
                object[4]= cli.getTelefono();
                object[5]= cli.getMascotas();
                object[6]= cli.getDeudas();
                modeloTable.addRow(object);
            }
            tablacli.setModel(modeloTable);
            tablacli.revalidate();
        } else{
            this.limpiarTabla();
            this.listarCliente();
        }
    }
    
    private void buscarcliente(){
        txtbuscador.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                iniciarbusqueda();
                System.out.println("Texto insertado: " + txtbuscador.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                iniciarbusqueda();
                System.out.println("Texto eliminado: " + txtbuscador.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
    }
    
    private void ActualizarMascotas(){
        Mascotas mascotas = new Mascotas();
        mascotas.actualizarCli();
    }
    
    private boolean verificarDNI(){
        int rowCount = tablacli.getRowCount();
    
        for (int i = 0; i < rowCount; i++) {
            Object value = tablacli.getValueAt(i, 3);

            if (txtdni.getText().equals(value)) {
                JOptionPane.showMessageDialog(this, "DNI ya registrado", "DNI Existente",JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        return true;
    }
    
    javax.swing.table.DefaultTableCellRenderer renderer = new javax.swing.table.DefaultTableCellRenderer() {
        @Override
        public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            java.awt.Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Obtener el valor de la celda en la séptima columna
            Object valorColumna7 = table.getValueAt(row, 6); // La séptima columna es el índice 6

            // Verificar si el valor es 0 o mayor a 0
            if (valorColumna7 instanceof Integer && (Integer) valorColumna7 == 0) {
                c.setBackground(java.awt.Color.GREEN); // Resaltar en verde si el valor es 0
            } else {
                c.setBackground(java.awt.Color.RED); // Resaltar en rojo si el valor es mayor a 0
            }

            return c;
        }
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnregister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablacli;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtbuscador;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtfono;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}