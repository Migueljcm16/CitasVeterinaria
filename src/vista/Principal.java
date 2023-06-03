/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.util.Timer;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Miguel Casa
 */
public class Principal extends javax.swing.JFrame {
    
    int op = 0;
    JInternalFrame mascotasFrame;
    JInternalFrame clientesFrame;
    JInternalFrame serviciosFrame;
    JInternalFrame citasFrame;
    JInternalFrame veterinariosFrame;
    JInternalFrame usuariosFrame;
    JInternalFrame reportesFrame;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/salud.png")));
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.redimensionarImg();
        this.ActualizarMascotas();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                verificarCitasProximas();
            }
        }, 500);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/desktopback.jpg"));
        Image img = icon.getImage();
        Desktop1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(img,0,0,getWidth(),getHeight(),this);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jpHora = new javax.swing.JPanel();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        lblHora = new javax.swing.JLabel();
        jpFecha = new javax.swing.JPanel();
        Rsfecha = new rojeru_san.RSLabelFecha();
        lblfecha = new javax.swing.JLabel();
        jpClientes = new javax.swing.JPanel();
        CargarCli = new javax.swing.JLabel();
        jpMascotas = new javax.swing.JPanel();
        CargarMascota = new javax.swing.JLabel();
        jpCitas = new javax.swing.JPanel();
        CargarCitas = new javax.swing.JLabel();
        jpVeterinarios = new javax.swing.JPanel();
        CargarVeterinarios = new javax.swing.JLabel();
        jpUsuarios = new javax.swing.JPanel();
        CargarUsuarios = new javax.swing.JLabel();
        jpServicios = new javax.swing.JPanel();
        CargarServicios = new javax.swing.JLabel();
        jpReportes = new javax.swing.JPanel();
        CargarReportes = new javax.swing.JLabel();
        jpCerrarSesion = new javax.swing.JPanel();
        Logout = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        logoLog = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Citas Veterinaria");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        javax.swing.GroupLayout Desktop1Layout = new javax.swing.GroupLayout(Desktop1);
        Desktop1.setLayout(Desktop1Layout);
        Desktop1Layout.setHorizontalGroup(
            Desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1044, Short.MAX_VALUE)
        );
        Desktop1Layout.setVerticalGroup(
            Desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jpHora.setBackground(new java.awt.Color(51, 51, 51));
        jpHora.setLayout(null);

        rSLabelHora1.setForeground(new java.awt.Color(102, 102, 102));
        jpHora.add(rSLabelHora1);
        rSLabelHora1.setBounds(40, 10, 90, 30);

        lblHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hora.png"))); // NOI18N
        jpHora.add(lblHora);
        lblHora.setBounds(30, 10, 110, 30);

        jpFecha.setBackground(new java.awt.Color(51, 51, 51));
        jpFecha.setLayout(null);

        Rsfecha.setForeground(new java.awt.Color(102, 102, 102));
        jpFecha.add(Rsfecha);
        Rsfecha.setBounds(10, 10, 90, 30);

        lblfecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hora.png"))); // NOI18N
        jpFecha.add(lblfecha);
        lblfecha.setBounds(10, 10, 90, 30);

        jpClientes.setBackground(new java.awt.Color(102, 0, 0));
        jpClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CargarCli.setForeground(new java.awt.Color(255, 255, 255));
        CargarCli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CargarCli.setText("Clientes");
        CargarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CargarCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarCliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CargarCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CargarCliMouseExited(evt);
            }
        });
        jpClientes.add(CargarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jpMascotas.setBackground(new java.awt.Color(102, 0, 0));

        CargarMascota.setForeground(new java.awt.Color(255, 255, 255));
        CargarMascota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CargarMascota.setText("Mascotas");
        CargarMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CargarMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarMascotaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CargarMascotaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CargarMascotaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpMascotasLayout = new javax.swing.GroupLayout(jpMascotas);
        jpMascotas.setLayout(jpMascotasLayout);
        jpMascotasLayout.setHorizontalGroup(
            jpMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMascotasLayout.createSequentialGroup()
                .addComponent(CargarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpMascotasLayout.setVerticalGroup(
            jpMascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMascotasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CargarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpCitas.setBackground(new java.awt.Color(102, 0, 0));

        CargarCitas.setForeground(new java.awt.Color(255, 255, 255));
        CargarCitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CargarCitas.setText("Citas");
        CargarCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CargarCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarCitasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CargarCitasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CargarCitasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpCitasLayout = new javax.swing.GroupLayout(jpCitas);
        jpCitas.setLayout(jpCitasLayout);
        jpCitasLayout.setHorizontalGroup(
            jpCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCitasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CargarCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpCitasLayout.setVerticalGroup(
            jpCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCitasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CargarCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpVeterinarios.setBackground(new java.awt.Color(102, 0, 0));

        CargarVeterinarios.setForeground(new java.awt.Color(255, 255, 255));
        CargarVeterinarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CargarVeterinarios.setText("Veterinarios");
        CargarVeterinarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CargarVeterinarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarVeterinariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CargarVeterinariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CargarVeterinariosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpVeterinariosLayout = new javax.swing.GroupLayout(jpVeterinarios);
        jpVeterinarios.setLayout(jpVeterinariosLayout);
        jpVeterinariosLayout.setHorizontalGroup(
            jpVeterinariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeterinariosLayout.createSequentialGroup()
                .addComponent(CargarVeterinarios, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpVeterinariosLayout.setVerticalGroup(
            jpVeterinariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVeterinariosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CargarVeterinarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpUsuarios.setBackground(new java.awt.Color(102, 0, 0));

        CargarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        CargarUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CargarUsuarios.setText("Usuarios");
        CargarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CargarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CargarUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CargarUsuariosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpUsuariosLayout = new javax.swing.GroupLayout(jpUsuarios);
        jpUsuarios.setLayout(jpUsuariosLayout);
        jpUsuariosLayout.setHorizontalGroup(
            jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUsuariosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CargarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpUsuariosLayout.setVerticalGroup(
            jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUsuariosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CargarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpServicios.setBackground(new java.awt.Color(102, 0, 0));

        CargarServicios.setForeground(new java.awt.Color(255, 255, 255));
        CargarServicios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CargarServicios.setText("Servicios");
        CargarServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CargarServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarServiciosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CargarServiciosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CargarServiciosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpServiciosLayout = new javax.swing.GroupLayout(jpServicios);
        jpServicios.setLayout(jpServiciosLayout);
        jpServiciosLayout.setHorizontalGroup(
            jpServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpServiciosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CargarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpServiciosLayout.setVerticalGroup(
            jpServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpServiciosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CargarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpReportes.setBackground(new java.awt.Color(102, 0, 0));

        CargarReportes.setForeground(new java.awt.Color(255, 255, 255));
        CargarReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CargarReportes.setText("Reportes");
        CargarReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CargarReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CargarReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CargarReportesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpReportesLayout = new javax.swing.GroupLayout(jpReportes);
        jpReportes.setLayout(jpReportesLayout);
        jpReportesLayout.setHorizontalGroup(
            jpReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpReportesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CargarReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpReportesLayout.setVerticalGroup(
            jpReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpReportesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CargarReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpCerrarSesion.setBackground(new java.awt.Color(102, 0, 0));
        jpCerrarSesion.setLayout(null);

        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logout.setText("Cerrar sesión");
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
        });
        jpCerrarSesion.add(Logout);
        Logout.setBounds(0, 0, 90, 30);

        lblusu.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        lblusu.setForeground(new java.awt.Color(255, 255, 255));
        lblusu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblusu.setText("Null");

        jPanel6.setPreferredSize(new java.awt.Dimension(10, 70));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        logoLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoLog.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpHora, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jpClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jpMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jpCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jpVeterinarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jpUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jpServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jpReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jpCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblusu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoLog, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpMascotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpVeterinarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoLog, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblusu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Desktop1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Desktop1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarMascotaMouseClicked
        // TODO add your handling code here:
        if (mascotasFrame != null) {
            mascotasFrame.dispose();
        }
        
        Mascotas mascotas = new Mascotas();
        mascotasFrame=  mascotas;
        mascotas.rMascotas(Desktop1);
        Desktop1.add(mascotas);
        mascotas.setVisible(true);;
    }//GEN-LAST:event_CargarMascotaMouseClicked
    
    private void CargarCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarCliMouseClicked
        // TODO add your handling code here:
        if (clientesFrame != null) {
            clientesFrame.dispose();
        }
        
        Clientes clientes = new Clientes();
        clientesFrame=  clientes;
        Desktop1.add(clientes);
        clientes.show();
    }//GEN-LAST:event_CargarCliMouseClicked

    private void CargarServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarServiciosMouseClicked
        // TODO add your handling code here:
        if (serviciosFrame != null) {
            serviciosFrame.dispose();
        }
        
        Servicios servicios = new Servicios();
        serviciosFrame=  servicios;
        Desktop1.add(servicios);
        servicios.show();
    }//GEN-LAST:event_CargarServiciosMouseClicked

    private void CargarCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarCitasMouseClicked
        // TODO add your handling code here:
        if (citasFrame != null) {
            citasFrame.dispose();
        }
        
        Citas citas = new Citas();
        citasFrame=  citas;
        Desktop1.add(citas);
        citas.show();
        citas.op = this.op;
        citas.verificarFechasVencidas();
        this.op = 1;
    }//GEN-LAST:event_CargarCitasMouseClicked

    private void CargarVeterinariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarVeterinariosMouseClicked
        // TODO add your handling code here:
        if (veterinariosFrame != null) {
            veterinariosFrame.dispose();
        }
        
        Veterinarios veterinarios = new Veterinarios();
        veterinariosFrame=  veterinarios;
        Desktop1.add(veterinarios);
        veterinarios.show();
    }//GEN-LAST:event_CargarVeterinariosMouseClicked

    private void CargarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarUsuariosMouseClicked
        // TODO add your handling code here:
        if (usuariosFrame != null) {
            usuariosFrame.dispose();
        }
        
        Usuarios usuarios = new Usuarios();
        usuariosFrame=  usuarios;
        Desktop1.add(usuarios);
        usuarios.show();
    }//GEN-LAST:event_CargarUsuariosMouseClicked

    private void CargarReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarReportesMouseClicked
        // TODO add your handling code here:
        if (reportesFrame != null) {
            reportesFrame.dispose();
        }
        
        ReporteCitas reportes = new ReporteCitas();
        reportesFrame=  reportes;
        Desktop1.add(reportes);
        reportes.show();
    }//GEN-LAST:event_CargarReportesMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(null, "¿Seguro que desea cerrar sesión?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (option ==  JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_LogoutMouseClicked

    private void CargarCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarCliMouseEntered
        // TODO add your handling code here:
        jpClientes.setBackground(new Color(157,0,0));
    }//GEN-LAST:event_CargarCliMouseEntered

    private void CargarCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarCliMouseExited
        // TODO add your handling code here:
        jpClientes.setBackground(new Color(102,0,0));
    }//GEN-LAST:event_CargarCliMouseExited

    private void CargarMascotaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarMascotaMouseEntered
        // TODO add your handling code here:
        jpMascotas.setBackground(new Color(157,0,0));
    }//GEN-LAST:event_CargarMascotaMouseEntered

    private void CargarMascotaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarMascotaMouseExited
        // TODO add your handling code here:
        jpMascotas.setBackground(new Color(102,0,0));
    }//GEN-LAST:event_CargarMascotaMouseExited

    private void CargarCitasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarCitasMouseExited
        // TODO add your handling code here:
        jpCitas.setBackground(new Color(102,0,0));
    }//GEN-LAST:event_CargarCitasMouseExited

    private void CargarCitasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarCitasMouseEntered
        // TODO add your handling code here:
        jpCitas.setBackground(new Color(157,0,0));
    }//GEN-LAST:event_CargarCitasMouseEntered

    private void CargarVeterinariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarVeterinariosMouseEntered
        // TODO add your handling code here:
         jpVeterinarios.setBackground(new Color(157,0,0));
    }//GEN-LAST:event_CargarVeterinariosMouseEntered

    private void CargarVeterinariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarVeterinariosMouseExited
        // TODO add your handling code here:
        jpVeterinarios.setBackground(new Color(102,0,0));
    }//GEN-LAST:event_CargarVeterinariosMouseExited

    private void CargarUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarUsuariosMouseEntered
        // TODO add your handling code here:
        jpUsuarios.setBackground(new Color(157,0,0));
    }//GEN-LAST:event_CargarUsuariosMouseEntered

    private void CargarUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarUsuariosMouseExited
        // TODO add your handling code here:
        jpUsuarios.setBackground(new Color(102,0,0));
    }//GEN-LAST:event_CargarUsuariosMouseExited

    private void CargarServiciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarServiciosMouseEntered
        // TODO add your handling code here:
        jpServicios.setBackground(new Color(157,0,0));
    }//GEN-LAST:event_CargarServiciosMouseEntered

    private void CargarServiciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarServiciosMouseExited
        // TODO add your handling code here:
        jpServicios.setBackground(new Color(102,0,0));
    }//GEN-LAST:event_CargarServiciosMouseExited

    private void CargarReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarReportesMouseEntered
        // TODO add your handling code here:
        jpReportes.setBackground(new Color(157,0,0));
    }//GEN-LAST:event_CargarReportesMouseEntered

    private void CargarReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarReportesMouseExited
        // TODO add your handling code here:
        jpReportes.setBackground(new Color(102,0,0));
    }//GEN-LAST:event_CargarReportesMouseExited

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        // TODO add your handling code here:
        jpCerrarSesion.setBackground(new Color(157,0,0));
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        // TODO add your handling code here:
        jpCerrarSesion.setBackground(new Color(102,0,0));
    }//GEN-LAST:event_LogoutMouseExited
    
    private void ActualizarMascotas(){
        Mascotas mascotas = new Mascotas();
        mascotas.actualizarCli();
    }
    
    private void redimensionarImg(){
        Icon iconPred = logoLog.getIcon();
        Image imgPred = ((ImageIcon) iconPred).getImage();
        Image imgIcon = imgPred.getScaledInstance(logoLog.getWidth(), logoLog.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoRedimensionado = new ImageIcon(imgIcon);
        logoLog.setIcon(iconoRedimensionado);
        
        Icon iconPred2 = lblHora.getIcon();
        Image imgPred2 = ((ImageIcon) iconPred2).getImage();
        Image imgIcon2 = imgPred2.getScaledInstance(lblHora.getWidth(), lblHora.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoRedimensionado2 = new ImageIcon(imgIcon2);
        lblHora.setIcon(iconoRedimensionado2);
        
        Icon iconPred3 = lblfecha.getIcon();
        Image imgPred3 = ((ImageIcon) iconPred3).getImage();
        Image imgIcon3 = imgPred3.getScaledInstance(lblfecha.getWidth(), lblfecha.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoRedimensionado3 = new ImageIcon(imgIcon3);
        lblfecha.setIcon(iconoRedimensionado3);
    }
    
    public void setVariable(String usu) {
        lblusu.setText(usu);
    }
    
    private void verificarCitasProximas(){
                Citas citas = new Citas();
                citas.verificarCitasProximas();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.setProperty("awt.useSystemAAFontSettings", "lcd"); // use font antialiasing
        System.setProperty("swing.aatext", "true");
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }

            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CargarCitas;
    private javax.swing.JLabel CargarCli;
    private javax.swing.JLabel CargarMascota;
    private javax.swing.JLabel CargarReportes;
    private javax.swing.JLabel CargarServicios;
    private javax.swing.JLabel CargarUsuarios;
    private javax.swing.JLabel CargarVeterinarios;
    public javax.swing.JDesktopPane Desktop1;
    private javax.swing.JLabel Logout;
    private rojeru_san.RSLabelFecha Rsfecha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jpCerrarSesion;
    private javax.swing.JPanel jpCitas;
    private javax.swing.JPanel jpClientes;
    private javax.swing.JPanel jpFecha;
    private javax.swing.JPanel jpHora;
    private javax.swing.JPanel jpMascotas;
    private javax.swing.JPanel jpReportes;
    private javax.swing.JPanel jpServicios;
    private javax.swing.JPanel jpUsuarios;
    private javax.swing.JPanel jpVeterinarios;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblusu;
    private javax.swing.JLabel logoLog;
    private rojeru_san.RSLabelHora rSLabelHora1;
    // End of variables declaration//GEN-END:variables
}