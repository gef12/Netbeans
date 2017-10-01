package entidade;

import java.io.Serializable;

/**
 *
 * @author Aislan
 */
public class Horario implements Serializable{
    private int horas;
    private int minutos;
    
    public Horario(int hora, int minuto){
        this.horas = hora;
        this.minutos = minuto;
    }

    public int getHora() {
        return horas;
    }

    public void setHora(int hora) {
        this.horas = hora;
    }

    public int getMinuto() {
        return minutos;
    }

    public void setMinuto(int minuto) {
        this.minutos = minuto;
    }

    @Override
    public String toString() {
        return "Horário=> " +  horas + "h" + minutos + "min";
    }
    
    
}
