/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import javax.swing.JOptionPane;
import Model.cDatos;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MASB
 */
public class TRABAJADOR extends javax.swing.JFrame {

    cDatos bd = new cDatos();

    /**
     * Creates new form TRABAJADOR
     */
    public TRABAJADOR() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxTipoTrabajador = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxTipoTrabajador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Pediatra" }));
        getContentPane().add(cbxTipoTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 150, -1));

        jLabel10.setText("Tipo Trabajador");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO_1.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        btnVolver.setBackground(new java.awt.Color(226, 226, 226));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 70, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TRABAJADOR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE(S) :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APELLIDOS :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EDAD :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("USUARIO :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MAIL :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CONTRASEÑA :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TELÉFONO :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        txtMail.setBackground(new java.awt.Color(238, 208, 230));
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 270, -1));

        txtUsuario.setBackground(new java.awt.Color(238, 208, 230));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 150, -1));

        txtTelefono.setBackground(new java.awt.Color(238, 208, 230));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 150, -1));

        txtApellido.setBackground(new java.awt.Color(238, 208, 230));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 270, -1));

        txtNombre.setBackground(new java.awt.Color(238, 208, 230));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 200, -1));

        txtEdad.setBackground(new java.awt.Color(238, 208, 230));
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 40, -1));

        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, -1, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo-abstracto-poligonal-geometrico-origami-estilo-3d_107146-98.jpg"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Menu mn = new Menu();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txtNombre.getText().trim().isEmpty() || txtApellido.getText().trim().isEmpty() || txtEdad.getText().trim().isEmpty() || txtMail.getText().trim().isEmpty() || txtPassword.getText().trim().isEmpty() || txtTelefono.getText().trim().isEmpty() || txtUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Debes llenar todos los campos!", "¡Alerta!", JOptionPane.ERROR_MESSAGE);
        } else if (!txtNombre.getText().matches("[a-zA-Z]+") || !txtApellido.getText().matches("[a-zA-Z]+") || !txtUsuario.getText().matches("[a-zA-Z]+") || !txtEdad.getText().matches("[0-9]+") || txtEdad.getText().length() < 1 || txtEdad.getText().length() > 2 || !txtTelefono.getText().matches("[0-9]+") || txtTelefono.getText().length() != 10 || !txtMail.getText().matches("^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")) {
            JOptionPane.showMessageDialog(null, "¡Los campos no tienen el formato requerido!", "¡Alerta!", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean validar = false;
            try {
                bd.conectar();
                //in Nombrexd nvarchar(60), in Apellidoxd nvarchar(60), in Edadxd int, in Telefonoxd int, in Mailxd nvarchar(60), in TipoTrabajadorxd nvarchar(60), in Usuarioxd nvarchar(60), in Contrasenaxd nvarchar(60))
                ResultSet res = bd.consulta("call spAgregarTrabajador('"+txtNombre.getText()+"', '"+txtApellido.getText()+"',"+txtEdad.getText()+",'"+txtTelefono.getText()+"','"+txtMail.getText()+"','"+cbxTipoTrabajador.getItemAt(cbxTipoTrabajador.getSelectedIndex())+"','"+txtUsuario.getText()+"','"+txtPassword.getText()+"');");
                while (res.next()) {
                    validar = (res.getString("Mensaje").equals("1"));
                }
                bd.cierraConexion();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            if(validar){
                JOptionPane.showMessageDialog(null, "¡Usuario registrado con éxito!", "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "¡Ese usuario ya existe, escoge otro r w r!", "¡Alerta!", JOptionPane.ERROR_MESSAGE);
            }
            
            txtNombre.setText("");
            txtApellido.setText("");
            txtEdad.setText("");
            txtMail.setText("");
            txtPassword.setText("");
            txtTelefono.setText("");
            txtUsuario.setText("");
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxTipoTrabajador;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
