/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;
import entidade.Aluno;
import entidade.Aula;
import entidade.Disciplina;
import entidade.TipoCargaHoraria;
import entidade.Turma;
import entidade.Usuario;
import entidade.Curso;
import entidade.Professor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GerenciadorDisciplinasSingleton {
    
    private static GerenciadorDisciplinasSingleton instance;
    ArrayList <Disciplina> listaDisciplinas  = new ArrayList();//estaciado apenas para fazer testes sendo que esta lista vai vim do BD
    //private ArrayList<Disciplina> listaDisciplinas = new ArrayList();
    //private final ArrayList<Turma> listaTurmas = new ArrayList();
    private final ArrayList<CelulaDiario> listaCelulaDiario = new ArrayList();
    private HashMap<Aluno, CelulaDiario> faltas = new HashMap();
    
    public GerenciadorDisciplinasSingleton(){}
    
    public static GerenciadorDisciplinasSingleton getInstance(){
        if(instance == null){
            instance = new GerenciadorDisciplinasSingleton();
        }
        return instance;
    }

    public ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }
    
    public boolean removerDisciplina(String siglaDisciplina){//parametro array list foi paassado apenas para testar
        for(int i=0;i<listaDisciplinas.size();i++){
            if(listaDisciplinas.get(i).getSigla().equals(siglaDisciplina)){
                //System.out.println(listaDisciplinas.get(i).getSigla());
                listaDisciplinas.remove(i);
               return true;
            }
        }
        return false;
    }
      
    public HashMap<Aluno, ArrayList<Aula>> obterRelatorioFaltasDisciplinaDocente(String matriculaProfessor,String siglaDisciplina){//parametro array list foi paassado apenas para testar
        
        for(int i=0;i<listaDisciplinas.size();i++){
            if(listaDisciplinas.get(i).getSigla().equals(siglaDisciplina)){                 
                for(int j=0;j<listaDisciplinas.get(i).getListaTurmas().size();j++){
//                    if(listaDisciplinas.get(i).getListaTurmas().get(j).getMatriculaProfessor().equals(matriculaProfessor)){
//                        
//                        return listaDisciplinas.get(i).getListaTurmas().get(j).getDiario().retornaDiarioDeFaltas();
//                    }
                }    
            }
    
        }
        return null;
    }
    
    public ArrayList<Disciplina> carregarDisciplinasPorCursoDoArquivo(String siglaCurso) throws IOException{
        LeitorArquivoBinario leitor = new LeitorArquivoBinario();
        leitor.abrirArquivoLeitura("cursos.bin");
        ArrayList<Curso> listaCursos;
        try {
            listaCursos = leitor.obterObjetosArquivo();
            for(int i = 0; i < leitor.obterObjetosArquivo().size(); i++){
                if(listaCursos.get(i).getSigla().equals(siglaCurso)){
                    listaDisciplinas = listaCursos.get(i).getListaDisciplinas();
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo de cursos");
        }
        leitor.fecharArquivoLeitura();
        return listaDisciplinas;
    }
    
}
    

