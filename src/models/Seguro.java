
package models;

import java.io.Serializable;

/**
 *
 * @author karolyne Marques
 */
public class Seguro implements Serializable{
    private int codigoSeguro;
    private String nome;
    private String tipo;
    private String descricao;
    private float valor;
    
    public Seguro(int codigoSeguro, String nome, String tipo, String descricao, float valor){
        this.codigoSeguro = codigoSeguro;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getCodigoSeguro() {
        return codigoSeguro;
    }

    public void setCodigoSeguro(int codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
     @Override
     public String toString(){
         return "\nCódigo do Seguro: " + getCodigoSeguro()
                 + "\nNome: " + getNome()
                 + "\nTipo: " + getTipo()
                 + "\nDescrição: " + getDescricao()
                 + "\nValor: " + getValor();
     }
}
