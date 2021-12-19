
package views;


import Controller.Controller;
import javax.swing.JFrame;

/**
 *
 * @author Karolyne Marques
 */
public class Main {

    public static void main(String[] args) {
//        Home home = new Home();
//        
//        home.setVisible(true);
//        home.setTitle("Aluguel de Veículos");
//        
//        //tela em full screen
//        home.setExtendedState(JFrame.MAXIMIZED_BOTH);
//            
            Controller controller = new Controller();
            
      
            System.out.println(controller.getLocacoes().toString());
        
    }
    
}
