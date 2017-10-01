
package berkeley;

import static berkeley.Simulacao.qtdClientes;


/**
 *
 * @author Gerferson
 */
// 
public class RealizarSincronizacao
{
    private long tempoServidor;
    private long[] diferecaTempo;
    private long somaDiferencas;  // soma das medias dos clientes e da NETfpga
    private final int numClientes = qtdClientes; // Simulando threads cliente com i = {0,1.... 20}
    private int contadorClientes;
    
    public RealizarSincronizacao(){
        this.tempoServidor = 0;
        this.contadorClientes = this.numClientes;
        this.diferecaTempo = new long[this.numClientes];
        this.somaDiferencas = 0;
    }
    
    public synchronized void setTempoServidor(long serverTime){ 
        this.tempoServidor = serverTime; // tempo atual do servidor
        try{
            notifyAll();                  // notifica os clientes que estão esperando na fila para colocar as diferenças de tempo
            wait();                       // servidor fica esperando
        }catch(InterruptedException e){}
    }
    
    public synchronized void setDifTempo(long time,int n){
        try{
            if(tempoServidor==0) wait();              // Se o servidor ainda não definiu threads cliente tempo de espera na fila 
            this.diferecaTempo[n] = (time-tempoServidor); // array com as diferencas entre o temo do mestre e os clientes
            this.somaDiferencas    += time;              // soma dos drifts rater
            contadorClientes--;                  // decrecendo numero de clientes
            if(contadorClientes==0) notify();    // Se você tem todos os clientes  calculado
            wait();                                // Os clientes esperam até o tempo for setado no  servidor em difftime
        }catch(InterruptedException e){}
    }
    
    public synchronized void calcMediaClientes(){//calculando o novo tempo pra ser enviado aos clientes
        long media = (this.somaDiferencas / (this.numClientes+1));
        for(int i=0;i<this.numClientes;i++) 
            this.diferecaTempo[i] = ((-this.diferecaTempo[i]) + media);//tempo que cada cliente tera que ajustar
        notifyAll();
    }
    
    public synchronized long getTempo(int n){ 
        return this.diferecaTempo[n]; 
    }
    public synchronized long getMedia(){ 
        return this.somaDiferencas / (this.numClientes+1); 
    }
    public synchronized void restart(){
        this.tempoServidor = 0;
        this.contadorClientes = this.numClientes;
        this.somaDiferencas = 0;
    }    
    
}