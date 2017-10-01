package fronteira;
import java.util.Scanner;
/**
 *
 * @author Clayton
 */
public class Casino {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double carteira = 100.00; //Começar carteira com R$ 100.00.
        double aposta ;     //valor Aposta Jogador.
        double resultado ; //Armazenar os ganhos e as perdas de cada jogo.
        String entrada ; //Usar para entrada
        //Criar instâcia do jogo Roleta
        Roleta jogo = new Roleta();
        do{
            System.out.print("Quanto você gostaria de Apostar?.....: ");
            aposta = console.nextDouble();
            carteira = carteira - aposta;
             if(carteira < 0){
                System.out.println(" ***ATENÇÂO ACABARAM OS CREDITOS*** ");
                break;
            }
            //Jogue uma Partida e armazenar os resultados
            resultado = jogo.Apostar(console, aposta);
            //Imprimir Resulatado
            jogo.Imprimir();
            //Liberar o buffer
            console.nextLine();
            //Quantidade de Atualização do valor da carteira e Avisar o Jogador.
            carteira = carteira + resultado;
            System.out.println("Voce tem R$"+ carteira +" em sua Carteira.");
            System.out.print("Apostar Mais uma vez? (S)Sim ou (N)Não.....: ");
            entrada = console.nextLine();      
        }while(!entrada.equalsIgnoreCase("N"));
    }// fim main
}//end class