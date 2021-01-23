/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

/**
 *
 * @author MASB
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        Salida = new javax.swing.JButton();
        CrearCita = new javax.swing.JButton();
        ConsultaCita = new javax.swing.JButton();
        btnTrabajador = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salida.setText("SALIDA");
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });
        getContentPane().add(Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 70, 20));

        CrearCita.setText("Crear cita ");
        CrearCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCitaActionPerformed(evt);
            }
        });
        getContentPane().add(CrearCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        ConsultaCita.setText("Consulta Cita ");
        ConsultaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaCitaActionPerformed(evt);
            }
        });
        getContentPane().add(ConsultaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        btnTrabajador.setText("Trabajador ");
        btnTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MENÚ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecciona la acción a realizar ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO_1.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo-abstracto-poligonal-geometrico-origami-estilo-3d_107146-98.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
       System.exit(0);  // TODO add your handling code here:
    }//GEN-LAST:event_SalidaActionPerformed

    private void ConsultaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaCitaActionPerformed
        ConsultaCiitas cn = new ConsultaCiitas();
        cn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ConsultaCitaActionPerformed

    private void CrearCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCitaActionPerformed
        CITAS ct = new CITAS();
        ct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CrearCitaActionPerformed

    private void btnTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajadorActionPerformed
        TRABAJADOR tr = new TRABAJADOR();
        tr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTrabajadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultaCita;
    private javax.swing.JButton CrearCita;
    private javax.swing.JButton Salida;
    private javax.swing.JButton btnTrabajador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}