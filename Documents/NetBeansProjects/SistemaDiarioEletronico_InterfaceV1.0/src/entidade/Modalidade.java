/*
 * ENUMERAÇÃO DE MODALIDADES (a distância ou presencial)
*/
package entidade;

/**
 *
 * @author Aislan
 */
public enum Modalidade {
    PRESENCIAL(1), A_DISTANCIA(2);
    private final int valor;
    
    Modalidade(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

}
