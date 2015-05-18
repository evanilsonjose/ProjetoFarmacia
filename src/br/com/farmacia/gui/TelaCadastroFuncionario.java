/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.farmacia.gui;

import br.com.farmacia.beans.Funcionario;
import br.com.farmacia.dao.FuncionarioDAO;

/**
 *
 * @author Evanilson
 */
public class TelaCadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaCadastroFuncionario() {
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

        jPanelCadastroFuncionario = new javax.swing.JPanel();
        jLabelNomeFuncionario = new javax.swing.JLabel();
        jLabelRgFuncionario = new javax.swing.JLabel();
        jLabelCpfFuncionario = new javax.swing.JLabel();
        jLabelDataNascFuncionario = new javax.swing.JLabel();
        jLabelEnderecoFuncionario = new javax.swing.JLabel();
        jLabelTelefoneFuncionario = new javax.swing.JLabel();
        jLabelFuncaoFuncionario = new javax.swing.JLabel();
        jLabelSalarioFuncionario = new javax.swing.JLabel();
        jTextFieldNomeFuncionario = new javax.swing.JTextField();
        jTextFieldRgFuncionario = new javax.swing.JTextField();
        jTextFieldCpfFuncionario = new javax.swing.JTextField();
        jTextFieldDataNascFuncionario = new javax.swing.JTextField();
        jTextFieldEnderecoFuncionario = new javax.swing.JTextField();
        jTextFieldTelefoneFuncionario = new javax.swing.JTextField();
        jTextFieldFuncaoFuncionario = new javax.swing.JTextField();
        jTextFieldSalarioFuncionario = new javax.swing.JTextField();
        jButtonCadastrarFuncionario = new javax.swing.JButton();
        jLabelCadastroFuncionario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelCadastroFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNomeFuncionario.setText("Nome:");

        jLabelRgFuncionario.setText("RG:");

        jLabelCpfFuncionario.setText("CPF:");

        jLabelDataNascFuncionario.setText("Data de Nasc.:");

        jLabelEnderecoFuncionario.setText("Endereço:");

        jLabelTelefoneFuncionario.setText("Telefone:");

        jLabelFuncaoFuncionario.setText("Função:");

        jLabelSalarioFuncionario.setText("Salário:");

        jButtonCadastrarFuncionario.setText("Cadasatrar");
        jButtonCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroFuncionarioLayout = new javax.swing.GroupLayout(jPanelCadastroFuncionario);
        jPanelCadastroFuncionario.setLayout(jPanelCadastroFuncionarioLayout);
        jPanelCadastroFuncionarioLayout.setHorizontalGroup(
            jPanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroFuncionarioLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelSalarioFuncionario)
                    .addComponent(jLabelFuncaoFuncionario)
                    .addComponent(jLabelTelefoneFuncionario)
                    .addComponent(jLabelEnderecoFuncionario)
                    .addComponent(jLabelDataNascFuncionario)
                    .addComponent(jLabelCpfFuncionario)
                    .addComponent(jLabelRgFuncionario)
                    .addComponent(jLabelNomeFuncionario))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDataNascFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFuncaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroFuncionarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCadastrarFuncionario)
                .addContainerGap())
        );
        jPanelCadastroFuncionarioLayout.setVerticalGroup(
            jPanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroFuncionarioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFuncionario)
                    .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRgFuncionario)
                    .addComponent(jTextFieldRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpfFuncionario)
                    .addComponent(jTextFieldCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataNascFuncionario)
                    .addComponent(jTextFieldDataNascFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEnderecoFuncionario)
                    .addComponent(jTextFieldEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefoneFuncionario)
                    .addComponent(jTextFieldTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFuncaoFuncionario)
                    .addComponent(jTextFieldFuncaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSalarioFuncionario)
                    .addComponent(jTextFieldSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButtonCadastrarFuncionario)
                .addContainerGap())
        );

        jLabelCadastroFuncionario.setText("Cadastro de Funcionário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastroFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabelCadastroFuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelCadastroFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCadastroFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
        String nome = jTextFieldNomeFuncionario.getText();
        String rg = jTextFieldRgFuncionario.getText();
        String cpf = jTextFieldCpfFuncionario.getText();
        String dataNasc = jTextFieldDataNascFuncionario.getText();
        String endereco = jTextFieldEnderecoFuncionario.getText();
        String telefone = jTextFieldTelefoneFuncionario.getText();
        String funcao = jTextFieldFuncaoFuncionario.getText();
        double salario = Double.parseDouble(jTextFieldSalarioFuncionario.getText());

        Funcionario funcionario = new Funcionario(0, nome, endereco, telefone, rg, cpf, dataNasc, funcao, salario);
        FuncionarioDAO funcaoFuncionario = new FuncionarioDAO();
        try {
            funcaoFuncionario.insereFuncionario(funcionario);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_jButtonCadastrarFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarFuncionario;
    private javax.swing.JLabel jLabelCadastroFuncionario;
    private javax.swing.JLabel jLabelCpfFuncionario;
    private javax.swing.JLabel jLabelDataNascFuncionario;
    private javax.swing.JLabel jLabelEnderecoFuncionario;
    private javax.swing.JLabel jLabelFuncaoFuncionario;
    private javax.swing.JLabel jLabelNomeFuncionario;
    private javax.swing.JLabel jLabelRgFuncionario;
    private javax.swing.JLabel jLabelSalarioFuncionario;
    private javax.swing.JLabel jLabelTelefoneFuncionario;
    private javax.swing.JPanel jPanelCadastroFuncionario;
    private javax.swing.JTextField jTextFieldCpfFuncionario;
    private javax.swing.JTextField jTextFieldDataNascFuncionario;
    private javax.swing.JTextField jTextFieldEnderecoFuncionario;
    private javax.swing.JTextField jTextFieldFuncaoFuncionario;
    private javax.swing.JTextField jTextFieldNomeFuncionario;
    private javax.swing.JTextField jTextFieldRgFuncionario;
    private javax.swing.JTextField jTextFieldSalarioFuncionario;
    private javax.swing.JTextField jTextFieldTelefoneFuncionario;
    // End of variables declaration//GEN-END:variables
}