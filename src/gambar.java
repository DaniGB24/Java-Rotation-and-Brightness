
import javax.swing.JFileChooser;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author I.R Dani
 */
public class gambar extends javax.swing.JFrame {
    private ImageIcon ii;
    private JLabel imageLabel;
    /**
     * Creates new form gambar
     */
    public classgambar gambar;
    public gambar() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        slider_Brightness = new javax.swing.JSlider();
        slider_rotate = new javax.swing.JSlider();
        lbl_SliderNumber = new javax.swing.JLabel();
        lbl_derajat = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        miBuka = new javax.swing.JMenuItem();
        miSimpan = new javax.swing.JMenuItem();
        miKeluar = new javax.swing.JMenuItem();
        mnEdit = new javax.swing.JMenu();
        miGrayScale = new javax.swing.JMenuItem();
        miBiner = new javax.swing.JMenuItem();
        miDefault = new javax.swing.JMenuItem();
        miBrightness = new javax.swing.JMenuItem();
        mnGeometri = new javax.swing.JMenu();
        miZin = new javax.swing.JMenuItem();
        miZout = new javax.swing.JMenuItem();
        miFlipv = new javax.swing.JMenuItem();
        miFliph = new javax.swing.JMenuItem();
        Rotate = new javax.swing.JMenu();
        mi_rotateRight90 = new javax.swing.JMenuItem();
        mi_rotateLeft90 = new javax.swing.JMenuItem();
        mi_rotate180 = new javax.swing.JMenuItem();
        mi_freeRotate = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PCD 1");

        jLabel1.setText("Gambar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        slider_Brightness.setMaximum(255);
        slider_Brightness.setMinimum(-255);
        slider_Brightness.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_BrightnessStateChanged(evt);
            }
        });

        slider_rotate.setMaximum(360);
        slider_rotate.setOrientation(javax.swing.JSlider.VERTICAL);
        slider_rotate.setEnabled(false);
        slider_rotate.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_rotateStateChanged(evt);
            }
        });

        lbl_SliderNumber.setText("0");

        lbl_derajat.setText("0");

        mnFile.setText("File");

        miBuka.setText("Buka");
        miBuka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBukaActionPerformed(evt);
            }
        });
        mnFile.add(miBuka);

        miSimpan.setText("Simpan");
        miSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSimpanActionPerformed(evt);
            }
        });
        mnFile.add(miSimpan);

        miKeluar.setText("Keluar");
        miKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKeluarActionPerformed(evt);
            }
        });
        mnFile.add(miKeluar);

        jMenuBar1.add(mnFile);

        mnEdit.setText("Edit");

        miGrayScale.setText("GrayScale");
        miGrayScale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGrayScaleActionPerformed(evt);
            }
        });
        mnEdit.add(miGrayScale);

        miBiner.setText("Biner");
        miBiner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBinerActionPerformed(evt);
            }
        });
        mnEdit.add(miBiner);

        miDefault.setText("Default");
        miDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDefaultActionPerformed(evt);
            }
        });
        mnEdit.add(miDefault);

        miBrightness.setText("Brightness");
        miBrightness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBrightnessActionPerformed(evt);
            }
        });
        mnEdit.add(miBrightness);

        jMenuBar1.add(mnEdit);

        mnGeometri.setText("Geometri");

        miZin.setText("Zoom In");
        miZin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miZinActionPerformed(evt);
            }
        });
        mnGeometri.add(miZin);

        miZout.setText("Zoom Out");
        miZout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miZoutActionPerformed(evt);
            }
        });
        mnGeometri.add(miZout);

        miFlipv.setText("Flip Vertikal");
        miFlipv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFlipvActionPerformed(evt);
            }
        });
        mnGeometri.add(miFlipv);

        miFliph.setText("Flip Horizontal");
        miFliph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFliphActionPerformed(evt);
            }
        });
        mnGeometri.add(miFliph);

        Rotate.setText("Rotation");

        mi_rotateRight90.setText("Rotate Right 90");
        mi_rotateRight90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_rotateRight90ActionPerformed(evt);
            }
        });
        Rotate.add(mi_rotateRight90);

        mi_rotateLeft90.setText("Rotate Left 90");
        mi_rotateLeft90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_rotateLeft90ActionPerformed(evt);
            }
        });
        Rotate.add(mi_rotateLeft90);

        mi_rotate180.setText("Rotate 180");
        mi_rotate180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_rotate180ActionPerformed(evt);
            }
        });
        Rotate.add(mi_rotate180);

        mi_freeRotate.setText("Free Rotate");
        mi_freeRotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_freeRotateActionPerformed(evt);
            }
        });
        Rotate.add(mi_freeRotate);

        mnGeometri.add(Rotate);

        jMenuBar1.add(mnGeometri);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(slider_Brightness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_SliderNumber)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(slider_rotate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_derajat))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_SliderNumber))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(slider_Brightness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(slider_rotate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_derajat)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public class SliderListener implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            int value = slider_Brightness.getValue();
            String str = Integer.toString(value);
            lbl_SliderNumber.setText(str);
            gambar.Brightness(slider_Brightness.getValue());
            jLabel1.setIcon(gambar.ScaleResultIcon);
            
        }     
    }
    
    private void isSliderUse(boolean kondisi){
        if(kondisi == true){
            
            slider_Brightness.setVisible(true);
            lbl_SliderNumber.setVisible(true);
        } else {
            
            slider_Brightness.setVisible(false);
            lbl_SliderNumber.setVisible(false);
        }
        
    }
    
    @Override
    public void paint (Graphics g) {
        super.paint(g);
        
    }
    private void miBukaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBukaActionPerformed
        // TODO add your handling code here:
        JFileChooser Tdialog= new JFileChooser();
        if(Tdialog.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            gambar=new classgambar(Tdialog.getSelectedFile().getAbsolutePath(),355,355);
            jLabel1.setIcon(gambar.GetIcon());
        }
    }//GEN-LAST:event_miBukaActionPerformed

    private void miSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSimpanActionPerformed
        // TODO add your handling code here:
        JFileChooser TDialog = new JFileChooser();
        if(TDialog.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
        {
            gambar.SaveImage(TDialog.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_miSimpanActionPerformed

    private void miKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKeluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_miKeluarActionPerformed

    private void miGrayScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGrayScaleActionPerformed
        // TODO add your handling code here:
        gambar.Grayscale();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_miGrayScaleActionPerformed

    private void miBinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBinerActionPerformed
        // TODO add your handling code here:
        gambar.Biner();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_miBinerActionPerformed

    private void miDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDefaultActionPerformed
        // TODO add your handling code here:
        gambar.Default();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_miDefaultActionPerformed

    private void miBrightnessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBrightnessActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_miBrightnessActionPerformed

    private void miFlipvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFlipvActionPerformed
        // TODO add your handling code here:
        isSliderUse(false);
        gambar.flipV();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_miFlipvActionPerformed

    private void miFliphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFliphActionPerformed
        // TODO add your handling code here:
        isSliderUse(false);
        gambar.flipH();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_miFliphActionPerformed

    private void miZinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miZinActionPerformed
        // TODO add your handling code here:
        isSliderUse(false);
        gambar.zoomin();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_miZinActionPerformed

    private void miZoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miZoutActionPerformed
        // TODO add your handling code here:
        isSliderUse(false);
        gambar.zoomout();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_miZoutActionPerformed

    private void mi_rotateRight90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_rotateRight90ActionPerformed
        // TODO add your handling code here:
        isSliderUse(false);
        gambar.Rotate(90, this);
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_mi_rotateRight90ActionPerformed

    private void mi_rotate180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_rotate180ActionPerformed
        // TODO add your handling code here:
        isSliderUse(false);
        gambar.Rotate(180, this);
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_mi_rotate180ActionPerformed

    private void mi_rotateLeft90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_rotateLeft90ActionPerformed
        // TODO add your handling code here:
        isSliderUse(false);
        gambar.Rotate(-90, this);
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_mi_rotateLeft90ActionPerformed

        
    private void mi_freeRotateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_freeRotateActionPerformed
        // TODO add your handling code here:
        slider_rotate.setEnabled(true);
    }//GEN-LAST:event_mi_freeRotateActionPerformed

    private void slider_rotateStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_rotateStateChanged
        // TODO add your handling code here:
        isSliderUse(false);
        gambar.rotasiCitra((double)slider_rotate.getValue(), this);
        int a = slider_rotate.getValue();
        lbl_derajat.setText(Integer.toString(a));
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_slider_rotateStateChanged

    private void slider_BrightnessStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_BrightnessStateChanged
        // TODO add your handling code here:
       isSliderUse(true);
        gambar.Brightness(slider_Brightness.getValue());
        jLabel1.setIcon(gambar.ScaleResultIcon);
        lbl_SliderNumber.setText(Integer.toString(slider_Brightness.getValue()));
    }//GEN-LAST:event_slider_BrightnessStateChanged

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
            java.util.logging.Logger.getLogger(gambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gambar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Rotate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_SliderNumber;
    private javax.swing.JLabel lbl_derajat;
    private javax.swing.JMenuItem miBiner;
    private javax.swing.JMenuItem miBrightness;
    private javax.swing.JMenuItem miBuka;
    private javax.swing.JMenuItem miDefault;
    private javax.swing.JMenuItem miFliph;
    private javax.swing.JMenuItem miFlipv;
    private javax.swing.JMenuItem miGrayScale;
    private javax.swing.JMenuItem miKeluar;
    private javax.swing.JMenuItem miSimpan;
    private javax.swing.JMenuItem miZin;
    private javax.swing.JMenuItem miZout;
    private javax.swing.JMenuItem mi_freeRotate;
    private javax.swing.JMenuItem mi_rotate180;
    private javax.swing.JMenuItem mi_rotateLeft90;
    private javax.swing.JMenuItem mi_rotateRight90;
    private javax.swing.JMenu mnEdit;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenu mnGeometri;
    private javax.swing.JSlider slider_Brightness;
    private javax.swing.JSlider slider_rotate;
    // End of variables declaration//GEN-END:variables
}
