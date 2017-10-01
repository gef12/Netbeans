/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Aula;

/**
 *
 * @author rebeca
 */
class CelulaDiario {
    Aula aula;
    boolean falta;
    
    public CelulaDiario(Aula aula, boolean falta) {
        this.aula = aula;
        this.falta = falta;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public boolean isFalta() {
        return falta;
    }

    public void setFalta(boolean falta) {
        this.falta = falta;
    }
    
    
}
