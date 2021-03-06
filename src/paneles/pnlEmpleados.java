/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

/**
 *
 * @author AndyMontiel
 */
public class pnlEmpleados extends javax.swing.JPanel {

    /**
     * Creates new form pnlEmpleados
     */
    public pnlEmpleados() {
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

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new rsbuttom.RSButtonMetro();
        btnEliminar = new rsbuttom.RSButtonMetro();
        btnActualizar = new rsbuttom.RSButtonMetro();
        txtBuscar = new javax.swing.JTextField();
        btnAgregar = new rsbuttom.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnCancelar = new rsbuttom.RSButtonMetro();
        btnAceptar = new rsbuttom.RSButtonMetro();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        txtTelefono = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btnBuscar.setText(" BUSCAR");
        btnBuscar.setToolTipText("Buscar proveedores en la base de datos.");
        btnBuscar.setColorHover(new java.awt.Color(79, 79, 79));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 180, 60));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminar.setText("  ELIMINAR");
        btnEliminar.setToolTipText("Eliminar empleado.");
        btnEliminar.setColorHover(new java.awt.Color(79, 79, 79));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 20, 240, 58));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N
        btnActualizar.setText("  ACTUALIZAR");
        btnActualizar.setToolTipText("Actualizar información de un empleado.");
        btnActualizar.setColorHover(new java.awt.Color(79, 79, 79));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 20, 240, 58));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 270, 60));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btnAgregar.setText("  AGREGAR");
        btnAgregar.setToolTipText("Agregar nuevo empleado a la base de datos.");
        btnAgregar.setColorHover(new java.awt.Color(79, 79, 79));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 58));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 620, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Teléfono:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Nombre:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Email:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 110, 30));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 620, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Dirección:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 110, 30));

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar.");
        btnCancelar.setColorHover(new java.awt.Color(0, 0, 0));
        btnCancelar.setColorNormal(new java.awt.Color(79, 79, 79));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 160, 150, 40));

        btnAceptar.setText("Aceptar");
        btnAceptar.setToolTipText("Guardar cambios.");
        btnAceptar.setColorHover(new java.awt.Color(0, 0, 0));
        btnAceptar.setColorNormal(new java.awt.Color(79, 79, 79));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 160, 150, 40));

        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDireccion.setRows(2);
        jScrollPane2.setViewportView(txtDireccion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 620, 40));

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 620, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLEADOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1336, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnAceptar;
    private rsbuttom.RSButtonMetro btnActualizar;
    private rsbuttom.RSButtonMetro btnAgregar;
    private rsbuttom.RSButtonMetro btnBuscar;
    private rsbuttom.RSButtonMetro btnCancelar;
    private rsbuttom.RSButtonMetro btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
