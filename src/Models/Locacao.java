
package Models;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author karolyne Marques
 */
public class Locacao {
    private int codigoLocacao;
    private int codigoCliente;
    private int codigoFuncionario;
    private Calendar dataLocacao;
    private Calendar dataDevolucao;
    private float valorTotal;
    private Pagamento formaPagamento;
    private ArrayList<Seguro> segurosContratados;
    private Boolean finalizada;
    
    public Locacao(int codigoLocacao,
            int codigoCliente,
            int codigoFuncionario,
            Calendar dataLocacao,
            Calendar dataDevolucao,
            float valorTotal,
            Pagamento formaPagamento,
            ArrayList<Seguro> segurosContratados,
            Boolean finalizada){
        this.codigoLocacao = codigoLocacao;
        this.codigoCliente = codigoCliente;
        this.codigoFuncionario = codigoFuncionario;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.segurosContratados = segurosContratados;
        this.finalizada = finalizada;
        
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

    public Boolean getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(Boolean finalizada) {
        this.finalizada = finalizada;
    }
    
    public float calcularValorTotal(){
        return 0;
    }
    
    public Boolean possuiSeguro(){
        return getSegurosContratados().size() > 0;
    }
    
    public Boolean verificarAtraso(){
        Calendar today = Calendar.getInstance();
        return today == getDataDevolucao();
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
