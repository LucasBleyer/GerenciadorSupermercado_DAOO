
package Apresentacao;

import Dominio.ModuloPessoa.Pessoa;
import Dominio.ModuloSupermercado.Produto;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TelaCompraProdutos extends javax.swing.JPanel {

    DefaultTableModel model;
    String selecionado = null;
    
    ArrayList<Produto> listProdutosCarrinho;

    public TelaCompraProdutos() {
    }
    
    public TelaCompraProdutos(ArrayList<Produto> listProdutos, Pessoa cliente) {
        initComponents();
        
        listProdutos = new ArrayList();
        
        listProdutosCarrinho = new ArrayList();
        
        this.model = (DefaultTableModel)this.tb_produtos.getModel();
        carregarTabela();
    }
    
    public void carregarTabela(){
        
        ((DefaultTableModel) tb_produtos.getModel()).setRowCount(0);
        
        for(int i = 0; i < TelaPrincipalForm.listProdutos.size(); i++)
        { 
           this.model.insertRow(i, new Object[]{TelaPrincipalForm.listProdutos.get(i).getNome(), TelaPrincipalForm.listProdutos.get(i).getPreco()});
        }
        this.tb_produtos.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lb_nomeCliente = new javax.swing.JLabel();
        bt_deslogar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_produtos = new javax.swing.JTable();
        bt_adicionarCarrinho = new javax.swing.JButton();

        jLabel1.setText("Selecione os Produtos que deseja comprar");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Usuário:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 22, -1, -1));

        lb_nomeCliente.setText("<nomeCliente>");
        jPanel1.add(lb_nomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 22, -1, -1));

        bt_deslogar.setText("Deslogar");
        bt_deslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_deslogarMouseClicked(evt);
            }
        });
        jPanel1.add(bt_deslogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 19, -1, -1));

        tb_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_produtos);

        bt_adicionarCarrinho.setText("Adicionar ao Carrinho");
        bt_adicionarCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_adicionarCarrinhoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(bt_adicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(349, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_adicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_deslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_deslogarMouseClicked

        switch(JOptionPane.showConfirmDialog(null, "Você têm certeza disso?", "Deslogar ", JOptionPane.YES_NO_OPTION))
        {
            case 0 :
            TelaPrincipalForm.telaLogin = new TelaLogin(TelaPrincipalForm.listProdutos);
            JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().remove(TelaPrincipalForm.telaCompraProdutos);
            janela.add(TelaPrincipalForm.telaLogin, BorderLayout.CENTER);
            janela.pack();
            break;

            case 1 :
            break;
        }
    }//GEN-LAST:event_bt_deslogarMouseClicked

    private void bt_adicionarCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_adicionarCarrinhoMouseClicked
        
        Object temp;
        int column = 0;
        int row = this.tb_produtos.getSelectedRow(); 
        temp = this.tb_produtos.getModel().getValueAt(row, column); 

        Produto p = null;
        try
        {
            if(temp != null)
            {
                this.selecionado = temp.toString();
                for(int i = 0; i < TelaPrincipalForm.listProdutos.size(); i++)
                {  
                    if(this.selecionado.equals(TelaPrincipalForm.listProdutos.get(i).getNome()))
                    {  
                        p = (Produto) TelaPrincipalForm.listProdutos.get(i);
                        listProdutosCarrinho.add(p);
                    }
                }
            }
            else
            {
                throw new Exception();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Selecione um Produto da tabela!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_adicionarCarrinhoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_adicionarCarrinho;
    private javax.swing.JButton bt_deslogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_nomeCliente;
    private javax.swing.JTable tb_produtos;
    // End of variables declaration//GEN-END:variables
}
