
package database;

import models.Locacao;
import models.Veiculo;
import models.Usuario;
import models.Seguro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;

import utils.Constantes;

/**
 *
 * @author karolyne Marques
 */
public class Arquivos {
    
    public static ArrayList<Locacao> readLocacoes(){
        ArrayList<Locacao> data = new ArrayList<>();

        try {
            
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Constantes.pathLocacoes));
            data = (ArrayList<Locacao>)ois.readObject();
            ois.close();
            
        } catch (ClassNotFoundException ex) {
            
            System.out.println("Erro ao converter o arquivo em objeto");
            
        } catch (IOException ex) {
            
            System.out.println(ex);
            
        }

        return data;
    }
    
    public static void writeLocacoes(ArrayList<Locacao> data){
        try {
            
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Constantes.pathLocacoes));
            oos.writeObject(data);
            oos.close();
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("Erro ao ler o arquivo: " + Constantes.pathLocacoes);
            
        } catch (IOException ex) {
            
            System.out.println(ex);
            
        }
    }
    
    public static ArrayList<Veiculo> readVeiculos(){
        ArrayList<Veiculo> data = new ArrayList<>();

        try {
            
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Constantes.pathVeiculos));
            data = (ArrayList<Veiculo>)ois.readObject();
            ois.close();
            
        } catch (ClassNotFoundException ex) {
            
            System.out.println("Erro ao converter o arquivo em objeto");
            
        } catch (IOException ex) {
            
            System.out.println(ex);
            
        }

        return data;
    }
    
    public static void writeVeiculos(ArrayList<Veiculo> data){
        try {
            
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Constantes.pathVeiculos));
            oos.writeObject(data);
            oos.close();
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("Erro ao ler o arquivo: " + Constantes.pathVeiculos);
            
        } catch (IOException ex) {
            
            System.out.println(ex);
            
        }
    }
    
    public static ArrayList<Usuario> readUsuarios(){
        ArrayList<Usuario> data = new ArrayList<>();

        try {
            
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Constantes.pathUsuarios));
            data = (ArrayList<Usuario>)ois.readObject();
            ois.close();
            
        } catch (ClassNotFoundException ex) {
            
            System.out.println("Erro ao converter o arquivo em objeto");
            
        } catch (IOException ex) {
            
            System.out.println(ex);
        }

        return data;
    }
    
    public static void writeUsuarios(ArrayList<Usuario> data){
        try {
            
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Constantes.pathUsuarios));
            oos.writeObject(data);
            oos.close();
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("Erro ao ler o arquivo: " + Constantes.pathUsuarios);
            
        } catch (IOException ex) {
            
            System.out.println(ex);
            
        }
    }
    
    public static ArrayList<Seguro> readSeguros(){
        ArrayList<Seguro> data = new ArrayList<>();

        try {
            
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Constantes.pathSeguros));
            data = (ArrayList<Seguro>)ois.readObject();
            ois.close();
            
        } catch (ClassNotFoundException ex) {
            
            System.out.println("Erro ao converter o arquivo em objeto");
            
        } catch (IOException ex) {
            
            System.out.println(ex);
            
        }

        return data;
    }
    
    public static void writeSeguros(ArrayList<Seguro> data){
        try {
            
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Constantes.pathSeguros));
            oos.writeObject(data);
            oos.close();
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("Erro ao ler o arquivo: " + Constantes.pathSeguros);
            
        } catch (IOException ex) {
            
            System.out.println(ex);
            
        }
    }
}
