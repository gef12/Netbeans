//Classe para manipulação de arquivos binários em Java
package controle;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LeitorArquivoBinario {
    private ObjectInputStream objetoLeitura; 

    public void abrirArquivoLeitura(String nomeArquivo){
        try{
           //Carrega o arquivo
           FileInputStream arqLeitura = new FileInputStream(nomeArquivo); 
           objetoLeitura = new ObjectInputStream(arqLeitura);
        }
        catch(IOException excecaoIO){
            System.err.printf("Erro ao abrir arquivo!%s", excecaoIO);           
        }
    }
    
    public void fecharArquivoLeitura(){
        try{
           //fecha o arquivo
           if(objetoLeitura!=null) 
               objetoLeitura.close();
        }
        catch(IOException excecaoIO){
            System.err.printf("Erro ao fechar arquivo!%s", excecaoIO); 
            System.exit(1);
        }
    }        
   
    //retorna um array com os objetos lidos do arquivo
    public ArrayList obterObjetosArquivo() throws IOException{    
        ArrayList objetosLidos = new ArrayList();
        try {
            while(true){
                objetosLidos.add(objetoLeitura.readObject());  
            }               
       }            
       catch(EOFException fimArquivo){
            return objetosLidos;
       }
       catch( IOException e ){
           System.out.println("Exceção ao ler do arquivo" + e);
       } catch (ClassNotFoundException e) {  
           System.out.println("Exceção: Classe não encontrada" + e);
        }  
       return objetosLidos;
    }    
}


