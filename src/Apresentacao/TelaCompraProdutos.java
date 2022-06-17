
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_produtos = new javax.swing.JTable();
        bt_adicionarCarrinho = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Total a pagar: ");

        lb_totalPagar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_totalPagar.setForeground(new java.awt.Color(0, 0, 0));
        lb_totalPagar.setText("<totalPagar>");

        tb_carrinho.setBackground(new java.awt.Color(255, 255, 255));
        tb_carrinho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/shopping_cart_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jLabel3.setText("Carrinho");

        bt_removerCarrinho.setBackground(new java.awt.Color(0, 0, 0));
        bt_removerCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_removerCarrinho.setForeground(new java.awt.Color(255, 255, 255));
        bt_removerCarrinho.setText("Remover do Carrinho");
        bt_removerCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_removerCarrinhoMouseClicked(evt);
            }
        });

        bt_finalizarCompra.setBackground(new java.awt.Color(0, 0, 0));
        bt_finalizarCompra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_finalizarCompra.setForeground(new java.awt.Color(255, 255, 255));
        bt_finalizarCompra.setText("Finalizar Compra");
        bt_finalizarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_finalizarCompraMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/shopping_cart_checkout_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/delete_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Usuário:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 10, -1, -1));

        lb_nomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_nomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        lb_nomeCliente.setText("<nomeAdministrador>");
        jPanel1.add(lb_nomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        bt_deslogar.setBackground(new java.awt.Color(255, 255, 255));
        bt_deslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/power_settings_new_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        bt_deslogar.setBorder(null);
        bt_deslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_deslogarMouseClicked(evt);
            }
        });
        jPanel1.add(bt_deslogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/attach_money_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        tb_produtos.setBackground(new java.awt.Color(255, 255, 255));
        tb_produtos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                false, false
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

        bt_adicionarCarrinho.setBackground(new java.awt.Color(255, 255, 255));
        bt_adicionarCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_adicionarCarrinho.setForeground(new java.awt.Color(0, 0, 0));
        bt_adicionarCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/add_circle_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        bt_adicionarCarrinho.setText("Adicionar ao Carrinho");
        bt_adicionarCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_adicionarCarrinhoMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("< Supermercado");

        jLabel10.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("do Desenvolvedor />");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(86, 86, 86))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_adicionarCarrinho))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel9)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_adicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_totalPagar)
                                            .addComponent(jLabel2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bt_removerCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                            .addComponent(bt_finalizarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(79, 79, 79))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_totalPagar)))
                        .addGap(294, 294, 294)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_removerCarrinho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_finalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
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
                                    contTotalPagar -= Supermercado.listCarrinho.get(i).getPreco();
                                    lb_totalPagar.setText("R$ " + contTotalPagar);
                                    
                                    this.modelCarrinho.removeRow(i);
                                    produto = (Produto) Supermercado.listCarrinho.remove(i);
                                    
                                    this.modelCarrinho = (DefaultTableModel)this.tb_carrinho.getModel();
                                    carregarTabelaCarrinho();
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
                janela.getContentPane().removeAll();
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_nomeCliente;
    private javax.swing.JLabel lb_totalPagar;
    private javax.swing.JTable tb_carrinho;
    private javax.swing.JTable tb_produtos;
    // End of variables declaration//GEN-END:variables
}
