
package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

import utils.Utilidades;

/**
 *
 * @author karolyne Marques
 */
public class Locacao implements Serializable{
    private int codigoLocacao;
    private int codigoCliente;
    private int codigoFuncionario;
    private Veiculo veiculoLocado;
    private Calendar dataLocacao;
    private Calendar dataDevolucao;
    private float valorTotal;
    private Pagamento formaPagamento;
    private ArrayList<Seguro> segurosContratados;
    private boolean finalizada;
    
    public Locacao(int codigoLocacao,
            int codigoCliente,
            int codigoFuncionario,
            Veiculo veiculoLocado,
            Calendar dataLocacao,
            Calendar dataDevolucao,
            float valorTotal,
            Pagamento formaPagamento,
            ArrayList<Seguro> segurosContratados,
            boolean finalizada){
        this.codigoLocacao = codigoLocacao;
        this.codigoCliente = codigoCliente;
        this.codigoFuncionario = codigoFuncionario;
        this.veiculoLocado = veiculoLocado;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.segurosContratados = segurosContratados;
        this.finalizada = finalizada;
        
    }

    public Veiculo getVeiculoLocado() {
        return veiculoLocado;
    }

    public void setVeiculoLocado(Veiculo veiculoLocado) {
        this.veiculoLocado = veiculoLocado;
    }

    public int getCodigoLocacao() {
        return codigoLocacao;
    }

    public void setCodigoLocacao(int codigoLocacao) {
        this.codigoLocacao = codigoLocacao;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public Calendar getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Calendar dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ArrayList<Seguro> getSegurosContratados() {
        return this.segurosContratados;
    }

    public void setSegurosContratados(ArrayList<Seguro> segurosContratados) {
        this.segurosContratados = segurosContratados;
    }

    public boolean getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
    
    public float calcularValorTotal(){
        float diaria = getVeiculoLocado().getValorDiaria(); 
        
        long diasAlugados = Utilidades.daysBetween(getDataLocacao(), getDataDevolucao());

        float valorSeguros = 0;
        
        for(Seguro s: segurosContratados){
            valorSeguros += s.getValor();
        }
        
        return (diaria*diasAlugados)+valorSeguros;
    }
    
    public boolean possuiSeguro(){
        return getSegurosContratados().size() > 0;
    }
    
    public boolean verificarAtraso(){
        Calendar today = Calendar.getInstance();
        
        long atraso = Utilidades.daysBetween(getDataDevolucao(), today);
        
        //se atraso <= 0 então já passou o dia da devolução, return true
        return (atraso <= 0);
    }
    
    private String toStringSeguros(){
        String seguros = "";
        if(getSegurosContratados().size() > 0){
            for(Seguro seg: segurosContratados){
                seguros += seg.toString();
            }
        }
        return seguros;
    }
    
    @Override
    public String toString(){
        return "\nCódigo de Locação: " + getCodigoLocacao()
                + "\nCódigo do Cliente: " + getCodigoCliente()
                + "\nCódigo do Funcionário: " + getCodigoFuncionario()
                + "\nData de Locação: " + getDataLocacao()
                + "\nData de Devolução: " + getDataDevolucao()
                + "\nValor Total: " + getValorTotal()
                + "\nFroma de Pagamento: " + getFormaPagamento()
                + "\nSeguros Contratados: " + (!"".equals(toStringSeguros()) ? toStringSeguros() : "Não há seguros contratados :c")
                + "\nLocação Finalizada: " + (getFinalizada() ? "Sim" : "Não");
    }
}
