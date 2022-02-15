 
package Formularios;

import javax.swing.table.DefaultTableModel;
import Datos.Arreglo_TipoUsuario;
import Clases.TipoUsuario;

/**
 *
 * @author zrisan
 */
public class TIpoUsuarioArray extends javax.swing.JFrame {
    Arreglo_TipoUsuario obj = new Arreglo_TipoUsuario();
    DefaultTableModel dtmtipousuario=new DefaultTableModel();

     public void llenaTabla(){
        dtmtipousuario.addColumn("CODIGO");
        dtmtipousuario.addColumn("USUARIO");
        tbTipo.setModel(dtmtipousuario);
    }
   void muestra(){
    DefaultTableModel dt=(DefaultTableModel)tbTipo.getModel();
    dt.setRowCount(0);
    for(int f=0; f<obj.tamaño();f++){
        TipoUsuario ep= obj.obtener(f);
        Object v[]={ep.getIdTipoUsuario(),ep.getTipo()};
                dt.addRow(v);
    }    
   }
    
    public TIpoUsuarioArray() {
        initComponents();
        llenaTabla();
        muestra();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idTipoUs = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTipo = new javax.swing.JTable();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idTipoUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTipoUsActionPerformed(evt);
            }
        });

        tbTipo.setModel(new javax.swing.table.DefaultTableModel(
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
        tbTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTipoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTipo);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idTipoUs, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnviar)))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviar)
                    .addComponent(idTipoUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTipoUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTipoUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTipoUsActionPerformed

    private void tbTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTipoMouseClicked
        int fila = tbTipo.rowAtPoint(evt.getPoint());

        idTipoUs.setText(tbTipo.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_tbTipoMouseClicked

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        UsuarioFrm.txtTipo.setText(idTipoUs.getText());
        dispose();
    }//GEN-LAST:event_btnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(TIpoUsuarioArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIpoUsuarioArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIpoUsuarioArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIpoUsuarioArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIpoUsuarioArray().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JTextField idTipoUs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTipo;
    // End of variables declaration//GEN-END:variables

}
