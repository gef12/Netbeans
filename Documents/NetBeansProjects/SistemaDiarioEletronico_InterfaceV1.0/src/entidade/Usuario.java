
package entidade;

import java.io.Serializable;

/**
 *
 * @author Aislan
 */
public abstract class Usuario implements Serializable {
    protected String nome;
    protected String email;
    protected String nomeUsuario;
    protected String senha;
    protected String matricula;
    
    public Usuario(String nome, String email, String nomeUsuario, String senha, String matricula){
        this.nome = nome;
        this.email = email;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return  "Nome = " + nome + " | email = " + email + " | nome de usuario = " + nomeUsuario +  " | matricula = " + matricula;
    }
    
    
}
