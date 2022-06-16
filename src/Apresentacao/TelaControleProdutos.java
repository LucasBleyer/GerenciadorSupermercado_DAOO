
package Apresentacao;


import Dominio.ModuloSupermercado.Produto;
import Dominio.ModuloSupermercado.Supermercado;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TelaControleProdutos extends javax.swing.JPanel {

    DefaultTableModel model;
    
    String selecionado = null;

    public TelaControleProdutos(ArrayList<Produto> listProdutos) {
        
        initComponents();

        listProdutos = new ArrayList();
        
        for (int i = 0; i < Supermercado.listPessoas.size(); i++)
        {
            String nome = Supermercado.listPessoas.get(i).getNome();
            lb_nomeAdministrador.setText(nome);
        }  
        
        this.model = (DefaultTableModel)this.tb_produtos.getModel();
        carregarTabela();
        
        validadorBotoesListaVazia();
    }
    
    public void carregarTabela(){
        
        ((DefaultTableModel) tb_produtos.getModel()).setRowCount(0);
        
        for(int i = 0; i < Supermercado.listProdutos.size(); i++)
        { 
           this.model.insertRow(i, new Object[]{Supermercado.listProdutos.get(i).getNome(), Supermercado.listProdutos.get(i).getPreco()});
        }
        this.tb_produtos.setModel(model);
    }
    
    public void validadorBotoesListaVazia(){
        
        if(Supermercado.listProdutos.isEmpty())
        {
            bt_excluir.setEnabled(false);
            bt_editar.setEnabled(false);
        }
        else
        {
            bt_excluir.setEnabled(true);
            bt_editar.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bt_cadastrar = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_produtos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lb_nomeAdministrador = new javax.swing.JLabel();
        bt_deslogar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Controle de Produtos");

        bt_cadastrar.setBackground(new java.awt.Color(255, 255, 255));
        bt_cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_cadastrar.setForeground(new java.awt.Color(0, 0, 0));
        bt_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/add_circle_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        bt_cadastrar.setText("Cadastrar Produtos");
        bt_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastrarMouseClicked(evt);
            }
        });

        bt_editar.setBackground(new java.awt.Color(255, 255, 255));
        bt_editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_editar.setForeground(new java.awt.Color(0, 0, 0));
        bt_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/edit_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        bt_editar.setText("Editar Produtos");
        bt_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_editarMouseClicked(evt);
            }
        });

        bt_excluir.setBackground(new java.awt.Color(255, 255, 255));
        bt_excluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_excluir.setForeground(new java.awt.Color(0, 0, 0));
        bt_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/delete_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        bt_excluir.setText("Excluir Produtos");
        bt_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_excluirMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        tb_produtos.setBackground(new java.awt.Color(255, 255, 255));
        tb_produtos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tb_produtos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_produtos.setForeground(new java.awt.Color(0, 0, 0));
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Usuário:");

        lb_nomeAdministrador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_nomeAdministrador.setForeground(new java.awt.Color(0, 0, 0));
        lb_nomeAdministrador.setText("<nomeAdministrador>");

        bt_deslogar.setBackground(new java.awt.Color(255, 255, 255));
        bt_deslogar.setForeground(new java.awt.Color(255, 255, 255));
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
                .addComponent(lb_nomeAdministrador))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_deslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lb_nomeAdministrador)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("< Supermercado");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("do Desenvolvedor />");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(150, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(170, 170, 170))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(99, 99, 99))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cadastrarMouseClicked

        TelaPrincipalForm.telaCadastroProdutos = new TelaCadastroProdutos();  
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(TelaPrincipalForm.telaControleProdutos);
        janela.add(TelaPrincipalForm.telaCadastroProdutos, BorderLayout.CENTER); 
        janela.pack();
        
    }//GEN-LAST:event_bt_cadastrarMouseClicked

    private void bt_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_editarMouseClicked
        
        TelaPrincipalForm.telaEdicaoProdutos = new TelaEdicaoProdutos(Supermercado.listProdutos);  
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(TelaPrincipalForm.telaControleProdutos);
        janela.add(TelaPrincipalForm.telaEdicaoProdutos, BorderLayout.CENTER); 
        janela.pack();
        
    }//GEN-LAST:event_bt_editarMouseClicked

    private void bt_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_excluirMouseClicked
                   
        switch(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o produto", "Exclusão de produtos", JOptionPane.YES_NO_OPTION))
        {
            case 0: 
                    Object temp;
                    int column = 0;
                    int row = this.tb_produtos.getSelectedRow();  
                    temp = this.tb_produtos.getModel().getValueAt(row, column); 
                    Produto produto = null;

                    try{
                        if(temp != null)
                        {
                            this.selecionado = temp.toString();
                            for(int i = 0; i < Supermercado.listProdutos.size(); i++)
                            {  
                                if(this.selecionado.equals(Supermercado.listProdutos.get(i).getNome()))
                                {  
                                    this.model.removeRow(i);
                                    produto = (Produto) Supermercado.listProdutos.remove(i);
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
        validadorBotoesListaVazia();
    }//GEN-LAST:event_bt_excluirMouseClicked

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
            JOptionPane.showMessageDialog(null, "Selecione um Produto da tabela!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tb_produtosMouseClicked

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
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JButton bt_deslogar;
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_nomeAdministrador;
    private javax.swing.JTable tb_produtos;
    // End of variables declaration//GEN-END:variables
}
