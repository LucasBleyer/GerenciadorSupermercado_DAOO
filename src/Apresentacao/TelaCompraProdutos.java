
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

    DefaultTableModel modelProdutos, modelCarrinho;
    String selecionado = null;

    double contTotalPagar = 0;
    
    public TelaCompraProdutos(ArrayList<Produto> listProdutos, Pessoa cliente) {
        initComponents();
        
        //lb_nomeCliente.setText(.getNome());
        
        listProdutos = new ArrayList();
        
        TelaPrincipalForm.listCarrinho = new ArrayList<Produto>();
        
        this.modelProdutos = (DefaultTableModel)this.tb_produtos.getModel();
        carregarTabelaProdutos();    
    }
    
    public void carregarTabelaProdutos(){
        
        ((DefaultTableModel) tb_produtos.getModel()).setRowCount(0);
        
        for(int i = 0; i < TelaPrincipalForm.listProdutos.size(); i++)
        { 
           this.modelProdutos.insertRow(i, new Object[]{TelaPrincipalForm.listProdutos.get(i).getNome(), TelaPrincipalForm.listProdutos.get(i).getPreco()});
        }
        this.tb_produtos.setModel(modelProdutos);
    }
    
    public void carregarTabelaCarrinho(){
        
        ((DefaultTableModel) tb_carrinho.getModel()).setRowCount(0);
        
        for(int i = 0; i < TelaPrincipalForm.listCarrinho.size(); i++)
        { 
           this.modelCarrinho.insertRow(i, new Object[]{TelaPrincipalForm.listCarrinho.get(i).getNome()});
        }
        this.tb_carrinho.setModel(modelCarrinho);
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
        jLabel2 = new javax.swing.JLabel();
        lb_totalPagar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_carrinho = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        bt_removerCarrinho = new javax.swing.JButton();
        bt_finalizarCompra = new javax.swing.JButton();

        jLabel1.setText("Selecione os Produtos que deseja adicionar ao Carrinho de Compras");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Usuário:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        lb_nomeCliente.setText("<nomeCliente>");
        jPanel1.add(lb_nomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        bt_deslogar.setText("Deslogar");
        bt_deslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_deslogarMouseClicked(evt);
            }
        });
        jPanel1.add(bt_deslogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt_removerCarrinho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_finalizarCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(bt_adicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(lb_totalPagar))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_adicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_totalPagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_removerCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_finalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_deslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_deslogarMouseClicked

        switch(JOptionPane.showConfirmDialog(null, "Você têm certeza disso?", "Deslogar ", JOptionPane.YES_NO_OPTION))
        {
            case 0:
            TelaPrincipalForm.telaLogin = new TelaLogin(TelaPrincipalForm.listProdutos);
            JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().remove(TelaPrincipalForm.telaCompraProdutos);
            janela.add(TelaPrincipalForm.telaLogin, BorderLayout.CENTER);
            janela.pack();
            break;

            case 1:
            break;
        }
    }//GEN-LAST:event_bt_deslogarMouseClicked

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
                for(int i = 0; i< TelaPrincipalForm.listProdutos.size(); i++)
                {  
                    if(this.selecionado.equals(TelaPrincipalForm.listProdutos.get(i).getNome()))
                    {  
                        p = (Produto) TelaPrincipalForm.listProdutos.get(i);
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
        
            for(int i=0; i<TelaPrincipalForm.listProdutos.size(); i++)
            {  
                if(selecionado.equals(TelaPrincipalForm.listProdutos.get(i).getNome()))
                { 
                    p = (Produto) TelaPrincipalForm.listProdutos.get(i);
                    
                    contTotalPagar += TelaPrincipalForm.listProdutos.get(i).getPreco();
                    lb_totalPagar.setText("R$" + contTotalPagar);   
                }
            }
            if(p != null)
            {
               TelaPrincipalForm.listCarrinho.add(p);
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
                            for(int i = 0; i < TelaPrincipalForm.listCarrinho.size(); i++)
                            {  
                                if(this.selecionado.equals(TelaPrincipalForm.listCarrinho.get(i).getNome()))
                                {  
                                    this.modelCarrinho.removeRow(i);
                                    produto = (Produto) TelaPrincipalForm.listCarrinho.remove(i);
                                    
                                    this.modelCarrinho = (DefaultTableModel)this.tb_carrinho.getModel();
                                    carregarTabelaCarrinho();
                                    
                                    contTotalPagar -= TelaPrincipalForm.listCarrinho.get(i).getPreco();
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
        
        TelaPrincipalForm.telaNotaFiscal = new TelaNotaFiscal(TelaPrincipalForm.listCarrinho, contTotalPagar);
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(TelaPrincipalForm.telaCompraProdutos);
        janela.add(TelaPrincipalForm.telaNotaFiscal, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_finalizarCompraMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_adicionarCarrinho;
    private javax.swing.JButton bt_deslogar;
    private javax.swing.JButton bt_finalizarCompra;
    private javax.swing.JButton bt_removerCarrinho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_nomeCliente;
    private javax.swing.JLabel lb_totalPagar;
    private javax.swing.JTable tb_carrinho;
    private javax.swing.JTable tb_produtos;
    // End of variables declaration//GEN-END:variables
}
