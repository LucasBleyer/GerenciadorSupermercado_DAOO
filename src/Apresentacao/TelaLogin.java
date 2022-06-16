
package Apresentacao;

import Dominio.ModuloPessoa.Administrador;
import Dominio.ModuloPessoa.Cliente;
import Dominio.ModuloPessoa.Pessoa;
import Dominio.ModuloSupermercado.Produto;
import Dominio.ModuloSupermercado.Supermercado;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaLogin extends javax.swing.JPanel {

    public TelaLogin(ArrayList<Produto> listProdutos) {
        initComponents();
        
        listProdutos = new ArrayList();
        
        Supermercado.listPessoas = new ArrayList();
        
        panel_login_adm.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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
        jLabel12 = new javax.swing.JLabel();
        bt_entrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("< Supermercado");

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("do Desenvolvedor />");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("/");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(337, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Informe seu Nome: ");

        tf_nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_nome.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Informe seu CPF: ");

        tf_cpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_cpf.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo de Identificação: ");

        buttonGroup1.add(rb_adm);
        rb_adm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb_adm.setForeground(new java.awt.Color(0, 0, 0));
        rb_adm.setText("Administrador");
        rb_adm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_admItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rb_cliente);
        rb_cliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb_cliente.setForeground(new java.awt.Color(0, 0, 0));
        rb_cliente.setText("Cliente");
        rb_cliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_clienteItemStateChanged(evt);
            }
        });

        panel_login_adm.setForeground(new java.awt.Color(0, 0, 0));
        panel_login_adm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Login:");
        panel_login_adm.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        tf_login_adm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panel_login_adm.add(tf_login_adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 240, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Senha:");
        panel_login_adm.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        tf_senha_adm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panel_login_adm.add(tf_senha_adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 240, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/verified_user_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        panel_login_adm.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        bt_entrar.setBackground(new java.awt.Color(255, 255, 255));
        bt_entrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_entrar.setForeground(new java.awt.Color(0, 0, 0));
        bt_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/start_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        bt_entrar.setText("Entrar");
        bt_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_entrarMouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/dialpad_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/person_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(43, 43, 43)
                                    .addComponent(rb_adm)
                                    .addGap(62, 62, 62)
                                    .addComponent(rb_cliente))))
                        .addComponent(panel_login_adm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rb_adm)
                    .addComponent(rb_cliente))
                .addGap(26, 26, 26)
                .addComponent(panel_login_adm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(bt_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    public Pessoa obterAdministrador(){
        String nome_adm = tf_nome.getText();
        String cpf_adm = tf_cpf.getText();
            
        Pessoa administrador = new Administrador(nome_adm, cpf_adm);
        Supermercado.listPessoas.add(administrador);
        
        return administrador;
    }
    
    public Pessoa obterCliente(){
        String nome_cliente = tf_nome.getText();
        String cpf_cliente = tf_cpf.getText();

        Pessoa cliente = new Cliente(nome_cliente, cpf_cliente);
        Supermercado.listPessoas.add(cliente);
        
        return cliente;
    }
    
    private void rb_admItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_admItemStateChanged
        
        panel_login_adm.setVisible(true);
        tf_login_adm.setText(tf_nome.getText().toUpperCase());
    }//GEN-LAST:event_rb_admItemStateChanged

    private void rb_clienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_clienteItemStateChanged

        panel_login_adm.setVisible(false);
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
            
        try
        {
            if(!tf_nome.getText().isEmpty() && !tf_cpf.getText().isEmpty() && !tf_login_adm.getText().isEmpty() && !tf_senha_adm.getText().isEmpty())
            {   
                TelaPrincipalForm.telaControleProdutos = new TelaControleProdutos(Supermercado.listProdutos);  
                JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
                janela.getContentPane().remove(TelaPrincipalForm.telaLogin);
                janela.add(TelaPrincipalForm.telaControleProdutos, BorderLayout.CENTER); 
                janela.pack();
            }
            else
            {
                throw new Exception();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "É necessário completar o cadastro e fazer o login para acessar o sistema como Administrador", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void validadorCliente(){
        
        try
        {
            if(!tf_nome.getText().isEmpty() && !tf_cpf.getText().isEmpty())
            {
                bt_entrar.setEnabled(true);
                
                TelaPrincipalForm.telaCompraProdutos = new TelaCompraProdutos(Supermercado.listProdutos);  
                JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
                janela.getContentPane().remove(TelaPrincipalForm.telaLogin);
                janela.add(TelaPrincipalForm.telaCompraProdutos, BorderLayout.CENTER); 
                janela.pack();
            }
            else
            {
                throw new Exception();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "É necessário completar o cadastro para acessar o sistema como Cliente", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_entrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
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
