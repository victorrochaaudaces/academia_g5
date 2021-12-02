/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.planos;

import entidade.TipoPlan;
import entidadeDao.TipoPlanDao;
import entidadeDao.TipoPlanDaoImpl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victor.rocha
 */
public class PesquisarPlanos extends javax.swing.JFrame {

    private TipoPlanDao tipoPlanDao = new TipoPlanDaoImpl();
    private List<TipoPlan> planos;
    private DefaultTableModel tabelaModelo;
    private TipoPlan tipoPlan;

    /**
     * Creates new form PesquisarPlanos
     */
    public PesquisarPlanos() {
        initComponents();
    }

    private void populatTabela() {
        tabelaModelo = (DefaultTableModel) tabelaPlanos.getModel();
        tabelaModelo.setNumRows(0);
        for (TipoPlan plano : planos) {
            tabelaModelo.addRow(new Object[]{plano.getNomePlan(), "R$" + plano.getMensalidade()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPlanos = new javax.swing.JTable();
        lbNomePlano = new javax.swing.JLabel();
        varNomePlano = new javax.swing.JTextField();
        btPesuisar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar planos");

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Pesquisa de planos da academia");
        lbTitulo.setBorder(new javax.swing.border.MatteBorder(null));

        tabelaPlanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome do plano", "Valor da mensalidade"
            }
        ));
        jScrollPane1.setViewportView(tabelaPlanos);

        lbNomePlano.setText("Nome:");

        btPesuisar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btPesuisar.setText("Pesquisar");
        btPesuisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesuisarActionPerformed(evt);
            }
        });

        btDeletar.setText("Deletar");
        btDeletar.setActionCommand("");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

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
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNomePlano, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(varNomePlano, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btPesuisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btDeletar)
                        .addGap(48, 48, 48)
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAlterar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomePlano)
                    .addComponent(varNomePlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesuisar))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDeletar)
                    .addComponent(btAlterar)
                    .addComponent(btVoltar))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesuisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesuisarActionPerformed
        String nome = varNomePlano.getText().trim();
        if (nome.length() > 2) {
            try {
                planos = tipoPlanDao.pesquisarTodo();
                populatTabela();
            } catch (Exception e) {
            }
        } else {
            try {
                planos = tipoPlanDao.pesquisarPorNome(nome);
                populatTabela();
            } catch (Exception e) {
                System.out.println("Erro ao pesquisar por nome " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btPesuisarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        JOptionPane.showConfirmDialog(null, "tem certeza que deseja excluir estes dados?");
        int linhaSelecionada = tabelaPlanos.getSelectedRow();
        try {
            tipoPlan = planos.get(linhaSelecionada);
            tipoPlanDao.excluir(tipoPlan.getCodPlan());
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!!");
            planos.remove(linhaSelecionada);
            populatTabela();
            varNomePlano.setText(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir, você precisa selecionar uma linha");
        }
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        int linhaSelecionada = tabelaPlanos.getSelectedRow();
        try {
            tipoPlan = planos.get(linhaSelecionada);
            new cadastroPlano(tipoPlan).setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados, por favor selecione uma linha para alterar os dados!");
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        new PlanosHome().setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(PesquisarPlanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarPlanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarPlanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarPlanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarPlanos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btPesuisar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNomePlano;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tabelaPlanos;
    private javax.swing.JTextField varNomePlano;
    // End of variables declaration//GEN-END:variables
}
