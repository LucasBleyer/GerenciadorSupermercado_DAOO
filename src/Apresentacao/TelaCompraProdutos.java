
package Apresentacao;

import Dominio.ModuloSupermercado.Produto;
import Dominio.ModuloSupermercado.Supermercado;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TelaCompraProdutos extends javax.swing.JPanel {

    DefaultTableModel modelProdutos, modelCarrinho;
    String selecionado = null;

    double contTotalPagar = 0;
    
    public TelaCompraProdutos(ArrayList<Produto> listProdutos) {
        initComponents();
        
        for (int i = 0; i < Supermercado.listPessoas.size(); i++)
        {
            String nome = Supermercado.listPessoas.get(i).getNome();
            lb_nomeCliente.setText(nome);
        } 
        
        listProdutos = new ArrayList();
        
        Supermercado.listCarrinho = new ArrayList<Produto>();
        
        this.modelProdutos = (DefaultTableModel)this.tb_produtos.getModel();
        carregarTabelaProdutos();    
    }
    
    public void carregarTabelaProdutos(){
        
        ((DefaultTableModel) tb_produtos.getModel()).setRowCount(0);
        
        for(int i = 0; i < Supermercado.listProdutos.size(); i++)
        { 
           this.modelProdutos.insertRow(i, new Object[]{Supermercado.listProdutos.get(i).getNome(), Supermercado.listProdutos.get(i).getPreco()});
        }
        this.tb_produtos.setModel(modelProdutos);
    }
    
    public void carregarTabelaCarrinho(){
        
        ((DefaultTableModel) tb_carrinho.getModel()).setRowCount(0);
        
        for(int i = 0; i < Supermercado.listCarrinho.size(); i++)
        { 
           this.modelCarrinho.insertRow(i, new Object[]{Supermercado.listCarrinho.get(i).getNome()});
        }
        this.tb_carrinho.setModel(modelCarrinho);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_produtos = new javax.swing.JTable();
        bt_adicionarCarrinho = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lb_totalPagar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_carrinho = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        bt_removerCarrinho = new javax.swing.JButton();
        bt_finalizarCompra = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lb_nomeCliente = new javax.swing.JLabel();
        bt_deslogar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("Selecione os Produtos que deseja adicionar ao Carrinho de Compras");

        tb_produtos.setModel(new javax.swing.table.DefaultTableModel(
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
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_produtosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_produtos);

        bt_adicionarCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/add_circle_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        bt_adicionarCarrinho.setText("Adicionar ao Carrinho");
        bt_adicionarCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_adicionarCarrinhoMouseClicked(evt);
            }
        });

        jLabel2.setText("Total a pagar: ");

        lb_totalPagar.setText("<totalPagar>");

        tb_carrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb_carrinho);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/shopping_cart_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jLabel3.setText("Carrinho");

        bt_removerCarrinho.setText("Remover do Carrinho");
        bt_removerCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_removerCarrinhoMouseClicked(evt);
            }
        });

        bt_finalizarCompra.setText("Finalizar Compra");
        bt_finalizarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_finalizarCompraMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/shopping_cart_checkout_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/delete_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N

        jLabel4.setText("Usuário:");

        lb_nomeCliente.setText("<nomeAdministrador>");

        bt_deslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/power_settings_new_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        bt_deslogar.setBorder(null);
        bt_deslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_deslogarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(bt_deslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addComponent(lb_nomeCliente))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_deslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lb_nomeCliente)))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/attach_money_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bt_finalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bt_removerCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(bt_adicionarCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                .addGap(175, 175, 175))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(lb_totalPagar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bt_adicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lb_totalPagar))
                                    .addComponent(jLabel7))
                                .addGap(189, 189, 189)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(bt_removerCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(bt_finalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_produtosMouseClicked
        
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
                for(int i = 0; i< Supermercado.listProdutos.size(); i++)
                {  
                    if(this.selecionado.equals(Supermercado.listProdutos.get(i).getNome()))
                    {  
                        p = (Produto) Supermercado.listProdutos.get(i);
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
            JOptionPane.showMessageDialog(null, "Selecione um Produto da tabela!", "Produtos à Venda", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tb_produtosMouseClicked

    private void bt_adicionarCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_adicionarCarrinhoMouseClicked
        
        try
        {
           if(this.selecionado != null)
           { 
            Produto p = null;
        
            for(int i=0; i<Supermercado.listProdutos.size(); i++)
            {  
                if(selecionado.equals(Supermercado.listProdutos.get(i).getNome()))
                { 
                    p = (Produto) Supermercado.listProdutos.get(i);
                    
                    contTotalPagar += Supermercado.listProdutos.get(i).getPreco();
                    lb_totalPagar.setText("R$" + contTotalPagar);   
                }
            }
            if(p != null)
            {
               Supermercado.listCarrinho.add(p);
               JOptionPane.showMessageDialog(null, "Produto adicionado ao carrinho!", "Carrinho!", JOptionPane.INFORMATION_MESSAGE);
               this.modelCarrinho = (DefaultTableModel)this.tb_carrinho.getModel();
               carregarTabelaCarrinho();
            }
        }
            else
            { 
             throw new Exception();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Selecione algum produto da tabela antes de continuar!", "Produtos à Venda!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_adicionarCarrinhoMouseClicked

    private void bt_removerCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_removerCarrinhoMouseClicked
        
        switch(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover o produto do carrinho", "Carrinho", JOptionPane.YES_NO_OPTION))
        {
            case 0: 
                    Object temp;
                    int column = 0;
                    int row = this.tb_carrinho.getSelectedRow();  
                    temp = this.tb_carrinho.getModel().getValueAt(row, column); 
                    Produto produto = null;

                    try{
                        if(temp != null)
                        {
                            this.selecionado = temp.toString();
                            for(int i = 0; i < Supermercado.listCarrinho.size(); i++)
                            {  
                                if(this.selecionado.equals(Supermercado.listCarrinho.get(i).getNome()))
                                {  
                                    this.modelCarrinho.removeRow(i);
                                    produto = (Produto) Supermercado.listCarrinho.remove(i);
                                    
                                    this.modelCarrinho = (DefaultTableModel)this.tb_carrinho.getModel();
                                    carregarTabelaCarrinho();
                                    
                                    contTotalPagar -= Supermercado.listCarrinho.get(i).getPreco();
                                    lb_totalPagar.setText("R$ " + contTotalPagar);
                                }
                            }    
                        }
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Selecione um Produto da tabela!", "Exclusão de Produtos!", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    break;
            case 1:
                    break;
        }
    }//GEN-LAST:event_bt_removerCarrinhoMouseClicked

    private void bt_finalizarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_finalizarCompraMouseClicked
        
        TelaPrincipalForm.telaNotaFiscal = new TelaNotaFiscal(Supermercado.listCarrinho, contTotalPagar);
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(TelaPrincipalForm.telaCompraProdutos);
        janela.add(TelaPrincipalForm.telaNotaFiscal, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_finalizarCompraMouseClicked

    private void bt_deslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_deslogarMouseClicked

        switch(JOptionPane.showConfirmDialog(null, "Você têm certeza disso?", "Deslogar ", JOptionPane.YES_NO_OPTION))
        {
            case 0 :
            TelaPrincipalForm.telaLogin = new TelaLogin(Supermercado.listProdutos);
            JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().remove(TelaPrincipalForm.telaControleProdutos);
            janela.add(TelaPrincipalForm.telaLogin, BorderLayout.CENTER);
            janela.pack();
            break;

            case 1 :
            break;
        }
    }//GEN-LAST:event_bt_deslogarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_adicionarCarrinho;
    private javax.swing.JButton bt_deslogar;
    private javax.swing.JButton bt_finalizarCompra;
    private javax.swing.JButton bt_removerCarrinho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_nomeCliente;
    private javax.swing.JLabel lb_totalPagar;
    private javax.swing.JTable tb_carrinho;
    private javax.swing.JTable tb_produtos;
    // End of variables declaration//GEN-END:variables
}
