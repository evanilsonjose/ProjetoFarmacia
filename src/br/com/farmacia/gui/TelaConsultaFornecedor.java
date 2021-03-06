package br.com.farmacia.gui;

import br.com.farmacia.beans.Fornecedor;
import br.com.farmacia.dao.FornecedorDAO;

/**
 *
 * @author Evanilson
 */
public class TelaConsultaFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsultaFornecedor
     */
    public TelaConsultaFornecedor() {
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

        jPanelConsultarFornecedor = new javax.swing.JPanel();
        jTextFieldCodigoCNPJFornecedor = new javax.swing.JTextField();
        jButtonConsultarFornecedorCodigo = new javax.swing.JButton();
        jLabelNomeFornecedor = new javax.swing.JLabel();
        jTextFieldNomeFornecedor = new javax.swing.JTextField();
        jLabelCNPJForncedor = new javax.swing.JLabel();
        jTextFieldCNPJFornecedor = new javax.swing.JTextField();
        jLabelEnderecoFornecedor = new javax.swing.JLabel();
        jLabelTelefoneFornecedor = new javax.swing.JLabel();
        jTextFieldEnderecoFornecedor = new javax.swing.JTextField();
        jTextFieldTelefoneFornecedor = new javax.swing.JTextField();
        jComboBoxCodigoCNPJ = new javax.swing.JComboBox();
        jLabelConsultarFornecedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelConsultarFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonConsultarFornecedorCodigo.setText("Consultar");
        jButtonConsultarFornecedorCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarFornecedorCodigoActionPerformed(evt);
            }
        });

        jLabelNomeFornecedor.setText("Nome:");

        jTextFieldNomeFornecedor.setEditable(false);

        jLabelCNPJForncedor.setText("CNPJ:");

        jTextFieldCNPJFornecedor.setEditable(false);

        jLabelEnderecoFornecedor.setText("Endereço:");

        jLabelTelefoneFornecedor.setText("Telefone:");

        jTextFieldEnderecoFornecedor.setEditable(false);

        jTextFieldTelefoneFornecedor.setEditable(false);

        jComboBoxCodigoCNPJ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "CNPJ" }));
        jComboBoxCodigoCNPJ.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCodigoCNPJItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultarFornecedorLayout = new javax.swing.GroupLayout(jPanelConsultarFornecedor);
        jPanelConsultarFornecedor.setLayout(jPanelConsultarFornecedorLayout);
        jPanelConsultarFornecedorLayout.setHorizontalGroup(
            jPanelConsultarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarFornecedorLayout.createSequentialGroup()
                .addGroup(jPanelConsultarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultarFornecedorLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanelConsultarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTelefoneFornecedor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelEnderecoFornecedor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCNPJForncedor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNomeFornecedor, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanelConsultarFornecedorLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jComboBoxCodigoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConsultarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNomeFornecedor)
                    .addGroup(jPanelConsultarFornecedorLayout.createSequentialGroup()
                        .addGroup(jPanelConsultarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCodigoCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultarFornecedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConsultarFornecedorCodigo)
                .addGap(6, 6, 6))
        );
        jPanelConsultarFornecedorLayout.setVerticalGroup(
            jPanelConsultarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarFornecedorLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanelConsultarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigoCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCodigoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelConsultarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFornecedor)
                    .addComponent(jTextFieldNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelConsultarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCNPJForncedor)
                    .addComponent(jTextFieldCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelConsultarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEnderecoFornecedor)
                    .addComponent(jTextFieldEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelConsultarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefoneFornecedor)
                    .addComponent(jTextFieldTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConsultarFornecedorCodigo)
                .addContainerGap())
        );

        jLabelConsultarFornecedor.setText("Consultar Fornecedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabelConsultarFornecedor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConsultarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabelConsultarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelConsultarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarFornecedorCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarFornecedorCodigoActionPerformed
       
        String opcaoConsulta = jComboBoxCodigoCNPJ.getSelectedItem().toString();
        
        if (opcaoConsulta.equals("Código")){
            Fornecedor fornecedor = new Fornecedor();
            FornecedorDAO funcaoFornecedor =  new FornecedorDAO();
            
            try {
                fornecedor = funcaoFornecedor.buscaFornecedorCodigo(Integer.parseInt(jTextFieldCodigoCNPJFornecedor.getText()));
                jTextFieldNomeFornecedor.setText(fornecedor.getNome());
                jTextFieldCNPJFornecedor.setText(fornecedor.getCNPJ());
                jTextFieldEnderecoFornecedor.setText(fornecedor.getEndereco());
                jTextFieldTelefoneFornecedor.setText(fornecedor.getTelefone());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }else{
            Fornecedor fornecedor = new Fornecedor();
            FornecedorDAO funcaoFornecedor =  new FornecedorDAO();
            
            try {
                fornecedor = funcaoFornecedor.buscaFornecedorCNPJ((jTextFieldCodigoCNPJFornecedor.getText()));
                jTextFieldNomeFornecedor.setText(fornecedor.getNome());
                jTextFieldCNPJFornecedor.setText(fornecedor.getCNPJ());
                jTextFieldEnderecoFornecedor.setText(fornecedor.getEndereco());
                jTextFieldTelefoneFornecedor.setText(fornecedor.getTelefone());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        
        
        
        
    }//GEN-LAST:event_jButtonConsultarFornecedorCodigoActionPerformed

    private void jComboBoxCodigoCNPJItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCodigoCNPJItemStateChanged
        // TODO add your handling code here:
        jTextFieldCodigoCNPJFornecedor.setText("");
        jTextFieldNomeFornecedor.setText("");
        jTextFieldCNPJFornecedor.setText("");
        jTextFieldEnderecoFornecedor.setText("");
        jTextFieldTelefoneFornecedor.setText("");
    }//GEN-LAST:event_jComboBoxCodigoCNPJItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultarFornecedorCodigo;
    private javax.swing.JComboBox jComboBoxCodigoCNPJ;
    private javax.swing.JLabel jLabelCNPJForncedor;
    private javax.swing.JLabel jLabelConsultarFornecedor;
    private javax.swing.JLabel jLabelEnderecoFornecedor;
    private javax.swing.JLabel jLabelNomeFornecedor;
    private javax.swing.JLabel jLabelTelefoneFornecedor;
    private javax.swing.JPanel jPanelConsultarFornecedor;
    private javax.swing.JTextField jTextFieldCNPJFornecedor;
    private javax.swing.JTextField jTextFieldCodigoCNPJFornecedor;
    private javax.swing.JTextField jTextFieldEnderecoFornecedor;
    private javax.swing.JTextField jTextFieldNomeFornecedor;
    private javax.swing.JTextField jTextFieldTelefoneFornecedor;
    // End of variables declaration//GEN-END:variables
}
