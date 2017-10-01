package controle;
import entidade.Aluno;
import entidade.Professor;
import entidade.TipoUsuario;
import entidade.Usuario;
import java.util.ArrayList;


/**
 *
 * @author Aislan
 */
public class GerenciadorAcessosSingleton {
    private static GerenciadorAcessosSingleton instance;
    
    //Lista para simulação
    //Os alunos vem em uma lista fornecida pelo SAPiENS. Assim como a lista de professores
    private ArrayList<Aluno> listaAlunos = new ArrayList(); 
    private ArrayList<Professor> listaProfessores = new ArrayList();
    private ArrayList<Usuario> listaUsuarios = new ArrayList();        
    
    private Usuario nomeUsuario; //Esse nomeUsuario é um atributo vem do Banco de dados?
    private Usuario senha;
    
    public GerenciadorAcessosSingleton(){}
    
    public static GerenciadorAcessosSingleton getInstance(){
        if(instance == null){
            instance = new GerenciadorAcessosSingleton();
        }
        return instance;
    }
    
    public boolean efetuarLogin(String nomeUsuario, String senha){
        //Se o usuário for validado iremos pesquisar nas duas listas se o usuário existe e adicioná-lo a lista de usuários
        if(validarUsuario(nomeUsuario, senha)){
            for(int i = 0; i < listaAlunos.size(); i++){
                listaUsuarios.add(listaAlunos.get(i));
                return true;
            }
            for(int i = 0; i <listaProfessores.size();i++){
                listaUsuarios.add(listaProfessores.get(i));
                return true;
            }
        }
        return false;
    }
    
    //Remove o objeto aluno ou objeto professor da lista
    public boolean efeturarLogout(String nomeUsuario, String senha){
        for(int i = 0; i <listaAlunos.size();i++){
            if(this.validarUsuario(nomeUsuario, senha)){
               listaAlunos.remove(listaAlunos.get(i));
                return true;
            }
        }
        for(int i = 0; i <listaProfessores.size();i++){
            if(this.validarUsuario(nomeUsuario, senha)){
               listaProfessores.remove(listaProfessores.get(i));
                return true;
            }
        }
        return false;
    }
    
    //Método cadastrarAluno só existe para simulação, pois a lista de alunos é fornecida pelo SAPIENS
     public boolean cadastrarAluno(String nome, String email, String nomeUsuario, String senha, String matricula){
        //Verifica se o aluno já está cadastrado, se não estiver efetua o cadastro
        for(int i = 0; i < listaAlunos.size(); i++){
            if((listaAlunos.get(i).getNome().equals(nome)) && (listaAlunos.get(i).getNomeUsuario().equals(nomeUsuario))){
                return false; //se nome e o nome usuario forem iguais, Aluno já cadastrado
            }
        }
        Aluno aluno = new Aluno(nome, email, nomeUsuario, senha, matricula);
        listaAlunos.add(aluno);
        return true;
    }
     
     //Método cadastrarProfessor só existe para simulação, pois a lista de professores é fornecida pelo SAPIENS
     public boolean cadastrarProfessor(String nome, String email, String nomeUsuario, String senha, String matricula){
        //Verifica se o professor já está cadastrado, se não estiver efetua o cadastro
        for(int i = 0; i < listaProfessores.size(); i++){
            if((listaProfessores.get(i).getNome().equals(nome)) && (listaProfessores.get(i).getNomeUsuario().equals(nomeUsuario))){
                   return false;
            }
            else{
                Professor professor = new Professor(nome, email, nomeUsuario, senha, matricula);
                listaProfessores.add(professor);
                return true;
            }
        }
        return false;
    }

    public boolean validarUsuario(String nomeUsuario, String senha){
        for(int i = 0; i <listaAlunos.size();i++){
            if((listaAlunos.get(i).getNomeUsuario().equals(nomeUsuario))&&(listaAlunos.get(i).getSenha().equals(senha))){
                return true;
            }
        }
        for(int i = 0; i <listaProfessores.size();i++){
            if((listaProfessores.get(i).getNomeUsuario().equals(nomeUsuario))&&(listaProfessores.get(i).getSenha().equals(senha))){
               return true;
            }
        }
        return false;
    }
    
}
