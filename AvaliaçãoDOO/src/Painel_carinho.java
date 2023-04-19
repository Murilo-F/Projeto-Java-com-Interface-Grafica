
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Painel_carinho extends javax.swing.JPanel {

    DefaultTableModel model;
    ArrayList<Produto> comida, bebida;
    ArrayList<Cadastro> listacadastro;
    String selecionado = null;
    LinkedList<Produto> lista = new LinkedList();
    double totalPreco = 0;
    private String nome;
    private String cpf;

    public Painel_carinho(LinkedList<Produto> lista) {
        initComponents();

        this.lista = lista; // Armazena a lista de produtos passada como parâmetro;

        inicializaTabela();
        atualizaPrecoTotal();
        atualizarTabela();
    }

    //Método para preencher a tabela com os conteúdos da lista de contratados.
    public void inicializaTabela() {
        // Cria um novo modelo de tabela
        model = new DefaultTableModel();
        // Adiciona as colunas na tabela
        model.addColumn("Produto");
        model.addColumn("Preço");
        model.addColumn("Quantidade");

        for (int i = 0; i < this.lista.size(); i++) { //Percorre a lista de produtos inserindo os elementos no modelo.
            Produto produto = lista.get(i);
            model.addRow(new Object[]{produto.getNome(), produto.getPreco(), produto.getQuantidade()});
        }

        jt_produto.setModel(model); // Define o modelo da tabela
    }


    public void atualizaPrecoTotal() {
        totalPreco = 0;
        for (Produto produto : lista) {
            totalPreco += produto.getPreco() * produto.getQuantidade();
        }
        jl_preco.setText("Preço total: " + totalPreco); // Atualiza o texto da JLabel para mostrar o preço total
    }

    public void atualizarTabela() {
        DefaultTableModel model = (DefaultTableModel) jt_produto.getModel();
        model.setRowCount(0); // Remove todas as linhas da tabela
        double total = 0.0; // Variável para calcular o total dos preços

        for (Produto produto : lista) { // Percorre a lista de produtos
            Object[] row = {produto.getNome(), produto.getPreco(), produto.getQuantidade()}; // Cria um array com o nome, preço e quantidade do produto
            model.addRow(row); // Adiciona o array como uma nova linha na tabela
            total += produto.getPreco() * produto.getQuantidade(); // Adiciona o preço do produto ao total
        }

        // Atualiza a JLabel com o total dos preços
        jl_preco.setText(String.format("Total: R$ " + total));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        remover = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jl_preco = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comprar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_produto = new javax.swing.JTable();
        voltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel4.setText("carinho");

        jLabel1.setFont(new java.awt.Font("Source Code Pro Black", 1, 24)); // NOI18N
        jLabel1.setText("Carinho de compras");

        remover.setText("Remover");
        remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel5.setText("compras");

        jl_preco.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Total a pagar");

        comprar.setText("Comprar");
        comprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrinho-carrinho2.png"))); // NOI18N

        jt_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carinho"
            }
        ));
        jt_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_produtoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_produto);

        voltar.setText("voltar");
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(remover, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltar)))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(voltar))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(remover)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerMouseClicked
        // TODO add your handling code here:
        int rowIndex = jt_produto.getSelectedRow();
        if (rowIndex != -1) {
            Produto produto = lista.remove(rowIndex);
            model.removeRow(rowIndex);
            atualizaPrecoTotal(); // Atualiza o preço total quando um produto é removido
            JOptionPane.showMessageDialog(Painel_carinho.this, "Produto " + produto.getNome() + " removido!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_removerMouseClicked

    private void jt_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_produtoMouseClicked
        // TODO add your handling code here:                                        
    }//GEN-LAST:event_jt_produtoMouseClicked

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        // TODO add your handling code here:
        Janela.pb = new Painel_compras();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.pd);
        janela.add(Janela.pb, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_voltarMouseClicked

    private void comprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarMouseClicked
        // TODO add your handling code here:
        StringBuilder mensagem = new StringBuilder();
        double total = 0.0;
        mensagem.append("Cliente: ").append(Cadastro.getNome()).append("\n").append("CPF: ").append(Cadastro.getCpf()).append("\n\n");
        for (int i = 0; i < model.getRowCount(); i++) {
            String nomeProduto = (String) model.getValueAt(i, 0);
            double precoProduto = (double) model.getValueAt(i, 1);
            int quantidadeProduto = (int) model.getValueAt(i, 2);
            mensagem.append("\n").append(nomeProduto).append(" - R$ ").append(precoProduto).append("\t quant: ").append(quantidadeProduto);
            total += precoProduto * quantidadeProduto;
            atualizaPrecoTotal();
        }
        mensagem.append("\nTotal: R$ ").append(total);
        //mensagem.append("\n CPC: ").append();
        JOptionPane.showMessageDialog(this, mensagem.toString(), "Compra realizada!", JOptionPane.INFORMATION_MESSAGE);
        atualizaPrecoTotal();
    }//GEN-LAST:event_comprarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jl_preco;
    private javax.swing.JTable jt_produto;
    private javax.swing.JButton remover;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
