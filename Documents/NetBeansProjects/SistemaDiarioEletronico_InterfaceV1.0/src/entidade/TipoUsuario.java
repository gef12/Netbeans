package entidade;

/**
 *
 * @author Aislan
 */
public enum TipoUsuario {
    PROFESSOR(1), ALUNO(2);
    private final int valor;
    
    TipoUsuario(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return valor;
    }
}
