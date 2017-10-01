/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import berkeley.RealizarSincronizacao;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author gus
 */
public class Cliente {
    private int clientID;
    public static long clientTime;
    long TMP;
    private RealizarSincronizacao sm;
    private final boolean addDelay = true;
    public static int f=0;
    
    
    public static void main(String[] args) {
        String sentence;
        String modifiedSentence;
        clientTime = System.nanoTime();
         
       
    

        try {

            // Cria um buffer que armazenará as informações de entrada do teclado
            BufferedReader inFromUSer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enviei para o servidor");
            // Cria um Socket cliente passando como parâmetro o ip e a porta do servidor   
            Socket client = new Socket("localhost", 40000);

            // Cria um stream de saída 
            DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());

            // Cria um buffer que armazenará as informações retornadas pelo servidor
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            while (true) {
                
                // Atribui as informações armazenadas no buffer do teclado à variável "sentence"
                //sentence = inFromUSer.readLine();
                if(f == 0){
                    f=1;
                
                    sentence= "teste";
                    
                    // Disponibiliza as informações contidas em "sentence" para a stream de saída do cliente
                    outToServer.writeBytes(sentence + "\n");
                }

                // Atribui as informações modificadas pelo servidor na variável "modifiedSentence"
                System.out.println("recebendo resposta do servidor");
                modifiedSentence = inFromServer.readLine();
                
                
                System.out.println("recebendo do servidor "+ modifiedSentence);
                if(modifiedSentence.equals("Tempo")){
                    System.out.println("Tempo do cliente enviado "+clientTime);
                    outToServer.writeBytes(clientTime + "\n");
                    
                
                }

                // Imprime no console do cliente a informação retornada pelo servidor
                //System.out.println("From Server: " + modifiedSentence);
            }

            // Fecha o Socket
            //client.close();

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
 
    
    public void run(){
        while(true){ // Clientes permanentemente conectados;
              
                this.clientTime += (this.addDelay) ? (this.clientID+1)*2 : 0;
                System.out.println("Tempo antigo do(cliente " + clientID + ") : " + this.clientTime);
                this.sm.setDifTempo(this.clientTime,this.clientID); // Diferenças para Setar, se o servidor não tiver configurado o seu tempo, os clientes esperam //
                this.clientTime += this.sm.getTempo(this.clientID); // atualizando relogios dos clientes
                System.out.println("Tempo sincronizado do (cliente " + clientID + ") : " + this.clientTime);
        }
    }
                 
}

