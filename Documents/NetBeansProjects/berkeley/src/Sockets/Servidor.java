/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import berkeley.RealizarSincronizacao;
import berkeley.Simulacao;
import static berkeley.Simulacao.qtdClientes;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author gus
 */
public class Servidor {

    private long serverTime; //tempo do servidor mestre
    private long[] diffTimes;//tempo do cliente - o tempo do metre servidor
    public static long sumDiffs=0;  // soma de todas as diferenças diifTimes de todos os clientes
    private final int numClients = qtdClientes; // 3 threads cliente com i = {0,1,2}
    private int countClientsOpered;
    public static int cont=0;
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        String clientSentence;
        String capitalized;
         //t te = new t();
        Simulacao f= new Simulacao();
        //f.teste();

        try {

            // Cria um SocketServer (Socket característico de um servidor)
            ServerSocket socket = new ServerSocket(40000);
            Socket connectionSocket = socket.accept();

                // Cria uma buffer que irá armazenar as informações enviadas pelo cliente
               BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

                // Cria uma stream de sáida para retorno das informações ao cliente
                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

            while (true) {
                     System.out.println("Recebendo do cliente");
                
                /* Cria um objeto Socket, mas passando informações características de um servidor,
                 *no qual somente abre uma porta e aguarda a conexão de um cliente 
                 */
                

                // Faz a leitura das informações enviadas pelo cliente as amazenam na variável "clientSentence"
                clientSentence = inFromClient.readLine();
                System.out.println("Recebeu  " + clientSentence);
                //código...
                Scanner input = new Scanner(System.in);
                /*System.in é pra ler da entrada padrão, normalmente o teclado*/
                String pausa = input.next();
                
                
                if (clientSentence.equals("teste")){
                    System.out.println("pedido para realizar sincronização");
                    capitalized = "Tempo" + "\n";
                    outToClient.writeBytes(capitalized);//
                    System.out.println("enviado ao cliente  SINCRO");
                    
                    
                }
                else{
                    
                    sumDiffs= sumDiffs + Long.parseUnsignedLong(clientSentence);
                    System.out.println("valor de sum "+sumDiffs);
                    capitalized = "Tempo" + "\n";
                    outToClient.writeBytes(capitalized);//
                    
                    if(cont>2){
                        
                        System.out.println("valor de cont "+cont);
                        Simulacao t=new Simulacao(); 
                        t.teste();
                    
                    }
                    cont++;
                
                }

                /* Faz uma modificação na String enviada pelo cliente, simulando um processamento em "back-end"
                 * antes de retorná-la ao cliente
                 */
                
                //capitalized = "SINCRO" + "\n";

                // Imprime a a String modificada no console do servidor
                //System.out.println(capitalized);

                // Retorna as informações modificadas, ao cliente
                //outToClient.writeBytes(capitalized);//enviando o tempo
                //System.out.println("enviado ao cliente");
                
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
   
   

   
}
