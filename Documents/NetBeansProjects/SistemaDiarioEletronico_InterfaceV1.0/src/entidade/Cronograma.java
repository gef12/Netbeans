
package entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Aislan
 */
public class Cronograma implements Serializable{
    private ArrayList<Aula> listaAulas = new ArrayList();
    private int existeAula = 0; 

    public boolean inserirAula(String descricaoAula,int duracaoEmMinutos,TipoAula tipo,Date data,Horario horario,Local local){
        //Verificando se existe aula já cadastrada
        for(int i = 0; i < listaAulas.size();i++){
            if((listaAulas.get(i).getDescricao().equals(descricaoAula)) && (listaAulas.get(i).getDuracaoEmMinutos()==duracaoEmMinutos)
                    && (listaAulas.get(i).getTipo().equals(tipo))){
                existeAula++;//existe aula no cronograma
            }
        }
        if(existeAula==0){ //não existe aula cadastrada
            return listaAulas.add(new Aula(descricaoAula, duracaoEmMinutos, data, tipo, horario, local));
        }
        return false;
    }
    
    public void removerAula(Date data,Horario horario){
        for(int i = 0; i < listaAulas.size(); i++){
            if((listaAulas.get(i).getData().equals(data)) && (listaAulas.get(i).getHorario().equals(horario))){
                listaAulas.remove(i); 
            }
        }
    }
    
}
