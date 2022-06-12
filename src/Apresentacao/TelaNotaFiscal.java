
package Apresentacao;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TelaNotaFiscal extends javax.swing.JPanel {

    public TelaNotaFiscal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bt_imprimirNota = new javax.swing.JButton();

        jLabel1.setText("Supermercado do Dev");

        bt_imprimirNota.setText("Imprimir Nota Fiscal");
        bt_imprimirNota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_imprimirNotaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_imprimirNota, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 456, Short.MAX_VALUE)
                .addComponent(bt_imprimirNota, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_imprimirNotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_imprimirNotaMouseClicked
        
        TelaPrincipalForm.telaAcessoSistema = new TelaAcessoSistema(TelaPrincipalForm.listProdutos);
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(TelaPrincipalForm.telaNotaFiscal);
        janela.add(TelaPrincipalForm.telaAcessoSistema, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_imprimirNotaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_imprimirNota;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
