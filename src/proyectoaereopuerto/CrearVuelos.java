package proyectoaereopuerto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hakris
 */
public class CrearVuelos extends javax.swing.JFrame {

    DefaultComboBoxModel destinosModel = new DefaultComboBoxModel();
    DefaultComboBoxModel clasesModel = new DefaultComboBoxModel();
    DefaultComboBoxModel numBoletosModel = new DefaultComboBoxModel();
    DefaultComboBoxModel aerolineaModel = new DefaultComboBoxModel();
    DefaultComboBoxModel diaModel = new DefaultComboBoxModel();
    DefaultComboBoxModel mesModel = new DefaultComboBoxModel();
    DefaultComboBoxModel anioModel = new DefaultComboBoxModel();
    DefaultComboBoxModel tiempoEstadiaModel = new DefaultComboBoxModel();
    DefaultComboBoxModel equipajesModel = new DefaultComboBoxModel();

    public CrearVuelos() {
        initComponents();
        cargarModelos();
        jlbl_Nombre.setText(getNombreLoggeado());

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
        jlbl_Nombre = new javax.swing.JLabel();
        jbtn_Volver = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtxt_FechaSalida = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxt_FechaVuelta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxt_TiempoVuelo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxt_Total = new javax.swing.JTextField();
        jbtn_Aceptar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcmb_Destino = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcmb_Clase = new javax.swing.JComboBox<>();
        jcmb_NumBoletos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcmb_Aerolinea = new javax.swing.JComboBox<>();
        jcmb_Mes = new javax.swing.JComboBox<>();
        jcmb_Dia = new javax.swing.JComboBox<>();
        jcmb_Anio = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jcmb_TiempoEstadia = new javax.swing.JComboBox<>();
        jchk_Equipaje = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcmb_CantEquipaje = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_Nombre.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        jlbl_Nombre.setForeground(new java.awt.Color(0, 153, 153));
        jlbl_Nombre.setText("nombre");
        jPanel1.add(jlbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jbtn_Volver.setBackground(new java.awt.Color(102, 204, 255));
        jbtn_Volver.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jbtn_Volver.setForeground(new java.awt.Color(204, 255, 255));
        jbtn_Volver.setText("CANCELAR");
        jbtn_Volver.setBorder(null);
        jbtn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 690, 140, 50));

        jLabel10.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(10, 66, 157));
        jLabel10.setText("Dia del embarque del vuelo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jtxt_FechaSalida.setBackground(new java.awt.Color(153, 204, 255));
        jtxt_FechaSalida.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jtxt_FechaSalida.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_FechaSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt_FechaSalida.setBorder(null);
        jtxt_FechaSalida.setEnabled(false);
        jPanel1.add(jtxt_FechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 360, 40));

        jLabel11.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(10, 66, 157));
        jLabel11.setText("Fecha de retorno");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jtxt_FechaVuelta.setBackground(new java.awt.Color(153, 204, 255));
        jtxt_FechaVuelta.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jtxt_FechaVuelta.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_FechaVuelta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt_FechaVuelta.setBorder(null);
        jtxt_FechaVuelta.setEnabled(false);
        jPanel1.add(jtxt_FechaVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 360, 40));

        jLabel12.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(10, 66, 157));
        jLabel12.setText("Tiempo estimado de vuelo");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jtxt_TiempoVuelo.setBackground(new java.awt.Color(153, 204, 255));
        jtxt_TiempoVuelo.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jtxt_TiempoVuelo.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_TiempoVuelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt_TiempoVuelo.setBorder(null);
        jtxt_TiempoVuelo.setEnabled(false);
        jPanel1.add(jtxt_TiempoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 360, 40));

        jLabel13.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(10, 66, 157));
        jLabel13.setText("Precio total");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        jtxt_Total.setBackground(new java.awt.Color(153, 204, 255));
        jtxt_Total.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jtxt_Total.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt_Total.setBorder(null);
        jtxt_Total.setEnabled(false);
        jPanel1.add(jtxt_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 360, 40));

        jbtn_Aceptar.setBackground(new java.awt.Color(102, 204, 255));
        jbtn_Aceptar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jbtn_Aceptar.setForeground(new java.awt.Color(204, 255, 255));
        jbtn_Aceptar.setText("COMPRAR");
        jbtn_Aceptar.setBorder(null);
        jbtn_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_AceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 690, 130, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 480, 820));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 66, 157));
        jLabel2.setText("Destino deseado");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jcmb_Destino.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_Destino.setForeground(new java.awt.Color(102, 102, 102));
        jcmb_Destino.setBorder(null);
        jcmb_Destino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmb_DestinoItemStateChanged(evt);
            }
        });
        jPanel2.add(jcmb_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 400, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(10, 66, 157));
        jLabel3.setText("Clase preferida en su vuelo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jcmb_Clase.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_Clase.setForeground(new java.awt.Color(102, 102, 102));
        jcmb_Clase.setBorder(null);
        jcmb_Clase.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmb_ClaseItemStateChanged(evt);
            }
        });
        jPanel2.add(jcmb_Clase, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 400, -1));

        jcmb_NumBoletos.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_NumBoletos.setForeground(new java.awt.Color(102, 102, 102));
        jcmb_NumBoletos.setBorder(null);
        jcmb_NumBoletos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmb_NumBoletosItemStateChanged(evt);
            }
        });
        jPanel2.add(jcmb_NumBoletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 400, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 66, 157));
        jLabel4.setText("Numero de boletos a comprar");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(10, 66, 157));
        jLabel5.setText("Aerolinea preferida");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(10, 66, 157));
        jLabel6.setText("Fecha de salida de su vuelo");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        jcmb_Aerolinea.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_Aerolinea.setForeground(new java.awt.Color(102, 102, 102));
        jcmb_Aerolinea.setBorder(null);
        jcmb_Aerolinea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmb_AerolineaItemStateChanged(evt);
            }
        });
        jPanel2.add(jcmb_Aerolinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 400, -1));

        jcmb_Mes.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_Mes.setForeground(new java.awt.Color(102, 102, 102));
        jcmb_Mes.setBorder(null);
        jcmb_Mes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmb_MesItemStateChanged(evt);
            }
        });
        jcmb_Mes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcmb_MesMouseClicked(evt);
            }
        });
        jPanel2.add(jcmb_Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 110, -1));

        jcmb_Dia.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_Dia.setForeground(new java.awt.Color(102, 102, 102));
        jcmb_Dia.setBorder(null);
        jcmb_Dia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmb_DiaItemStateChanged(evt);
            }
        });
        jcmb_Dia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcmb_DiaMouseClicked(evt);
            }
        });
        jcmb_Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_DiaActionPerformed(evt);
            }
        });
        jPanel2.add(jcmb_Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 110, -1));

        jcmb_Anio.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_Anio.setForeground(new java.awt.Color(102, 102, 102));
        jcmb_Anio.setBorder(null);
        jcmb_Anio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmb_AnioItemStateChanged(evt);
            }
        });
        jcmb_Anio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcmb_AnioMouseClicked(evt);
            }
        });
        jPanel2.add(jcmb_Anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 110, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(10, 66, 157));
        jLabel7.setText("Dias de estadía");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 200, 50));

        jcmb_TiempoEstadia.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_TiempoEstadia.setForeground(new java.awt.Color(102, 102, 102));
        jcmb_TiempoEstadia.setBorder(null);
        jcmb_TiempoEstadia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmb_TiempoEstadiaItemStateChanged(evt);
            }
        });
        jPanel2.add(jcmb_TiempoEstadia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, 110, -1));

        jchk_Equipaje.setBackground(new java.awt.Color(255, 255, 255));
        jchk_Equipaje.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jchk_Equipaje.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jchk_EquipajeItemStateChanged(evt);
            }
        });
        jchk_Equipaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jchk_EquipajeMouseClicked(evt);
            }
        });
        jPanel2.add(jchk_Equipaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 740, 30, 30));

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(10, 66, 157));
        jLabel8.setText("Equipaje");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, 110, 50));

        jLabel9.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(10, 66, 157));
        jLabel9.setText("cantidad");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 730, -1, 50));

        jcmb_CantEquipaje.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_CantEquipaje.setForeground(new java.awt.Color(102, 102, 102));
        jcmb_CantEquipaje.setBorder(null);
        jcmb_CantEquipaje.setEnabled(false);
        jcmb_CantEquipaje.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmb_CantEquipajeItemStateChanged(evt);
            }
        });
        jPanel2.add(jcmb_CantEquipaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 730, 110, -1));

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setText("Bienvenido");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_VolverActionPerformed
        MenuUser mu = new MenuUser();
        mu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_VolverActionPerformed

    private void jbtn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_AceptarActionPerformed
        subirInformacion();
        MenuUser rv = new MenuUser();
        rv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_AceptarActionPerformed

    private void jchk_EquipajeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jchk_EquipajeItemStateChanged

    }//GEN-LAST:event_jchk_EquipajeItemStateChanged

    private void jchk_EquipajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jchk_EquipajeMouseClicked
        if (jchk_Equipaje.isSelected()) {
            jcmb_CantEquipaje.enable();
            precioTotal();
            jcmb_CantEquipaje.updateUI();
        } else {
            jcmb_CantEquipaje.disable();
            precioTotal();
            jcmb_CantEquipaje.updateUI();
        }
    }//GEN-LAST:event_jchk_EquipajeMouseClicked

    private void jcmb_DestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmb_DestinoItemStateChanged
        precioTotal();
        tiempoTotal();
    }//GEN-LAST:event_jcmb_DestinoItemStateChanged

    private void jcmb_ClaseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmb_ClaseItemStateChanged
        precioTotal();
        tiempoTotal();
    }//GEN-LAST:event_jcmb_ClaseItemStateChanged

    private void jcmb_NumBoletosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmb_NumBoletosItemStateChanged
        precioTotal();
    }//GEN-LAST:event_jcmb_NumBoletosItemStateChanged

    private void jcmb_AerolineaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmb_AerolineaItemStateChanged
        precioTotal();
        tiempoTotal();
    }//GEN-LAST:event_jcmb_AerolineaItemStateChanged

    private void jcmb_TiempoEstadiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmb_TiempoEstadiaItemStateChanged
        precioTotal();
        setFechaEnLabel();
    }//GEN-LAST:event_jcmb_TiempoEstadiaItemStateChanged

    private void jcmb_CantEquipajeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmb_CantEquipajeItemStateChanged
        precioTotal();
    }//GEN-LAST:event_jcmb_CantEquipajeItemStateChanged

    private void jcmb_DiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcmb_DiaMouseClicked

    }//GEN-LAST:event_jcmb_DiaMouseClicked

    private void jcmb_MesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcmb_MesMouseClicked

    }//GEN-LAST:event_jcmb_MesMouseClicked

    private void jcmb_AnioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcmb_AnioMouseClicked

    }//GEN-LAST:event_jcmb_AnioMouseClicked

    private void jcmb_DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_DiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_DiaActionPerformed

    private void jcmb_DiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmb_DiaItemStateChanged
        setFechaEnLabel();
    }//GEN-LAST:event_jcmb_DiaItemStateChanged

    private void jcmb_MesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmb_MesItemStateChanged
        setFechaEnLabel();        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_MesItemStateChanged

    private void jcmb_AnioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmb_AnioItemStateChanged
        setFechaEnLabel();        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_AnioItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CrearVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearVuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtn_Aceptar;
    private javax.swing.JButton jbtn_Volver;
    private javax.swing.JCheckBox jchk_Equipaje;
    private javax.swing.JComboBox<String> jcmb_Aerolinea;
    private javax.swing.JComboBox<String> jcmb_Anio;
    private javax.swing.JComboBox<String> jcmb_CantEquipaje;
    private javax.swing.JComboBox<String> jcmb_Clase;
    private javax.swing.JComboBox<String> jcmb_Destino;
    private javax.swing.JComboBox<String> jcmb_Dia;
    private javax.swing.JComboBox<String> jcmb_Mes;
    private javax.swing.JComboBox<String> jcmb_NumBoletos;
    private javax.swing.JComboBox<String> jcmb_TiempoEstadia;
    private javax.swing.JLabel jlbl_Nombre;
    private javax.swing.JTextField jtxt_FechaSalida;
    private javax.swing.JTextField jtxt_FechaVuelta;
    private javax.swing.JTextField jtxt_TiempoVuelo;
    private javax.swing.JTextField jtxt_Total;
    // End of variables declaration//GEN-END:variables

    private void cargarModelos() {
        //Destinos
        String[] modeloDestino = {"seleccione", "Alemania", "Argentina", "Brasil", "Canada", "China", "Colombia", "Costa Rica", "España", "Estados Unidos", "Francia", "Honduras", "Italia", "Japon", "Mexico", "Peru", "Rusia", "Tailandia", "Ucrania", "Uruguay"};
        for (String i : modeloDestino) {
            destinosModel.addElement(i);
        }
        jcmb_Destino.setModel(destinosModel);

        //Clases
        String[] modeloClases = {"seleccione", "Economica", "Ejecutiva", "Primera Clase"};
        for (String i : modeloClases) {
            clasesModel.addElement(i);
        }
        jcmb_Clase.setModel(clasesModel);

        //Numeros de boletos
        for (int i = 1; i <= 10; i++) {
            numBoletosModel.addElement(i);
        }
        jcmb_NumBoletos.setModel(numBoletosModel);

        //Aerolineas
        String[] modeloAere = {"seleccione", "LATAM", "AVIANCA", "EXPEDIA", "XPRESS", "JET", "TAME"};
        for (String i : modeloAere) {
            aerolineaModel.addElement(i);
        }
        jcmb_Aerolinea.setModel(aerolineaModel);

        //menu dia
        for (int i = 1; i <= 31; i++) {
            diaModel.addElement(i);
        }
        jcmb_Dia.setModel(diaModel);

        //menu mes
        for (int i = 1; i <= 12; i++) {
            mesModel.addElement(i);
        }
        jcmb_Mes.setModel(mesModel);

        //menu año
        for (int i = 2022; i <= 2030; i++) {
            anioModel.addElement(i);
        }
        jcmb_Anio.setModel(anioModel);

        //tiempo estadia
        for (int i = 1; i <= 60; i++) {
            tiempoEstadiaModel.addElement(i);
        }
        jcmb_TiempoEstadia.setModel(tiempoEstadiaModel);
        //numero equipaje
        for (int i = 1; i <= 10; i++) {
            equipajesModel.addElement(i);
        }
        jcmb_CantEquipaje.setModel(equipajesModel);
    }

    private double tiempoDestino() {
        String destino = jcmb_Destino.getSelectedItem().toString();
        switch (destino) {
            case "Alemania":
                return 15;
            case "Argentina":
                return 9;
            case "Brasil":
                return 4;
            case "Canada":
                return 9;
            case "China":
                return 23;
            case "Colombia":
                return 2;
            case "Costa Rica":
                return 4;
            case "España":
                return 12;
            case "Estados Unidos":
                return 4;
            case "Francia":
                return 12;
            case "Honduras":
                return 5;
            case "Italia":
                return 13;
            case "Japon":
                return 23;
            case "Mexico":
                return 7;
            case "Peru":
                return 250;
            case "Rusia":
                return 14;
            case "Tailandia":
                return 16;
            case "Ucrania":
                return 17;
            case "Uruguay":
                return 5;
            default:
                return 0;
        }
    }

    private double tiempoClase() {
        String clase = jcmb_Clase.getSelectedItem().toString();
        switch (clase) {
            case "Economica":
                return 0.9;
            case "Ejecutiva":
                return 0.87;
            case "Primera Clase":
                return 0.77;
            default:
                return 1;
        }
    }

    private double tiempoAerolinea() {
        String nombre = jcmb_Aerolinea.getSelectedItem().toString();
        switch (nombre) {
            case "LATAM":
                return 1;
            case "AVIANCA":
                return 0.9;
            case "EXPEDIA":
                return 0.85;
            case "XPRESS":
                return 0.75;
            case "JET":
                return 0.9;
            case "TAME":
                return 0.75;
            default:
                return 1;
        }
    }

    private double precioDestino() {
        String destino = jcmb_Destino.getSelectedItem().toString();
        switch (destino) {
            case "Alemania":
                return 980;
            case "Argentina":
                return 450;
            case "Brasil":
                return 300;
            case "Canada":
                return 800;
            case "China":
                return 1200;
            case "Colombia":
                return 250;
            case "Costa Rica":
                return 280;
            case "España":
                return 860;
            case "Estados Unidos":
                return 600;
            case "Francia":
                return 900;
            case "Honduras":
                return 400;
            case "Italia":
                return 900;
            case "Japon":
                return 1250;
            case "Mexico":
                return 700;
            case "Peru":
                return 250;
            case "Rusia":
                return 900;
            case "Tailandia":
                return 670;
            case "Ucrania":
                return 680;
            case "Uruguay":
                return 350;
            default:
                return 0;
        }
    }

    private double precioClase() {
        String clase = jcmb_Clase.getSelectedItem().toString();
        switch (clase) {
            case "Economica":
                return 1.2;
            case "Ejecutiva":
                return 1.4;
            case "Primera Clase":
                return 1.7;
            default:
                return 1;
        }
    }

    private double precioAerolinea() {
        String nombre = jcmb_Aerolinea.getSelectedItem().toString();
        switch (nombre) {
            case "LATAM":
                return 1.1;
            case "AVIANCA":
                return 1.4;
            case "EXPEDIA":
                return 1.3;
            case "XPRESS":
                return 1.5;
            case "JET":
                return 1.2;
            case "TAME":
                return 1.6;
            default:
                return 1;
        }
    }

    private double precioEquipaje(int numero) {
        if (numero == 0) {
            return 0;
        }
        return 18.3 * numero;
    }

    private double comprobarBoletos(int numero) {
        if (numero == 0) {
            return 1;
        }
        return numero;
    }

    private void tiempoTotal() {

        tiempoDestino();
        tiempoClase();
        tiempoAerolinea();

        DecimalFormat formato = new DecimalFormat("#"); //Para sacar el resultado con dos decimas
        double destino = tiempoDestino();
        double clase = tiempoClase();
        double aero = tiempoAerolinea();

        double total = (destino * clase * aero);
        int tot = (int) Math.round(total);
        jtxt_TiempoVuelo.setText(String.valueOf(formato.format(tot)));
        jtxt_TiempoVuelo.updateUI();
    }

    private void precioTotal() {
        DecimalFormat formato = new DecimalFormat("#.00"); //Para sacar el resultado con dos decimas
        double destino = precioDestino();
        double clase = precioClase();
        jcmb_NumBoletos.getSelectedIndex();
        double boletos = comprobarBoletos(jcmb_NumBoletos.getSelectedIndex() + 1); //El +1 es para corregir un error que no entiendo por que no multiplicaba por 2 al seleccionar el 2
        double aero = precioAerolinea();
        double equipaje = precioEquipaje(jcmb_CantEquipaje.getSelectedIndex() + 1);

        double total;
        if (jchk_Equipaje.isSelected()) {
            total = (destino * clase * aero) * boletos + equipaje;
            int tot = (int) Math.round(total);
            jtxt_Total.setText(String.valueOf(tot));
            jtxt_Total.updateUI();
        } else {
            total = (destino * clase * aero) * boletos;
            int tot = (int) Math.round(total);
            jtxt_Total.setText(String.valueOf(tot));
            jtxt_Total.updateUI();
        }
    }

    private void setFechaEnLabel() { //Poner una fecha ingresada x 3 combos en una con formato y string
        int dia = jcmb_Dia.getSelectedIndex() + 1;
        int mes = jcmb_Mes.getSelectedIndex() + 1;
        int anio = jcmb_Anio.getSelectedIndex() + 2022;

        
        if (dia<10 && mes <10) {
                String fecha = anio + "-0" + mes + "-0" + dia;
                jtxt_FechaSalida.setText(fecha);
            }else if (dia < 10) {
                String fecha = anio + "-" + mes + "-0" + dia;
                jtxt_FechaSalida.setText(fecha);
            } else if (mes < 10) {
                String fecha = anio + "-0" + mes + "-" + dia;
                jtxt_FechaSalida.setText(fecha);
            } else {
                String fecha = anio + "-" + mes + "-" + dia;
                jtxt_FechaSalida.setText(fecha);
            }
        
//Sacar la fecha de salida

        /*--------------------------------------------------------------------*/
        //Sacar la fecha de vuelta
        int diaI = jcmb_Dia.getSelectedIndex() + 2;
        int mesI = jcmb_Mes.getSelectedIndex() + 1;
        int anioI = jcmb_Anio.getSelectedIndex() + 2022;

        diaI = diaI + jcmb_TiempoEstadia.getSelectedIndex();

        if (diaI > 31) {

            do {
                diaI = diaI - 31;
                mesI++;
            } while (diaI < 31);

            if (diaI<10 && mesI <10) {
                String fechaVuelta = anioI + "-0" + mesI + "-0" + diaI;
                jtxt_FechaVuelta.setText(fechaVuelta);
            }else if (diaI < 10) {
                String fechaVuelta = anioI + "-" + mesI + "-0" + diaI;
                jtxt_FechaVuelta.setText(fechaVuelta);
            } else if (mesI < 10) {
                String fechaVuelta = anioI + "-0" + mesI + "-" + diaI;
                jtxt_FechaVuelta.setText(fechaVuelta);
            } else {
                String fechaVuelta = anioI + "-" + mesI + "-" + diaI;
                jtxt_FechaVuelta.setText(fechaVuelta);
            }

        } else {

            if (diaI<10 && mesI <10) {
                String fechaVuelta = anioI + "-0" + mesI + "-0" + diaI;
                jtxt_FechaVuelta.setText(fechaVuelta);
            }else if (diaI < 10) {
                String fechaVuelta = anioI + "-" + mesI + "-0" + diaI;
                jtxt_FechaVuelta.setText(fechaVuelta);
            } else if (mesI < 10) {
                String fechaVuelta = anioI + "-0" + mesI + "-" + diaI;
                jtxt_FechaVuelta.setText(fechaVuelta);
            } else {
                String fechaVuelta = anioI + "-" + mesI + "-" + diaI;

                jtxt_FechaVuelta.setText(fechaVuelta);
            }
        }

    }
    
    public String getNombreLoggeado() { //Consigue el nombre del usuario que se logeo
        try {
            ModificarCuenta mc = new ModificarCuenta();
            String logeado = mc.getUsuarioLogeado();

            conexionUsuarios cc = new conexionUsuarios();
            Connection cn = cc.conectar();
            String sql = "";
            sql = "select NOM_USER FROM usuariosaereopuerto WHERE NIK_USER = '" + logeado + "'";
            PreparedStatement psd = cn.prepareStatement(sql);
            ResultSet rs = psd.executeQuery();
            if (rs.next()) {
                return rs.getString("NOM_USER");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return "";
    }

    private void subirInformacion() {
        try {
            ModificarCuenta mc = new ModificarCuenta();
            String logeado = mc.getUsuarioLogeado();
            conexionUsuarios cc = new conexionUsuarios();
            Connection cn = cc.conectar();
            String sql = "";
            sql = "insert into vuelos(DEST_VUEL, CLASE_VUEL, AEROL_VUEL, NUM_BOL_VUEL, FEC_SAL_VUEL, FEC_RET_VUEL, CAN_EQUI_VUEL, TIEM_VUEL, TOTAL_VUEL, ID_USER_VUEL) values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement psd = cn.prepareStatement(sql);
            psd.setString(1, jcmb_Destino.getSelectedItem().toString());
            psd.setString(2, jcmb_Clase.getSelectedItem().toString());
            psd.setString(3, jcmb_Aerolinea.getSelectedItem().toString());
            psd.setString(4, jcmb_NumBoletos.getSelectedItem().toString());
            psd.setString(5, jtxt_FechaSalida.getText());
            psd.setString(6, jtxt_FechaVuelta.getText());
            psd.setString(7, jcmb_CantEquipaje.getSelectedItem().toString());
            psd.setString(8, jtxt_TiempoVuelo.getText());
            psd.setString(9, jtxt_Total.getText());
            psd.setString(10, logeado);

            psd.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vuelo creado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
