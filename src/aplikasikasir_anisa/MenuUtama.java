/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasikasir_anisa;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class MenuUtama extends javax.swing.JFrame {
Connection konek;
PreparedStatement pst;
ResultSet rst;

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        konek = Koneksi.KoneksiDB();
        mulai();
        tampilWaktu();
    }

    public void mulai() {
    FormLogin.setVisible(false);
    Register.setEnabled(false);
    Logout.setEnabled(false);
    Master.setEnabled(false);
    Transaksi.setEnabled(false);
    Laporan.setEnabled(false);
    txtjam.setEnabled(false);
    txttanggal.setEnabled(false);
    btnregister.setEnabled(false);
    btnproduk.setEnabled(false);
    btnpelanggan.setEnabled(false);
    btnpenjualan.setEnabled(false);
}

    public void tampilWaktu() {
        Thread clock = new Thread() {
            public void run() {
                for(;;) {
                    Calendar cal = Calendar.getInstance();
                    SimpleDateFormat Jam = new SimpleDateFormat("HH:mm:ss");
                    SimpleDateFormat Tanggal = new SimpleDateFormat("yyyy-MM-dd");
                    txtjam.setText(Jam.format(cal.getTime()));
                    txttanggal.setText(Tanggal.format(cal.getTime()));
               try { sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
            }
        };
        clock.start();
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
        btnregister = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnpelanggan = new javax.swing.JButton();
        btnproduk = new javax.swing.JButton();
        btnpenjualan = new javax.swing.JButton();
        FormLogin = new javax.swing.JInternalFrame();
        formlogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbhakakses = new javax.swing.JComboBox<>();
        btndaftar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txttanggal = new javax.swing.JTextField();
        txtjam = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Register = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenuItem();
        Login = new javax.swing.JMenuItem();
        Master = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        Produk = new javax.swing.JMenuItem();
        Transaksi = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        Laporan = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        Tentang = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        btnregister.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-register-40 (1).png")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Silahkan login dulu...!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnregister)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregister)
                .addGap(33, 33, 33))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        btnpelanggan.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-customer-30.png")); // NOI18N
        btnpelanggan.setText("Pelanggan");

        btnproduk.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-product-30.png")); // NOI18N
        btnproduk.setText("Produk");

        btnpenjualan.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-sale-30.png")); // NOI18N
        btnpenjualan.setText("Penjualan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(btnpelanggan)
                .addGap(44, 44, 44)
                .addComponent(btnproduk)
                .addGap(34, 34, 34)
                .addComponent(btnpenjualan)
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpelanggan)
                    .addComponent(btnproduk)
                    .addComponent(btnpenjualan))
                .addGap(27, 27, 27))
        );

        FormLogin.setVisible(true);

        formlogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        formlogin.setText("FORM LOGIN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-user-20.png")); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-password-20.png")); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-access-20.png")); // NOI18N
        jLabel4.setText("Hak Akses");

        cmbhakakses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih salah satu-" }));
        cmbhakakses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbhakaksesActionPerformed(evt);
            }
        });

        btndaftar.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-list-20 (1).png")); // NOI18N
        btndaftar.setText("BATAL");

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-login-20.png")); // NOI18N
        jButton2.setText("MASUK");

        javax.swing.GroupLayout FormLoginLayout = new javax.swing.GroupLayout(FormLogin.getContentPane());
        FormLogin.getContentPane().setLayout(FormLoginLayout);
        FormLoginLayout.setHorizontalGroup(
            FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLoginLayout.createSequentialGroup()
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(formlogin)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLoginLayout.createSequentialGroup()
                                .addGap(0, 21, Short.MAX_VALUE)
                                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbhakakses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
            .addGroup(FormLoginLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btndaftar)
                .addGap(86, 86, 86)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FormLoginLayout.setVerticalGroup(
            FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLoginLayout.createSequentialGroup()
                .addComponent(formlogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbhakakses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndaftar)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-home-20 (1).png")); // NOI18N
        jMenu1.setText("Beranda");

        Register.setText("Register");
        jMenu1.add(Register);

        Logout.setText("Logout");
        jMenu1.add(Logout);

        Login.setText("Login");
        jMenu1.add(Login);

        jMenuBar1.add(jMenu1);

        Master.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-master-20.png")); // NOI18N
        Master.setText("Master");
        Master.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasterActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Pelanggan");
        Master.add(jMenuItem3);

        Produk.setText("Produk");
        Master.add(Produk);

        jMenuBar1.add(Master);

        Transaksi.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-transaction-20.png")); // NOI18N
        Transaksi.setText("Transaksi");

        jMenuItem5.setText("Penjualan");
        Transaksi.add(jMenuItem5);

        jMenuBar1.add(Transaksi);

        Laporan.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-report-20 (1).png")); // NOI18N
        Laporan.setText("Laporan");
        Laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanActionPerformed(evt);
            }
        });

        jMenuItem6.setText("Rekap laporan");
        Laporan.add(jMenuItem6);

        jMenuBar1.add(Laporan);

        Help.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-about-20.png")); // NOI18N
        Help.setText("Help");

        Tentang.setText("Tentang");
        Tentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TentangActionPerformed(evt);
            }
        });
        Help.add(Tentang);

        jMenuBar1.add(Help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(FormLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtjam, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FormLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbhakaksesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbhakaksesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbhakaksesActionPerformed

    private void TentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TentangActionPerformed
   new FormAbout().setVisible (true);     // TODO add your handling code here:
    }//GEN-LAST:event_TentangActionPerformed

    private void LaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanActionPerformed
     new FormLapTransaksi().setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_LaporanActionPerformed

    private void MasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MasterActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame FormLogin;
    private javax.swing.JMenu Help;
    private javax.swing.JMenu Laporan;
    private javax.swing.JMenuItem Login;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenu Master;
    private javax.swing.JMenuItem Produk;
    private javax.swing.JMenuItem Register;
    private javax.swing.JMenuItem Tentang;
    private javax.swing.JMenu Transaksi;
    private javax.swing.JButton btndaftar;
    private javax.swing.JButton btnpelanggan;
    private javax.swing.JButton btnpenjualan;
    private javax.swing.JButton btnproduk;
    private javax.swing.JButton btnregister;
    private javax.swing.JComboBox<String> cmbhakakses;
    private javax.swing.JLabel formlogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtjam;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txttanggal;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
