
package entidade;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Aislan
 */
public class Curso implements Serializable {
    private String nome;
    private String sigla;
    private int cargaHoraria;
    private ArrayList<Disciplina> listaDisciplinas = new ArrayList();
    private ArrayList<Aluno> listaAlunos = new ArrayList();
    
    public void adicionarAluno(Aluno aluno){
        
        listaAlunos.add(aluno);
    }
    
    public ArrayList retornaArrayListAlunos(){
        
        return listaAlunos;
    }
    
    public boolean removerAluno(String matriculaAluno){
        
        int i;
        
        for(i=0;i<listaAlunos.size();i++){
            
            if(listaAlunos.get(i).getMatricula().equals(matriculaAluno)){
               return listaAlunos.remove(listaAlunos.get(i));
            }
        }
        
        return false;
    }
    
    public Curso(String nome, String sigla, int cargaHoraria){
        this.nome = nome;
        this.sigla = sigla;
        this.cargaHoraria = cargaHoraria;
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public boolean adicionarDisciplina(Disciplina disciplina){
        listaDisciplinas.add(disciplina);
        return true;
    }
    
    public boolean removerDisciplina(Disciplina disciplina){
        listaDisciplinas.remove(disciplina);
        return true;
    }
    public ArrayList<Disciplina> getListaDisciplinas(){
        return listaDisciplinas;
        
    }
    
    
    
    @Override
    public String toString(){
        return "Nome: " + nome + " | Sigla: " + sigla + " | Carga Horária: " + cargaHoraria + "\n";
    }
    
}
