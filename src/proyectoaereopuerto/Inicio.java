package proyectoaereopuerto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hakris
 */
public class Inicio extends javax.swing.JFrame {
    int xMouse, yMouse;
    public Inicio() {
        initComponents();
        jbtn_Tapar.setVisible(false);
        unlogUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jpnl_top = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtxt_Usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtn_Aceptar = new javax.swing.JButton();
        jbtn_Registrarse = new javax.swing.JButton();
        jbtn_Ver = new javax.swing.JButton();
        jbtn_Tapar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jpsw_Pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 350, 10));

        jSeparator1.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 350, 10));

        jpnl_top.setBackground(new java.awt.Color(102, 204, 255));
        jpnl_top.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpnl_topMouseDragged(evt);
            }
        });
        jpnl_top.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnl_topMousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(102, 204, 255));
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText(" X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnl_topLayout = new javax.swing.GroupLayout(jpnl_top);
        jpnl_top.setLayout(jpnl_topLayout);
        jpnl_topLayout.setHorizontalGroup(
            jpnl_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnl_topLayout.createSequentialGroup()
                .addContainerGap(520, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnl_topLayout.setVerticalGroup(
            jpnl_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnl_topLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jpnl_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

        jtxt_Usuario.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jtxt_Usuario.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxt_Usuario.setBorder(null);
        getContentPane().add(jtxt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 440, 50));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 66, 157));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 70, 580, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 66, 157));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONTRASEÑA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 580, -1));

        jbtn_Aceptar.setBackground(new java.awt.Color(102, 204, 255));
        jbtn_Aceptar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jbtn_Aceptar.setForeground(new java.awt.Color(204, 255, 255));
        jbtn_Aceptar.setText("ENTRAR");
        jbtn_Aceptar.setBorder(null);
        jbtn_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 290, 50));

        jbtn_Registrarse.setBackground(new java.awt.Color(102, 204, 255));
        jbtn_Registrarse.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jbtn_Registrarse.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_Registrarse.setText("Aqui");
        jbtn_Registrarse.setBorder(null);
        jbtn_Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_RegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 70, 40));

        jbtn_Ver.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_Ver.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jbtn_Ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaereopuerto/imagenes/ojoAbierto.png"))); // NOI18N
        jbtn_Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_VerActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 50, 50));

        jbtn_Tapar.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_Tapar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jbtn_Tapar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaereopuerto/imagenes/ojoCerrado.png"))); // NOI18N
        jbtn_Tapar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_TaparActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_Tapar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 50, 50));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("No tienes una cuenta? Registrate ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, -1, -1));

        jpsw_Pass.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jpsw_Pass.setForeground(new java.awt.Color(102, 102, 102));
        jpsw_Pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpsw_Pass.setBorder(null);
        getContentPane().add(jpsw_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 440, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 580, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_AceptarActionPerformed
        if (ingresarCuenta() == true) {
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema de Aereopuerto");
            logUsuario();
            if (comprobarAdmin() == true) {
                this.setVisible(false);
                MenuAdm mu = new MenuAdm();
                mu.setVisible(true);
            } else {
                this.dispose();
                MenuUser ma = new MenuUser();
                ma.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }
    }//GEN-LAST:event_jbtn_AceptarActionPerformed

    private void jbtn_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_RegistrarseActionPerformed
        Registro re = new Registro();
        this.setVisible(false);
        re.setVisible(true);
    }//GEN-LAST:event_jbtn_RegistrarseActionPerformed

    private void jbtn_VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_VerActionPerformed
        jpsw_Pass.setEchoChar((char) 0);
        jbtn_Ver.setVisible(false);
        jbtn_Tapar.setVisible(true);
        jpsw_Pass.requestFocus();
    }//GEN-LAST:event_jbtn_VerActionPerformed

    private void jbtn_TaparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_TaparActionPerformed
        jpsw_Pass.setEchoChar(('*'));
        jbtn_Tapar.setVisible(false);
        jbtn_Ver.setVisible(true);
        jpsw_Pass.requestFocus();
    }//GEN-LAST:event_jbtn_TaparActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jpnl_topMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnl_topMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jpnl_topMousePressed

    private void jpnl_topMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnl_topMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jpnl_topMouseDragged

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtn_Aceptar;
    private javax.swing.JButton jbtn_Registrarse;
    private javax.swing.JButton jbtn_Tapar;
    private javax.swing.JButton jbtn_Ver;
    private javax.swing.JPanel jpnl_top;
    private javax.swing.JPasswordField jpsw_Pass;
    private javax.swing.JTextField jtxt_Usuario;
    // End of variables declaration//GEN-END:variables

    private boolean ingresarCuenta() {

        if (jtxt_Usuario.getText().isEmpty() || jtxt_Usuario.getText() == "") {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre de usuario");
            jtxt_Usuario.requestFocus(); //y le damos focus
        } else if (jpsw_Pass.getText().isEmpty() || jpsw_Pass.getText() == "") { //Comprobamos que el usuario ingreso la pass
            JOptionPane.showMessageDialog(null, "Ingrese la contraseña");
            jpsw_Pass.requestFocus(); //sino le damos focus
        } else {
            //String nuevoPass = hash.shal(jpsw_Pass.getText()); //encriptamos la password
            String nuevoPass =(jpsw_Pass.getText());
            try {
                conexionUsuarios cc = new conexionUsuarios();
                Connection cn = cc.conectar();
                String sql = "";
                sql = "select PASS_USER FROM usuariosaereopuerto WHERE NIK_USER = ?";
                PreparedStatement psd = cn.prepareStatement(sql);
                psd.setString(1, jtxt_Usuario.getText());
                ResultSet rs = psd.executeQuery();
                if (rs.next()) {
                    if (nuevoPass.equals(rs.getString("PASS_USER"))) {
                        return true;
                    }
                }
                return false;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                return false;
            }

        }
        return false;
    }

    private boolean comprobarAdmin() {
        try {
            conexionUsuarios cc = new conexionUsuarios();
            Connection cn = cc.conectar();
            String sql = "";
            sql = "select TIPO_USER FROM usuariosaereopuerto WHERE NIK_USER = ?";
            PreparedStatement psd = cn.prepareStatement(sql);
            psd.setString(1, jtxt_Usuario.getText());
            ResultSet rs = psd.executeQuery();
            if (rs.next()) {
                if (rs.getString("TIPO_USER").equals("A")) {
                    return true;
                }
            }
            return false;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }

    public void unlogUsuario() {
            try {
                conexionUsuarios cc = new conexionUsuarios();
                Connection cn = cc.conectar();
                String sql = "";
                sql = "truncate table usuariologeado";
                PreparedStatement psd = cn.prepareStatement(sql);
                psd.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
    }

    private void logUsuario() {
        try {
            conexionUsuarios cc = new conexionUsuarios();
            Connection cn = cc.conectar();
            String sql = "";
            sql = "insert into usuariologeado(NIK_USER) values(?)";
            PreparedStatement psd = cn.prepareStatement(sql);
            psd.setString(1, jtxt_Usuario.getText());
            psd.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
