/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;
import entidade.Aluno;
import entidade.Curso;
import entidade.Disciplina;
import entidade.Turma;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Cláudio G
 */
public class GerenciadorCursosSingleton {
    
    
    private static GerenciadorCursosSingleton getInstance;
    private ArrayList<Curso> listadecursos = new ArrayList();
    private GerenciadorCursosSingleton(){}
    
    public static GerenciadorCursosSingleton getInstance(){
        if(getInstance == null){
            getInstance = new GerenciadorCursosSingleton();
        }
        return getInstance;
    }
    
//    public GerenciadorDisciplinasSingleton getInstanceGerenciadorDisciplinasSingleton(){
//        
//        return GerenciadorDisciplinasSingleton.getInstance();
//    }
    
    public boolean removerCurso(String sigla){
        int i;
        for(i=0;i<listadecursos.size();i++){
            if(listadecursos.get(i).getSigla().equals(sigla)){
               return listadecursos.remove(listadecursos.get(i));
            }
        }
        return false;
        
    }
    
    public void inserirCurso(String nome, String sigla, int cargaHoraria){
        Curso curso = new Curso(nome, sigla, cargaHoraria);
        listadecursos.add(curso);
    }
    

    
    public ArrayList<Curso> getListadecursos(){
        return listadecursos;
    }
    
    public boolean inserirAlunoEmCurso(Aluno aluno, String cursoSigla){
        int i;
        for(i=0;i<listadecursos.size();i++){
            if(listadecursos.get(i).getSigla().equals(cursoSigla)){
                listadecursos.get(i).adicionarAluno(aluno);
            }
        }
        return false;
    }
    
    public boolean removerAlunoEmCurso(String matriculaAluno, String cursoSigla){
        int i;
        for(i=0;i<listadecursos.size();i++){
            if(listadecursos.get(i).getSigla().equals(cursoSigla)){
                listadecursos.get(i).removerAluno(matriculaAluno);
            }
        }
        return false;
    }
    
    public Curso obterCurso(String sigla){
        Curso curso = null;        
        int i;        
        for(i=0;i<listadecursos.size();i++){
            if(listadecursos.get(i).getSigla().equals(sigla)){
                curso = listadecursos.get(i);
            }
        }
        return curso;
    }
    
     public Turma obterTurma(String nomeTurma,int identificador,int tipoCargaHoraria){
        Turma t = null;
        for(int i = 0; i < listadecursos.size();i++){
            if((listadecursos.get(i).getListaDisciplinas().get(i).getListaTurmas().get(i).getNome().equals(nomeTurma)) &&
                    (listadecursos.get(i).getListaDisciplinas().get(i).getListaTurmas().get(i).getIdentificador() == identificador) &&
                            (listadecursos.get(i).getListaDisciplinas().get(i).getListaTurmas().get(i).getCargaHoraria() == tipoCargaHoraria)){
                t = listadecursos.get(i).getListaDisciplinas().get(i).getListaTurmas().get(i);
//                System.out.println(t);
            }
//            System.out.println(GerenciadorCursosSingleton.getInstance().getListadecursos().get(i).getListaDisciplinas().get(i).getListaTurma().get(i));
        }
        return t;
    }
     
    public Disciplina obterDisciplina(String sigla) throws IOException{
        Disciplina d1 = null;
        for(int i = 0; i<listadecursos.size();i++){
            if(obterTodasDisciplinasCursoArquivo(listadecursos.get(i).getSigla()).get(i).getSigla().equals(sigla)){
                d1 = obterTodasDisciplinasCursoArquivo(listadecursos.get(i).getSigla()).get(i);
            }
        }
        return d1;
    } 
    
    public void salvarCursosArquivo()throws IOException{
        EscritorArquivoBinario escritor = new EscritorArquivoBinario();
        escritor.abrirArquivoEscrita("cursos.bin");
        escritor.escreverObjetoArquivo(listadecursos);
        escritor.fecharArquivoEscrita();
    }
    
    public void obterCursosArquivo() throws IOException{
        LeitorArquivoBinario leitor = new LeitorArquivoBinario();
        leitor.abrirArquivoLeitura("cursos.bin");
        listadecursos = leitor.obterObjetosArquivo();
        leitor.fecharArquivoLeitura();
    }
    
    public ArrayList<Disciplina> obterTodasDisciplinasCursoArquivo(String siglaCurso)throws IOException{
        LeitorArquivoBinario leitor = new LeitorArquivoBinario();
        leitor.abrirArquivoLeitura("cursos.bin");
        ArrayList<Disciplina> listaDisciplinas = new ArrayList();
        try {
            listadecursos = leitor.obterObjetosArquivo();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo!!! ");
        }
        leitor.fecharArquivoLeitura();
        for(int i = 0; i <listadecursos.size();i++){
            if(listadecursos.get(i).getSigla().equals(siglaCurso)){
                listaDisciplinas = listadecursos.get(i).getListaDisciplinas();
            }
        }
        return listaDisciplinas;
    }
    
}
