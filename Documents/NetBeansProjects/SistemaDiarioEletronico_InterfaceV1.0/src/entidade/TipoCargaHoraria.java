package entidade;

/**
 *
 * @author Aislan
 */
public enum TipoCargaHoraria {
    TEORICA(1), PRATICA(2), TEORICA_PRATICA(0);
    private final int cargaHoraria;
    
    TipoCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    
    public int getCargaHoraria(){
        return cargaHoraria;
    }
}
