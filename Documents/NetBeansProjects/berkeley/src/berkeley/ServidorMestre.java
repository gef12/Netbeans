
package berkeley;
import TempoNTP.ObterNtp;
import TempoNTP.ObterTempo;
import java.text.SimpleDateFormat; 
import java.util.Date;
import java.util.Scanner;

public class ServidorMestre extends Thread
{
    private RealizarSincronizacao sm;
    private final int esperar;
    private long tempoServidor;
    //ObterTempo objFecha=new ObterTempo();
    TempoNTP.ObterNtp NTP=new ObterNtp();
    public static int ct=1;
    
    
    
    
    public ServidorMestre(RealizarSincronizacao sm){
        this.sm = sm;
        this.esperar = 10000; // 10s
        this.tempoServidor = System.nanoTime();//podemos pegar um horario NTP ou o do proprio server
        //this.tempoServidor = objFecha.getNTPDate().getTime();
        //System.out.println(objFecha.getNTPDate().getTime());
        //System.out.println(NTP.TempoNTP());
        //this.tempoServidor = NTP.TempoNTP();
    }
    
    
    
    public void run(){//metodo so para simular no casso aqui e so chamar  os metoso sockets para enviar o tempo ou pedir
        
        while(true){
            try{
                
                Thread.sleep(this.esperar); // espera  10s
                
                // liga //
                /** Defina o horário do servidor
                  * Isso já está definido, o servidor vai esperar **/
                System.out.println("Tempo Antigo do (servidor) : " + this.tempoServidor);
                this.sm.setTempoServidor(this.tempoServidor);
                /** os clientes já configurado 
                  * Deve calcular a média e configurar as definições **/
                this.sm.calcMediaClientes();
                /** ajustando a hora no servidor (horaServidor + media)**/
                this.tempoServidor += this.sm.getMedia();
                /** Imprimindo o horario do servidor **/
                
                
                System.out.println("Tempo ajustado do (servidor) : " + this.tempoServidor);
                Thread.sleep(2000);
                System.out.println("----------------------------------------");
                /** Quando o servidor Finaliza deve se restaurar o estado inicial **/
                
                this.sm.restart();
                
            }catch(InterruptedException e){} 
        }
    }
}