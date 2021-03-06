/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import tela.funcionario.TelaLoginFuncionario;
import tela.aluno.TelaLoginAluno;
import tela.aluno.CadastroAluno;
import javax.swing.JOptionPane;

/**
 *
 * @author victor.rocha
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTituloHome = new javax.swing.JLabel();
        btLogarAluno = new javax.swing.JButton();
        btLogarFuncionario = new javax.swing.JButton();
        lbNotifi = new javax.swing.JLabel();
        btCriarCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Home");

        lbTituloHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTituloHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloHome.setText("Academia Sesc");

        btLogarAluno.setText("Aluno");
        btLogarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogarAlunoActionPerformed(evt);
            }
        });

        btLogarFuncionario.setText("Funcionário");
        btLogarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogarFuncionarioActionPerformed(evt);
            }
        });

        lbNotifi.setText("Não tem login? Faça agora mesmo o seu!");

        btCriarCadastro.setText("Cadastre-se");
        btCriarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTituloHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btLogarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btLogarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNotifi)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btCriarCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTituloHome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLogarAluno)
                    .addComponent(btLogarFuncionario))
                .addGap(18, 18, 18)
                .addComponent(lbNotifi)
                .addGap(18, 18, 18)
                .addComponent(btCriarCadastro)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLogarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogarAlunoActionPerformed
        JOptionPane.showMessageDialog(null, "Agora faça login para acessar os serviços da academia!");
        new TelaLoginAluno().setVisible(true);
        dispose();


    }//GEN-LAST:event_btLogarAlunoActionPerformed

    private void btLogarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogarFuncionarioActionPerformed
        JOptionPane.showMessageDialog(null, "Agora faça login para acessar a area de funcionário do sistema!");
        new TelaLoginFuncionario().setVisible(true);
        dispose();
    }//GEN-LAST:event_btLogarFuncionarioActionPerformed

    private void btCriarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarCadastroActionPerformed
        new CadastroAluno().setVisible(true);
        dispose();
    }//GEN-LAST:event_btCriarCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCriarCadastro;
    private javax.swing.JButton btLogarAluno;
    private javax.swing.JButton btLogarFuncionario;
    private javax.swing.JLabel lbNotifi;
    private javax.swing.JLabel lbTituloHome;
    // End of variables declaration//GEN-END:variables
}
