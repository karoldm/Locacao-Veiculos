
package views;

import Controller.Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Seguro;
import utils.Utilidades;

/**
 *
 * @author karolyne Marques
 */
public class CadastrarSeguro extends javax.swing.JDialog {
    Controller controller = new Controller();
    int id;
    ArrayList<Seguro> seguros  = new ArrayList<>();
    /**
     * Creates new form CadastrarSeguro
     */
    public CadastrarSeguro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
/*Os códigos de usuário, veiculo, seguro, e locação são gerados automaticamente.
A geração se da por uma contagem, ou seja, se não houver usuário cadastrado
o id gerado será 0 (zero), porém se existir um ou mais usuários na lista
o código gerado será o código do último usuário da lista + 1. A lógica se
aplica aos outros códigos (veiculo, seguro, locação)*/

        this.seguros = controller.getSeguros();
        if(!this.seguros.isEmpty()) {
            this.id = this.seguros.get(this.seguros.size()-1).getCodigoSeguro() + 1;
        }
        else {
            this.id = 0;
        }
        
        TextIDSeguro.setText(Integer.toString(this.id));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PanelCadastrarSeguro = new javax.swing.JPanel();
        TextIDSeguro = new javax.swing.JTextField();
        LabelIDSeguro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LabelDadosCarro = new javax.swing.JLabel();
        LabelNome = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        ButtonCancel = new javax.swing.JButton();
        ButtonCofirm = new javax.swing.JButton();
        LabelTipo = new javax.swing.JLabel();
        TextTipo = new javax.swing.JTextField();
        LabelDescricao = new javax.swing.JLabel();
        TextDescricao = new javax.swing.JTextField();
        LabelValor = new javax.swing.JLabel();
        TextValor = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelCadastrarSeguro.setBackground(new java.awt.Color(255, 255, 255));

        TextIDSeguro.setEditable(false);
        TextIDSeguro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TextIDSeguro.setMinimumSize(null);

        LabelIDSeguro.setText("Código do Seguro");

        jSeparator1.setForeground(new java.awt.Color(32, 32, 32));

        LabelDadosCarro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelDadosCarro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDadosCarro.setText("Dados do Seguro");
        LabelDadosCarro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LabelNome.setText("Nome");

        TextNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TextNome.setMinimumSize(null);

        ButtonCancel.setBackground(new java.awt.Color(229, 4, 4));
        ButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCancel.setText("Cancelar");
        ButtonCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCancel.setBorderPainted(false);
        ButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCancel.setFocusable(false);
        ButtonCancel.setMaximumSize(new java.awt.Dimension(110, 30));
        ButtonCancel.setMinimumSize(new java.awt.Dimension(110, 30));
        ButtonCancel.setRequestFocusEnabled(false);
        ButtonCancel.setRolloverEnabled(false);
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        ButtonCofirm.setBackground(new java.awt.Color(37, 149, 3));
        ButtonCofirm.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCofirm.setText("Confirmar");
        ButtonCofirm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCofirm.setBorderPainted(false);
        ButtonCofirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCofirm.setFocusable(false);
        ButtonCofirm.setMaximumSize(new java.awt.Dimension(110, 30));
        ButtonCofirm.setMinimumSize(new java.awt.Dimension(110, 30));
        ButtonCofirm.setRequestFocusEnabled(false);
        ButtonCofirm.setRolloverEnabled(false);
        ButtonCofirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCofirmActionPerformed(evt);
            }
        });

        LabelTipo.setText("Tipo");

        TextTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TextTipo.setMinimumSize(null);

        LabelDescricao.setText("Descrição");

        TextDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TextDescricao.setMinimumSize(null);

        LabelValor.setText("Valor");

        TextValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TextValor.setMinimumSize(null);

        javax.swing.GroupLayout PanelCadastrarSeguroLayout = new javax.swing.GroupLayout(PanelCadastrarSeguro);
        PanelCadastrarSeguro.setLayout(PanelCadastrarSeguroLayout);
        PanelCadastrarSeguroLayout.setHorizontalGroup(
            PanelCadastrarSeguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadastrarSeguroLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PanelCadastrarSeguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextValor, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDadosCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextIDSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelCadastrarSeguroLayout.createSequentialGroup()
                        .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonCofirm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelIDSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        PanelCadastrarSeguroLayout.setVerticalGroup(
            PanelCadastrarSeguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadastrarSeguroLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(LabelIDSeguro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextIDSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelDadosCarro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextValor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(PanelCadastrarSeguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCofirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelCadastrarSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCadastrarSeguro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearForm(){
        TextNome.setText("");
        TextTipo.setText("");
        TextDescricao.setText("");
        TextValor.setText("");

        this.id = this.seguros.get(this.seguros.size()-1).getCodigoSeguro() + 1;
        TextIDSeguro.setText(Integer.toString(this.id));
    }
    
    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ButtonCancelActionPerformed

    private void ButtonCofirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCofirmActionPerformed
        // TODO add your handling code here:
        String nome = TextNome.getText();
        String tipo = TextTipo.getText();
        String descricao = TextDescricao.getText();
        String valor = TextValor.getText();

        String[] itens = {
            nome,
            tipo,
            descricao,
            
        };

        if(!Utilidades.hasNull(itens)){

                try {
                    Seguro s = new Seguro(id, nome, tipo, descricao, Float.parseFloat(valor));
                    
                    controller.addSeguro(s);
                    this.seguros.add(s);

                    JOptionPane.showMessageDialog(this, "Cadastro realizado."
                        + " Seguro cadastrado com sucesso!",
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
                    clearForm();

                } catch(NumberFormatException nfe){
                    System.out.println(nfe);

                    JOptionPane.showMessageDialog(this, "Dados inválidos."
                        + " Entradas para valor devem ter o formato: 1111.111,",
                        "Atenção", JOptionPane.WARNING_MESSAGE);
                } //tryCatch
           
        } //if hasNull
        else {
            JOptionPane.showMessageDialog(this, "Entrada de dado vazia."
                + " Por favor preencha todos os campos!",
                "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ButtonCofirmActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastrarSeguro dialog = new CadastrarSeguro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonCofirm;
    private javax.swing.JLabel LabelDadosCarro;
    private javax.swing.JLabel LabelDescricao;
    private javax.swing.JLabel LabelIDSeguro;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelTipo;
    private javax.swing.JLabel LabelValor;
    private javax.swing.JPanel PanelCadastrarSeguro;
    private javax.swing.JTextField TextDescricao;
    private javax.swing.JTextField TextIDSeguro;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextTipo;
    private javax.swing.JTextField TextValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
