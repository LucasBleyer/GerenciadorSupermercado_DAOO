
package Apresentacao;

import Dominio.ModuloPessoa.Administrador;
import Dominio.ModuloPessoa.Cliente;
import Dominio.ModuloPessoa.Pessoa;
import Dominio.ModuloSupermercado.Produto;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaLogin extends javax.swing.JPanel {

    public TelaLogin(ArrayList<Produto> listProdutos) {
        initComponents();
        
        listProdutos = new ArrayList();
        
        TelaPrincipalForm.listPessoas = new ArrayList();
        
        panel_login_adm.setVisible(false);
        bt_entrar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_cpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rb_adm = new javax.swing.JRadioButton();
        rb_cliente = new javax.swing.JRadioButton();
        panel_login_adm = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tf_login_adm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_senha_adm = new javax.swing.JPasswordField();
        bt_entrar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jLabel1.setText("Supermercado");

        jLabel2.setText("do Desenvolvedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(245, 245, 245))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(185, 185, 185))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(322, Short.MAX_VALUE))
        );

        jLabel3.setText("Informe seu Nome: ");

        jLabel4.setText("Informe seu CPF: ");

        jLabel5.setText("Tipo de Identificação: ");

        buttonGroup1.add(rb_adm);
        rb_adm.setText("Administrador");
        rb_adm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_admItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rb_cliente);
        rb_cliente.setText("Cliente");
        rb_cliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_clienteItemStateChanged(evt);
            }
        });

        panel_login_adm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Login:");
        panel_login_adm.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));
        panel_login_adm.add(tf_login_adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 6, 250, -1));

        jLabel7.setText("Senha:");
        panel_login_adm.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));
        panel_login_adm.add(tf_senha_adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 250, -1));

        bt_entrar.setText("Entrar");
        bt_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_entrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_login_adm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_adm)
                                        .addGap(62, 62, 62)
                                        .addComponent(rb_cliente))
                                    .addComponent(bt_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rb_adm)
                    .addComponent(rb_cliente))
                .addGap(41, 41, 41)
                .addComponent(panel_login_adm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    public Pessoa obterAdministrador(){
        String nome_adm = tf_nome.getText();
        String cpf_adm = tf_cpf.getText();
            
        Pessoa administrador = new Administrador(nome_adm, cpf_adm);
        TelaPrincipalForm.listPessoas.add(administrador);
        
        return administrador;
    }
    
    public Pessoa obterCliente(){
        String nome_cliente = tf_nome.getText();
        String cpf_cliente = tf_cpf.getText();

        Pessoa cliente = new Cliente(nome_cliente, cpf_cliente);
        TelaPrincipalForm.listPessoas.add(cliente);
        
        return cliente;
    }
    
    private void rb_admItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_admItemStateChanged
        panel_login_adm.setVisible(true);
        tf_login_adm.setText(tf_nome.getText().toUpperCase());
        bt_entrar.setEnabled(true);
    }//GEN-LAST:event_rb_admItemStateChanged

    private void rb_clienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_clienteItemStateChanged
        panel_login_adm.setVisible(false);
        bt_entrar.setEnabled(true);
    }//GEN-LAST:event_rb_clienteItemStateChanged

    private void bt_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_entrarMouseClicked
        
        if(rb_adm.isSelected()== true)
        {
            obterAdministrador();
            validadorAdministrador();
        }
        else
        {
            if (rb_cliente.isSelected() == true)
            {
                obterCliente();
                validadorCliente();
            }
        }
    }//GEN-LAST:event_bt_entrarMouseClicked

    public void validadorAdministrador(){
            
//        try
//        {
            if(!tf_nome.getText().isEmpty() && !tf_cpf.getText().isEmpty() && !tf_login_adm.getText().isEmpty() && !tf_senha_adm.getText().isEmpty())
            {
                TelaPrincipalForm.telaControleProdutos = new TelaControleProdutos(TelaPrincipalForm.listProdutos);  
                JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
                janela.getContentPane().remove(TelaPrincipalForm.telaLogin);
                janela.add(TelaPrincipalForm.telaControleProdutos, BorderLayout.CENTER); 
                janela.pack();
            }
//            else
//            {
//                throw new Exception();
//            }
//        }
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, "É necessário completar o cadastro e fazer o login para acessar o sistema como Administrador", "Erro!", JOptionPane.ERROR_MESSAGE);
//        }
    }
    
    public void validadorCliente(){
        
//        try
//        {
            if(!tf_nome.getText().isEmpty() && !tf_cpf.getText().isEmpty())
            {
                TelaPrincipalForm.telaCompraProdutos = new TelaCompraProdutos(TelaPrincipalForm.listProdutos, obterCliente());  
                JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
                janela.getContentPane().remove(TelaPrincipalForm.telaLogin);
                janela.add(TelaPrincipalForm.telaCompraProdutos, BorderLayout.CENTER); 
                janela.pack();
            }
//            else
//            {
//                throw new Exception();
//            }
//        }
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, "É necessário completar o cadastro para acessar o sistema como Cliente", "Erro!", JOptionPane.ERROR_MESSAGE);
//        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_entrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_login_adm;
    private javax.swing.JRadioButton rb_adm;
    private javax.swing.JRadioButton rb_cliente;
    private javax.swing.JTextField tf_cpf;
    private javax.swing.JTextField tf_login_adm;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JPasswordField tf_senha_adm;
    // End of variables declaration//GEN-END:variables
}
