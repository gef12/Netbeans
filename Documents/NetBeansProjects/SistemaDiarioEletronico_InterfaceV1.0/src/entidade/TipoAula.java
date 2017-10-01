package entidade;

import java.io.Serializable;


/**
 *
 * @author Aislan
 */
public enum TipoAula implements Serializable {
    NORMAL(1), EXTRA(2);
    private final int valor;
        
    TipoAula(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return valor;
    }
}
