
import java.awt.BorderLayout;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;

public class Painel_compras extends javax.swing.JPanel {

    DefaultListModel<String> model, model2;
    LinkedList<Produto> lista = new LinkedList();
    LinkedList<Produto> listaAux;
    LinkedList<Produto> listaAux2;

    public Painel_compras() {
        initComponents();

        listaAux = Painel_vizualizar.listaComidas;
        listaAux2 = Painel_vizualizar.listaBebidas;

        this.model = new DefaultListModel();
        this.model2 = new DefaultListModel();

        // Define os modelos para as listas de comidas e bebidas
        bebida.setModel(model2);
        comida.setModel(model);

        // Atualiza as listas com os produtos das listas de comidas e bebidas
        //comida
        criaLista(listaAux, model);
        //bebida
        criaLista(listaAux2, model2);

    }

    private void criaLista(List<Produto> lista, DefaultListModel<String> model) {

        // Adiciona os nomes dos produtos ao modelo
        for (Produto p : lista) {
            model.addElement(p.getNome());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtable_nomes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bebida = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        comida = new javax.swing.JList<>();
        jb_adicionar = new javax.swing.JButton();
        jl_preco = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        carinho = new javax.swing.JButton();
        jl_quantidade = new javax.swing.JLabel();

        jScrollPane4.setViewportView(jList4);

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel6.setText("Comidas");

        jtable_nomes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_nomes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_nomesMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jtable_nomes);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Txt_IV25", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Amazon Compras");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrinho-carrinho.png"))); // NOI18N

        voltar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        voltar.setText("Voltar");
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        bebida.setBorder(new javax.swing.border.MatteBorder(null));
        bebida.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bebida.setForeground(new java.awt.Color(51, 51, 51));
        bebida.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        bebida.setSelectionBackground(new java.awt.Color(153, 255, 255));
        bebida.setSelectionForeground(new java.awt.Color(0, 0, 0));
        bebida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bebidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bebida);

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel2.setText("Bebidas");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel3.setText("Comidas");

        comida.setBorder(new javax.swing.border.MatteBorder(null));
        comida.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        comida.setForeground(new java.awt.Color(51, 51, 51));
        comida.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        comida.setSelectionBackground(new java.awt.Color(153, 255, 255));
        comida.setSelectionForeground(new java.awt.Color(0, 0, 0));
        comida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comidaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(comida);

        jb_adicionar.setText("Adicionar ao Carinho");
        jb_adicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_adicionarMouseClicked(evt);
            }
        });

        jl_preco.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/501200_cubiertos_fork_knive_spoon_icon.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/501212_cafe_coffee_cup_taza_icon.png"))); // NOI18N

        carinho.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        carinho.setText("Carinho");
        carinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carinhoMouseClicked(evt);
            }
        });

        jl_quantidade.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jb_adicionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_preco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carinho, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jl_quantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28)
                        .addComponent(jl_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_adicionar)
                    .addComponent(carinho))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtable_nomesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_nomesMouseClicked

    }//GEN-LAST:event_jtable_nomesMouseClicked

    private void carinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carinhoMouseClicked

        Janela.pd = new Painel_carinho(this.lista);
        Janela janela = (Janela) (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.pb);
        janela.add(Janela.pd, BorderLayout.CENTER);
        janela.pack();

    }//GEN-LAST:event_carinhoMouseClicked

    private void jb_adicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_adicionarMouseClicked
        // Verifica se algum item foi selecionado nas listas de comidas ou bebidas
        int selectedIndexComida = comida.getSelectedIndex();

        int selectedIndexBebida = bebida.getSelectedIndex();

        if (selectedIndexComida == -1 && selectedIndexBebida == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto para adicionar à lista de compras.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (selectedIndexComida != -1) { // Se um item de comida foi selecionado
            if (listaAux.isEmpty()) {
                JOptionPane.showMessageDialog(this, "A lista de bebidas está vazia.", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                Produto produto2 = listaAux.get(selectedIndexComida); // Recupera o produto da lista de comidas

                // Cria um JSpinner para permitir a seleção da quantidade do produto
                SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, 1, produto2.getQuantidade(), 1);
                JSpinner spinner = new JSpinner(spinnerModel);

                // Mostra o JSpinner em um JOptionPane para que o usuário possa selecionar a quantidade
                int opcao = JOptionPane.showOptionDialog(this, spinner, "Quantidade do Produto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (opcao == JOptionPane.OK_OPTION) { // Se o usuário clicou em OK
                    int quantidade = (int) spinner.getValue(); // Recupera o valor selecionado no JSpinner
                    if (quantidade <= produto2.getQuantidade()) {
                        // Cria um novo produto com a quantidade selecionada e adiciona na lista de compras
                        Produto produtoSelecionado2 = new Produto(produto2.getNome(), produto2.getPreco(), quantidade);
                        lista.add(produtoSelecionado2);

                        // Reduz a quantidade do produto de acordo com o valor selecionado no JSpinner
                        produto2.setQuantidade(produto2.getQuantidade() - quantidade);

                        // Atualiza a lista de comidas com o produto modificado
                        listaAux.set(selectedIndexComida, produto2);

                        // Remove o produto da lista de comidas se a quantidade for 0
                        if (produto2.getQuantidade() == 0) {
                            listaAux.remove(selectedIndexComida);
                            model.remove(selectedIndexComida);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "A quantidade selecionada é maior do que a disponível.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } else if (selectedIndexBebida != -1) { // Se um item de bebida foi selecionado
            if (listaAux2.isEmpty()) {
                JOptionPane.showMessageDialog(this, "A lista de bebidas está vazia.", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                Produto produto = listaAux2.get(selectedIndexBebida); // Recupera o produto da lista de bebidas

                // Cria um JSpinner para permitir a seleção da quantidade do produto
                SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, 1, produto.getQuantidade(), 1);
                JSpinner spinner = new JSpinner(spinnerModel);

                // Mostra o JSpinner em um JOptionPane para que o usuário possa selecionar a quantidade
                int opcao = JOptionPane.showOptionDialog(this, spinner, "Quantidade do Produto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (opcao == JOptionPane.OK_OPTION) { // Se o usuário clicou em OK
                    int quantidade = (int) spinner.getValue(); // Recupera o valor selecionado no JSpinner
                    if (quantidade <= produto.getQuantidade()) {
                        // Cria um novo produto com a quantidade selecionada e adiciona na lista de compras
                        Produto produtoSelecionado = new Produto(produto.getNome(), produto.getPreco(), quantidade);
                        lista.add(produtoSelecionado);

                        // Reduz a quantidade do produto de acordo com o valor selecionado no JSpinner
                        produto.setQuantidade(produto.getQuantidade() - quantidade);

                        // Atualiza a lista de bebidas com o produto modificado
                        listaAux2.set(selectedIndexBebida, produto);

                        // Remove o produto da lista de bebidas se a quantidade for 0
                        if (produto.getQuantidade() == 0) {
                            listaAux2.remove(selectedIndexBebida);
                            model2.remove(selectedIndexBebida);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "A quantidade selecionada é maior do que a disponível.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_jb_adicionarMouseClicked

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        // TODO add your handling code here:
        Janela.pa = new Painel_login();
        Janela janela = (Janela) (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.pb);
        janela.add(Janela.pa, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_voltarMouseClicked

    private void bebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bebidaMouseClicked
        // TODO add your handling code here:
        int selectedIndexC = bebida.getSelectedIndex();
        if (selectedIndexC != -1) { // Verifica se algum item foi selecionado
            comida.clearSelection();
            double preco = Painel_vizualizar.listaBebidas.get(selectedIndexC).getPreco(); // Substitua "Painel_compras.lista" pela sua própria lista de objetos
            int quantidade = Painel_vizualizar.listaBebidas.get(selectedIndexC).getQuantidade();
            jl_preco.setText("Preço: " + preco); // Define o texto do JLabel com o preço
            jl_quantidade.setText("Quantidade: " + quantidade);
        }
    }//GEN-LAST:event_bebidaMouseClicked

    private void comidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comidaMouseClicked
        // TODO add your handling code here:
        int selectedIndexB = comida.getSelectedIndex();
        if (selectedIndexB != -1) { // Verifica se algum item foi selecionado
            bebida.clearSelection();
            double preco = Painel_vizualizar.listaComidas.get(selectedIndexB).getPreco(); // Substitua "Painel_compras.lista" pela sua própria lista de objetos
            int quantidade = Painel_vizualizar.listaComidas.get(selectedIndexB).getQuantidade();
            jl_preco.setText("Preço: " + preco); // Define o texto do JLabel com o preço
            jl_quantidade.setText("Quantidade: " + quantidade);
        }
    }//GEN-LAST:event_comidaMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        bebida.clearSelection();
        comida.clearSelection();
    }//GEN-LAST:event_jPanel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> bebida;
    private javax.swing.JButton carinho;
    private javax.swing.JList<String> comida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jb_adicionar;
    private javax.swing.JLabel jl_preco;
    private javax.swing.JLabel jl_quantidade;
    private javax.swing.JTable jtable_nomes;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
