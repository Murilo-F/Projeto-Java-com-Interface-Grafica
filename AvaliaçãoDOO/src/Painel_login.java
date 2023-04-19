
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Painel_login extends javax.swing.JPanel {

    static List<Cadastro> listacadastro;


    public Painel_login() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jt_nome = new javax.swing.JTextField();
        adm = new javax.swing.JRadioButton();
        usuario = new javax.swing.JRadioButton();
        proximo3 = new javax.swing.JButton();
        jt_cpf = new javax.swing.JFormattedTextField();

        setForeground(new java.awt.Color(60, 63, 65));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Simplex_IV50", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Bem-vindo(a) ao site");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF:");

        jt_nome.setBackground(new java.awt.Color(153, 153, 153));

        adm.setBackground(new java.awt.Color(0, 153, 204));
        adm.setText("Adiministrador");
        adm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admMouseClicked(evt);
            }
        });

        usuario.setBackground(new java.awt.Color(0, 153, 204));
        usuario.setText("Usuario");
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });

        proximo3.setBackground(new java.awt.Color(0, 255, 255));
        proximo3.setFont(new java.awt.Font("Source Code Pro", 1, 18)); // NOI18N
        proximo3.setForeground(new java.awt.Color(255, 255, 255));
        proximo3.setText("Login");
        proximo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proximo3MouseClicked(evt);
            }
        });

        jt_cpf.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 69, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(adm)
                                .addGap(18, 18, 18)
                                .addComponent(usuario))
                            .addComponent(jt_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(jt_cpf))
                        .addGap(47, 47, 47))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(proximo3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adm)
                    .addComponent(usuario))
                .addGap(18, 18, 18)
                .addComponent(proximo3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void admMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admMouseClicked
        // TODO add your handling code here:
        if (adm.isSelected()) {
            usuario.setEnabled(false);
        } else {
            usuario.setEnabled(true);
        }
    }//GEN-LAST:event_admMouseClicked

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
        // TODO add your handling code here:
        if (usuario.isSelected()) {
            adm.setEnabled(false);
        } else {
            adm.setEnabled(true);
        }
    }//GEN-LAST:event_usuarioMouseClicked

    private void proximo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proximo3MouseClicked
        // TODO add your handling code here:

        String nome = jt_nome.getText();
        String cpf = jt_cpf.getText();

        if (usuario.isSelected()) {
            if (nome.isEmpty() || cpf.isEmpty()) {
                JOptionPane.showMessageDialog(Painel_login.this, "Nome ou CPF não informados");
            } else {
                Cadastro.setNome(nome);
                Cadastro.setCpf(cpf);
                // Verifica se o CPF contém somente números
                if (cpf.matches("[0-9]+")) {
                    Janela.pb = new Painel_compras();
                    JOptionPane.showMessageDialog(Painel_login.this, "Bem-vindo(a) " + nome);
                    Janela janela = (Janela) (JFrame) SwingUtilities.getWindowAncestor(this);
                    janela.getContentPane().remove(Janela.pa);
                    janela.add(Janela.pb, BorderLayout.CENTER);
                    janela.pack();
                } else {
                    JOptionPane.showMessageDialog(Painel_login.this, "CPF inválido");
                }
            }
        }

        if (adm.isSelected()) {
            if (nome.equals("murilo") && cpf.equals("09365652928")) {
                Janela.pc = new Painel_cadastro(nome);
                Janela janela = (Janela) (JFrame) SwingUtilities.getWindowAncestor(this);
                janela.getContentPane().remove(Janela.pa);
                janela.add(Janela.pc, BorderLayout.CENTER);
                janela.pack();
                JOptionPane.showMessageDialog(Painel_login.this, "Login bem sucedido");
            } else {
                JOptionPane.showMessageDialog(Painel_login.this, "Nome ou CPF não informados");
            }
        }
    }//GEN-LAST:event_proximo3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField jt_cpf;
    private javax.swing.JTextField jt_nome;
    private javax.swing.JButton proximo3;
    private javax.swing.JRadioButton usuario;
    // End of variables declaration//GEN-END:variables
}
