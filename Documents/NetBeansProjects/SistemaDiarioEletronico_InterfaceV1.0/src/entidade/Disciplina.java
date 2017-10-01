package entidade;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Aislan
 */

public class Disciplina implements Serializable {
    private String nome;
    private String sigla;
    private int cargaHorariaTeorica;
    private int cargaHorariaPratica;
    private final ArrayList<Turma> listaTurmas = new ArrayList();
    private int turmaExistente = 0; // variavel auxiliar para percorrer a lista de turmas para saber se a turma já existe

    
    public Disciplina(String nome, String sigla, int cargaHorariaTeorica, int cargaHorariaPratica) {
        this.nome = nome;
        this.sigla = sigla;
        this.cargaHorariaTeorica = cargaHorariaTeorica;
        this.cargaHorariaPratica = cargaHorariaPratica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getCargaHorariaTeorica() {
        return cargaHorariaTeorica;
    }

    public void setCargaHorariaTeorica(int cargaHorariaTeorica) {
        this.cargaHorariaTeorica = cargaHorariaTeorica;
    }

    public int getCargaHorariaPratica() {
        return cargaHorariaPratica;
    }

    public void setCargaHorariaPratica(int cargaHorariaPratica) {
        this.cargaHorariaPratica = cargaHorariaPratica;
    }

    public ArrayList<Turma> getListaTurmas() {
        return listaTurmas;
    }
    
    public Turma obterTurma(String nomeTurma){
        Turma t = null;
        for(int i = 0; i <getListaTurmas().size();i++){
            if(getListaTurmas().get(i).getNome().equals(nomeTurma)){
                t = getListaTurmas().get(i);
            }
        }
       return t; 
    }

    public TipoCargaHoraria obterTipoCargaHoraria(){
        if((cargaHorariaTeorica != 0 ) && (cargaHorariaPratica != 0)){
        }
        else if((cargaHorariaTeorica != 0 ) && (cargaHorariaPratica == 0)){
            return TipoCargaHoraria.TEORICA;
        }
        return TipoCargaHoraria.PRATICA;
    }
    
    public boolean inserirTurmaEmDisciplina(String nomeTurma, int identificador, TipoCargaHoraria tipoCargaHoraria, int valorCargaHoraria){
        for(int i = 0; i < listaTurmas.size(); i++){
            if((listaTurmas.get(i).getNome().equals(nomeTurma)) && (listaTurmas.get(i).getIdentificador() == identificador) && 
                    (listaTurmas.get(i).getCargaHoraria() == valorCargaHoraria)){ 
                turmaExistente++;//turma existente
            }
        }
        if(turmaExistente == 0) // turma não existe, logo é possível criá-la
            return listaTurmas.add(new Turma(nomeTurma, valorCargaHoraria, identificador));
        return false;
    }
    
    /*RECEBE O NOME DA TURMA IDENTIFICADOR E O VALOR DA CARGA HORÁRIA E REMOVE*/
    public boolean removerTurmaDaDisciplina(String nomeTurma, int identificador, int valorCargaHoraria, TipoCargaHoraria tipoCargaHoraria){
        for(int i = 0; i < listaTurmas.size(); i++){
            if((listaTurmas.get(i).getNome().equals(nomeTurma)) && (listaTurmas.get(i).getIdentificador() == identificador) && 
                    (listaTurmas.get(i).getCargaHoraria() == valorCargaHoraria)){ 
                listaTurmas.remove(i);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Disciplina" + " nome = " + nome + " | sigla = " + sigla + " | cargaHorariaTeorica = " 
                + cargaHorariaTeorica + " | cargaHorariaPratica = " + cargaHorariaPratica +  " | listaTurmas = " 
                + listaTurmas + "\n";
    }

   
}
