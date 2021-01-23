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
public class ConsultaCiitas extends javax.swing.JFrame {
    cDatos bd = new cDatos();
    /**
     * Creates new form ConsultaCiitas
     */
    public ConsultaCiitas() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        txtDiagnostico.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLOGO = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        APELLIDO = new javax.swing.JLabel();
        OBSERVACIONES = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        btnBuscar = new javax.swing.JButton();
        JlabelFONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HISTORIAL DEL PACIENTE ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 400, 30));

        btnVolver.setBackground(new java.awt.Color(226, 226, 226));
        btnVolver.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, 20));

        jLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO_1.jpeg"))); // NOI18N
        getContentPane().add(jLOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 220, 130));

        jNombre.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jNombre.setForeground(new java.awt.Color(255, 255, 255));
        jNombre.setText("NOMBRE :");
        getContentPane().add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        APELLIDO.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        APELLIDO.setForeground(new java.awt.Color(255, 255, 255));
        APELLIDO.setText("APELLIDOS :");
        getContentPane().add(APELLIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        OBSERVACIONES.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        OBSERVACIONES.setForeground(new java.awt.Color(255, 255, 255));
        OBSERVACIONES.setText("DIAGNÓSTICO ");
        getContentPane().add(OBSERVACIONES, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        txtNombre.setBackground(new java.awt.Color(238, 208, 230));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 280, 20));

        txtApellido.setBackground(new java.awt.Color(238, 208, 230));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 280, -1));

        jScrollPane1.setBackground(new java.awt.Color(238, 208, 230));

        txtDiagnostico.setBackground(new java.awt.Color(238, 208, 230));
        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        jScrollPane1.setViewportView(txtDiagnostico);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 510, 290));

        btnBuscar.setBackground(new java.awt.Color(226, 226, 226));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        JlabelFONDO.setForeground(new java.awt.Color(255, 255, 255));
        JlabelFONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo-abstracto-poligonal-geometrico-origami-estilo-3d_107146-98.jpg"))); // NOI18N
        getContentPane().add(JlabelFONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
      Menu mn = new Menu();
      mn.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        txtDiagnostico.setText("");
        if(txtNombre.getText().trim().isEmpty() || !txtNombre.getText().matches("[a-zA-Z]+") || txtApellido.getText().trim().isEmpty() || !txtApellido.getText().matches("[a-zA-Z]+")){
            JOptionPane.showMessageDialog(null, "¡Formato no aceptado en los datos!", "¡Alerta!", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                bd.conectar();
                ResultSet res = bd.consulta("call spDesplegarDiagnosticos('"+txtNombre.getText()+"','"+txtApellido.getText()+"');");
                while(res.next()){
                    if(res.getString("Diagnostico").equals("-1")){
                        JOptionPane.showMessageDialog(null, "¡Ese usuario no está en la base de datos!", "¡Alerta!", JOptionPane.ERROR_MESSAGE);
                    }else{
                        txtDiagnostico.setText(txtDiagnostico.getText()+"\n"+res.getString("Diagnostico"));
                    }
                }
                bd.cierraConexion();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel APELLIDO;
    private javax.swing.JLabel JlabelFONDO;
    private javax.swing.JLabel OBSERVACIONES;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLOGO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
