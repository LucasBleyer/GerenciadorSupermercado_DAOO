
package Apresentacao;

import Dominio.ModuloSupermercado.Produto;
import java.awt.BorderLayout;
import java.util.ArrayList;

public class TelaPrincipalForm extends javax.swing.JFrame {
    
    static TelaAcessoSistema telaAcessoSistema;
    static TelaLogin telaLogin;
    
    static ArrayList<Produto> listProdutos;
    
    static TelaControleProdutos telaControleProdutos;
    static TelaCadastroProdutos telaCadastroProdutos;
    static TelaEdicaoProdutos telaEdicaoProdutos;
    
    static TelaCompraProdutos telaCompraProdutos;
    
    public TelaPrincipalForm() {
        initComponents();
        
        listProdutos = new ArrayList();
        
        telaAcessoSistema = new TelaAcessoSistema(listProdutos);
        
        this.setLayout(new BorderLayout()); 
        this.add(telaAcessoSistema, BorderLayout.CENTER); 
        this.pack(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
