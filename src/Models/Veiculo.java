
package Models;

/**
 *
 * @author Karolyne Marques
 */
public abstract class Veiculo {
    protected int codigoVeiculo;
    protected String nomeModelo;
    protected String montadora;
    protected int anoFabricacao;
    protected int anoModelo;
    protected String placa;
    protected String categoria;
    protected float valorFipe;
    protected float valorDiaria;
    protected boolean alugado;
    
    public Veiculo(int codigoVeiculo, 
            String nomeModelo, 
            String montadora, 
            int anoFabricacao, 
            int anoModelo,
            String placa,
            String categoria,
            float valorFipe,
            float valorDiaria,
            boolean alugado){
        this.codigoVeiculo = codigoVeiculo;
        this.nomeModelo = nomeModelo;
        this.montadora = montadora;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.placa = placa;
        this.categoria = categoria;
        this.valorFipe = valorFipe;
        this.valorDiaria = valorDiaria;
        this.alugado = alugado;
    }

    public int getCodigoVeiculo() {
        return codigoVeiculo;
    }

    public void setCodigoVeiculo(int codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getValorFipe() {
        return valorFipe;
    }

    public void setValorFipe(float valorFipe) {
        this.valorFipe = valorFipe;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean getAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
    abstract float calcularValorDiaria();
    
    public boolean estaAlugado(){
        return getAlugado();
    }
    
    public boolean alugar(){
        if(!getAlugado()){
            setAlugado(true);
            return true;
        }
        return false; //Carro indisponivel
    }
    
    public void devolver(){
        setAlugado(false);
    }
    
    @Override
    public String toString(){
        return "\nCódigo do Veículo: " + getCodigoVeiculo()
                + "\nModelo do Veículo: " + getNomeModelo()
                + "\nMontadora: " + getMontadora()
                + "\nAno de Fabricação: " + getAnoFabricacao()
                + "\nAno do Modelo: " + getAnoModelo()
                + "\nPlaca do Veículo: " + getPlaca()
                + "\nCategoria: " + getCategoria()
                + "\nValor do Fipe: " + getValorFipe()
                + "\nValor da Diária: " + getValorDiaria();
       
    }
}
