/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlimSatimUygulamasi;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gunay
 */
public class AlimSatim extends javax.swing.JFrame {

    /**
     * Creates new form gorsel_181220038_2
     */
    int satir;
    
    public AlimSatim() {
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
        jLabel1 = new javax.swing.JLabel();
        jComboUrunKategori = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jFiyatAlTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboFiyatBirimi = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jAdetAlTxt = new javax.swing.JTextField();
        jKaydetButon = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jIstenilenSatisAdedi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboKDV = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jFiyatGoster = new javax.swing.JLabel();
        jKategoriGoster = new javax.swing.JLabel();
        jStokAdetGoster = new javax.swing.JLabel();
        jKDVsizGoster = new javax.swing.JLabel();
        jKDVliGoster = new javax.swing.JLabel();
        jBirimGoster = new javax.swing.JLabel();
        jSatisYapButon = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Ürün Kategori");

        jComboUrunKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bilgisayar", "Cep Telefonu", "TV" }));

        jLabel2.setText("Ürün Fiyat");

        jFiyatAlTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFiyatAlTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Fiyat Birimi");

        jComboFiyatBirimi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TL", "Euro", "Dolar" }));

        jLabel4.setText("Adet Sayısı");

        jKaydetButon.setText("KAYDET");
        jKaydetButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKaydetButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboFiyatBirimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboUrunKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFiyatAlTxt)
                            .addComponent(jAdetAlTxt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jKaydetButon)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboUrunKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFiyatAlTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboFiyatBirimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jAdetAlTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jKaydetButon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Kayıt");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setText("Seçilen Ürün Kategori");

        jLabel8.setText("Seçilen Ürün Fiyatı");

        jLabel9.setText("Seçilen Ürün Stok Adedi");

        jLabel10.setText("İstenilen Satış Adedi");

        jLabel11.setText("Uygulanacak KDV Oranı");

        jComboKDV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "8", "18" }));
        jComboKDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboKDVActionPerformed(evt);
            }
        });

        jLabel12.setText("Toplam Satış Fiyatı (KDV'siz)");

        jLabel13.setText("Toplam Satış Fiyatı (KDV'li)");

        jFiyatGoster.setText("....................................");

        jKategoriGoster.setText("....................................");

        jStokAdetGoster.setText("....................................");

        jKDVsizGoster.setText("....................................");

        jKDVliGoster.setText("....................................");

        jBirimGoster.setText("....................................");

        jSatisYapButon.setText("Satış Yap");
        jSatisYapButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSatisYapButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jKDVliGoster)
                        .addGap(46, 46, 46)
                        .addComponent(jSatisYapButon))
                    .addComponent(jKDVsizGoster)
                    .addComponent(jComboKDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIstenilenSatisAdedi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jStokAdetGoster)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jFiyatGoster)
                        .addGap(18, 18, 18)
                        .addComponent(jBirimGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jKategoriGoster))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jKategoriGoster))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jFiyatGoster)
                        .addComponent(jBirimGoster)))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jStokAdetGoster))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addComponent(jIstenilenSatisAdedi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboKDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jKDVsizGoster))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jKDVliGoster)
                    .addComponent(jSatisYapButon))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Sorgulama & Satış");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kategori", "Fiyat", "Fiyat Birimi", "Stok Adedi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFiyatAlTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFiyatAlTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFiyatAlTxtActionPerformed

    private void jKaydetButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKaydetButonActionPerformed
        // TODO add your handling code here:
       DefaultTableModel tablemodel = (DefaultTableModel) jTable1.getModel();
       Object data[] = new Object [4];
       data[0] = jComboUrunKategori.getSelectedItem();
       data[1] = jFiyatAlTxt.getText();
       data[2] = jComboFiyatBirimi.getSelectedItem();
       data[3] = jAdetAlTxt.getText();
       tablemodel.addRow(data);
       jTable1.setModel(tablemodel);
    }//GEN-LAST:event_jKaydetButonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         satir = jTable1.getSelectedRow();
         String kategori = jTable1.getValueAt(satir,0).toString();
         String fiyat = jTable1.getValueAt(satir,1).toString();
         String fiyatBirim = jTable1.getValueAt(satir,2).toString();
         String stokAdet = jTable1.getValueAt(satir,3).toString();
         jKategoriGoster.setText(kategori);
         jFiyatGoster.setText(fiyat);
         jBirimGoster.setText(fiyatBirim);
         jStokAdetGoster.setText(stokAdet);
         
    }//GEN-LAST:event_jTable1MouseClicked

    private void jSatisYapButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSatisYapButonActionPerformed
        // TODO add your handling code here:
        if(Integer.parseInt(jIstenilenSatisAdedi.getText().toString()) > Integer.parseInt(jStokAdetGoster.getText().toString()) ){
            JOptionPane.showMessageDialog(null, "Stokta yeterli ürün bulunmamaktadır.","HATA!", JOptionPane.ERROR_MESSAGE);      
        }
        else{
            Object[] options = {"Evet","Hayır"};
             int n = JOptionPane.showOptionDialog(null,"Satış Yapılsın mı?","Kontrol",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, options,options[0]);
             if(n == 0){ // Evet ise
                 int stokAdet = Integer.parseInt(jStokAdetGoster.getText().toString());
                 int satisAdet = Integer.parseInt(jIstenilenSatisAdedi.getText().toString());
                 int sonuc = stokAdet-satisAdet;
                 jTable1.setValueAt(sonuc , satir, 3);
             }
             else if (n==1) {
                 JOptionPane.showMessageDialog(null,"Satış Yapılmadı","Bilgi!",JOptionPane.INFORMATION_MESSAGE);
             }
  
        }            
    }//GEN-LAST:event_jSatisYapButonActionPerformed

    private void jComboKDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboKDVActionPerformed
        // TODO add your handling code here:
        float urunFiyati = Float.parseFloat(jFiyatGoster.getText().toString());
        float satisAdedi = Integer.parseInt(jIstenilenSatisAdedi.getText().toString());
        jKDVsizGoster.setText(String.valueOf(urunFiyati*satisAdedi));
        
        int KDV = Integer.parseInt(jComboKDV.getSelectedItem().toString());
        float carpim = urunFiyati*satisAdedi;
        float KDVli = (carpim*KDV)/100;
        jKDVliGoster.setText(String.valueOf(carpim + KDVli));
        
        
        
    }//GEN-LAST:event_jComboKDVActionPerformed

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
            java.util.logging.Logger.getLogger(AlimSatim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlimSatim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlimSatim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlimSatim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlimSatim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAdetAlTxt;
    private javax.swing.JLabel jBirimGoster;
    private javax.swing.JComboBox<String> jComboFiyatBirimi;
    private javax.swing.JComboBox<String> jComboKDV;
    private javax.swing.JComboBox<String> jComboUrunKategori;
    private javax.swing.JTextField jFiyatAlTxt;
    private javax.swing.JLabel jFiyatGoster;
    private javax.swing.JTextField jIstenilenSatisAdedi;
    private javax.swing.JLabel jKDVliGoster;
    private javax.swing.JLabel jKDVsizGoster;
    private javax.swing.JLabel jKategoriGoster;
    private javax.swing.JButton jKaydetButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jSatisYapButon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jStokAdetGoster;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
