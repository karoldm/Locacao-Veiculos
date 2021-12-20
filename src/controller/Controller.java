
package Controller;

import models.Locacao;
import models.Seguro;
import models.Usuario;
import models.Veiculo;

import database.Arquivos;

import java.util.ArrayList;

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
  
}