/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoaereopuerto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hakris
 */
public class ModificarCuenta extends javax.swing.JFrame {

    /**
     * Creates new form ModificarCuenta
     */
    public ModificarCuenta() {
        initComponents();
        cargarDatos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtn_Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxt_Nombre = new javax.swing.JTextField();
        jtxt_Apellido = new javax.swing.JTextField();
        jtxt_Nacimiento = new javax.swing.JTextField();
        jtxt_Cedula = new javax.swing.JTextField();
        jtxt_Username = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxt_Telefono = new javax.swing.JTextField();
        jpsw_Pass = new javax.swing.JPasswordField();
        jbtn_Actualizar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn_Volver.setBackground(new java.awt.Color(102, 204, 255));
        jbtn_Volver.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jbtn_Volver.setForeground(new java.awt.Color(204, 255, 255));
        jbtn_Volver.setText("Volver");
        jbtn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_VolverActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 700, 110, 40));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("MODIFICAR MI CUENTA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 66, 157));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(10, 66, 157));
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 66, 157));
        jLabel4.setText("Usuario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(10, 66, 157));
        jLabel5.setText("Contraseña:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(10, 66, 157));
        jLabel6.setText("Fecha de Nacimiento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(10, 66, 157));
        jLabel7.setText("Cedula:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, -1, -1));

        jtxt_Nombre.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jtxt_Nombre.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jtxt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 220, -1));

        jtxt_Apellido.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jtxt_Apellido.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jtxt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 220, -1));

        jtxt_Nacimiento.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jtxt_Nacimiento.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_Nacimiento.setEnabled(false);
        getContentPane().add(jtxt_Nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 220, -1));

        jtxt_Cedula.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jtxt_Cedula.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_Cedula.setEnabled(false);
        getContentPane().add(jtxt_Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 230, -1));

        jtxt_Username.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jtxt_Username.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt_Username.setEnabled(false);
        getContentPane().add(jtxt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 500, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(10, 66, 157));
        jLabel8.setText("Telefono:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        jtxt_Telefono.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jtxt_Telefono.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jtxt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 220, -1));

        jpsw_Pass.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jpsw_Pass.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jpsw_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 220, -1));

        jbtn_Actualizar.setBackground(new java.awt.Color(102, 204, 255));
        jbtn_Actualizar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jbtn_Actualizar.setForeground(new java.awt.Color(204, 255, 255));
        jbtn_Actualizar.setText("Guardar");
        jbtn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 700, 120, 40));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_VolverActionPerformed
        MenuUser mu = new MenuUser();
        mu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_VolverActionPerformed

    private void jbtn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ActualizarActionPerformed
        try {
            conexionUsuarios cc = new conexionUsuarios();
            Connection cn = cc.conectar();
            String sql = "";
            String userloged = getUsuarioLogeado();
            sql = "update usuariosaereopuerto set NOM_USER='" + jtxt_Nombre.getText() + "',APE_USER='" + jtxt_Apellido.getText() + "',PASS_USER='" + jpsw_Pass.getText() + "',TEL_USER='" + jtxt_Telefono.getText()+ "' where NIK_USER='"+userloged+"'";
            PreparedStatement psd = cn.prepareStatement(sql);
            int n = psd.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jbtn_ActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtn_Actualizar;
    private javax.swing.JButton jbtn_Volver;
    private javax.swing.JPasswordField jpsw_Pass;
    private javax.swing.JTextField jtxt_Apellido;
    private javax.swing.JTextField jtxt_Cedula;
    private javax.swing.JTextField jtxt_Nacimiento;
    private javax.swing.JTextField jtxt_Nombre;
    private javax.swing.JTextField jtxt_Telefono;
    private javax.swing.JTextField jtxt_Username;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
        String[] registros = new String[7];
        try {
            conexionUsuarios cc = new conexionUsuarios();
            Connection cn = cc.conectar();
            String sql = "";
            String userloged = getUsuarioLogeado();
            sql = "select * from usuariosaereopuerto where NIK_USER='"+userloged+ "'";
            Statement psd = cn.createStatement();
            ResultSet rs = psd.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("NIK_USER");
                registros[1] = rs.getString("NOM_USER");
                registros[2] = rs.getString("APE_USER");
                registros[3] = rs.getString("PASS_USER");
                registros[4] = rs.getString("FEC_NAC_USER");
                registros[5] = rs.getString("CED_USER");
                registros[6] = rs.getString("TEL_USER");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        jtxt_Username.setText(registros[0]);
        jtxt_Nombre.setText(registros[1]);
        jtxt_Apellido.setText(registros[2]);
        jpsw_Pass.setText(registros[3]);
        jtxt_Nacimiento.setText(registros[4]);
        jtxt_Cedula.setText(registros[5]);
        jtxt_Telefono.setText(registros[6]);

    }

    public String getUsuarioLogeado() { //Metodo para conseguir el usuario que se logeo
        try {
            conexionUsuarios cc = new conexionUsuarios();
            Connection cn = cc.conectar();
            String sql = "";
            sql = "select * FROM usuariologeado";
            PreparedStatement psd = cn.prepareStatement(sql);
            ResultSet rs = psd.executeQuery();
            if (rs.next()) {
                return rs.getString("NIK_USER");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return "";
    }



}
