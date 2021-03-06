/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.farmacia.gui;

import br.com.farmacia.beans.Cliente;
import br.com.farmacia.dao.ClienteDAO;
import br.com.farmacia.util.Util;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Evanilson
 */
public class TelaAlteraCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroCliente
     */
    public TelaAlteraCliente() {
        initComponents();
        jLabelCodigoCliente.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAlteraCliente = new javax.swing.JPanel();
        jLabelNomeCliente = new javax.swing.JLabel();
        jLabelRgCliente = new javax.swing.JLabel();
        jLabelCpfCliente = new javax.swing.JLabel();
        jLabelDataNascCliente = new javax.swing.JLabel();
        jLabelEnderecoCliente = new javax.swing.JLabel();
        jLabelTelefoneCliente = new javax.swing.JLabel();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jTextFieldRgCliente = new javax.swing.JTextField();
        jTextFieldCpfCliente = new javax.swing.JTextField();
        jTextFieldDataNascCliente = new javax.swing.JTextField();
        jTextFieldEnderecoCliente = new javax.swing.JTextField();
        jTextFieldTelefoneCliente = new javax.swing.JTextField();
        jButtonAlterarCliente = new javax.swing.JButton();
        jButtonCancelarCliente = new javax.swing.JButton();
        jComboBoxCodigoCpf = new javax.swing.JComboBox();
        jTextFieldCodigoCpfCliente = new javax.swing.JTextField();
        jButtonConsultaCliente = new javax.swing.JButton();
        jLabelCodigoCliente = new javax.swing.JLabel();
        jLabelAlteraCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AlterarCliente");
        setResizable(false);

        jPanelAlteraCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNomeCliente.setText("Nome:");

        jLabelRgCliente.setText("RG:");

        jLabelCpfCliente.setText("CPF:");

        jLabelDataNascCliente.setText("Data de Nascimento:");

        jLabelEnderecoCliente.setText("Endereço:");

        jLabelTelefoneCliente.setText("Telefone:");

        jButtonAlterarCliente.setText("Atualizar");
        jButtonAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarClienteActionPerformed(evt);
            }
        });

        jButtonCancelarCliente.setText("Cancelar");

        jComboBoxCodigoCpf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "CPF" }));
        jComboBoxCodigoCpf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCodigoCpfItemStateChanged(evt);
            }
        });

        jButtonConsultaCliente.setText("Consultar");
        jButtonConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAlteraClienteLayout = new javax.swing.GroupLayout(jPanelAlteraCliente);
        jPanelAlteraCliente.setLayout(jPanelAlteraClienteLayout);
        jPanelAlteraClienteLayout.setHorizontalGroup(
            jPanelAlteraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlteraClienteLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanelAlteraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlteraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelCpfCliente)
                        .addComponent(jLabelRgCliente)
                        .addComponent(jLabelTelefoneCliente)
                        .addComponent(jLabelEnderecoCliente)
                        .addGroup(jPanelAlteraClienteLayout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jLabelNomeCliente))
                        .addComponent(jLabelDataNascCliente))
                    .addGroup(jPanelAlteraClienteLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jComboBoxCodigoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelAlteraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNomeCliente)
                    .addGroup(jPanelAlteraClienteLayout.createSequentialGroup()
                        .addGroup(jPanelAlteraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDataNascCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCodigoCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCodigoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConsultaCliente)
                .addGap(9, 9, 9))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlteraClienteLayout.createSequentialGroup()
                .addContainerGap(439, Short.MAX_VALUE)
                .addComponent(jButtonCancelarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterarCliente)
                .addGap(6, 6, 6))
        );
        jPanelAlteraClienteLayout.setVerticalGroup(
            jPanelAlteraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlteraClienteLayout.createSequentialGroup()
                .addGroup(jPanelAlteraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlteraClienteLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButtonConsultaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCodigoCliente)
                        .addGap(328, 328, 328))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlteraClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelAlteraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxCodigoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCodigoCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAlteraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNomeCliente)
                            .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanelAlteraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRgCliente)
                            .addComponent(jTextFieldRgCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanelAlteraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCpfCliente)
                            .addComponent(jTextFieldCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanelAlteraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDataNascCliente)
                            .addComponent(jTextFieldDataNascCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanelAlteraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEnderecoCliente)
                            .addComponent(jTextFieldEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanelAlteraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTelefoneCliente)
                            .addComponent(jTextFieldTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanelAlteraClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlterarCliente)
                    .addComponent(jButtonCancelarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelAlteraCliente.setText("Altera Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelAlteraCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabelAlteraCliente)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelAlteraCliente)
                .addGap(18, 18, 18)
                .addComponent(jPanelAlteraCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarClienteActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(jLabelCodigoCliente.getText());
        String nome = jTextFieldNomeCliente.getText();
        String rg = jTextFieldRgCliente.getText();
        String cpf = jTextFieldCpfCliente.getText();
        String dataNascTemp = jTextFieldDataNascCliente.getText();
        Util util = new Util();
        String dataNasc = util.inverteData(dataNascTemp);
        String endereco = jTextFieldEnderecoCliente.getText();
        String telefone = jTextFieldTelefoneCliente.getText();

        Cliente cliente = new Cliente(codigo, nome, endereco, telefone, rg, cpf, dataNasc);
        ClienteDAO clienteDAO = new ClienteDAO();
        try {
            clienteDAO.alteraCliente(cliente);
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL erro: " + e.getMessage());
        } finally {
            jTextFieldCodigoCpfCliente.setText("");
            jTextFieldNomeCliente.setText("");
            jTextFieldRgCliente.setText("");
            jTextFieldCpfCliente.setText("");
            jTextFieldDataNascCliente.setText("");
            jTextFieldEnderecoCliente.setText("");
            jTextFieldTelefoneCliente.setText("");
        }

    }//GEN-LAST:event_jButtonAlterarClienteActionPerformed

    private void jButtonConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaClienteActionPerformed
        // TODO add your handling code here:
        String opcaoConsulta = jComboBoxCodigoCpf.getSelectedItem().toString();
        if (opcaoConsulta.equals("Código")) {
            Cliente cliente = new Cliente();
            ClienteDAO funcaoCliente = new ClienteDAO();
            try {
                cliente = funcaoCliente.buscaClienteCodigo(Integer.parseInt(jTextFieldCodigoCpfCliente.getText()));
                jLabelCodigoCliente.setText(String.valueOf(cliente.getCodigo()));
                jTextFieldNomeCliente.setText(cliente.getNome());
                jTextFieldRgCliente.setText(cliente.getRG());
                jTextFieldCpfCliente.setText(cliente.getCPF());
                jTextFieldDataNascCliente.setText(cliente.getDataNasc());
                jTextFieldEnderecoCliente.setText(cliente.getEndereco());
                jTextFieldTelefoneCliente.setText(cliente.getTelefone());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else {
            Cliente cliente = new Cliente();
            ClienteDAO funcaoCliente = new ClienteDAO();
            try {
                cliente = funcaoCliente.buscaClienteCpf(jTextFieldCodigoCpfCliente.getText());
                jLabelCodigoCliente.setText(String.valueOf(cliente.getCodigo()));
                jTextFieldNomeCliente.setText(cliente.getNome());
                jTextFieldRgCliente.setText(cliente.getRG());
                jTextFieldCpfCliente.setText(cliente.getCPF());
                jTextFieldDataNascCliente.setText(cliente.getDataNasc());
                jTextFieldEnderecoCliente.setText(cliente.getEndereco());
                jTextFieldTelefoneCliente.setText(cliente.getTelefone());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonConsultaClienteActionPerformed

    private void jComboBoxCodigoCpfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCodigoCpfItemStateChanged
        // TODO add your handling code here:
        jTextFieldCodigoCpfCliente.setText("");
        jTextFieldNomeCliente.setText("");
        jTextFieldRgCliente.setText("");
        jTextFieldCpfCliente.setText("");
        jTextFieldDataNascCliente.setText("");
        jTextFieldEnderecoCliente.setText("");
        jTextFieldTelefoneCliente.setText("");
    }//GEN-LAST:event_jComboBoxCodigoCpfItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaAlteraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlteraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlteraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlteraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlteraCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarCliente;
    private javax.swing.JButton jButtonCancelarCliente;
    private javax.swing.JButton jButtonConsultaCliente;
    private javax.swing.JComboBox jComboBoxCodigoCpf;
    private javax.swing.JLabel jLabelAlteraCliente;
    private javax.swing.JLabel jLabelCodigoCliente;
    private javax.swing.JLabel jLabelCpfCliente;
    private javax.swing.JLabel jLabelDataNascCliente;
    private javax.swing.JLabel jLabelEnderecoCliente;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JLabel jLabelRgCliente;
    private javax.swing.JLabel jLabelTelefoneCliente;
    private javax.swing.JPanel jPanelAlteraCliente;
    private javax.swing.JTextField jTextFieldCodigoCpfCliente;
    private javax.swing.JTextField jTextFieldCpfCliente;
    private javax.swing.JTextField jTextFieldDataNascCliente;
    private javax.swing.JTextField jTextFieldEnderecoCliente;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldRgCliente;
    private javax.swing.JTextField jTextFieldTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}
