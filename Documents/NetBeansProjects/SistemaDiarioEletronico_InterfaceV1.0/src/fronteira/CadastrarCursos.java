/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fronteira;

import controle.GerenciadorAcessosSingleton;
import controle.GerenciadorCursosSingleton;
import entidade.Aluno;
import entidade.Disciplina;

/**
 *
 * @author Aislan
 */
public class CadastrarCursos {
    public void inserirCurso(){
        GerenciadorCursosSingleton.getInstance().inserirCurso("Computação", "CCF", 3000);
        GerenciadorCursosSingleton.getInstance().inserirCurso("Alimentos", "EAL", 4000);
        
        GerenciadorCursosSingleton.getInstance().inserirAlunoEmCurso(new Aluno("Aislan", "aislan@ufv.br", 
                "aislanrodrigo", "1234", "EF01241"), "CCF");
        
        
     //   GerenciadorCursosSingleton.getInstance().obterCurso("Computação").adicionarDisciplina(new Disciplina("Programação",
       //         "CCF110", 60, 40));
        
       
    }   
}