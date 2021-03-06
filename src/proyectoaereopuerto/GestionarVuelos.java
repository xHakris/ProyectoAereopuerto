package proyectoaereopuerto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hakris
 */
public class GestionarVuelos extends javax.swing.JFrame {

    DefaultComboBoxModel destinosModel = new DefaultComboBoxModel();
    DefaultComboBoxModel pilotosModel = new DefaultComboBoxModel();
    DefaultComboBoxModel modelosModel = new DefaultComboBoxModel();
    DefaultComboBoxModel estadosModel = new DefaultComboBoxModel();
    int vuelo; int asientosOcupados= 0; String destinos;
    /**
     * Creates new form GestionVuelos
     */
    public GestionarVuelos() {
        initComponents();
        cargarModelos();
        jairbus319.setVisible(false);
        jboeing737.setVisible(false);
        jboeing747.setVisible(false);
        jaribus300600.setVisible(false);
        jantonv.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jbtn_Volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcmb_Pilotos = new javax.swing.JComboBox<>();
        jcmb_Modelos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jcmb_Destinos = new javax.swing.JComboBox<>();
        jcmb_Estado = new javax.swing.JComboBox<>();
        jbtn_Confirmar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jtxt_AsientosDisponibles = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jairbus319 = new javax.swing.JLabel();
        jaribus300600 = new javax.swing.JLabel();
        jboeing737 = new javax.swing.JLabel();
        jboeing747 = new javax.swing.JLabel();
        jantonv = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxt_AsientosTotales = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxt_NumPasajeros = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn_Volver.setBackground(new java.awt.Color(102, 204, 255));
        jbtn_Volver.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jbtn_Volver.setForeground(new java.awt.Color(204, 255, 255));
        jbtn_Volver.setText("Volver");
        jbtn_Volver.setBorder(null);
        jbtn_Volver.setOpaque(false);
        jbtn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_VolverActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 110, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 66, 157));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Destinos encontrados");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 60, 510, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 66, 157));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Asignar piloto a cargo del avi??n");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 160, 510, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(10, 66, 157));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Modelo del avi??n");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 260, 510, -1));

        jcmb_Pilotos.setBackground(new java.awt.Color(102, 204, 255));
        jcmb_Pilotos.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_Pilotos.setForeground(new java.awt.Color(102, 102, 102));
        jcmb_Pilotos.setBorder(null);
        jcmb_Pilotos.setOpaque(false);
        jPanel2.add(jcmb_Pilotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 350, -1));

        jcmb_Modelos.setBackground(new java.awt.Color(102, 204, 255));
        jcmb_Modelos.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_Modelos.setForeground(new java.awt.Color(102, 102, 102));
        jcmb_Modelos.setBorder(null);
        jcmb_Modelos.setOpaque(false);
        jcmb_Modelos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmb_ModelosItemStateChanged(evt);
            }
        });
        jPanel2.add(jcmb_Modelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 350, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(10, 66, 157));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Estado del avi??n");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 510, -1));

        jcmb_Destinos.setBackground(new java.awt.Color(102, 204, 255));
        jcmb_Destinos.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_Destinos.setForeground(new java.awt.Color(102, 102, 102));
        jcmb_Destinos.setBorder(null);
        jcmb_Destinos.setOpaque(false);
        jcmb_Destinos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmb_DestinosItemStateChanged(evt);
            }
        });
        jPanel2.add(jcmb_Destinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 350, -1));

        jcmb_Estado.setBackground(new java.awt.Color(102, 204, 255));
        jcmb_Estado.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_Estado.setForeground(new java.awt.Color(102, 102, 102));
        jcmb_Estado.setBorder(null);
        jcmb_Estado.setOpaque(false);
        jPanel2.add(jcmb_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 350, -1));

        jbtn_Confirmar.setBackground(new java.awt.Color(102, 204, 255));
        jbtn_Confirmar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jbtn_Confirmar.setForeground(new java.awt.Color(204, 255, 255));
        jbtn_Confirmar.setText("Confirmar");
        jbtn_Confirmar.setBorder(null);
        jbtn_Confirmar.setOpaque(false);
        jbtn_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ConfirmarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 110, 40));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxt_AsientosDisponibles.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jtxt_AsientosDisponibles.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_AsientosDisponibles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt_AsientosDisponibles.setBorder(null);
        jtxt_AsientosDisponibles.setEnabled(false);
        jPanel1.add(jtxt_AsientosDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 380, 40));

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(10, 66, 157));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Asientos disponibles");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 380, -1));

        jairbus319.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaereopuerto/imagenes/Airbus319.jpg"))); // NOI18N
        jPanel1.add(jairbus319, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 380, 300));

        jaribus300600.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaereopuerto/imagenes/Aurbus300-600.jpg"))); // NOI18N
        jPanel1.add(jaribus300600, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 380, 300));

        jboeing737.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaereopuerto/imagenes/Boeing737.jpg"))); // NOI18N
        jPanel1.add(jboeing737, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 380, 300));

        jboeing747.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaereopuerto/imagenes/Boeing747.jpg"))); // NOI18N
        jPanel1.add(jboeing747, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 380, 300));

        jantonv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaereopuerto/imagenes/antov.jpg"))); // NOI18N
        jPanel1.add(jantonv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 380, 300));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(10, 66, 157));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Capacidad del avi??n");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 380, -1));

        jtxt_AsientosTotales.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jtxt_AsientosTotales.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_AsientosTotales.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt_AsientosTotales.setBorder(null);
        jtxt_AsientosTotales.setEnabled(false);
        jPanel1.add(jtxt_AsientosTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 380, 40));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(10, 66, 157));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Numero de pasajeros");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 370, 20));

        jtxt_NumPasajeros.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jtxt_NumPasajeros.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_NumPasajeros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt_NumPasajeros.setBorder(null);
        jtxt_NumPasajeros.setEnabled(false);
        jPanel1.add(jtxt_NumPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 380, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, 640));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_VolverActionPerformed
        MenuAdm ma = new MenuAdm();
        ma.setVisible(true);
        this.dispose();
        //aaaadsda
    }//GEN-LAST:event_jbtn_VolverActionPerformed

    private void jcmb_ModelosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmb_ModelosItemStateChanged
        jtxt_AsientosTotales.setText(String.valueOf(asientosDeModelos()));
        jtxt_AsientosDisponibles.setText(String.valueOf(ponerAsientosDisponibles()));
    }//GEN-LAST:event_jcmb_ModelosItemStateChanged

    private void jcmb_DestinosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmb_DestinosItemStateChanged
        int a = getAsientosOcupados();
        jtxt_NumPasajeros.setText(String.valueOf(a));
        asientosOcupados = 0;
    }//GEN-LAST:event_jcmb_DestinosItemStateChanged

    private void jbtn_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ConfirmarActionPerformed
        subirDatos();
    }//GEN-LAST:event_jbtn_ConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarVuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jairbus319;
    private javax.swing.JLabel jantonv;
    private javax.swing.JLabel jaribus300600;
    private javax.swing.JLabel jboeing737;
    private javax.swing.JLabel jboeing747;
    private javax.swing.JButton jbtn_Confirmar;
    private javax.swing.JButton jbtn_Volver;
    private javax.swing.JComboBox<String> jcmb_Destinos;
    private javax.swing.JComboBox<String> jcmb_Estado;
    private javax.swing.JComboBox<String> jcmb_Modelos;
    private javax.swing.JComboBox<String> jcmb_Pilotos;
    private javax.swing.JTextField jtxt_AsientosDisponibles;
    private javax.swing.JTextField jtxt_AsientosTotales;
    private javax.swing.JTextField jtxt_NumPasajeros;
    // End of variables declaration//GEN-END:variables

    private void cargarModelos() {
        //Destinos
        conseguirDestinos();
        //Pilotos
        conseguirPilotos();
        //Modelo de Aviones
        String[] modelos = {"seleccione", "Airbus 319", "Boeing 737", "Boeing 747", "Airbus 300-600 ST", "Antonov 225 Mriya"};
        for (String i : modelos) {
            modelosModel.addElement(i);
        }
        jcmb_Modelos.setModel(modelosModel);
        //Estado del avion
        String[] estado = {"seleccione", "En espera", "Embarcando", "Despeg??"};
        for (String i : estado) {
            estadosModel.addElement(i);
        }
        jcmb_Estado.setModel(estadosModel);
        
    }

    private void conseguirPilotos() {
        try {
            conexionUsuarios cc = new conexionUsuarios();
            Connection cn = cc.conectar();
            String sql = "";
            sql = "select * FROM usuariosaereopuerto WHERE TIPO_USER = 'P' ORDER BY NOM_USER";
            PreparedStatement psd = cn.prepareStatement(sql);
            ResultSet rs = psd.executeQuery();
            pilotosModel.addElement("seleccionar");
            while (rs.next()){
                String nombre = rs.getString("NOM_USER");
                String apellido = rs.getString("APE_USER");
                String piloto = (nombre+" "+apellido);
                pilotosModel.addElement(piloto);
            }
            jcmb_Pilotos.setModel(pilotosModel);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void conseguirDestinos() {
        try {
            conexionUsuarios cc = new conexionUsuarios();
            Connection cn = cc.conectar();
            String sql = "";
            sql = "select * FROM vuelos ORDER BY ID_VUEL";
            PreparedStatement psd = cn.prepareStatement(sql);
            ResultSet rs = psd.executeQuery();
            destinosModel.addElement("seleccionar");
            while (rs.next()){
                destinos = rs.getString("DEST_VUEL");
                vuelo = rs.getInt("ID_VUEL");
                String piloto = ("Vuelo #"+vuelo+" con destino a "+destinos);
                destinosModel.addElement(piloto);
            }
            
            jcmb_Destinos.setModel(destinosModel);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private int getAsientosOcupados() {
        try {
            conexionUsuarios cc = new conexionUsuarios();
            Connection cn = cc.conectar();
            String sql = "";
            sql = "select * FROM vuelos WHERE DEST_VUEL= '"+destinos+"' ORDER BY ID_VUEL";
            PreparedStatement psd = cn.prepareStatement(sql);
            ResultSet rs = psd.executeQuery();
            
            while (rs.next()){
                int numBoletos = rs.getInt("NUM_BOL_VUEL");
                asientosOcupados = asientosOcupados+numBoletos;
            }
            
            return asientosOcupados;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return 0;
    }
    
    private int asientosDeModelos() {
        String clase = jcmb_Modelos.getSelectedItem().toString();
        switch (clase) {
            case "Airbus 319":
                jairbus319.setVisible(true);
                jboeing737.setVisible(false);
                jboeing747.setVisible(false);
                jaribus300600.setVisible(false);
                jantonv.setVisible(false);
                return 142;
            case "Boeing 737":
                jairbus319.setVisible(false);
                jboeing737.setVisible(true);
                jboeing747.setVisible(false);
                jaribus300600.setVisible(false);
                jantonv.setVisible(false);
                return 162;
            case "Boeing 747":
                jairbus319.setVisible(false);
                jboeing737.setVisible(false);
                jboeing747.setVisible(true);
                jaribus300600.setVisible(false);
                jantonv.setVisible(false);
                return 460;
            case "Airbus 300-600 ST":
                jairbus319.setVisible(false);
                jboeing737.setVisible(false);
                jboeing747.setVisible(false);
                jaribus300600.setVisible(true);
                jantonv.setVisible(false);
                return 280;
            case "Antonov 225 Mriya":
                jairbus319.setVisible(false);
                jboeing737.setVisible(false);
                jboeing747.setVisible(false);
                jaribus300600.setVisible(false);
                jantonv.setVisible(true);
                return 50;
            default:
                return 0;
        }
    }


    private int ponerAsientosDisponibles() {
        int t = Integer.valueOf(jtxt_AsientosTotales.getText());
        int c = Integer.valueOf(jtxt_NumPasajeros.getText());
        if (t<=0 || c<=0) {
            return 0;
        }
        return t-c;
    }

    private void subirDatos() {
        try {
            conexionUsuarios cc = new conexionUsuarios();
            Connection cn = cc.conectar();
            String sql = "";
            sql = "insert into aviones(NUM_ASIEN_AVI, ID_PILOT_AVI, NUM_PASAJ_AVI, MOD_AVI, EST_AVI) values(?,?,?,?,?)";
            PreparedStatement psd = cn.prepareStatement(sql);
            psd.setString(1, jtxt_AsientosTotales.getText());
            psd.setString(2, jcmb_Pilotos.getSelectedItem().toString());
            psd.setString(3, jtxt_NumPasajeros.getText());
            psd.setString(4, jcmb_Modelos.getSelectedItem().toString());
            psd.setString(5, jcmb_Estado.getSelectedItem().toString());

            psd.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vuelo creado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
