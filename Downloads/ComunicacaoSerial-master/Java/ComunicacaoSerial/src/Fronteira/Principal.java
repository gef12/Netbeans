/*
 * 
 */
package Fronteira;

import controle.GerenciadorSingleton;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.IOException;


public class Principal {
    public static void main(String[] args) throws IOException {
        GerenciadorSingleton novo=new GerenciadorSingleton();
        //novo.inicirSistema();
        
        TelaPrincipal tc = new TelaPrincipal();
        tc.setExtendedState(MAXIMIZED_BOTH);
        tc.setVisible(true);
        //novo.EnviarTemperatura();
        
    }
                
    }
    
    

