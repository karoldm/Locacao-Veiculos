
package Models;

import java.util.Calendar;

/**
 *
 * @author karolyne Marques
 */
public class Funcionario extends Usuario{
    protected float salario;
    protected String pis;
    protected Calendar dataAdmissao;
    
    public Funcionario(int codigoUsuario,
            String nome,
            String cpf,
            String rg,
            Calendar dataNascimento,
            String endereco,
            String cep,
            String email,
            float salario,
            String pis,
            Calendar dataAdmissao){
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.salario = salario;
        this.pis = pis;
        this.dataAdmissao = dataAdmissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    
    @Override
    public String toString(){
        return super.toString()
                + "\nSalário: " + getSalario()
                + "\nPIS: " + getPis()
                + "\nData de Admissão: " + getDataAdmissao();
    }
}
