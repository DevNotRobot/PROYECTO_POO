package Formularios;

import Clases.Ventas;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;
import Datos.Arreglo_Venta;

public class frmVentas extends javax.swing.JFrame {
    Arreglo_Venta obj=new Arreglo_Venta();
    DefaultTableModel dtmVenta=new DefaultTableModel();
    
    Double[] vec = new Double[]{};
    
    public frmVentas() {
        initComponents();
        llenaTabla();
        muestra();
        

        txtCod.setText(String.valueOf(obj.genCodigo()));
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ZonedDateTime zdt = ZonedDateTime.now();
        String zdtString = dtf.format(zdt);
        txtFecha.setText(zdtString);
    }

    public void llenaTabla(){
        dtmVenta.addColumn("CODIGO");
        dtmVenta.addColumn("FECHA DE VENTA");
        dtmVenta.addColumn("IMPORTE");
        dtmVenta.addColumn("COMPROBANTE");
        dtmVenta.addColumn("OBSERVACIONES");
        dtmVenta.addColumn("EMPLEADO");
        dtmVenta.addColumn("CLIENTE");
        tbVentas.setModel(dtmVenta);
    }
    
   void muestra(){
    DefaultTableModel dt=(DefaultTableModel)tbVentas.getModel();
    dt.setRowCount(0);
        for(int f=0; f<obj.tamaño();f++){
            Ventas ep= obj.obtener(f);
            Object v[]={ep.getIdVenta(),ep.getFechaVenta(),ep.getImporte(),ep.getComprobanteVenta(),ep.getObservaciones(),
            ep.getIdEmpleado(),ep.getIdCliente()};
                    dt.addRow(v);
        }    
    }
   
   public double sumarDatos(){
       double suma= 0;
       for(int i = 0; i < vec.length; i++) {
           suma+= vec[i];
       }
       return suma;
   }
   
  

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtImport = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtEmple = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cbCompr = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        btnRegrsar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbVentas = new javax.swing.JTable();
        btnEmpleado = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnAddProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ventas");

        jLabel2.setText("ID");

        jLabel3.setText("FECHA DE VENTA");

        jLabel4.setText("IMPORTE");

        jLabel5.setText("COMPROBANTE");

        jLabel6.setText("OBSERVACIONES");

        jLabel7.setText("CLIENTE");

        jLabel8.setText("EMPLEADO");

        txtImport.setEnabled(false);

        txtCliente.setEnabled(false);

        txtEmple.setEnabled(false);

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cbCompr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOLETA", "FACTURA" }));

        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane1.setViewportView(txtObs);

        btnRegrsar.setText("REGRESAR");
        btnRegrsar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegrsarActionPerformed(evt);
            }
        });

        tbVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbVentas);

        btnEmpleado.setText("...");
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });

        btnCliente.setText("...");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnAddProd.setText("Agregar Producto");
        btnAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbCompr, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtImport, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnAddProd)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                                .addComponent(txtEmple))
                                            .addGap(52, 52, 52)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnCliente)
                                                .addComponent(btnEmpleado))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregar)
                                    .addComponent(btnRegrsar))
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnAddProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(txtEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCompr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmpleado))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(btnAgregar))
                                .addGap(18, 18, 18)
                                .addComponent(btnRegrsar)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCod.setText("");
        txtFecha.setText("");
        txtImport.setText("");
        cbCompr.getSelectedIndex();
        txtObs.setText("");
        txtEmple.setText("");
        txtCliente.setText("");
        btnAgregar.setEnabled(true);
        muestra();
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Ventas p= new Ventas();
        p.setIdVenta(Integer.parseInt(txtCod.getText()));
        p.setFechaVenta(txtFecha.getText());
        p.setImporte(Double.parseDouble(txtImport.getText()));
        p.setComprobanteVenta(cbCompr.getSelectedItem().toString());
        p.setObservaciones(txtObs.getText());
        p.setIdEmpleado(txtEmple.getText());
        p.setIdCliente(txtCliente.getText());
        obj.adicion(p);
        btnAgregar.setEnabled(false);
        muestra();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegrsarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegrsarActionPerformed
        frmPrincipal principal = new frmPrincipal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegrsarActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        FrmCliente cliente = new FrmCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        EmpleadoArray empleado=new EmpleadoArray();
        empleado.setVisible(true);
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdActionPerformed
        
        if(txtImport.equals("")){
            return;
        }else{
            for(int i=0;i<vec.length;i++){
                vec[i]=Double.parseDouble(txtImport.getText());
            }
       
            double importe = sumarDatos();
            txtImport.setText(String.valueOf(importe));
        }
        
            
         
        DetalleProductoArray dtpa = new DetalleProductoArray();
        dtpa.setVisible(true);
    }//GEN-LAST:event_btnAddProdActionPerformed

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
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProd;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEmpleado;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegrsar;
    private javax.swing.JComboBox<String> cbCompr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbVentas;
    public static javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCod;
    public static javax.swing.JTextField txtEmple;
    private javax.swing.JTextField txtFecha;
    public static javax.swing.JTextField txtImport;
    private javax.swing.JTextArea txtObs;
    // End of variables declaration//GEN-END:variables
}
