/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Javanim extends javax.swing.JFrame {

    /**
     * Creates new form Javanim
     */
    public Javanim() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtnim = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("APLIKASI NIM MAHASISWA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nim   :");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        txtnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnimActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("jalankan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("keluar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(txtnim)
                            .addComponent(txtnama)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnimActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String kodeNim = txtnim.getText();

       String nama = txtnama.getText();

       char jeKelamin = kodeNim.charAt(6);

       JOptionPane.showMessageDialog(this, "Nama Mahasiswa : " + nama);

       if(jeKelamin == '1')
       {
           JOptionPane.showMessageDialog(this, "Jenis Kelamin mahasiswa adalah Laki-Laki");
       }else if (jeKelamin == '2')
       {
           JOptionPane.showMessageDialog(this, "Jenis Kelamin mahasiswa adalah Perempuan");
       }else
       {
           JOptionPane.showMessageDialog(this, "Jenis Kelamin Tidak Ditemukan");
       }

       //ini adalah code program mencari kode urut mahasiswa
       String kodeUrut = kodeNim.substring(7);

       JOptionPane.showMessageDialog(this, "Kode Urut Mahasiswa Anda Adalah :" + kodeUrut);


       //ini adalah code program untuk jenjang pendidikan
       char koJenj = kodeNim.charAt(0);

       if(koJenj == '1')
       {
           JOptionPane.showMessageDialog(this, "Jenjang S-1");
       }else if (koJenj == '2')
       {
           JOptionPane.showMessageDialog(this, "Jenjang S-2");
       }else if(koJenj == '3')
       {
           JOptionPane.showMessageDialog(this, "Jenjang S-3");
       }

       //ini adalah kode tahun masuk
       String tahun = kodeNim.substring(1,3);

       if(tahun.equals("20"))
       {
          JOptionPane.showMessageDialog(this, "Mahasiswa Tahun 2020");
       }else if(tahun.equals("19"))
       {
           JOptionPane.showMessageDialog(this, "Mahasiswa Tahun 2019  ");
       }
       else
       {
           JOptionPane.showMessageDialog(this, "Upps, tahun masuk tidak ditemukan");
       }

       //ini adalah kode untuk jurusan
       String jurusan = kodeNim.substring(4, 6);

       if(jurusan.equals("01"))
       {
          JOptionPane.showMessageDialog(this, "Teknik Informatika");

       }else if(jurusan.equals("02"))
       {
           JOptionPane.showMessageDialog(this, "Teknik Industri");
       }
       else if(jurusan.equals("03"))
       {
           JOptionPane.showMessageDialog(this, "Sistem Informasi");
       }
       else if(jurusan.equals("04"))
       {
           JOptionPane.showMessageDialog(this, "Matematika");
       }
       else if(jurusan.equals("05"))
       {
           JOptionPane.showMessageDialog(this, "Elektro");
       }
       else
       {
           JOptionPane.showMessageDialog(this, "Upps, jurusan tidak ditemukan");
       }

       //kode untuk fakultas

       char fakultas = kodeNim.charAt(3);

       if(fakultas == '1')
       {
           JOptionPane.showMessageDialog(this, "Tarbiyah dan Keguruan");
       }else if (fakultas == '2')
       {
           JOptionPane.showMessageDialog(this, "Syariah dan Hukum");
       }else if (fakultas == '3')
       {
           JOptionPane.showMessageDialog(this, "USHULUDDIN");
       }
       else if (fakultas == '4')
       {
           JOptionPane.showMessageDialog(this, "Dakwah dan Komunikasi");
       }
       else if (fakultas == '5')
       {
           JOptionPane.showMessageDialog(this, "Sains dan Teknologi");
           //System.out.println("Sains dan Teknologi");
       }
       else if (fakultas == '6')
       {
           JOptionPane.showMessageDialog(this, "Psikologi");
       }
       else if (fakultas == '7')
       {
           JOptionPane.showMessageDialog(this, "Ekonomi dan Ilmu Social");
       }
       else if (fakultas == '8')
       {
           JOptionPane.showMessageDialog(this, "Pertanian dan Peternakana");
       }
       else
       {
           JOptionPane.showMessageDialog(this, "Jenis Kelamin Tidak Ditemukan");
       }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Javanim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Javanim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Javanim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Javanim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Javanim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    // End of variables declaration//GEN-END:variables
}
