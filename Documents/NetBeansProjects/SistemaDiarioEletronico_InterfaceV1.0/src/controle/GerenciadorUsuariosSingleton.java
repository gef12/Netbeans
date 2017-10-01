package controle;

import entidade.Aluno;
import entidade.Professor;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author Aislan
 */

public class GerenciadorUsuariosSingleton {
    private static GerenciadorUsuariosSingleton controladorUsuarios;
    private ArrayList<Aluno> listaAlunos = new ArrayList();
    private ArrayList<Professor> listaProfessores = new ArrayList();
    
    
    public GerenciadorUsuariosSingleton(){}
    
    public static GerenciadorUsuariosSingleton getInstance(){
        if(controladorUsuarios == null){
            controladorUsuarios = new GerenciadorUsuariosSingleton();
        }
        return controladorUsuarios;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public ArrayList<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(ArrayList<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }
    
    public boolean cadastrarProfessor(String nome, String email, String nomeUsuario, String matricula, String senha){
        listaProfessores.add(new Professor(nome,email,nomeUsuario,matricula,senha));
        System.out.println(listaProfessores.size());
        return true;
    }
    

    
    public void obterUsuarioArquivo() throws IOException{
        LeitorArquivoBinario leitor = new LeitorArquivoBinario();
        leitor.abrirArquivoLeitura("usuarios.dat");
//        listaAlunos = leitor.obterObjetosArquivo();
        listaProfessores = leitor.obterObjetosArquivo();
        leitor.fecharArquivoLeitura();
    }
    
    public void salvarUsuarioArquivo(){
        EscritorArquivoBinario escritor = new EscritorArquivoBinario();
        escritor.abrirArquivoEscrita("usuarios.dat");
//        escritor.escreverObjetoArquivo(listaAlunos);
        escritor.escreverObjetoArquivo(listaProfessores);
        escritor.fecharArquivoEscrita();
    }
    
}
