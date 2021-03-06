/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tela.funcionario;

import tela.funcionario.CadastroFuncionario;
import entidade.Funcionario;
import tela.aluno.PesquisarAluno;
import tela.planos.PlanosHome;
import tela.professor.ProfessoresHome;

/**
 *
 * @author victo
 */
public class HomeFuncionarioLogado extends javax.swing.JFrame {

    private Funcionario funcionario;

    /**
     * Creates new form Home
     */
    public HomeFuncionarioLogado(Funcionario funcionario) {
        initComponents();
        this.funcionario = funcionario;
    }

    public HomeFuncionarioLogado() {
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

        jMenu2 = new javax.swing.JMenu();
        linkCadastro = new javax.swing.JLabel();
        linkPesquisa = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cadastro = new javax.swing.JMenu();
        menuItemCadUsuario = new javax.swing.JMenuItem();
        menu_pesquisa = new javax.swing.JMenu();
        menuItemPesqUsuario = new javax.swing.JMenuItem();
        menu_planos = new javax.swing.JMenu();
        TelaPlanos = new javax.swing.JMenuItem();
        menu_professores = new javax.swing.JMenu();
        telaprofessores = new javax.swing.JMenuItem();
        menu_aluno = new javax.swing.JMenu();
        telaAlunos = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Home Funcionario");

        linkCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/adicionar-usuario _64.png"))); // NOI18N
        linkCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        linkCadastro.setPreferredSize(new java.awt.Dimension(64, 64));
        linkCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkCadastroMouseClicked(evt);
            }
        });

        linkPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/pesquisar-usuario.png"))); // NOI18N
        linkPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        linkPesquisa.setPreferredSize(new java.awt.Dimension(64, 64));
        linkPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkPesquisarMouseClicked(evt);
            }
        });

        menu_cadastro.setText("Cadastro");

        menuItemCadUsuario.setText("cadastrar funcionarios");
        menuItemCadUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuItemCadUsuarioMousePressed(evt);
            }
        });
        menu_cadastro.add(menuItemCadUsuario);

        jMenuBar1.add(menu_cadastro);

        menu_pesquisa.setText("Pesquisa");

        menuItemPesqUsuario.setText("Pesquisar funcionarios");
        menuItemPesqUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuItemPesqUsuarioMousePressed(evt);
            }
        });
        menu_pesquisa.add(menuItemPesqUsuario);

        jMenuBar1.add(menu_pesquisa);

        menu_planos.setText("Planos");

        TelaPlanos.setText("Planos academia");
        TelaPlanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuItemPlanosMousePressed(evt);
            }
        });
        menu_planos.add(TelaPlanos);

        jMenuBar1.add(menu_planos);

        menu_professores.setText("Professores");

        telaprofessores.setText("Professores academia");
        telaprofessores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_professoresMousePressed(evt);
            }
        });
        menu_professores.add(telaprofessores);

        jMenuBar1.add(menu_professores);

        menu_aluno.setText("Alunos");

        telaAlunos.setText("Pesquisar alunos");
        telaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_alunoMousePressed(evt);
            }
        });
        menu_aluno.add(telaAlunos);

        jMenuBar1.add(menu_aluno);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(linkCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(linkPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linkCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linkPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void linkCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkCadastroMouseClicked
        new CadastroFuncionario().setVisible(true);
        dispose();
    }//GEN-LAST:event_linkCadastroMouseClicked

    private void linkPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkPesquisarMouseClicked
        new PesquisaFuncionario().setVisible(true);
        dispose();
    }//GEN-LAST:event_linkPesquisarMouseClicked

    private void menuItemCadUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemCadUsuarioMousePressed
        new CadastroFuncionario().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemCadUsuarioMousePressed

    private void menuItemPesqUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemPesqUsuarioMousePressed
        new PesquisaFuncionario().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemPesqUsuarioMousePressed

    private void menu_professoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_professoresMousePressed
        new ProfessoresHome().setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_professoresMousePressed

    private void menuItemPlanosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemPlanosMousePressed
        new PlanosHome().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemPlanosMousePressed

    private void menu_alunoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_alunoMousePressed
        new PesquisarAluno().setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_alunoMousePressed

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
            java.util.logging.Logger.getLogger(HomeFuncionarioLogado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFuncionarioLogado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFuncionarioLogado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFuncionarioLogado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFuncionarioLogado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem TelaPlanos;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel linkCadastro;
    private javax.swing.JLabel linkPesquisa;
    private javax.swing.JMenuItem menuItemCadUsuario;
    private javax.swing.JMenuItem menuItemPesqUsuario;
    private javax.swing.JMenu menu_aluno;
    private javax.swing.JMenu menu_cadastro;
    private javax.swing.JMenu menu_pesquisa;
    private javax.swing.JMenu menu_planos;
    private javax.swing.JMenu menu_professores;
    private javax.swing.JMenuItem telaAlunos;
    private javax.swing.JMenuItem telaprofessores;
    // End of variables declaration//GEN-END:variables
}
