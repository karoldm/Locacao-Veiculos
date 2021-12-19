
package models;

/**
 *
 * @author karolyne Marques
 */
public class VeiculoImportado extends Veiculo{
    protected float taxaImpostoEstadual;
    protected float taxaImpostoFederal;
    
    public VeiculoImportado(int codigoVeiculo, 
            String nomeModelo, 
            String montadora, 
            int anoFabricacao, 
            int anoModelo,
            String placa,
            String categoria,
            float valorFipe,
            float taxaImpostoEstadual,
            float taxaImpostoFederal){
        super(codigoVeiculo, 
              nomeModelo,
              montadora,
              anoFabricacao,
              anoModelo,
              placa,
              categoria,
              valorFipe);
        this.taxaImpostoEstadual = taxaImpostoEstadual;
        this.taxaImpostoFederal = taxaImpostoFederal;
       
    }

    public float getTaxaImpostoEstadual() {
        return taxaImpostoEstadual;
    }

    public void setTaxaImpostoEstadual(float taxaImpostoEstadual) {
        this.taxaImpostoEstadual = taxaImpostoEstadual;
    }

    public float getTaxaImpostoFederal() {
        return taxaImpostoFederal;
    }

    public void setTaxaImpostoFederal(float taxaImpostoFederal) {
        this.taxaImpostoFederal = taxaImpostoFederal;
    }
    
    @Override
    public float calcularValorDiaria(){
        return this.getValorFipe() 
                + getTaxaImpostoEstadual() 
                + getTaxaImpostoFederal();
    }
    
    @Override
    public String toString(){
        return super.toString()
                + "\nTaxa de Imposto Estadual: " + getTaxaImpostoEstadual()
                + "\nTaxa de Imposto Federal: " + getTaxaImpostoFederal();
    }
}
