package entidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Aislan
 */
public class Diario {
    
    private HashMap<Aluno, ArrayList<Aula>> faltas = new HashMap();
    private ArrayList<Aula> listaFaltas;
    
    public Diario() {
        faltas = new HashMap<>();
    }
    
    public boolean inserirFalta(Aluno aluno, Aula aula){
        //Verifica se a lista de faltas está vazia
        listaFaltas = faltas.get(aluno);
        if(listaFaltas == null){
            listaFaltas = new ArrayList();
            faltas.put(aluno,listaFaltas); 

        }
        listaFaltas.add(aula);        
        return true;
    }
    
    public boolean removerFaltaDoAluno(Aluno aluno, Aula aula){
        if(faltas.get(aluno).isEmpty()){
            return false;
        }
        else{
            faltas.remove(aluno, aula);
            return true;
        }
    }
    
    public ArrayList<Aula> obterFaltasDoAluno(Aluno aluno, Date ateAData){
        ArrayList<Aula> faltaAluno = new ArrayList();
        for(int i = 0; i < faltas.get(aluno).size(); i++){
            if(faltas.get(aluno).get(i).getData().compareTo(ateAData)<=0){
               faltaAluno.add(faltas.get(aluno).get(i));
            }
        }
        return faltaAluno;
    }

    public HashMap<Aluno, ArrayList<Aula>> getFaltas() {
        return faltas;
    }

    public ArrayList<Aula> getListaFaltas() {
        return listaFaltas;
    }
    
    public HashMap<Aluno, ArrayList<Aula>>retornaDiarioDeFaltas(){
        return faltas;
        
    }

    @Override
    public String toString() {
        return "Diario{" + "faltas=" + faltas.toString() + ", listaFaltas=" + listaFaltas.toString() + '}';
    }
    
    
}

