/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import dao.CitaDao;
import dao.impl.CitaDaoImpl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cita;
import utilitario.EXCELcitas;
import utilitario.PDFcitas;



/**
 *
 * @author Miguel Casa
 */
public class ReporteCitas extends javax.swing.JInternalFrame {

    Cita cita = new Cita();
    CitaDao citaDAO = new CitaDaoImpl();
    DefaultTableModel modeloTable =  new DefaultTableModel();
    /**
     * Creates new form ReporteCitas
     */
    public ReporteCitas() {
        initComponents();
        this.listarRegistroCitas();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCitaTotal = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cboOrden = new javax.swing.JComboBox<>();
        btnReporte = new javax.swing.JButton();
        btnVaciarTabla = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tablaCitaTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "MASCOTA", "VETERINARIO", "SERVICIO", "FECHA", "HORA", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaCitaTotal);
        if (tablaCitaTotal.getColumnModel().getColumnCount() > 0) {
            tablaCitaTotal.getColumnModel().getColumn(0).setResizable(false);
            tablaCitaTotal.getColumnModel().getColumn(0).setPreferredWidth(5);
            tablaCitaTotal.getColumnModel().getColumn(1).setResizable(false);
            tablaCitaTotal.getColumnModel().getColumn(2).setResizable(false);
            tablaCitaTotal.getColumnModel().getColumn(3).setResizable(false);
            tablaCitaTotal.getColumnModel().getColumn(4).setResizable(false);
            tablaCitaTotal.getColumnModel().getColumn(4).setPreferredWidth(150);
            tablaCitaTotal.getColumnModel().getColumn(5).setResizable(false);
            tablaCitaTotal.getColumnModel().getColumn(5).setPreferredWidth(30);
            tablaCitaTotal.getColumnModel().getColumn(6).setResizable(false);
            tablaCitaTotal.getColumnModel().getColumn(6).setPreferredWidth(30);
            tablaCitaTotal.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Ordenar Por:");

        cboOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Cliente", "Mascota", "Veterinario", "Servicio", "Fecha", "Hora", "Estado" }));
        cboOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboOrdenActionPerformed(evt);
            }
        });

        btnReporte.setText("GENERAR REPORTE");
        btnReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        btnVaciarTabla.setText("VACIAR TABLA");
        btnVaciarTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVaciarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(cboOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReporte)
                        .addGap(18, 18, 18)
                        .addComponent(btnVaciarTabla)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(28, 28, 28))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte)
                    .addComponent(btnVaciarTabla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRO DE CITAS TOTALES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(375, 375, 375))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboOrdenActionPerformed
        // TODO add your handling code here:
        this.limpiarTabla();
        this.listarRegistroCitas();
    }//GEN-LAST:event_cboOrdenActionPerformed

    private void btnVaciarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarTablaActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(null, "¿Seguro que desea vaciar la tabla?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (option ==  JOptionPane.YES_OPTION){
            if(citaDAO.vaciarTablaRegistro()){
                this.limpiarTabla();
                this.listarRegistroCitas();
                JOptionPane.showMessageDialog(this, "Los datos de la tabla fueron eliminados correctamente", "OK",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al vaciar la tabla   ", "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnVaciarTablaActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
        PDFcitas pdfcita = new PDFcitas();
        pdfcita.reporteCitas(cboOrden.getSelectedItem().toString());
        
        EXCELcitas excelcita = new EXCELcitas();
        excelcita.reporteCitas(cboOrden.getSelectedItem().toString());
    }//GEN-LAST:event_btnReporteActionPerformed

    private  void listarRegistroCitas(){
            List<Cita> listarCitas = citaDAO.listarRegistroCitas(cboOrden.getSelectedItem().toString());
            modeloTable = (DefaultTableModel)tablaCitaTotal.getModel();
            Object[] object = new Object[8];
            
            for(Cita cita :listarCitas){
                object[0]= cita.getId();
                object[1]= cita.getNombreCli();
                object[2]= cita.getNombrePet();
                object[3]= cita.getNombreVet();
                object[4]= cita.getTipoCita();
                object[5]= cita.getFechaCita();
                object[6]= cita.getHoraCita();
                object[7]= cita.getEstadoCita();
                modeloTable.addRow(object);
            }
            tablaCitaTotal.setModel(modeloTable);
            tablaCitaTotal.revalidate();
    }
    
    private void limpiarTabla(){
            modeloTable = (DefaultTableModel) tablaCitaTotal.getModel();
            modeloTable.setRowCount(0);
            tablaCitaTotal.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnVaciarTabla;
    private javax.swing.JComboBox<String> cboOrden;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaCitaTotal;
    // End of variables declaration//GEN-END:variables
}
