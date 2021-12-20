
package views;
/**
 *
 * @author karolyne Marques
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

        PanelMenu = new javax.swing.JPanel();
        PanelButtons = new javax.swing.JPanel();
        ButtonAlugarCarro = new javax.swing.JButton();
        ButtonCadastrarCarro = new javax.swing.JButton();
        ButtonCadastrarCliente = new javax.swing.JButton();
        ButtonCadastrarFuncionario = new javax.swing.JButton();
        ButtonCadastrarSeguro = new javax.swing.JButton();
        ButtonRelatorios1 = new javax.swing.JButton();
        ButtonDevolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        PanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        PanelMenu.setAlignmentX(0.0F);
        PanelMenu.setAlignmentY(0.0F);
        PanelMenu.setLayout(new java.awt.GridBagLayout());

        PanelButtons.setBackground(new java.awt.Color(255, 255, 255));
        PanelButtons.setLayout(new java.awt.GridLayout(7, 1, 0, 25));

        ButtonAlugarCarro.setBackground(new java.awt.Color(32, 32, 32));
        ButtonAlugarCarro.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAlugarCarro.setText("Alugar Carro");
        ButtonAlugarCarro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonAlugarCarro.setBorderPainted(false);
        ButtonAlugarCarro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonAlugarCarro.setFocusable(false);
        ButtonAlugarCarro.setMaximumSize(new java.awt.Dimension(300, 30));
        ButtonAlugarCarro.setMinimumSize(new java.awt.Dimension(100, 30));
        ButtonAlugarCarro.setPreferredSize(new java.awt.Dimension(300, 30));
        ButtonAlugarCarro.setRequestFocusEnabled(false);
        ButtonAlugarCarro.setRolloverEnabled(false);
        ButtonAlugarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlugarCarroButtonVoltarMenuActionPerformed(evt);
            }
        });
        PanelButtons.add(ButtonAlugarCarro);

        ButtonCadastrarCarro.setBackground(new java.awt.Color(32, 32, 32));
        ButtonCadastrarCarro.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCadastrarCarro.setText("Cadastrar Carro");
        ButtonCadastrarCarro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCadastrarCarro.setBorderPainted(false);
        ButtonCadastrarCarro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCadastrarCarro.setFocusable(false);
        ButtonCadastrarCarro.setMaximumSize(new java.awt.Dimension(300, 30));
        ButtonCadastrarCarro.setMinimumSize(new java.awt.Dimension(100, 30));
        ButtonCadastrarCarro.setPreferredSize(new java.awt.Dimension(300, 30));
        ButtonCadastrarCarro.setRequestFocusEnabled(false);
        ButtonCadastrarCarro.setRolloverEnabled(false);
        ButtonCadastrarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarCarroButtonVoltarMenuActionPerformed(evt);
            }
        });
        PanelButtons.add(ButtonCadastrarCarro);

        ButtonCadastrarCliente.setBackground(new java.awt.Color(32, 32, 32));
        ButtonCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCadastrarCliente.setText("Cadastrar Cliente");
        ButtonCadastrarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCadastrarCliente.setBorderPainted(false);
        ButtonCadastrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCadastrarCliente.setFocusable(false);
        ButtonCadastrarCliente.setMaximumSize(new java.awt.Dimension(300, 30));
        ButtonCadastrarCliente.setMinimumSize(new java.awt.Dimension(100, 30));
        ButtonCadastrarCliente.setPreferredSize(new java.awt.Dimension(300, 30));
        ButtonCadastrarCliente.setRequestFocusEnabled(false);
        ButtonCadastrarCliente.setRolloverEnabled(false);
        ButtonCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarClienteButtonVoltarMenuActionPerformed(evt);
            }
        });
        PanelButtons.add(ButtonCadastrarCliente);

        ButtonCadastrarFuncionario.setBackground(new java.awt.Color(32, 32, 32));
        ButtonCadastrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCadastrarFuncionario.setText("Cadastrar Funcionário");
        ButtonCadastrarFuncionario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCadastrarFuncionario.setBorderPainted(false);
        ButtonCadastrarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCadastrarFuncionario.setFocusable(false);
        ButtonCadastrarFuncionario.setMaximumSize(new java.awt.Dimension(300, 30));
        ButtonCadastrarFuncionario.setMinimumSize(new java.awt.Dimension(100, 30));
        ButtonCadastrarFuncionario.setPreferredSize(new java.awt.Dimension(300, 30));
        ButtonCadastrarFuncionario.setRequestFocusEnabled(false);
        ButtonCadastrarFuncionario.setRolloverEnabled(false);
        ButtonCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarFuncionarioButtonVoltarMenuActionPerformed(evt);
            }
        });
        PanelButtons.add(ButtonCadastrarFuncionario);

        ButtonCadastrarSeguro.setBackground(new java.awt.Color(32, 32, 32));
        ButtonCadastrarSeguro.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCadastrarSeguro.setText("Cadastrar Seguro");
        ButtonCadastrarSeguro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCadastrarSeguro.setBorderPainted(false);
        ButtonCadastrarSeguro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCadastrarSeguro.setFocusable(false);
        ButtonCadastrarSeguro.setMaximumSize(new java.awt.Dimension(300, 30));
        ButtonCadastrarSeguro.setMinimumSize(new java.awt.Dimension(100, 30));
        ButtonCadastrarSeguro.setPreferredSize(new java.awt.Dimension(300, 30));
        ButtonCadastrarSeguro.setRequestFocusEnabled(false);
        ButtonCadastrarSeguro.setRolloverEnabled(false);
        ButtonCadastrarSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarSeguroButtonVoltarMenuActionPerformed(evt);
            }
        });
        PanelButtons.add(ButtonCadastrarSeguro);

        ButtonRelatorios1.setBackground(new java.awt.Color(32, 32, 32));
        ButtonRelatorios1.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRelatorios1.setText("Relatórios");
        ButtonRelatorios1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonRelatorios1.setBorderPainted(false);
        ButtonRelatorios1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonRelatorios1.setFocusable(false);
        ButtonRelatorios1.setMaximumSize(new java.awt.Dimension(300, 30));
        ButtonRelatorios1.setMinimumSize(new java.awt.Dimension(100, 30));
        ButtonRelatorios1.setPreferredSize(new java.awt.Dimension(300, 30));
        ButtonRelatorios1.setRequestFocusEnabled(false);
        ButtonRelatorios1.setRolloverEnabled(false);
        ButtonRelatorios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRelatorios1ButtonVoltarMenuActionPerformed(evt);
            }
        });
        PanelButtons.add(ButtonRelatorios1);

        ButtonDevolver.setBackground(new java.awt.Color(32, 32, 32));
        ButtonDevolver.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDevolver.setText("Devolução de Veículo");
        ButtonDevolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonDevolver.setBorderPainted(false);
        ButtonDevolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonDevolver.setFocusable(false);
        ButtonDevolver.setMaximumSize(new java.awt.Dimension(300, 30));
        ButtonDevolver.setMinimumSize(new java.awt.Dimension(100, 30));
        ButtonDevolver.setPreferredSize(new java.awt.Dimension(300, 30));
        ButtonDevolver.setRequestFocusEnabled(false);
        ButtonDevolver.setRolloverEnabled(false);
        ButtonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDevolverButtonVoltarMenuActionPerformed(evt);
            }
        });
        PanelButtons.add(ButtonDevolver);

        PanelMenu.add(PanelButtons, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAlugarCarroButtonVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlugarCarroButtonVoltarMenuActionPerformed
        // TODO add your handling code here:
        AlugarCarro alugarCarro = new AlugarCarro(this, true);
        alugarCarro.setVisible(true);
        alugarCarro.setLocationRelativeTo(null);
    }//GEN-LAST:event_ButtonAlugarCarroButtonVoltarMenuActionPerformed

    private void ButtonCadastrarCarroButtonVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarCarroButtonVoltarMenuActionPerformed
        // TODO add your handling code here:
        CadastrarCarro cadastrarCarro = new CadastrarCarro(this, true);
        cadastrarCarro.setVisible(true);
        cadastrarCarro.setLocationRelativeTo(null);
    }//GEN-LAST:event_ButtonCadastrarCarroButtonVoltarMenuActionPerformed

    private void ButtonCadastrarClienteButtonVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarClienteButtonVoltarMenuActionPerformed
        // TODO add your handling code here:
        CadastrarCliente cadastrarCliente = new CadastrarCliente(this, true);
        cadastrarCliente.setVisible(true);
        cadastrarCliente.setLocationRelativeTo(null);
    }//GEN-LAST:event_ButtonCadastrarClienteButtonVoltarMenuActionPerformed

    private void ButtonCadastrarFuncionarioButtonVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarFuncionarioButtonVoltarMenuActionPerformed
        // TODO add your handling code here:
        CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario(this, true);
        cadastrarFuncionario.setVisible(true);
        cadastrarFuncionario.setLocationRelativeTo(null);
    }//GEN-LAST:event_ButtonCadastrarFuncionarioButtonVoltarMenuActionPerformed

    private void ButtonCadastrarSeguroButtonVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarSeguroButtonVoltarMenuActionPerformed
        // TODO add your handling code here:
        CadastrarSeguro cadastrarSeguro = new CadastrarSeguro(this, true);
        cadastrarSeguro.setVisible(true);
        cadastrarSeguro.setLocationRelativeTo(null);
    }//GEN-LAST:event_ButtonCadastrarSeguroButtonVoltarMenuActionPerformed

    private void ButtonRelatorios1ButtonVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRelatorios1ButtonVoltarMenuActionPerformed
        // TODO add your handling code here:
        Relatorios relatorios = new Relatorios(this, false);
        relatorios.setVisible(true);
        relatorios.setLocationRelativeTo(null);
    }//GEN-LAST:event_ButtonRelatorios1ButtonVoltarMenuActionPerformed

    private void ButtonDevolverButtonVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDevolverButtonVoltarMenuActionPerformed
        // TODO add your handling code here:
        DevolucaoVeiculo devolucao = new DevolucaoVeiculo(this, true);
        devolucao.setVisible(true);
        devolucao.setLocationRelativeTo(null);
    }//GEN-LAST:event_ButtonDevolverButtonVoltarMenuActionPerformed

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
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlugarCarro;
    private javax.swing.JButton ButtonCadastrarCarro;
    private javax.swing.JButton ButtonCadastrarCliente;
    private javax.swing.JButton ButtonCadastrarFuncionario;
    private javax.swing.JButton ButtonCadastrarSeguro;
    private javax.swing.JButton ButtonDevolver;
    private javax.swing.JButton ButtonRelatorios1;
    private javax.swing.JPanel PanelButtons;
    private javax.swing.JPanel PanelMenu;
    // End of variables declaration//GEN-END:variables
}
