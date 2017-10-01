
package berkeley;

import TempoNTP.ObterNtp;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gerferson
 */
public class Clientes extends Thread
{
    private int idCliente;
    private long tempoCliente;
    private RealizarSincronizacao sm;
    private final boolean atraso = true;
    //TempoNTP.ObterNtp NTP=new ObterNtp();
    public Clientes(int idCliente,RealizarSincronizacao sm){
        this.sm         = sm;
        this.idCliente   = idCliente;
        this.tempoCliente = System.nanoTime();
        //this.tempoCliente =NTP.TempoNTP();
    }
    
    public void run(){//metodo criado pelo sincronizado so para teseta
        while(true){ // Clientes permanece conectados;
                // Atualização Temp e adicione um atraso específico para cada thread, neste caso 
                //this.tempoCliente += (this.atraso) ? (this.idCliente+1)*2 : 0;//simulando o tempo de ida e volta
                Random gerador = new Random();
                this.tempoCliente += gerador.nextInt(500);
		 ;
                System.out.println("Tempo antigo do(cliente " + idCliente + ") : " + this.tempoCliente);
                this.sm.setDifTempo(this.tempoCliente,this.idCliente); // Diferenças para Setar, se o servidor não tiver configurado o seu tempo, os clientes esperam //
                this.tempoCliente += this.sm.getTempo(this.idCliente); // atualizando relogios dos clientes  
                System.out.println("Tempo sincronizado (cliente " + idCliente + ") : " + this.tempoCliente);
            try {
                Thread.sleep(10000); // espera  10s
            } catch (InterruptedException ex) {
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
                 
}