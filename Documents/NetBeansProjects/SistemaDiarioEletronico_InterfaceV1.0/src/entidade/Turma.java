
package entidade;

import controle.GerenciadorUsuariosSingleton;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Aislan
 */
public class Turma implements Serializable {
    private String nome;
    private int cargaHoraria;
    private int identificador;
    private final ArrayList<Aluno> listaAlunos = new ArrayList();
    private Professor professor;
    private Cronograma cronograma;
    private Diario diario;

    public Turma(String nome, int cargaHoraria, int identificador){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }
    
    
    
    
    public boolean inserirAlunoNaTurma(Aluno aluno){
        //Verifica se o aluno já não está na Turma
        int existeAluno = 0;
        for(int i = 0; i < listaAlunos.size(); i ++){
            if(listaAlunos.get(i).equals(aluno)){
                existeAluno++;
            }
        }
        if(existeAluno == 0){
            return listaAlunos.add(aluno);
        } //aluno não está na turma
        
        return false; //aluno já existente
    }
    
    public boolean removerAlunoNaTurma(String matriculaAluno){
        for(int i = 0; i < listaAlunos.size(); i++){
            if(listaAlunos.get(i).getMatricula().equals(matriculaAluno)){
                listaAlunos.remove(listaAlunos.get(i));
                return true; //Conseguiu remover o Aluno
            }
            else{
                return false; //não conseguiu remover o Aluno
            }
        }
        return true;
    }
                                                               
    public boolean inserirCronogramaNaTurma(){
        int inserirCronograma = 0;
        if(inserirCronograma ==0){//Relação Todo-parte, só é possível inserir uma vez
            cronograma = new Cronograma();  
            inserirCronograma++;
            return true;
        }    
        else{
            return false;
        }
    }
        
    public boolean inserirDiarioNaTurma(){
        int inserirDiario = 0;
        if(inserirDiario == 0){ //Relação Todo-parte, só é possível inserir uma vez
            diario = new Diario();
            inserirDiario++;
            return true;
        }
        else{
            return false;
        }
    }

    public Diario getDiario() {
        return diario;
    }
    
    //como recuperar um professor? no gerenciador de usuarios?
    public boolean inserirProfessorTurma(String matricula){ //como validar professor? 
        System.out.println("forafor");    
        for(int i = 0; i < GerenciadorUsuariosSingleton.getInstance().getListaProfessores().size();i++){
                professor = GerenciadorUsuariosSingleton.getInstance().getListaProfessores().get(i);
                System.out.println("professor inserido");
                return true;
            }
            
        
        return false;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    @Override
    public String toString() {
        return "Nome = " + nome + " | Professor = " + professor + "| Carga horaria = " + cargaHoraria + "| identificador = " + identificador + " | lista de alunos matriculados = " + listaAlunos + " | cronograma = " + cronograma + " | diario = " + diario;
    } 
    
    
}
