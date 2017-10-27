package controle;

import area15.Tela_login;
import java.io.IOException;
import java.util.ArrayList;



public class GerenciadorUsuariosSingleton {
    private static GerenciadorUsuariosSingleton controladorUsuarios;
    //private ArrayList<Aluno> listaAlunos = new ArrayList();
    //private ArrayList<Professor> listaProfessores = new ArrayList();
    
    
    public GerenciadorUsuariosSingleton(){}
    
    public static GerenciadorUsuariosSingleton getInstance(){
        if(controladorUsuarios == null){
            controladorUsuarios = new GerenciadorUsuariosSingleton();
        }
        return controladorUsuarios;
    }

    /*
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
    */

    
    public void obterUsuarioArquivo() throws IOException{
        
    }
    public void loginUsuario(){
        Tela_login login = new Tela_login();
        login.setVisible(true);
        
    }
    
    public void salvarUsuarioArquivo(){
        
    }
    
}
