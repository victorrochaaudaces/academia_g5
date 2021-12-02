/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tela.aluno;

import entidade.TipoPlan;
import entidade.User;
import entidadeDao.TipoPlanDao;
import entidadeDao.TipoPlanDaoImpl;
import entidadeDao.UserDao;
import entidadeDao.UserDaoImpl;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class CadastroAluno extends javax.swing.JFrame {

    private User user;
    private UserDao userDao = new UserDaoImpl();
    private List<TipoPlan> planos;

    public CadastroAluno() {
        initComponents();
        pesquisarPlanoCombobox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        varRest_medCadastro = new javax.swing.JTextField();
        lbRest_med = new javax.swing.JLabel();
        varPesoCadastro = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        varAlturaCadastro = new javax.swing.JTextField();
        lbPeso = new javax.swing.JLabel();
        varTelefoneCadastro = new javax.swing.JTextField();
        lbAltura = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        varComboPlan = new javax.swing.JComboBox<>();
        lbPlano = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        varNomecadastro = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        varSobrenomeCadastro = new javax.swing.JTextField();
        varSenhaCadastro = new javax.swing.JPasswordField();
        lbSobrenome = new javax.swing.JLabel();
        varEmailCadastro = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        varEnderecoCadastro = new javax.swing.JTextField();
        lbEndereco = new javax.swing.JLabel();
        varIdadeCadastro = new javax.swing.JTextField();
        lbIdade = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de cadastro do aluno");

        lbRest_med.setText("Restrição medica:");

        lbTelefone.setText("Telefone:");

        lbPeso.setText("Peso:");

        lbAltura.setText("Altura:");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lbPlano.setText("Plano:");

        lbTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Cadastro de aluno");
        lbTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        lbSenha.setText("Senha:");

        lbNome.setText("Nome:");
        lbNome.setToolTipText("");

        lbSobrenome.setText("Sobrenome:");

        lbEmail.setText("E-mail:");

        lbEndereco.setText("Endereço:");

        lbIdade.setText("Idade:");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(varEmailCadastro))
                            .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(varEnderecoCadastro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(varSobrenomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(lbPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPlano, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(lbSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(varPesoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(varTelefoneCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(varAlturaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(varComboPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varSenhaCadastro)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(varNomecadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbRest_med, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(varRest_medCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(varIdadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addGap(18, 18, 18)
                .addComponent(btCadastrar)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(lbPeso)
                    .addComponent(varNomecadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varPesoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSobrenome)
                    .addComponent(lbAltura)
                    .addComponent(varSobrenomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varAlturaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(lbTelefone)
                    .addComponent(varEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varTelefoneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereco)
                    .addComponent(varEnderecoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenha)
                    .addComponent(varSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdade)
                    .addComponent(varIdadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlano)
                    .addComponent(varComboPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRest_med)
                    .addComponent(varRest_medCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btVoltar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        user = new User();
        int linhaSelecionada = varComboPlan.getSelectedIndex();
        TipoPlan tipoPlan = planos.get(--linhaSelecionada);
        user.setNome(varNomecadastro.getText().trim());
        user.setSobrenome(varSobrenomeCadastro.getText().trim());
        user.setEmail(varEmailCadastro.getText().trim());
        user.setEndereco(varEnderecoCadastro.getText());
        user.setIdade(Integer.parseInt(varIdadeCadastro.getText()));
        user.setRest_med(varRest_medCadastro.getText());
        user.setNum_tel(Long.parseLong(varTelefoneCadastro.getText()));
        user.setPeso(Double.parseDouble(varPesoCadastro.getText()));
        user.setAltura(Double.parseDouble(varAlturaCadastro.getText()));
        user.setTipoPlan(tipoPlan);
        user.setSenha(String.valueOf(varSenhaCadastro.getPassword()));
        try {
            userDao.salvar(user);
            JOptionPane.showMessageDialog(null, "Usuário criado com sucesso! Agora faça login para começar a usar os serviços!");
            new TelaLoginAluno().setVisible(true);
            dispose();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar um aluno! " + e.getMessage());
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        new TelaLoginAluno().setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void pesquisarPlanoCombobox() {
        TipoPlanDao tipoPlanDao = new TipoPlanDaoImpl();
        try {
            planos = tipoPlanDao.pesquisarTodo();
            carregarComboPlan(planos);
        } catch (Exception e) {
            System.out.println("Erro ao carregar combobox " + e.getMessage());
        }
    }

    private void carregarComboPlan(List<TipoPlan> tipoPlans) {
        varComboPlan.addItem("Selecione um plano...");
        for (TipoPlan tipoPlan : planos) {
            varComboPlan.addItem(tipoPlan.getNomePlan());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel lbAltura;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbIdade;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JLabel lbPlano;
    private javax.swing.JLabel lbRest_med;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbSobrenome;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField varAlturaCadastro;
    private javax.swing.JComboBox<String> varComboPlan;
    private javax.swing.JTextField varEmailCadastro;
    private javax.swing.JTextField varEnderecoCadastro;
    private javax.swing.JTextField varIdadeCadastro;
    private javax.swing.JTextField varNomecadastro;
    private javax.swing.JTextField varPesoCadastro;
    private javax.swing.JTextField varRest_medCadastro;
    private javax.swing.JPasswordField varSenhaCadastro;
    private javax.swing.JTextField varSobrenomeCadastro;
    private javax.swing.JTextField varTelefoneCadastro;
    // End of variables declaration//GEN-END:variables
}
