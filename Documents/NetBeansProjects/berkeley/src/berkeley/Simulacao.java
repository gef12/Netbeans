
package berkeley;

public class Simulacao
{
    public static int qtdClientes=2;
    public static void main(String args[]){
        RealizarSincronizacao sm = new RealizarSincronizacao();
        // Criando  e iniciando o servidor //
        ServidorMestre srv = new ServidorMestre(sm);
        srv.start();//inicializando o servidor mestre
        Clientes clv[] = new Clientes[qtdClientes];//inicializando os clientes
        // Criando  e iniciando o servidor Clientes //
        for(int i=0;i<qtdClientes;i++){
            clv[i] = new Clientes(i,sm);
            clv[i].start();//inicializando os clientes
        }
      
        
    }
    public void teste()
    {
        RealizarSincronizacao sm = new RealizarSincronizacao();
        // Criando  e iniciando o servidor //
        ServidorMestre srv = new ServidorMestre(sm);
        srv.start();
        Clientes clv[] = new Clientes[qtdClientes];
        // Criando  e iniciando o servidor Clientes //
        for(int i=0;i<qtdClientes;i++){
            clv[i] = new Clientes(i,sm);
            clv[i].start();
        }
    }
}