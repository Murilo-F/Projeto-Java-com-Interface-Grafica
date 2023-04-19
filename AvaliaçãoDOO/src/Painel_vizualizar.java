
import java.awt.BorderLayout;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;

public class Painel_vizualizar extends javax.swing.JPanel {

    static LinkedList<Produto> listaBebidas = new LinkedList();
    static LinkedList<Produto> listaComidas = new LinkedList();

    private String nome;
    private double preco;
    private int quantidade;

    public Painel_vizualizar() {
        initComponents();
        atualizaJComboBox();
    }

    public void limpaFormulario() {
        jt_nome2.setText("");
        jt_preco2.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cadastrar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jt_preco2 = new javax.swing.JTextField();
        jt_nome2 = new javax.swing.JTextField();
        cb_categoria = new javax.swing.JComboBox<>();
        remover1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jb_produtos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        editar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Txt_IV25", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Amazon Compras");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrinho-carrinho.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        cadastrar.setText("cadastrar");
        cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarMouseClicked(evt);
            }
        });

        voltar.setText("voltar");
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jt_preco2.setText("Digite o preço do produto");
        jt_preco2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_preco2MouseClicked(evt);
            }
        });

        jt_nome2.setText("Digite o nome do produto");
        jt_nome2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_nome2MouseClicked(evt);
            }
        });

        cb_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comidas", "Bebidas" }));
        cb_categoria.setSelectedItem(jb_produtos);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_categoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jt_preco2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jt_nome2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(cb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jt_nome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jt_preco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        remover1.setText("remover");
        remover1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remover1MouseClicked(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setText("produtos adicionados");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_produtos, 0, 192, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        editar.setText("editar");
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(remover1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(remover1)
                    .addComponent(editar))
                .addGap(18, 18, 18)
                .addComponent(voltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atualizaJComboBox() {
        // Limpa os itens do JComboBox
        jb_produtos.removeAllItems();

        // Adiciona os itens da lista de comidas ao JComboBox
        for (Produto produto : listaComidas) {
            jb_produtos.addItem(produto.getNome());
        }

        // Adiciona os itens da lista de bebidas ao JComboBox
        for (Produto produto : listaBebidas) {
            jb_produtos.addItem(produto.getNome());
        }
    }

    private void atualizaComboBox() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        // Adiciona os produtos da lista de comidas no modelo do JComboBox
        for (Produto produto : listaComidas) {
            model.addElement(produto.getNome());
        }

        // Adiciona os produtos da lista de bebidas no modelo do JComboBox
        for (Produto produto : listaBebidas) {
            model.addElement(produto.getNome());
        }

        // Atualiza o modelo do JComboBox
        jb_produtos.setModel(model);
    }

    private void cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarMouseClicked
        // Captura o nome e o preço do produto dos campos de texto
        nome = jt_nome2.getText();
        preco = Double.parseDouble(jt_preco2.getText());

        // Captura a opção selecionada no JComboBox
        String categoria = cb_categoria.getSelectedItem().toString();

        if (categoria == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione uma categoria.");
            return;
        }

        if ("Comidas".equals(categoria)) {
            // Cria um JSpinner para permitir a seleção da quantidade do produto
            SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, 1, 100, 1);
            JSpinner spinner = new JSpinner(spinnerModel);
            int opcao = JOptionPane.showOptionDialog(this, spinner, "Quantidade do Produto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            int quantidade = (int) spinner.getValue();
            Produto produto = new Produto(nome, preco, quantidade);
            listaComidas.add(produto);

            System.out.println("categoria: " + categoria + "\nquantidade: " + quantidade + "\n");
        }
        if ("Bebidas".equals(categoria)) {
            // Cria um JSpinner para permitir a seleção da quantidade do produto
            SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, 1, 100, 1);
            JSpinner spinner = new JSpinner(spinnerModel);
            int opcao = JOptionPane.showOptionDialog(this, spinner, "Quantidade do Produto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            int quantidade = (int) spinner.getValue();
            Produto produto = new Produto(nome, preco, quantidade);
            listaBebidas.add(produto);

            System.out.println("categoria: " + categoria + "\nquantidade: " + quantidade + "\n");
        }

        // Limpa os campos de texto após adicionar o produto à lista correspondente
        limpaFormulario();

        atualizaComboBox();
    }//GEN-LAST:event_cadastrarMouseClicked

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        // TODO add your handling code here:
        Janela.pa = new Painel_login();
        Janela janela = (Janela) (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.pe);
        janela.add(Janela.pa, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_voltarMouseClicked

    private void jt_nome2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_nome2MouseClicked
        // TODO add your handling code here:
        if (jt_nome2.isEnabled()) {
            jt_nome2.setText("");
        }
    }//GEN-LAST:event_jt_nome2MouseClicked

    private void jt_preco2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_preco2MouseClicked
        // TODO add your handling code here:
        if (jt_preco2.isEnabled()) {
            jt_preco2.setText("");
        }
    }//GEN-LAST:event_jt_preco2MouseClicked

    private void remover1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remover1MouseClicked
        // TODO add your handling code here:

        /// Remove o produto selecionado do JComboBox
        String produtoSelecionado = jb_produtos.getSelectedItem().toString();

        // Remove o produto da lista de comidas, se existir
        for (Produto produto : listaComidas) {
            if (produto.getNome().equals(produtoSelecionado)) {
                listaComidas.remove(produto);
                break;
            }
        }

        // Remove o produto da lista de bebidas, se existir
        for (Produto produto : listaBebidas) {
            if (produto.getNome().equals(produtoSelecionado)) {
                listaBebidas.remove(produto);
                break;
            }
        }

        // Atualiza o modelo do JComboBox
        atualizaComboBox();
    }//GEN-LAST:event_remover1MouseClicked

    private void editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseClicked
        // TODO add your handling code here:

        String produtoSelecionado = jb_produtos.getSelectedItem().toString();

        // Obter os valores do produto que será editado
        for (Produto produto : listaBebidas) {
            if (produto.getNome().equals(produtoSelecionado)) {
                jt_nome2.setText(nome);
                jt_preco2.setText(String.valueOf(preco));
                listaBebidas.remove(produto);
                break;
            }
        }
        for (Produto produto : listaComidas) {
            if (produto.getNome().equals(produtoSelecionado)) {
                jt_nome2.setText(nome);
                jt_preco2.setText(String.valueOf(preco));
                listaComidas.remove(produto);
                break;
            }
        }
        atualizaComboBox();
    }//GEN-LAST:event_editarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JComboBox<String> cb_categoria;
    private javax.swing.JButton editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox<String> jb_produtos;
    private javax.swing.JTextField jt_nome2;
    private javax.swing.JTextField jt_preco2;
    private javax.swing.JButton remover1;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
