
package entidade;

import java.io.Serializable;

/**
 *
 * @author Aislan
 */
public class Aluno extends Usuario implements Serializable {
    
    public Aluno(String nome, String email, String nomeUsuario, String senha, String matricula){
        super(nome, email, nomeUsuario, senha, matricula);
        
    }
    
    
}
