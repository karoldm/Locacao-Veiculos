
package models;

import java.util.Calendar;

/**
 *
 * @author karolyne Marques
 */
public class Cliente extends Usuario{
    protected String categoriaCNH;
    protected String numeroCNH;
    protected Calendar validadeCNH;
    protected boolean clienteOuro;
    
    public Cliente(int codigoUsuario,
            String nome,
            String cpf,
            String rg,
            Calendar dataNascimento,
            String endereco,
            String cep,
            String email,
            String categoriaCNH,
            String numeroCNH,
            Calendar validadeCNH,
            boolean clienteOuro){
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.categoriaCNH = categoriaCNH;
        this.numeroCNH = numeroCNH;
        this.validadeCNH = validadeCNH;
        this.clienteOuro = clienteOuro;
    }

    public String getCategoriaCNH() {
        return categoriaCNH;
    }

    public void setCategoriaCNH(String categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public Calendar getValidadeCNH() {
        return validadeCNH;
    }

    public void setValidadeCNH(Calendar validadeCNH) {
        this.validadeCNH = validadeCNH;
    }

    public boolean getClienteOuro() {
        return clienteOuro;
    }

    public void setClienteOuro(boolean clienteOuro) {
        this.clienteOuro = clienteOuro;
    }
    
    @Override
    public String toString(){
        return super.toString() 
                + "\nCategoria da CNH: " + getCategoriaCNH()
                + "\nNúmero da CNH: " + getNumeroCNH()
                + "\nValidade da CNH: " + getValidadeCNH()
                + "\nCliente de Ouro: " + (getClienteOuro() ? "Sim" : "Não");
    }
}
