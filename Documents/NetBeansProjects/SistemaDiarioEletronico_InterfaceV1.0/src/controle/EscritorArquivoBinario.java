//Classe para manipulação de arquivos binários em Java
package controle;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscritorArquivoBinario {
    private ObjectOutputStream objetoEscrita;
    
    public void abrirArquivoEscrita(String nomeArquivo){
        try{
           //Carrega o arquivo
            FileOutputStream arqLeitura = new FileOutputStream(nomeArquivo);
            objetoEscrita = new ObjectOutputStream(arqLeitura); 
        }
        catch(IOException excecaoIO){
            System.err.printf("Erro ao abrir arquivo!%s", excecaoIO);           
        }
    }

    public void fecharArquivoEscrita(){
        try{
           //fecha o arquivo
           if(objetoEscrita!=null) 
               objetoEscrita.close();
        }
        catch(IOException excecaoIO){
            System.err.printf("Erro ao fechar arquivo!%s", excecaoIO); 
            System.exit(1);
        }
    }    
        
    public void escreverObjetoArquivo(ArrayList objetos){
        try{
            //Grava o objeto cliente no arquivo
            for (int i = 0; i < objetos.size(); i++){
                objetoEscrita.flush();
                objetoEscrita.writeObject(objetos.get(i));                
            }
            System.out.println("\nObjeto gravado com sucesso!\n");
        }

        catch( IOException e ){
                System.err.printf("Exceção durante escrita: " + e.toString());
        }    
    }    
}



