package entidade;

import java.io.Serializable;

/**
 *
 * @author Aislan
 */
public class Local implements Serializable{
    private String nome;
    private String descricao;

    
    public Local(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Local=> " + nome + "  Descricão: " + descricao + ' ';
    }
    
}
