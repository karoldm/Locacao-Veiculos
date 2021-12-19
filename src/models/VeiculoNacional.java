
package models;

/**
 *
 * @author karolyne Marques
 */
public class VeiculoNacional extends Veiculo{
    protected float taxaImpostoEstadual;
    
    public VeiculoNacional(int codigoVeiculo, 
            String nomeModelo, 
            String montadora, 
            int anoFabricacao, 
            int anoModelo,
            String placa,
            String categoria,
            float valorFipe,
            float taxaImpostoEstadual){
        super(codigoVeiculo, 
              nomeModelo,
              montadora,
              anoFabricacao,
              anoModelo,
              placa,
              categoria,
              valorFipe);
        this.taxaImpostoEstadual = taxaImpostoEstadual;
        
    }

    public float getTaxaImpostoEstadual() {
        return taxaImpostoEstadual;
    }

    public void setTaxaImpostoEstadual(float taxaImpostoEstadual) {
        this.taxaImpostoEstadual = taxaImpostoEstadual;
    }
    
    @Override
    public float calcularValorDiaria(){
       
        return this.getValorFipe() + getTaxaImpostoEstadual();
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTaxa de Imposto Estadual: " + getTaxaImpostoEstadual();
    }
}
