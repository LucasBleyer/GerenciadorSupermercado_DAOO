
package Apresentacao;

import Dominio.ModuloSupermercado.Produto;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TelaNotaFiscal extends javax.swing.JPanel {

    DefaultTableModel modelCarrinho;
    
    public TelaNotaFiscal(ArrayList<Produto> listCarrinho, double contTotalPagar) {
        initComponents();
        
        tb_carrinho.setEnabled(false);
        
        lb_totalPagar.setText("R$ " +contTotalPagar);
        
        listCarrinho = new ArrayList();
        
        this.modelCarrinho = (DefaultTableModel)this.tb_carrinho.getModel();
        carregarTabelaCarrinho();
    }
    
    public void carregarTabelaCarrinho(){
        
        ((DefaultTableModel) tb_carrinho.getModel()).setRowCount(0);
        
        for(int i = 0; i < TelaPrincipalForm.listCarrinho.size(); i++)
        { 
           this.modelCarrinho.insertRow(i, new Object[]{TelaPrincipalForm.listCarrinho.get(i).getNome(), TelaPrincipalForm.listCarrinho.get(i).getPreco()});
        }
        this.tb_carrinho.setModel(modelCarrinho);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bt_imprimirNota = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_carrinho = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_nomeCliente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lb_totalPagar = new javax.swing.JLabel();

        jLabel1.setText("Supermercado do Dev");

        bt_imprimirNota.setText("Imprimir Nota Fiscal");
        bt_imprimirNota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_imprimirNotaMouseClicked(evt);
            }
        });

        tb_carrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_carrinho);
        if (tb_carrinho.getColumnModel().getColumnCount() > 0) {
            tb_carrinho.getColumnModel().getColumn(0).setResizable(false);
            tb_carrinho.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setText("Produtos Comprados:");

        jLabel3.setText("Nome Cliente: ");

        jLabel4.setText("CPF Cliente:");

        jLabel5.setText("Total: ");

        lb_nomeCliente.setText("<nomeCliente>");

        jLabel6.setText("<cpfCliente>");

        lb_totalPagar.setText("<totalPagar>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_imprimirNota, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_totalPagar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_nomeCliente))
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lb_nomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lb_totalPagar))
                .addGap(42, 42, 42)
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_nomeCliente;
    private javax.swing.JLabel lb_totalPagar;
    private javax.swing.JTable tb_carrinho;
    // End of variables declaration//GEN-END:variables
}
