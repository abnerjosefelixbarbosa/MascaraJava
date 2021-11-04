package presentation;

import domain.Usuarios;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class MascaraScreen extends javax.swing.JFrame {

    public MascaraScreen() {
        initComponents();
        Mascara();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mascara = new javax.swing.JFormattedTextField();
        Verificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Verificar.setText("Verificar");
        Verificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(mascara, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(mascara, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Mascara() {
        try {
            MaskFormatter m = new MaskFormatter("###.###.###-##");
            m.install(this.mascara);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
    }

    private void VerificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerificarMouseClicked
        var u = new Usuarios();
        u.setMascara(this.mascara.getText());
        VerificarMascara(u);
    }//GEN-LAST:event_VerificarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void VerificarMascara(Usuarios dados) {
        var mascara = dados.getMascara();
        var res = "";
        
        for (int i = 0; i < mascara.length(); i++) {
            if (Character.isSpaceChar(mascara.charAt(i))) {
                res = "Mascara incompleta";
                break;
            }
        }
        
        if (res == "") {
            JOptionPane.showMessageDialog(null, "Ok", "Messagem", 1);
        } else {
            JOptionPane.showMessageDialog(null, res, "Erro", 0);
        }
    }

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
            java.util.logging.Logger.getLogger(MascaraScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MascaraScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MascaraScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MascaraScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                var ms = new MascaraScreen();
                ms.setDefaultCloseOperation(3);
                ms.setLocationRelativeTo(null);
                ms.setResizable(true);
                ms.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Verificar;
    private javax.swing.JFormattedTextField mascara;
    // End of variables declaration//GEN-END:variables
}
