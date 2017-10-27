/*
 * 
 */
package area15;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.IOException;

/**
 *
 * @author Aislan
 */
public class Principal {
    public static void main(String[] args) throws IOException {
        Tela_login tc = new Tela_login();
        //tc.setExtendedState(MAXIMIZED_BOTH);
        tc.setVisible(true);
//        new TelaCadastrarUsuario_().setVisible(true);
        
//                GerenciadorDisciplinasSingleton.getInstance().obterTurma("Turma", 1, 0);
//
//        new TelaCadastroCursosBinario_().setVisible(true);
                
    }
    
}
