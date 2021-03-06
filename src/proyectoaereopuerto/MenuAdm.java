package proyectoaereopuerto;

/**
 *
 * @author Hakris
 */
public class MenuAdm extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdm
     */
    public MenuAdm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jbtn_ControlarVuelos = new javax.swing.JButton();
        jbtn_GestionarVuelos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtn_Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sistema del Administrador");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 520, 50));

        jbtn_ControlarVuelos.setBackground(new java.awt.Color(102, 204, 255));
        jbtn_ControlarVuelos.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jbtn_ControlarVuelos.setForeground(new java.awt.Color(204, 255, 255));
        jbtn_ControlarVuelos.setText("Revisar vuelos");
        jbtn_ControlarVuelos.setBorder(null);
        jbtn_ControlarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ControlarVuelosActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_ControlarVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 340, 50));

        jbtn_GestionarVuelos.setBackground(new java.awt.Color(102, 204, 255));
        jbtn_GestionarVuelos.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jbtn_GestionarVuelos.setForeground(new java.awt.Color(204, 255, 255));
        jbtn_GestionarVuelos.setText("Gestionar vuelos creados");
        jbtn_GestionarVuelos.setBorder(null);
        jbtn_GestionarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_GestionarVuelosActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_GestionarVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 340, 50));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("??Bienvenido!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 520, -1));

        jbtn_Salir.setBackground(new java.awt.Color(102, 204, 255));
        jbtn_Salir.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jbtn_Salir.setForeground(new java.awt.Color(204, 255, 255));
        jbtn_Salir.setText("Desconectarse");
        jbtn_Salir.setBorder(null);
        jbtn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 340, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaereopuerto/imagenes/fondoAdmin.jpg"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_ControlarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ControlarVuelosActionPerformed
        RevisarVuelos ma = new RevisarVuelos();
        ma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_ControlarVuelosActionPerformed

    private void jbtn_GestionarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_GestionarVuelosActionPerformed
        GestionarVuelos gv = new GestionarVuelos();
        gv.setVisible(true);
        this.setVisible(false);
        //asdasd
    }//GEN-LAST:event_jbtn_GestionarVuelosActionPerformed

    private void jbtn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_SalirActionPerformed
        Inicio ini = new Inicio();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtn_ControlarVuelos;
    private javax.swing.JButton jbtn_GestionarVuelos;
    private javax.swing.JButton jbtn_Salir;
    // End of variables declaration//GEN-END:variables
}
