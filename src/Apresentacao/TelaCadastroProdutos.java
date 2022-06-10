
package Apresentacao;

import Dominio.ModuloSupermercado.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaCadastroProdutos extends javax.swing.JPanel {

    ArrayList<Produto> listProdutos;
    
    public TelaCadastroProdutos(ArrayList<Produto> listProdutos) {
        initComponents();
        
        listProdutos = this.listProdutos;
    }
    
    public Produto obterProduto(){
        
        String nome = tf_nome.getText();
        double preco = Double.valueOf(tf_preco.getText());
        
        Produto produto = new Produto(nome, preco);
        return produto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_preco = new javax.swing.JTextField();
        bt_cadastrar = new javax.swing.JButton();

        jLabel1.setText("Cadastrar Novo Produto");

        jLabel2.setText("Informe o Nome do Produto: ");

        jLabel3.setText("Informe o Preço do Produto: ");

        bt_cadastrar.setText("Cadastrar");
        bt_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(tf_nome)
                            .addComponent(jLabel3)
                            .addComponent(tf_preco, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cadastrarMouseClicked
        
//        try{
//            if (!tf_nome.getText().isEmpty() && !tf_preco.getText().isEmpty()) 
//            {
//                listProdutos.add(obterProduto());
//                limparCampos();
//                
//                for (int i = 0; i < listProdutos.size(); i++)
//                {
//                    JOptionPane.showMessageDialog(null, "O produto " + listProdutos.get(i).getNome() + " foi cadastrado com sucesso!", "Cadastro de Produtos", JOptionPane.INFORMATION_MESSAGE);
//                }
//            } 
//            else
//            {
//                throw new Exception();
//            }
//        }
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos cadastrar um produto!", "Erro!", JOptionPane.ERROR_MESSAGE);
//        }
        
    }//GEN-LAST:event_bt_cadastrarMouseClicked

    public void limparCampos(){

        tf_nome.setText("");
        tf_preco.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_preco;
    // End of variables declaration//GEN-END:variables
}
