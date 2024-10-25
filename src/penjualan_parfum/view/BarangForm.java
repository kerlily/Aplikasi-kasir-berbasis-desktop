package penjualan_parfum.view;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import penjualan_parfum.DBConnection;
import penjualan_parfum.entity.Barang;
import penjualan_parfum.model.BarangModel;

public class BarangForm extends javax.swing.JDialog {
    private Connection connection;
    private Barang barang;
    private BarangModel barangModel;
    private BarangData barangData;
    public BarangForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        connection = DBConnection.newgetInstant();
        barang = new Barang();
        barangModel = new BarangModel(connection);
        barangData = new BarangData(parent, true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textKode = new javax.swing.JTextField();
        textNama = new javax.swing.JTextField();
        textSatuan = new javax.swing.JTextField();
        textHargaSatuan = new javax.swing.JFormattedTextField();
        buttonBaru = new javax.swing.JButton();
        buttonTambah = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonData = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FORMULIR PARFUM");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Kode parfum");

        jLabel2.setText("Merk Parfum");

        jLabel3.setText("varian");

        jLabel4.setText("Harga");

        textHargaSatuan.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        textHargaSatuan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textHargaSatuan.setValue(0);

        buttonBaru.setText("BARU");
        buttonBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBaruActionPerformed(evt);
            }
        });

        buttonTambah.setText("TAMBAH");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonUbah.setText("UBAH");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        buttonHapus.setText("HAPUS");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonData.setText("DATA");
        buttonData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDataActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("INPUT PARFUM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonBaru)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonTambah)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonUbah)
                            .addGap(10, 10, 10)
                            .addComponent(buttonHapus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonData))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(70, 70, 70)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textKode)
                                .addComponent(textNama)
                                .addComponent(textSatuan)
                                .addComponent(textHargaSatuan)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBaru)
                    .addComponent(buttonTambah)
                    .addComponent(buttonUbah)
                    .addComponent(buttonHapus)
                    .addComponent(buttonData))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
        barang.setKode(textKode.getText());
        barang.setNama(textNama.getText());
        barang.setSatuan(textSatuan.getText());
        barang.setHarga_satuan(Integer.valueOf(String .valueOf(textHargaSatuan.getValue())));
        
        try{
            connection.setAutoCommit(false);
            barangModel.update(barang);
            connection.commit();
            JOptionPane.showMessageDialog(this, "DATA BERHASIL DIUPDATE", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(this, "DATA GAGAL DIUPDATE", "KESALAHAN", JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_buttonUbahActionPerformed

    private void buttonBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBaruActionPerformed
        textKode.setText(null);
        textNama.setText(null);
        textSatuan.setText(null);
        textHargaSatuan.setValue(0);
        textKode.requestFocus();
    }//GEN-LAST:event_buttonBaruActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        barang.setKode(textKode.getText());
        barang.setNama(textNama.getText());
        barang.setSatuan(textSatuan.getText());
        barang.setHarga_satuan(Integer.valueOf(String .valueOf(textHargaSatuan.getValue())));
        
        try{
            connection.setAutoCommit(false);
            barangModel.insert(barang);
            connection.commit();
            JOptionPane.showMessageDialog(this, "DATA BERHASIL DITAMBAH", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(this, "DATA GAGAL DITAMBAH", "KESALAHAN", JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        barang.setKode(textKode.getText());
        barang.setNama(textNama.getText());
        barang.setSatuan(textSatuan.getText());
        barang.setHarga_satuan(Integer.valueOf(String .valueOf(textHargaSatuan.getValue())));
        
        try{
            connection.setAutoCommit(false);
            barangModel.delete(barang);
            connection.commit();
            JOptionPane.showMessageDialog(this, "DATA BERHASIL DIHAPUS", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(this, "DATA GAGAL DIHAPUS", "KESALAHAN", JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDataActionPerformed
        barangData.show();
        barang = barangData.getSelectionRow();
        if(barang != null){
            textKode.setText(barang.getKode());
            textNama.setText(barang.getNama());
            textSatuan.setText(barang.getSatuan());
            textHargaSatuan.setValue(barang.getHarga_satuan());
        }
    }//GEN-LAST:event_buttonDataActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(BarangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BarangForm dialog = new BarangForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBaru;
    private javax.swing.JButton buttonData;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JFormattedTextField textHargaSatuan;
    private javax.swing.JTextField textKode;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textSatuan;
    // End of variables declaration//GEN-END:variables
}
