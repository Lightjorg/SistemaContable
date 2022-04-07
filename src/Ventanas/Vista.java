
package Ventanas;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import sistemacontable.factura_ingresar;
import sistemacontable.leer_archivo;


public class Vista extends javax.swing.JFrame {

    
    public Vista() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JDatos = new javax.swing.JTable();
        btnImportar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha de Elaboracion", "Serie", "Factura", "Razon Social", "Concepto", "Monto", "Moneda", "Ret", "Retencion", "Neto a Recibir", "Monto Pagado", "Dif", "Tipo de Cambio", "Deposito de Pesos", "Fecha de Pago", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JDatos);
        if (JDatos.getColumnModel().getColumnCount() > 0) {
            JDatos.getColumnModel().getColumn(0).setResizable(false);
            JDatos.getColumnModel().getColumn(1).setResizable(false);
            JDatos.getColumnModel().getColumn(2).setResizable(false);
            JDatos.getColumnModel().getColumn(3).setResizable(false);
            JDatos.getColumnModel().getColumn(4).setResizable(false);
            JDatos.getColumnModel().getColumn(5).setResizable(false);
            JDatos.getColumnModel().getColumn(6).setResizable(false);
            JDatos.getColumnModel().getColumn(7).setResizable(false);
            JDatos.getColumnModel().getColumn(8).setResizable(false);
            JDatos.getColumnModel().getColumn(9).setResizable(false);
            JDatos.getColumnModel().getColumn(10).setResizable(false);
            JDatos.getColumnModel().getColumn(11).setResizable(false);
            JDatos.getColumnModel().getColumn(12).setResizable(false);
            JDatos.getColumnModel().getColumn(13).setResizable(false);
            JDatos.getColumnModel().getColumn(14).setResizable(false);
            JDatos.getColumnModel().getColumn(15).setResizable(false);
        }

        btnImportar.setText("Importar");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        jLabel1.setText("Prototipo Sistema Contabe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(btnImportar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(416, 416, 416))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(btnImportar)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        
        DefaultTableModel modelo;
        ArrayList factura_recibida=new ArrayList();

        JFileChooser fileChooser = new JFileChooser(".");
        int status = fileChooser.showOpenDialog(null); 

        if (status == JFileChooser.APPROVE_OPTION) {

        File selectedFile =fileChooser.getSelectedFile();

        leer_archivo l=new leer_archivo();
        String direccion=selectedFile.getParent()+"/"+selectedFile.getName();

        factura_recibida=l.leer_archivo_exel(direccion);
        Iterator it=factura_recibida.iterator();

        try{

            Object datos[] = new Object [16];
            modelo = (DefaultTableModel) JDatos.getModel();
            for (int i = modelo.getRowCount() - 1; i>=0; i--)
            {
                modelo.removeRow(i);
            }


        while(it.hasNext()){

            factura_ingresar lib_ing;
            lib_ing=(factura_ingresar) it.next();
            datos[0]=lib_ing.getFechaElab();
            datos[1]=lib_ing.getSer();
            datos[2]=lib_ing.getFact();
            datos[3]=lib_ing.getRazonSo();
            datos[4]=lib_ing.getConcept();
            datos[5]=lib_ing.getMont();
            datos[6]=lib_ing.getMon();
            datos[7]=lib_ing.getRe();
            datos[8]=lib_ing.getReten();
            datos[9]=lib_ing.getNeto();
            datos[10]=lib_ing.getMontoPa();
            datos[11]=lib_ing.getDi();
            datos[12]=lib_ing.getTipCam();
            datos[13]=lib_ing.getDepPe();
            datos[14]=lib_ing.getFecPag();
            datos[15]=lib_ing.getEst();
            modelo.addRow(datos);
        }

} catch(Exception e){
//manejo de error
}

} else if (status == JFileChooser.CANCEL_OPTION) {



}



        
        
    }//GEN-LAST:event_btnImportarActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JDatos;
    private javax.swing.JButton btnImportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
