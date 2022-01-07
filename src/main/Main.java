
package main;



import javax.swing.JFrame;
import views.Home;

/**
 *
 * @author Karolyne Marques
 */
public class Main {

    public static void main(String[] args) {
        Home home = new Home();;
        
        home.setVisible(true);
        home.setTitle("Aluguel de Veículos");
        
        //tela em full screen
        home.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}
