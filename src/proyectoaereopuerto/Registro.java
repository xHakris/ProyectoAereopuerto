
package proyectoaereopuerto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hakris
 */
public class Registro extends javax.swing.JFrame {
    DefaultComboBoxModel DiaModel = new DefaultComboBoxModel();
    DefaultComboBoxModel MesModel = new DefaultComboBoxModel();
    DefaultComboBoxModel AnioModel = new DefaultComboBoxModel();
    
    
    public Registro() {
        initComponents();
        cargarComboFecha();
        jbtn_Tapar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxt_Nombre = new javax.swing.JTextField();
        jtxt_Apellido = new javax.swing.JTextField();
        jtxt_Username = new javax.swing.JTextField();
        jtxt_Cedula = new javax.swing.JTextField();
        jtxt_Telefono = new javax.swing.JTextField();
        jcmb_Dia = new javax.swing.JComboBox<>();
        jcmb_Mes = new javax.swing.JComboBox<>();
        jcmb_Anio = new javax.swing.JComboBox<>();
        jbtn_Aceptar = new javax.swing.JButton();
        jbtn_Cancelar = new javax.swing.JButton();
        jpsw_Pass = new javax.swing.JPasswordField();
        jbtn_Ver = new javax.swing.JButton();
        jbtn_Tapar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 290, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 290, 10));

        jSeparator1.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 290, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 290, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 290, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator6.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 290, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 290, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 290, 10));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 66, 157));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 66, 157));
        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(10, 66, 157));
        jLabel3.setText("Username:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 66, 157));
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(10, 66, 157));
        jLabel5.setText("Cedula:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(10, 66, 157));
        jLabel6.setText("Telefono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(10, 66, 157));
        jLabel7.setText("Fecha de Nacimiento:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        jtxt_Nombre.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jtxt_Nombre.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_Nombre.setBorder(null);
        getContentPane().add(jtxt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 270, -1));

        jtxt_Apellido.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jtxt_Apellido.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_Apellido.setBorder(null);
        getContentPane().add(jtxt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 270, -1));

        jtxt_Username.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jtxt_Username.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_Username.setBorder(null);
        getContentPane().add(jtxt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 270, -1));

        jtxt_Cedula.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jtxt_Cedula.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_Cedula.setBorder(null);
        getContentPane().add(jtxt_Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 270, -1));

        jtxt_Telefono.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jtxt_Telefono.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_Telefono.setBorder(null);
        getContentPane().add(jtxt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 270, -1));

        jcmb_Dia.setBackground(new java.awt.Color(204, 255, 255));
        jcmb_Dia.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_Dia.setBorder(null);
        jcmb_Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_DiaActionPerformed(evt);
            }
        });
        getContentPane().add(jcmb_Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 80, -1));

        jcmb_Mes.setBackground(new java.awt.Color(204, 255, 255));
        jcmb_Mes.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_Mes.setBorder(null);
        getContentPane().add(jcmb_Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 80, -1));

        jcmb_Anio.setBackground(new java.awt.Color(204, 255, 255));
        jcmb_Anio.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jcmb_Anio.setBorder(null);
        getContentPane().add(jcmb_Anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 110, -1));

        jbtn_Aceptar.setBackground(new java.awt.Color(102, 204, 255));
        jbtn_Aceptar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jbtn_Aceptar.setForeground(new java.awt.Color(204, 255, 255));
        jbtn_Aceptar.setText("Aceptar");
        jbtn_Aceptar.setBorder(null);
        jbtn_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 90, 40));

        jbtn_Cancelar.setBackground(new java.awt.Color(102, 204, 255));
        jbtn_Cancelar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jbtn_Cancelar.setForeground(new java.awt.Color(204, 255, 255));
        jbtn_Cancelar.setText("Cancelar");
        jbtn_Cancelar.setBorder(null);
        jbtn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 90, 40));

        jpsw_Pass.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jpsw_Pass.setForeground(new java.awt.Color(102, 102, 102));
        jpsw_Pass.setBorder(null);
        getContentPane().add(jpsw_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 270, -1));

        jbtn_Ver.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_Ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaereopuerto/imagenes/ojoAbierto.png"))); // NOI18N
        jbtn_Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_VerActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 50, 50));

        jbtn_Tapar.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_Tapar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoaereopuerto/imagenes/ojoCerrado.png"))); // NOI18N
        jbtn_Tapar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_TaparActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_Tapar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 50, 50));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_AceptarActionPerformed
        crearUsuario();
    }//GEN-LAST:event_jbtn_AceptarActionPerformed

    private void jbtn_VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_VerActionPerformed
        jpsw_Pass.setEchoChar((char)0);
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

    private void jbtn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_CancelarActionPerformed
        Inicio ini = new Inicio();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_CancelarActionPerformed

    private void jcmb_DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_DiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_DiaActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JButton jbtn_Aceptar;
    private javax.swing.JButton jbtn_Cancelar;
    private javax.swing.JButton jbtn_Tapar;
    private javax.swing.JButton jbtn_Ver;
    private javax.swing.JComboBox<String> jcmb_Anio;
    private javax.swing.JComboBox<String> jcmb_Dia;
    private javax.swing.JComboBox<String> jcmb_Mes;
    private javax.swing.JPasswordField jpsw_Pass;
    private javax.swing.JTextField jtxt_Apellido;
    private javax.swing.JTextField jtxt_Cedula;
    private javax.swing.JTextField jtxt_Nombre;
    private javax.swing.JTextField jtxt_Telefono;
    private javax.swing.JTextField jtxt_Username;
    // End of variables declaration//GEN-END:variables

    private void crearUsuario() {
        //Bloque de comprobaciones de campos
        if(comprobarCampoVacio(jtxt_Nombre.getText())==false){
            JOptionPane.showMessageDialog(null, "Debe ingresar su nombre");
            jtxt_Nombre.requestFocus();
        }else if(comprobarCampoVacio(jtxt_Apellido.getText())==false){
            JOptionPane.showMessageDialog(null, "Debe ingresar su apellido");
            jtxt_Apellido.requestFocus();
        }else if(comprobarCampoVacio(jtxt_Username.getText())==false){
            JOptionPane.showMessageDialog(null, "Debe ingresar un Usuario único");
            jtxt_Username.requestFocus();
        }else if(comprobarCampoVacio(jpsw_Pass.getText())==false){
            JOptionPane.showMessageDialog(null, "Debe ingresar una contraseña");
            jpsw_Pass.requestFocus();
        }else if(comprobarCampoVacio(jtxt_Cedula.getText())==false){
            JOptionPane.showMessageDialog(null, "Debe ingresar una cédula válida");
            jtxt_Cedula.requestFocus();
        }else if(comprobarCampoVacio(jtxt_Telefono.getText())==false){
            JOptionPane.showMessageDialog(null, "Debe ingresar un teléfono válido");
            jtxt_Telefono.requestFocus();
        }
        //Bloque para subir los campos
        else{
            String fechaNacimiento = conseguirFecha();
            //String passEncriptada = hash.shal(jpsw_Pass.getText());
            String pass = (jpsw_Pass.getText());
            try {
                conexionUsuarios cc = new conexionUsuarios();
                Connection cn = cc.conectar();
                String sql = "";
                sql = "insert into usuariosaereopuerto(NIK_USER,PASS_USER,NOM_USER,APE_USER,FEC_NAC_USER,CED_USER,TEL_USER,TIPO_USER)values(?,?,?,?,?,?,?,?)";
                PreparedStatement psd = cn.prepareStatement(sql);
                psd.setString(1, jtxt_Username.getText());
                psd.setString(2, pass);
                psd.setString(3, jtxt_Nombre.getText());
                psd.setString(4, jtxt_Apellido.getText());
                psd.setString(5, fechaNacimiento);
                psd.setString(6, jtxt_Cedula.getText());
                psd.setString(7, jtxt_Telefono.getText());
                psd.setString(8, "U"); //Asignamos el tipo de usuario basico con U
                
                psd.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Cuenta creada con éxito.");
                    limpiarDatosyCerrar();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
        }
    }
    
    private boolean comprobarCampoVacio(String campo){
        return !(campo.isEmpty() || campo =="");
    }
    
    private void limpiarDatosyCerrar() {
        jtxt_Username.setText("");
        jtxt_Apellido.setText("");
        jtxt_Cedula.setText("");
        jtxt_Nombre.setText("");
        jtxt_Telefono.setText("");
        jpsw_Pass.setText("");

        this.dispose();
        Inicio ini = new Inicio();
        ini.setVisible(true);
    }
    
    private void cargarComboFecha(){
        for (int i = 1; i <= 31; i++) {
            DiaModel.addElement(i);
        }
        jcmb_Dia.setModel(DiaModel);
        
        for (int i = 1; i <= 12; i++) {
            MesModel.addElement(i);
        }
        jcmb_Mes.setModel(MesModel);
        
        for (int i = 2022; i >= 1950; i--) {
            AnioModel.addElement(i);
        }
        jcmb_Anio.setModel(AnioModel);
    }

    public String conseguirFecha(){ //Convierte la fecha de 3 elecciones y la devuelve unida
        String dia = jcmb_Dia.getSelectedItem().toString();
        String mes = jcmb_Mes.getSelectedItem().toString();
        String anio = jcmb_Anio.getSelectedItem().toString();
        
        return anio+"-"+mes+"-"+dia;
    }
}
