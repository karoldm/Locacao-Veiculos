
package Controller;

import models.Locacao;
import models.Seguro;
import models.Usuario;
import models.Veiculo;

import database.Arquivos;

import java.util.ArrayList;
import java.util.Calendar;
import models.Cliente;
import models.Funcionario;

/**
 *
 * @author karolyne Marques
 */
public class Controller {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Locacao> locacoes = new ArrayList<>();
    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    private ArrayList<Seguro> seguros = new ArrayList<>();
    
    public Controller(){}

    public ArrayList<Locacao> getLocacoes() {
        this.locacoes = Arquivos.readLocacoes();
        return this.locacoes;
    }

    public ArrayList<Veiculo> getVeiculos() {
        this.veiculos = Arquivos.readVeiculos();
        return this.veiculos;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
        Arquivos.writeUsuarios(this.usuarios);
    }

    public void setLocacoes(ArrayList<Locacao> locacoes) {
        this.locacoes = locacoes;
        Arquivos.writeLocacoes(this.locacoes);
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
        Arquivos.writeVeiculos(this.veiculos);
    }

    public void setSeguros(ArrayList<Seguro> seguros) {
        this.seguros = seguros;
        Arquivos.writeSeguros(this.seguros);
    }

    public ArrayList<Usuario> getUsuarios() {
        this.usuarios = Arquivos.readUsuarios();
        return this.usuarios;
    }

    public ArrayList<Seguro> getSeguros() {
        this.seguros = Arquivos.readSeguros();
        return this.seguros;
    }
    
    public void addLocacao(Locacao data){
        this.locacoes = Arquivos.readLocacoes();
        this.locacoes.add(data);
        Arquivos.writeLocacoes(this.locacoes);
    }
    
    public void addVeiculo(Veiculo data){
        this.veiculos = Arquivos.readVeiculos();
        this.veiculos.add(data);
        Arquivos.writeVeiculos(this.veiculos);
    }
    
    public void addUsuario(Usuario data){
        this.usuarios = Arquivos.readUsuarios();
        this.usuarios.add(data);
        Arquivos.writeUsuarios(this.usuarios);
    }
    
    public void addSeguro(Seguro data){
        this.seguros = Arquivos.readSeguros();
        this.seguros.add(data);
        Arquivos.writeSeguros(this.seguros);
    }
    
    public Cliente getClienteByCodigo(int id){
        this.usuarios = Arquivos.readUsuarios();
        for(Usuario u: this.usuarios){
            if(u instanceof Cliente && u.getCodigoUsuario() == id){
                return (Cliente)u;
            }
        }
        return null;
    }
    
    public Locacao getLocacaoByCodigo(int id){
        this.locacoes = Arquivos.readLocacoes();
        for(Locacao l: this.locacoes){
            if(l.getCodigoLocacao() == id){
                return l;
            }
        }
        return null;
    }
    
    public Funcionario getFuncionarioByCodigo(int id){
        this.usuarios = Arquivos.readUsuarios();
        for(Usuario u: this.usuarios){
            if(u.getCodigoUsuario() == id){
                return (Funcionario)u;
            }
        }
        return null;
    }
    
    public Seguro getSeguroByCodigo(int id){
        this.seguros = Arquivos.readSeguros();
        for(Seguro s: this.seguros){
            if(s.getCodigoSeguro() == id){
                return s;
            }
        }
        return null;
    }
    
    public Veiculo getVeiculoByCodigo(int id){
        this.veiculos = Arquivos.readVeiculos();
        for(Veiculo v: this.veiculos){
            if(v.getCodigoVeiculo() == id){
                return v;
            }
        }
        return null;
    }
    
    public ArrayList<Funcionario> getFuncionarios(){
        this.usuarios = Arquivos.readUsuarios();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        for(Usuario u: this.usuarios){
            if(u instanceof Funcionario funcionario){
                funcionarios.add(funcionario);
            }
        }
        return funcionarios;
    }
    
    public ArrayList<Cliente> getClientes(){
        this.usuarios = Arquivos.readUsuarios();
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        for(Usuario u: this.usuarios){
            if(u instanceof Cliente cliente){
                clientes.add(cliente);
            }
        }
        return clientes;
    }
  
    public ArrayList<Locacao> getLocacoesByMes(int mes){
        this.locacoes = Arquivos.readLocacoes();
        ArrayList<Locacao> locacoesMes = new ArrayList<>();
        
        for(Locacao l: this.locacoes){
            if(l.getDataLocacao().get(Calendar.MONTH) == (mes)){
                locacoesMes.add(l);
            }
        }
        return locacoesMes;
    }
    
    public ArrayList<Locacao> getLocacoesCliente(int id){
        this.locacoes = Arquivos.readLocacoes();
        ArrayList<Locacao> locacoesCliente = new ArrayList<>();
        
        for(Locacao l: this.locacoes){
            if(l.getCodigoCliente() == id){
                locacoesCliente.add(l);
            }
        }
        
        return locacoesCliente;
    }
    
    public ArrayList<Veiculo> getVeiculosLocadosCliente(int id){
        ArrayList<Locacao> locacoesCliente = getLocacoesCliente(id);
        ArrayList<Veiculo> veiculosLocados = new ArrayList<>();
        
        for(Locacao l: locacoesCliente){
            veiculosLocados.add(l.getVeiculoLocado());
        }
        
        return veiculosLocados;
    }
    
    public Funcionario funcionarioMes(int mes){
        this.usuarios = Arquivos.readUsuarios();
        this.locacoes = Arquivos.readLocacoes();
        ArrayList<Funcionario> funcionarios = getFuncionarios();
        //armazena o código dos funcionarios que realizaram locações do mes dado
        //para cada locação armazenar o código do usuario na lista
        //o código que mais se repetir na lista é o código do funcionário do mês
        ArrayList<Integer> codigosFuncionario = new ArrayList<>();
        //armazena o código que mais apareceu na lista e quantas vezes apareceu
        int[] max = {-1, 0};
        
        for(Locacao l: this.locacoes){
            if(l.getDataLocacao().get(Calendar.MONTH) == (mes-1)){
                codigosFuncionario.add(l.getCodigoFuncionario());
            }
        }
        
        int idFun;
        int qtd = 0;
        
        for(Funcionario f: funcionarios){
            idFun = f.getCodigoUsuario();
            for(int id: codigosFuncionario){
                if(idFun == id){
                    qtd++;
                }
            }
            
            if(qtd > max[1]){
                max[1] = qtd;
                max[0] = idFun;
            }
            qtd = 0;
        }
        
        //nenhuma locação realizada no sistema ou nenhum funcionário cadastrado
        if(max[0] == -1) return null;
        return getFuncionarioByCodigo(max[0]);
    }
    
    public ArrayList<Seguro> getSegurosLocacao(int id){
        Locacao l = getLocacaoByCodigo(id);
        return l.getSegurosContratados();
    }
}