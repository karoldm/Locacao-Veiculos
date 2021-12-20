
package views;

import Controller.Controller;
import utils.Utilidades;

import models.Veiculo;
import models.Locacao;
import models.VeiculoImportado;
import models.VeiculoNacional;
import models.Seguro;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import java.util.Calendar;
import models.Cliente;
import models.Funcionario;
import models.Usuario;

/**
 *
 * @author karolyne Marques
 */
public class Relatorios extends javax.swing.JDialog {
    Controller controller = new Controller();
    ArrayList<Veiculo> veiculos = controller.getVeiculos();
    ArrayList<Locacao> locacoes = controller.getLocacoes();
    ArrayList<Seguro> seguros = controller.getSeguros();
    ArrayList<Usuario> usuarios = controller.getUsuarios();
    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double width = screenSize.getWidth();
    double height = screenSize.getHeight();
    /**
     * Creates new form Relatorios
     */
    public Relatorios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setSize(new Dimension((int)width, (int)height-100));
        this.PanelRelatorio.setPreferredSize(new Dimension((int)width, (int)height-100));
        this.Table.setSize(new Dimension((int)width, 0));
        
        this.ScrollPane.getViewport().setBackground(new Color(255,255,255));
        this.ScrollPane.setBorder(BorderFactory.createEmptyBorder());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRelatorio = new javax.swing.JPanel();
        ScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        MenuBar = new javax.swing.JMenuBar();
        MenuLocacoes = new javax.swing.JMenu();
        MenuItemLocacoesRealizadas = new javax.swing.JMenuItem();
        MenuItemLocacoesMes = new javax.swing.JMenuItem();
        MenuItemLocacoesFinalizadas = new javax.swing.JMenuItem();
        MenuItemLocacoesNaoFinalizadas = new javax.swing.JMenuItem();
        MenuItemLocacoesAtraso = new javax.swing.JMenuItem();
        MenuVeiculos = new javax.swing.JMenu();
        MenuItemVeiculosCadastrados = new javax.swing.JMenuItem();
        MenuItemVeiculosNacionais = new javax.swing.JMenuItem();
        MenuItemVeiculosImportados = new javax.swing.JMenuItem();
        MenuItemVeiculosDisp = new javax.swing.JMenuItem();
        MenuItemVeiculosLocados = new javax.swing.JMenuItem();
        MenuItemVeiculosAtraso = new javax.swing.JMenuItem();
        MenuItemVeiculosLocCliente = new javax.swing.JMenuItem();
        MenuSeguros = new javax.swing.JMenu();
        MenuItemSegurosCadastrados = new javax.swing.JMenuItem();
        MenuFuncionarios = new javax.swing.JMenu();
        MenuItemFunCadastrados = new javax.swing.JMenuItem();
        MenuItemFunMes = new javax.swing.JMenuItem();
        MenuClientes = new javax.swing.JMenu();
        MenuItemClientesCadastrados = new javax.swing.JMenuItem();
        MenuItemLocCliente = new javax.swing.JMenuItem();
        MenuItemClienteLocAtraso = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatórios");
        setPreferredSize(new java.awt.Dimension(1024, 475));
        setResizable(false);

        PanelRelatorio.setBackground(new java.awt.Color(255, 255, 255));

        ScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPane.setBorder(null);
        ScrollPane.setPreferredSize(new Dimension((int)this.width, (int)this.height-100));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ScrollPane.setViewportView(Table);

        javax.swing.GroupLayout PanelRelatorioLayout = new javax.swing.GroupLayout(PanelRelatorio);
        PanelRelatorio.setLayout(PanelRelatorioLayout);
        PanelRelatorioLayout.setHorizontalGroup(
            PanelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );
        PanelRelatorioLayout.setVerticalGroup(
            PanelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );

        MenuBar.setBackground(new java.awt.Color(255, 255, 255));

        MenuLocacoes.setBackground(new java.awt.Color(255, 255, 255));
        MenuLocacoes.setText("Locações");

        MenuItemLocacoesRealizadas.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemLocacoesRealizadas.setText("Locações Realizadas");
        MenuItemLocacoesRealizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemLocacoesRealizadasActionPerformed(evt);
            }
        });
        MenuLocacoes.add(MenuItemLocacoesRealizadas);

        MenuItemLocacoesMes.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemLocacoesMes.setText("Locações por Mês");
        MenuItemLocacoesMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemLocacoesMesActionPerformed(evt);
            }
        });
        MenuLocacoes.add(MenuItemLocacoesMes);

        MenuItemLocacoesFinalizadas.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemLocacoesFinalizadas.setText("Locações Finalizadas");
        MenuItemLocacoesFinalizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemLocacoesFinalizadasActionPerformed(evt);
            }
        });
        MenuLocacoes.add(MenuItemLocacoesFinalizadas);

        MenuItemLocacoesNaoFinalizadas.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemLocacoesNaoFinalizadas.setText("Locações não Finalizadas");
        MenuItemLocacoesNaoFinalizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemLocacoesNaoFinalizadasActionPerformed(evt);
            }
        });
        MenuLocacoes.add(MenuItemLocacoesNaoFinalizadas);

        MenuItemLocacoesAtraso.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemLocacoesAtraso.setText("Locações em Atraso");
        MenuItemLocacoesAtraso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemLocacoesAtrasoActionPerformed(evt);
            }
        });
        MenuLocacoes.add(MenuItemLocacoesAtraso);

        MenuBar.add(MenuLocacoes);

        MenuVeiculos.setText("Veículos");

        MenuItemVeiculosCadastrados.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemVeiculosCadastrados.setText("Veículos Cadastrados");
        MenuItemVeiculosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVeiculosCadastradosActionPerformed(evt);
            }
        });
        MenuVeiculos.add(MenuItemVeiculosCadastrados);

        MenuItemVeiculosNacionais.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemVeiculosNacionais.setText("Veículos Nacionais");
        MenuItemVeiculosNacionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVeiculosNacionaisActionPerformed(evt);
            }
        });
        MenuVeiculos.add(MenuItemVeiculosNacionais);

        MenuItemVeiculosImportados.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemVeiculosImportados.setText("Veículos Importados");
        MenuItemVeiculosImportados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVeiculosImportadosActionPerformed(evt);
            }
        });
        MenuVeiculos.add(MenuItemVeiculosImportados);

        MenuItemVeiculosDisp.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemVeiculosDisp.setText("Veículos Disponíveis");
        MenuItemVeiculosDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVeiculosDispActionPerformed(evt);
            }
        });
        MenuVeiculos.add(MenuItemVeiculosDisp);

        MenuItemVeiculosLocados.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemVeiculosLocados.setText("Veículos Locados");
        MenuItemVeiculosLocados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVeiculosLocadosActionPerformed(evt);
            }
        });
        MenuVeiculos.add(MenuItemVeiculosLocados);

        MenuItemVeiculosAtraso.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemVeiculosAtraso.setText("Veículos com Atraso");
        MenuItemVeiculosAtraso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVeiculosAtrasoActionPerformed(evt);
            }
        });
        MenuVeiculos.add(MenuItemVeiculosAtraso);

        MenuItemVeiculosLocCliente.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemVeiculosLocCliente.setText("Veículos Locados por Cliente");
        MenuItemVeiculosLocCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVeiculosLocClienteActionPerformed(evt);
            }
        });
        MenuVeiculos.add(MenuItemVeiculosLocCliente);

        MenuBar.add(MenuVeiculos);

        MenuSeguros.setText("Seguros");

        MenuItemSegurosCadastrados.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemSegurosCadastrados.setText("Seguros Cadastrados");
        MenuItemSegurosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSegurosCadastradosActionPerformed(evt);
            }
        });
        MenuSeguros.add(MenuItemSegurosCadastrados);

        MenuBar.add(MenuSeguros);

        MenuFuncionarios.setText("Funcionários");

        MenuItemFunCadastrados.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemFunCadastrados.setText("Funcionários Cadastrados");
        MenuItemFunCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFunCadastradosActionPerformed(evt);
            }
        });
        MenuFuncionarios.add(MenuItemFunCadastrados);

        MenuItemFunMes.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemFunMes.setText("Funcionários do Mês");
        MenuFuncionarios.add(MenuItemFunMes);

        MenuBar.add(MenuFuncionarios);

        MenuClientes.setText("Clientes");

        MenuItemClientesCadastrados.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemClientesCadastrados.setText("Clientes Cadastrados");
        MenuItemClientesCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemClientesCadastradosActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuItemClientesCadastrados);

        MenuItemLocCliente.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemLocCliente.setText("Locações do Cliente");
        MenuClientes.add(MenuItemLocCliente);

        MenuItemClienteLocAtraso.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemClienteLocAtraso.setText("Clientes com Locação em Atraso");
        MenuItemClienteLocAtraso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemClienteLocAtrasoActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuItemClienteLocAtraso);

        MenuBar.add(MenuClientes);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableVeiculo(Object rows[][], int QtdRows){
        Object[] columns = {"Id", "Modelo", "Montadora", "Ano de Fabricação",
        "Ano do Modelo", "Placa", "Categoria", "Valor Fipe", "Valor Diária", 
        "Alugado", "Taxa Estadual", "Taxa Federal"}; 
        
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        
        for(int i = 0; i < QtdRows; i++){
            tableModel.addRow(rows[i]);
        }
        
        Table.setModel(tableModel);

    }
    
    public void tableLocacao(Object rows[][], int QtdRows){
        Object[] columns = {"Código",
            "Código do Cliente",
            "Código do Funcionário",
            "Código do Veículo",
            "Locação",
            "Devolução",
            "Total",
            "Forma de Pagamento",
            "Seguros",
            "Finalizada"}; 
        
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        
        for(int i = 0; i < QtdRows; i++){
            tableModel.addRow(rows[i]);
        }
        
        Table.setModel(tableModel);
    }
    
    public void tableSeguro(Object rows[][], int QtdRows){
        Object[] columns = {"Código",
            "Nome",
            "Tipo",
            "Descrição",
            "Valor"}; 
        
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        
        for(int i = 0; i < QtdRows; i++){
            tableModel.addRow(rows[i]);
        }
        
        Table.setModel(tableModel);
    }
    
   public void tableFuncionario(Object rows[][], int QtdRows){
       Object[] columns = {"Código",
            "Nome",
            "CPF",
            "RG",
            "CEP",
            "Endereço",
            "Data Nascimento",
            "Email",
            "Pis",
            "Data Admissão",
            "Salário"
       }; 
        
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        
        for(int i = 0; i < QtdRows; i++){
            tableModel.addRow(rows[i]);
        }
        
        Table.setModel(tableModel);
   }
   
   public void tableCliente(Object rows[][], int QtdRows){
        Object[] columns = {"Código",
        "Nome",
        "CPF",
        "RG",
        "CEP",
        "Endereço",
        "Data Nascimento",
        "Email",
        "Categoria CNH",
        "Número CNH",
        "Validade CNH"
       }; 
        
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        
        for(int i = 0; i < QtdRows; i++){
            tableModel.addRow(rows[i]);
        }
        
        Table.setModel(tableModel);
   }
    
    private void MenuItemVeiculosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVeiculosCadastradosActionPerformed
        // TODO add your handling code here:
        
        Object rows[][] = new Object[12][veiculos.size()];
        
        int i = 0;
        for(Veiculo v: this.veiculos){
            Object[] data = {
                v.getCodigoVeiculo(), 
                v.getNomeModelo(),
                v.getMontadora(),
                v.getAnoFabricacao(),
                v.getAnoModelo(),
                v.getPlaca(),
                v.getCategoria(),
                String.format("%.2f", v.getValorFipe()),
                String.format("%.2f", v.getValorDiaria()),
                (v.getAlugado()?"Sim":"Não"),
                (v instanceof VeiculoImportado 
                    ? String.format("%.2f", ((VeiculoImportado)v).getTaxaImpostoEstadual())
                    : String.format("%.2f", ((VeiculoNacional)v).getTaxaImpostoEstadual())),
                (v instanceof VeiculoImportado 
                    ? String.format("%.2f", ((VeiculoImportado)v).getTaxaImpostoFederal())
                    : "-")};
            
            rows[i] = data;
            i++;
        }
        
        tableVeiculo(rows, i);
    }//GEN-LAST:event_MenuItemVeiculosCadastradosActionPerformed

    private void MenuItemLocacoesMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemLocacoesMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemLocacoesMesActionPerformed

    private void MenuItemVeiculosNacionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVeiculosNacionaisActionPerformed
        // TODO add your handling code here:
        Object rows[][] = new Object[12][this.veiculos.size()];
        
        int i = 0;
        for(Veiculo v: this.veiculos){
            if(v instanceof VeiculoNacional){
                Object[] data = {
                v.getCodigoVeiculo(), 
                v.getNomeModelo(),
                v.getMontadora(),
                v.getAnoFabricacao(),
                v.getAnoModelo(),
                v.getPlaca(),
                v.getCategoria(),
                String.format("%.2f", v.getValorFipe()),
                String.format("%.2f", v.getValorDiaria()),
                (v.getAlugado()?"Sim":"Não"),
                String.format("%.2f", ((VeiculoNacional)v).getTaxaImpostoEstadual()),
                "-"};
            
                rows[i] = data;
                i++;
            }
        }
        tableVeiculo(rows, i);
    }//GEN-LAST:event_MenuItemVeiculosNacionaisActionPerformed

    private void MenuItemLocacoesRealizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemLocacoesRealizadasActionPerformed
        // TODO add your handling code here:
        Object rows[][] = new Object[12][this.locacoes.size()];
        String segurosContratados = "";
        
        int i = 0;
        for(Locacao l: this.locacoes){
            for(Seguro s: l.getSegurosContratados()){
                segurosContratados += s.getNome() + ", ";
            }
                Object[] data = {
                l.getCodigoLocacao(), 
                l.getCodigoCliente(),
                l.getCodigoFuncionario(),
                l.getVeiculoLocado().getCodigoVeiculo(),
                (l.getDataLocacao().get(Calendar.DATE)
                        +"-"+l.getDataLocacao().get(Calendar.MONTH)
                        +"-"+l.getDataLocacao().get(Calendar.YEAR)),
                (l.getDataDevolucao().get(Calendar.DATE)
                        +"-"+l.getDataDevolucao().get(Calendar.MONTH)
                        +"-"+l.getDataDevolucao().get(Calendar.YEAR)),
                 String.format("%.2f", l.getValorTotal()),
                l.getFormaPagamento().getTipoPagamento(),
                segurosContratados,
                (l.getFinalizada()?"Sim":"Não")
                };
            
                rows[i] = data;
                i++;
        }
        tableLocacao(rows, i);
    }//GEN-LAST:event_MenuItemLocacoesRealizadasActionPerformed

    private void MenuItemVeiculosImportadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVeiculosImportadosActionPerformed
        // TODO add your handling code here:
        Object rows[][] = new Object[12][this.veiculos.size()];
        
        int i = 0;
        for(Veiculo v: this.veiculos){
            if(v instanceof VeiculoImportado){
                Object[] data = {
                v.getCodigoVeiculo(), 
                v.getNomeModelo(),
                v.getMontadora(),
                v.getAnoFabricacao(),
                v.getAnoModelo(),
                v.getPlaca(),
                v.getCategoria(),
                String.format("%.2f", v.getValorFipe()),
                String.format("%.2f", v.getValorDiaria()),
                (v.getAlugado()?"Sim":"Não"),
                String.format("%.2f", ((VeiculoImportado)v).getTaxaImpostoEstadual()),
                String.format("%.2f", ((VeiculoImportado)v).getTaxaImpostoFederal())};
            
                rows[i] = data;
                i++;
            }
        }
        tableVeiculo(rows, i);
    }//GEN-LAST:event_MenuItemVeiculosImportadosActionPerformed

    private void MenuItemVeiculosDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVeiculosDispActionPerformed
        // TODO add your handling code here:
        
        Object rows[][] = new Object[12][veiculos.size()];
        
        int i = 0;
        for(Veiculo v: this.veiculos){
            if(!v.getAlugado()){
                Object[] data = {
                v.getCodigoVeiculo(), 
                v.getNomeModelo(),
                v.getMontadora(),
                v.getAnoFabricacao(),
                v.getAnoModelo(),
                v.getPlaca(),
                v.getCategoria(),
                String.format("%.2f", v.getValorFipe()),
                String.format("%.2f", v.getValorDiaria()),
                (v.getAlugado()?"Sim":"Não"),
                (v instanceof VeiculoImportado 
                    ? String.format("%.2f",((VeiculoImportado)v).getTaxaImpostoEstadual())
                    : String.format("%.2f",((VeiculoNacional)v).getTaxaImpostoEstadual())),
                (v instanceof VeiculoImportado 
                    ? String.format("%.2f",((VeiculoImportado)v).getTaxaImpostoFederal())
                    : "-")};
            
                rows[i] = data;
                i++;
            }
        }
        
        tableVeiculo(rows, i);
    }//GEN-LAST:event_MenuItemVeiculosDispActionPerformed

    private void MenuItemVeiculosLocadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVeiculosLocadosActionPerformed
        // TODO add your handling code here:
        
        Object rows[][] = new Object[12][veiculos.size()];
        
        int i = 0;
        for(Veiculo v: this.veiculos){
            if(v.getAlugado()){
                Object[] data = {
                v.getCodigoVeiculo(), 
                v.getNomeModelo(),
                v.getMontadora(),
                v.getAnoFabricacao(),
                v.getAnoModelo(),
                v.getPlaca(),
                v.getCategoria(),
                String.format("%.2f", v.getValorFipe()),
                String.format("%.2f", v.getValorDiaria()),
                (v.getAlugado()?"Sim":"Não"),
                (v instanceof VeiculoImportado 
                    ? String.format("%.2f",((VeiculoImportado)v).getTaxaImpostoEstadual())
                    : String.format("%.2f",((VeiculoNacional)v).getTaxaImpostoEstadual())),
                (v instanceof VeiculoImportado 
                    ? String.format("%.2f",((VeiculoImportado)v).getTaxaImpostoFederal())
                    : "-")};
            
                rows[i] = data;
                i++;
            }
        }
        
        tableVeiculo(rows, i);
    }//GEN-LAST:event_MenuItemVeiculosLocadosActionPerformed

    private void MenuItemVeiculosAtrasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVeiculosAtrasoActionPerformed
        // TODO add your handling code here:
        
        Object rows[][] = new Object[12][veiculos.size()];
        
        Calendar today = Calendar.getInstance();
        
        int i = 0;
        Veiculo v;
        for(Locacao l: this.locacoes){
            if(Utilidades.daysBetween(today, l.getDataDevolucao()) < 0){
                
                v = l.getVeiculoLocado();
                
                Object[] data = {
                v.getCodigoVeiculo(), 
                v.getNomeModelo(),
                v.getMontadora(),
                v.getAnoFabricacao(),
                v.getAnoModelo(),
                v.getPlaca(),
                v.getCategoria(),
                String.format("%.2f", v.getValorFipe()),
                String.format("%.2f", v.getValorDiaria()),
                (v.getAlugado()?"Sim":"Não"),
                (v instanceof VeiculoImportado 
                    ? String.format("%.2f",((VeiculoImportado)v).getTaxaImpostoEstadual())
                    : String.format("%.2f",((VeiculoNacional)v).getTaxaImpostoEstadual())),
                (v instanceof VeiculoImportado 
                    ? String.format("%.2f",((VeiculoImportado)v).getTaxaImpostoFederal())
                    : "-")};
            
                rows[i] = data;
                i++;
            }
        }
        
        tableVeiculo(rows, i);
    }//GEN-LAST:event_MenuItemVeiculosAtrasoActionPerformed

    private void MenuItemVeiculosLocClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVeiculosLocClienteActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MenuItemVeiculosLocClienteActionPerformed

    private void MenuItemLocacoesFinalizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemLocacoesFinalizadasActionPerformed
        // TODO add your handling code here:
        Object rows[][] = new Object[12][this.locacoes.size()];
        String segurosContratados = "";
        
        int i = 0;
        for(Locacao l: this.locacoes){
            if(l.getFinalizada()){
                for(Seguro s: l.getSegurosContratados()){
                segurosContratados += s.getNome() + ", ";
                }
                Object[] data = {
                l.getCodigoLocacao(), 
                l.getCodigoCliente(),
                l.getCodigoFuncionario(),
                l.getVeiculoLocado().getCodigoVeiculo(),
                (l.getDataLocacao().get(Calendar.DATE)
                        +"-"+l.getDataLocacao().get(Calendar.MONTH)
                        +"-"+l.getDataLocacao().get(Calendar.YEAR)),
                (l.getDataDevolucao().get(Calendar.DATE)
                        +"-"+l.getDataDevolucao().get(Calendar.MONTH)
                        +"-"+l.getDataDevolucao().get(Calendar.YEAR)),
                String.format("%.2f", l.getValorTotal()),
                l.getFormaPagamento().getTipoPagamento(),
                segurosContratados,
                (l.getFinalizada()?"Sim":"Não")
                };
            
                rows[i] = data;
                i++;
            }
        }
        tableLocacao(rows, i);
    }//GEN-LAST:event_MenuItemLocacoesFinalizadasActionPerformed

    private void MenuItemLocacoesNaoFinalizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemLocacoesNaoFinalizadasActionPerformed
        // TODO add your handling code here:
        Object rows[][] = new Object[12][this.locacoes.size()];
        String segurosContratados = "";
        
        int i = 0;
        for(Locacao l: this.locacoes){
            if(!l.getFinalizada()){
                for(Seguro s: l.getSegurosContratados()){
                segurosContratados += s.getNome() + ", ";
                }
                Object[] data = {
                l.getCodigoLocacao(), 
                l.getCodigoCliente(),
                l.getCodigoFuncionario(),
                l.getVeiculoLocado().getCodigoVeiculo(),
                (l.getDataLocacao().get(Calendar.DATE)
                        +"-"+l.getDataLocacao().get(Calendar.MONTH)
                        +"-"+l.getDataLocacao().get(Calendar.YEAR)),
                (l.getDataDevolucao().get(Calendar.DATE)
                        +"-"+l.getDataDevolucao().get(Calendar.MONTH)
                        +"-"+l.getDataDevolucao().get(Calendar.YEAR)),
                 String.format("%.2f", l.getValorTotal()),
                l.getFormaPagamento().getTipoPagamento(),
                segurosContratados,
                (l.getFinalizada()?"Sim":"Não")
                };
            
                rows[i] = data;
                i++;
            }
        }
        tableLocacao(rows, i);
    }//GEN-LAST:event_MenuItemLocacoesNaoFinalizadasActionPerformed

    private void MenuItemLocacoesAtrasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemLocacoesAtrasoActionPerformed
        // TODO add your handling code here:
        Object rows[][] = new Object[12][this.locacoes.size()];
        String segurosContratados = "";
        Calendar today = Calendar.getInstance();
        
        int i = 0;
        for(Locacao l: this.locacoes){
            if(Utilidades.daysBetween(today, l.getDataDevolucao()) < 0){
                for(Seguro s: l.getSegurosContratados()){
                segurosContratados += s.getNome() + ", ";
                }
                Object[] data = {
                l.getCodigoLocacao(), 
                l.getCodigoCliente(),
                l.getCodigoFuncionario(),
                l.getVeiculoLocado().getCodigoVeiculo(),
                (l.getDataLocacao().get(Calendar.DATE)
                        +"-"+l.getDataLocacao().get(Calendar.MONTH)
                        +"-"+l.getDataLocacao().get(Calendar.YEAR)),
                (l.getDataDevolucao().get(Calendar.DATE)
                        +"-"+l.getDataDevolucao().get(Calendar.MONTH)
                        +"-"+l.getDataDevolucao().get(Calendar.YEAR)),
                 String.format("%.2f", l.getValorTotal()),
                l.getFormaPagamento().getTipoPagamento(),
                segurosContratados,
                (l.getFinalizada()?"Sim":"Não")
                };
            
                rows[i] = data;
                i++;
            }
        }
        tableLocacao(rows, i);
    }//GEN-LAST:event_MenuItemLocacoesAtrasoActionPerformed

    private void MenuItemSegurosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSegurosCadastradosActionPerformed
        // TODO add your handling code here:
        Object rows[][] = new Object[12][this.seguros.size()];
        
        int i = 0;
        for(Seguro s: this.seguros){
            Object[] data = {
            s.getCodigoSeguro(),
            s.getNome(),
            s.getTipo(),
            s.getDescricao(),
             String.format("%.2f", s.getValor())
            };

            rows[i] = data;
            i++;
        }
        tableSeguro(rows, i);
    }//GEN-LAST:event_MenuItemSegurosCadastradosActionPerformed

    private void MenuItemFunCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFunCadastradosActionPerformed
        // TODO add your handling code here:
        Object rows[][] = new Object[12][this.usuarios.size()];
        
        int i = 0;
        for(Funcionario f: controller.getFuncionarios()){
            Object[] data = {
                f.getCodigoUsuario(),
                f.getNome(),
                f.getCpf(),
                f.getRg(),
                f.getCep(),
                f.getEndereco(),
                (f.getDataNascimento().get(Calendar.DATE)
                        +"-"+f.getDataNascimento().get(Calendar.MONTH)
                        +"-"+f.getDataNascimento().get(Calendar.YEAR)),
                f.getEmail(),
                f.getPis(),
                (f.getDataAdmissao().get(Calendar.DATE)
                        +"-"+f.getDataAdmissao().get(Calendar.MONTH)
                        +"-"+f.getDataAdmissao().get(Calendar.YEAR)),
                 String.format("%.2f", f.getSalario())
            };

            rows[i] = data;
            i++;
        }
        tableFuncionario(rows, i);
    }//GEN-LAST:event_MenuItemFunCadastradosActionPerformed

    private void MenuItemClientesCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemClientesCadastradosActionPerformed
        // TODO add your handling code here:
        Object rows[][] = new Object[12][this.usuarios.size()];
        
        int i = 0;
        for(Cliente c: controller.getClientes()){
            Object[] data = {
                c.getCodigoUsuario(),
                c.getNome(),
                c.getCpf(),
                c.getRg(),
                c.getCep(),
                c.getEndereco(),
                (c.getDataNascimento().get(Calendar.DATE)
                        +"-"+c.getDataNascimento().get(Calendar.MONTH)
                        +"-"+c.getDataNascimento().get(Calendar.YEAR)),
                c.getEmail(),
                c.getCategoriaCNH(),
                c.getNumeroCNH(),
                (c.getValidadeCNH().get(Calendar.DATE)
                        +"-"+c.getValidadeCNH().get(Calendar.MONTH)
                        +"-"+c.getValidadeCNH().get(Calendar.YEAR))
            };

            rows[i] = data;
            i++;
        }
        tableCliente(rows, i);
    }//GEN-LAST:event_MenuItemClientesCadastradosActionPerformed

    private void MenuItemClienteLocAtrasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemClienteLocAtrasoActionPerformed
        // TODO add your handling code here:
        Object rows[][] = new Object[12][veiculos.size()];
        
        Calendar today = Calendar.getInstance();
        
        int i = 0;
        Cliente c;
        for(Locacao l: this.locacoes){
            if(Utilidades.daysBetween(today, l.getDataDevolucao()) < 0){
                
                c = controller.getClienteByCodigo(l.getCodigoCliente());
                
                Object[] data = {
                c.getCodigoUsuario(),
                c.getNome(),
                c.getCpf(),
                c.getRg(),
                c.getCep(),
                c.getEndereco(),
                (c.getDataNascimento().get(Calendar.DATE)
                        +"-"+c.getDataNascimento().get(Calendar.MONTH)
                        +"-"+c.getDataNascimento().get(Calendar.YEAR)),
                c.getEmail(),
                c.getCategoriaCNH(),
                c.getNumeroCNH(),
                (c.getValidadeCNH().get(Calendar.DATE)
                        +"-"+c.getValidadeCNH().get(Calendar.MONTH)
                        +"-"+c.getValidadeCNH().get(Calendar.YEAR))
                };
            
                rows[i] = data;
                i++;
            }
        }
        
        tableCliente(rows, i);
    }//GEN-LAST:event_MenuItemClienteLocAtrasoActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Relatorios dialog = new Relatorios(new javax.swing.JFrame(), true);
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
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenu MenuFuncionarios;
    private javax.swing.JMenuItem MenuItemClienteLocAtraso;
    private javax.swing.JMenuItem MenuItemClientesCadastrados;
    private javax.swing.JMenuItem MenuItemFunCadastrados;
    private javax.swing.JMenuItem MenuItemFunMes;
    private javax.swing.JMenuItem MenuItemLocCliente;
    private javax.swing.JMenuItem MenuItemLocacoesAtraso;
    private javax.swing.JMenuItem MenuItemLocacoesFinalizadas;
    private javax.swing.JMenuItem MenuItemLocacoesMes;
    private javax.swing.JMenuItem MenuItemLocacoesNaoFinalizadas;
    private javax.swing.JMenuItem MenuItemLocacoesRealizadas;
    private javax.swing.JMenuItem MenuItemSegurosCadastrados;
    private javax.swing.JMenuItem MenuItemVeiculosAtraso;
    private javax.swing.JMenuItem MenuItemVeiculosCadastrados;
    private javax.swing.JMenuItem MenuItemVeiculosDisp;
    private javax.swing.JMenuItem MenuItemVeiculosImportados;
    private javax.swing.JMenuItem MenuItemVeiculosLocCliente;
    private javax.swing.JMenuItem MenuItemVeiculosLocados;
    private javax.swing.JMenuItem MenuItemVeiculosNacionais;
    private javax.swing.JMenu MenuLocacoes;
    private javax.swing.JMenu MenuSeguros;
    private javax.swing.JMenu MenuVeiculos;
    private javax.swing.JPanel PanelRelatorio;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JTable Table;
    // End of variables declaration//GEN-END:variables
}
