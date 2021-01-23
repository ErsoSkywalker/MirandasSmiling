package VIEW;

import Utilities.CitasRepoMethods;
import Model.cDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author MASB
 */
public class CITAS extends javax.swing.JFrame {
    cDatos bd = new cDatos();
    public CITAS() {
        initComponents();
        this.setLocationRelativeTo(null);

        cbxDia.removeAllItems();
        cbxMes.removeAllItems();
        cbxAno.removeAllItems();
        cbxDentista.removeAllItems();
        for (int i = 2000; i < 2099; i++, cbxAno.addItem(Integer.toString(i)));
        for (int i = 0; i < 12; i++, cbxMes.addItem(Integer.toString(i).length() == 1 ? "0" + Integer.toString(i) : Integer.toString(i)));
        for (int i = 0; i < 31; i++, cbxDia.addItem(Integer.toString(i).length() == 1 ? "0" + Integer.toString(i) : Integer.toString(i)));

        try{
            bd.conectar();
            ResultSet res = bd.consulta("call spDespliegaDentista();");
            while(res.next()){
                cbxDentista.addItem(res.getString("Nombre"));
            }
            bd.cierraConexion();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbxTipoDePago = new javax.swing.JComboBox<>();
        cbxDentista = new javax.swing.JComboBox<>();
        cbxAno = new javax.swing.JComboBox<>();
        cbxMes = new javax.swing.JComboBox<>();
        cbxDia = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        LOGO = new javax.swing.JLabel();
        AGENDARCITA = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        EDAD = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        TServicio = new javax.swing.JLabel();
        MPago = new javax.swing.JLabel();
        Hconsulta = new javax.swing.JLabel();
        Dentasignado = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDiagnostico = new javax.swing.JTextArea();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 320, 40));

        jLabel1.setText("ASDASDASDASD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        cbxTipoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta de Credito" }));
        getContentPane().add(cbxTipoDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 320, 40));

        cbxDentista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbxDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 320, 40));

        cbxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAnoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 90, 30));

        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxMesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbxMesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbxMesMouseReleased(evt);
            }
        });
        cbxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMesActionPerformed(evt);
            }
        });
        getContentPane().add(cbxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 110, 30));

        cbxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbxDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 100, 30));

        btnVolver.setBackground(new java.awt.Color(226, 226, 226));
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, 20));

        LOGO.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGO_1.jpeg"))); // NOI18N
        getContentPane().add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 220, 120));

        AGENDARCITA.setBackground(new java.awt.Color(255, 255, 255));
        AGENDARCITA.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        AGENDARCITA.setForeground(java.awt.SystemColor.text);
        AGENDARCITA.setText("AGENDAR CITA");
        AGENDARCITA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(AGENDARCITA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 40));

        NOMBRE.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        NOMBRE.setForeground(new java.awt.Color(255, 255, 255));
        NOMBRE.setText("Nombre del paciente :");
        getContentPane().add(NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 20));

        txtNombre.setBackground(new java.awt.Color(238, 208, 230));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 220, 30));

        EDAD.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        EDAD.setForeground(new java.awt.Color(255, 255, 255));
        EDAD.setText("Edad : ");
        getContentPane().add(EDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 60, 30));

        txtEdad.setBackground(new java.awt.Color(238, 208, 230));
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 40, 30));

        TServicio.setBackground(new java.awt.Color(255, 255, 255));
        TServicio.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        TServicio.setForeground(new java.awt.Color(255, 255, 255));
        TServicio.setText("DIAGNÓSTICO :");
        getContentPane().add(TServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, 30));

        MPago.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        MPago.setForeground(new java.awt.Color(255, 255, 255));
        MPago.setText("Método de pago :");
        getContentPane().add(MPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        Hconsulta.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        Hconsulta.setForeground(new java.awt.Color(255, 255, 255));
        Hconsulta.setText("Fecha de cita :");
        getContentPane().add(Hconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        Dentasignado.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        Dentasignado.setForeground(new java.awt.Color(255, 255, 255));
        Dentasignado.setText("Dentista asignado :");
        getContentPane().add(Dentasignado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, -1, -1));

        jApellido.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jApellido.setForeground(new java.awt.Color(255, 255, 255));
        jApellido.setText("Apellidos :");
        getContentPane().add(jApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        txtApellido.setBackground(new java.awt.Color(238, 208, 230));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 330, 30));

        txtAreaDiagnostico.setBackground(new java.awt.Color(238, 208, 230));
        txtAreaDiagnostico.setColumns(20);
        txtAreaDiagnostico.setRows(5);
        jScrollPane1.setViewportView(txtAreaDiagnostico);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 320, 90));

        FONDO.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo-abstracto-poligonal-geometrico-origami-estilo-3d_107146-98.jpg"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 620, 650));

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

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void cbxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMesActionPerformed
        
        if (cbxMes.getItemAt(cbxMes.getSelectedIndex()) != null) {
            switch (cbxMes.getItemAt(cbxMes.getSelectedIndex())) {
                case "02": {
                    cbxDia.removeAllItems();
                    for (int i = 0; i < (CitasRepoMethods.validarAnoBisiesto(cbxAno.getItemAt(cbxAno.getSelectedIndex())) ? 29 : 28); i++, cbxDia.addItem(Integer.toString(i).length() == 1 ? "0" + Integer.toString(i) : Integer.toString(i)));
                    break;
                }
                //Tienen 31 días: Enero, marzo, mayo, julio, agosto, octubre y diciembre.
                case "01":
                case "03":
                case "05":
                case "07":
                case "08":
                case "10":
                case "12": {
                    cbxDia.removeAllItems();
                    for (int i = 0; i < 31; i++, cbxDia.addItem(Integer.toString(i).length() == 1 ? "0" + Integer.toString(i) : Integer.toString(i)));
                    break;
                }
                case "04":
                case "06":
                case "09":
                case "11": {
                    cbxDia.removeAllItems();
                    for (int i = 0; i < 30; i++, cbxDia.addItem(Integer.toString(i).length() == 1 ? "0" + Integer.toString(i) : Integer.toString(i)));
                    break;
                }

            }
        }


    }//GEN-LAST:event_cbxMesActionPerformed

    private void cbxMesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxMesMouseClicked

    }//GEN-LAST:event_cbxMesMouseClicked

    private void cbxMesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxMesMouseReleased

    }//GEN-LAST:event_cbxMesMouseReleased

    private void cbxMesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxMesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMesMousePressed

    private void cbxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAnoActionPerformed
        cbxDia.removeAllItems();
        if (cbxMes.getItemAt(cbxMes.getSelectedIndex()) != null && cbxAno.getItemAt(cbxAno.getSelectedIndex()) != null) {
            if(cbxMes.getItemAt(cbxMes.getSelectedIndex()).equalsIgnoreCase("02")){
                for (int i = 0; i < (CitasRepoMethods.validarAnoBisiesto(cbxAno.getItemAt(cbxAno.getSelectedIndex())) ? 29 : 28); i++, cbxDia.addItem(Integer.toString(i).length() == 1 ? "0" + Integer.toString(i) : Integer.toString(i)));
            }
        }
    }//GEN-LAST:event_cbxAnoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if(txtNombre.getText().trim().isEmpty() || !txtNombre.getText().matches("[a-zA-Z]+") || txtApellido.getText().trim().isEmpty() || !txtApellido.getText().matches("[a-zA-Z]+") || txtEdad.getText().trim().isEmpty() || !txtEdad.getText().matches("[0-9]+") || txtTelefono.getText().trim().isEmpty() || !txtTelefono.getText().matches("[0-9]+") || txtTelefono.getText().length() != 10){
            JOptionPane.showMessageDialog(null, "¡Los campos no tienen el formato requerido!", "¡Alerta!", JOptionPane.ERROR_MESSAGE);
        }else{
            int DentistaSeleccionado = cbxDentista.getSelectedIndex()+1;
            boolean validar = false;
            try{
                bd.conectar();
                ResultSet res = bd.consulta("call spAgregarCita('"+txtNombre.getText()+"', '"+txtApellido.getText()+"',"+txtEdad.getText()+",'"+cbxAno.getSelectedItem()+"-"+cbxMes.getSelectedItem()+"-"+cbxDia.getSelectedItem()+"', "+DentistaSeleccionado+", '"+txtTelefono.getText()+"', '"+txtAreaDiagnostico.getText()+"','"+cbxTipoDePago.getSelectedItem()+"');");
                while(res.next()){
                    validar = res.getString("Mensaje").equals("1");
                }
                bd.cierraConexion();
            }catch(SQLException e){
                e.printStackTrace();
            }
            
            if(validar){
                JOptionPane.showMessageDialog(null, "¡Se ha agregado la cita con éxito!", "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "¡Ha ocurrido un error!", "¡Alerta!", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        txtNombre.setText("");
        txtApellido.setText("");
        txtAreaDiagnostico.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AGENDARCITA;
    private javax.swing.JLabel Dentasignado;
    private javax.swing.JLabel EDAD;
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel Hconsulta;
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel MPago;
    private javax.swing.JLabel NOMBRE;
    private javax.swing.JLabel TServicio;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxAno;
    private javax.swing.JComboBox<String> cbxDentista;
    private javax.swing.JComboBox<String> cbxDia;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JComboBox<String> cbxTipoDePago;
    private javax.swing.JLabel jApellido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextArea txtAreaDiagnostico;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
