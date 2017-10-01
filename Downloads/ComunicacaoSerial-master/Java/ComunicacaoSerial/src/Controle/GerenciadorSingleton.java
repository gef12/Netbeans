package controle;

import Entidade.SerialRxTx;
import TerGrafico.ThermometerDemo1;
import java.util.ArrayList;



 
public class GerenciadorSingleton {
    private static GerenciadorSingleton instance;
    
    //Lista para simulação
    //Os alunos vem em uma lista fornecida pelo SAPiENS. Assim como a lista de professores
    
    
    public GerenciadorSingleton(){}
    SerialRxTx serial= new SerialRxTx();
    public static GerenciadorSingleton getInstance(){
        if(instance == null){
            instance = new GerenciadorSingleton();
        }
        return instance;
    }
    
    public boolean iniciarSistema(){
        
   
   if(serial.iniciaSerial()){
       System.out.println("Comunicação estabelecida");
   
   }else{
       System.out.println("Comunicação não estabelecida");
   
   }     
   return true;
    }
    
    //Remove o objeto aluno ou objeto professor da lista
    public boolean enviarDados(char dados){
        serial.sendData(dados);
        return false;
    }
    
    //Método cadastrarAluno só existe para simulação, pois a lista de alunos é fornecida pelo SAPIENS
     public boolean requisitarTemperatura(){
        
        return true;
    }
     public boolean AtualizarTemperatura(){
        
        return true;
    }
     public boolean EnviarTemperatura(double Temperatura){
         
        
       
        return true;
    }
     
     //Método cadastrarProfessor só existe para simulação, pois a lista de professores é fornecida pelo SAPIENS
     public boolean requisitarEstadoLuzesAmbiente1(){
        
        return false;
    }
     public boolean requisitarEstadoLuzesAmbiente2(){
        
        return false;
    }
     public boolean requisitarEstadoLuzesAmbiente3(){
        
        return false;
    }
     public boolean requisitarEstadoAlarme(){
        
        return false;
    }
     public boolean requisitarEstadoLuzesAmbiente4(){
        
        return false;
    }

    public boolean validarUsuario(String nomeUsuario, String senha){
       
        return false;
    }
    
}
