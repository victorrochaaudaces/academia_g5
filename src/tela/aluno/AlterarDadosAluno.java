/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tela.aluno;

import entidade.TipoPlan;
import entidadeDao.UserDao;
import entidade.User;
import entidadeDao.TipoPlanDao;
import entidadeDao.TipoPlanDaoImpl;

/**
 *
 * @author victo
 */
import entidadeDao.UserDaoImpl;
import java.util.List;
import javax.swing.JOptionPane;

public class AlterarDadosAluno extends javax.swing.JFrame {

    private User user;
    private UserDao userDao = new UserDaoImpl();
    private List<TipoPlan> planos;
    private int matricula;

    /**
     * Creates new form CadUsuario
     */
    public AlterarDadosAluno() {
        initComponents();
        pesquisarPlanoCombobox();
    }
    
    

    public AlterarDadosAluno(User user) {
        initComponents();
        this.user = user;
        varNome.setText(user.getNome());
        varSobrenome.setText(user.getSobrenome());
        varEmail.setText(user.getEmail());
        varEndereco.setText(user.getEndereco());
        varIdade.setText(Integer.toString(user.getIdade()));
        varAltura.setText(Double.toString(user.getAltura()));
        varRest_med.setText(user.getRest_med());
        varPeso.setText(Double.toString(user.getPeso()));
        varTelefone.setText(Long.toString(user.getNum_tel()));
        pesquisarPlanoCombobox();
        varComboPlan.setSelectedItem(user.getTipoPlan().getNomePlan());
        varSenha.setText(user.getSenha());
        matricula = user.getMatricula();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbSobrenome = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbIdade = new javax.swing.JLabel();
        lbRest_med = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbPeso = new javax.swing.JLabel();
        lbAltura = new javax.swing.JLabel();
        varComboPlan = new javax.swing.JComboBox<>();
        varNome = new javax.swing.JTextField();
        varSobrenome = new javax.swing.JTextField();
        varEmail = new javax.swing.JTextField();
        varEndereco = new javax.swing.JTextField();
        varIdade = new javax.swing.JTextField();
        varRest_med = new javax.swing.JTextField();
        varPeso = new javax.swing.JTextField();
        varAltura = new javax.swing.JTextField();
        varTelefone = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();
        lbPlano = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        varSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de cadastro");

        lbTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Dados de cadastro do aluno");
        lbTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        lbNome.setText("Nome:");
        lbNome.setToolTipText("");

        lbSobrenome.setText("Sobrenome:");

        lbEmail.setText("E-mail:");

        lbEndereco.setText("Endereço:");

        lbIdade.setText("Idade:");

        lbRest_med.setText("Restrição medica:");

        lbTelefone.setText("Telefone:");

        lbPeso.setText("Peso:");

        lbAltura.setText("Altura:");

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        lbPlano.setText("Plano:");

        lbSenha.setText("Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAlterar)
                        .addGap(231, 231, 231))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(358, 358, 358))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(varEmail))
                                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(varEndereco))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(varSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(lbPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPlano, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(lbSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(varPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(varTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(varAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(varComboPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varSenha)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(varIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbRest_med, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(varRest_med, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(lbPeso)
                    .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSobrenome)
                    .addComponent(lbAltura)
                    .addComponent(varSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(lbTelefone)
                    .addComponent(varEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereco)
                    .addComponent(varEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenha)
                    .addComponent(varSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdade)
                    .addComponent(varIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlano)
                    .addComponent(varComboPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRest_med)
                    .addComponent(varRest_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btAlterar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
//        user = new User();
        int linhaSelecionada = varComboPlan.getSelectedIndex();
        TipoPlan tipoPlan = planos.get(--linhaSelecionada);
        user.setTipoPlan(tipoPlan);
        user.setNome(varNome.getText().trim());
        user.setSobrenome(varSobrenome.getText().trim());
        user.setEmail(varEmail.getText().trim());
        user.setNum_tel(Long.parseLong(varTelefone.getText()));
        user.setAltura(Double.parseDouble(varAltura.getText()));
        user.setPeso(Double.parseDouble(varPeso.getText()));
        user.setEndereco(varEndereco.getText());
        user.setIdade(Integer.parseInt(varIdade.getText()));
        user.setSenha(String.valueOf(varSenha.getPassword()));
        user.setMatricula(matricula);
        user.setRest_med(varRest_med.getText());
        try {
            userDao.alterar(user);
            JOptionPane.showMessageDialog(null, "Os dados do aluno forma alterados com sucesso");
            new TelaLoginAluno().setVisible(true);
            dispose();
        } catch (Exception e) {
            System.out.println("Erro ao alterar dados do usuario " + e.getMessage());
        }
    }//GEN-LAST:event_btAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarDadosAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarDadosAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarDadosAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarDadosAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarDadosAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
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
    private javax.swing.JTextField varAltura;
    private javax.swing.JComboBox<String> varComboPlan;
    private javax.swing.JTextField varEmail;
    private javax.swing.JTextField varEndereco;
    private javax.swing.JTextField varIdade;
    private javax.swing.JTextField varNome;
    private javax.swing.JTextField varPeso;
    private javax.swing.JTextField varRest_med;
    private javax.swing.JPasswordField varSenha;
    private javax.swing.JTextField varSobrenome;
    private javax.swing.JTextField varTelefone;
    // End of variables declaration//GEN-END:variables
}
