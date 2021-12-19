
package models;

/**
 *
 * @author karolyne Marques
 */
public class Dinheiro extends Pagamento {
    
    public Dinheiro(){
        super("Dinheiro");
    }
    
    @Override
    public String toString(){
        return "\nTipo de Pagamento: " + getTipoPagamento();
    }
}
