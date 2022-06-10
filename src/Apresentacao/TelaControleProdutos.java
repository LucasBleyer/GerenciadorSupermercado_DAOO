
package Apresentacao;

import Dominio.ModuloPessoa.Administrador;
import Dominio.ModuloSupermercado.Produto;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TelaControleProdutos extends javax.swing.JPanel {
  
    ArrayList<Produto> listProdutos;
    DefaultTableModel model;
    
    String selecionado = null;
    
    public TelaControleProdutos(Administrador adm) {
        initComponents();
        lb_nomeAdministrador.setText(adm.getNome());
        
        listProdutos = new ArrayList();
        
        this.model = (DefaultTableModel)this.tb_produtos.getModel();
        carregarTabela();
        
        validadorBotoesListaVazia();
    }

    public TelaControleProdutos(ArrayList<Produto> listProdutos) {
        initComponents();
        
        this.listProdutos = listProdutos;
        
        this.model = (DefaultTableModel)this.tb_produtos.getModel();
        carregarTabela();
    }
    
    public void carregarTabela(){
        
        ((DefaultTableModel) tb_produtos.getModel()).setRowCount(0);
        
        for(int i = 0; i < listProdutos.size(); i++)
        { 
           this.model.insertRow(i, new Object[]{listProdutos.get(i).getNome(), listProdutos.get(i).getPreco()});
        }
        this.tb_produtos.setModel(model);
    }
    
    public void validadorBotoesListaVazia(){
        
        if(listProdutos.isEmpty())
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
        jLabel4 = new javax.swing.JLabel();
        lb_nomeAdministrador = new javax.swing.JLabel();
        bt_cadastrar = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_produtos = new javax.swing.JTable();
        bt_deslogar = new javax.swing.JButton();

        jLabel1.setText("Controle de Produtos");

        jLabel4.setText("Usuário:");

        lb_nomeAdministrador.setText("<nomeAdministrador>");

        bt_cadastrar.setText("Cadastrar Produtos");
        bt_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastrarMouseClicked(evt);
            }
        });

        bt_editar.setText("Editar Produtos");
        bt_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_editarMouseClicked(evt);
            }
        });

        bt_excluir.setText("Excluir Produtos");
        bt_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_excluirMouseClicked(evt);
            }
        });

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

        bt_deslogar.setText("Deslogar");
        bt_deslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_deslogarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(458, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_nomeAdministrador)
                        .addGap(52, 52, 52)
                        .addComponent(bt_deslogar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lb_nomeAdministrador)
                    .addComponent(bt_deslogar))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cadastrarMouseClicked

        TelaPrincipalForm.telaCadastroProdutos = new TelaCadastroProdutos(listProdutos);  
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(TelaPrincipalForm.telaControleProdutos);
        janela.add(TelaPrincipalForm.telaCadastroProdutos, BorderLayout.CENTER); 
        janela.pack();
        
    }//GEN-LAST:event_bt_cadastrarMouseClicked

    private void bt_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_editarMouseClicked
        
        TelaPrincipalForm.telaEdicaoProdutos = new TelaEdicaoProdutos(listProdutos);  
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
                            for(int i = 0; i < listProdutos.size(); i++)
                            {  
                                if(this.selecionado.equals(listProdutos.get(i).getNome()))
                                {  
                                    this.model.removeRow(i);
                                    produto = (Produto) listProdutos.remove(i);
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

    private void bt_deslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_deslogarMouseClicked
        
        switch(JOptionPane.showConfirmDialog(null, "Você têm certeza disso?", "Deslogar ", JOptionPane.YES_NO_OPTION))
        {
           case 0 :
                    TelaPrincipalForm.telaLogin = new TelaLogin();
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
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JButton bt_deslogar;
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_nomeAdministrador;
    private javax.swing.JTable tb_produtos;
    // End of variables declaration//GEN-END:variables
}
