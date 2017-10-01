/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fronteira;


import java.util.Random;
import java.util.Scanner;
public class Roleta { // Primeira Vez
        double resultado = 0; //Variável que recebera o resultado do sorteio randomico.
        int cor; // Variável de entrada Cor a escolher 0)Vermelho ou 1)Preto.
        String corEsc = null; //Variável pra Guardar Cor Escolhida como int em String
        String corRan = null; //Variável pra Guardar Cor Sortiada como int em String
        int aposta; // Variável de Aposta
        int numeroRandom;
        int corRandom;
    public double Apostar(Scanner semValor,double valorAposta){ // Abre Segunda Scanner semValor
        Scanner console = new Scanner(System.in);
        Random r = new Random();//Gerar Numeros Aleatórios.
        this.numeroRandom = r.nextInt(36);// Variavel que recebe um Numero Randomico de 0 a 36
        this.corRandom = r.nextInt(1);//Variável que recebe Cor Randomica 0)Vermelho ou 2)Preto
        System.out.print("Ecolha o Numero entre ( 0 a 36).......:");
        this.aposta = console.nextInt();
        System.out.print("Voce quer Apostar 0) Vermelho ou 1) Preto? ...:");
        this.cor = console.nextInt();
        if(this.cor == 0){
            this.corEsc = "VERMELHO";
        }else{
            this.corEsc = "PRETO";
        }
        System.out.println("");
         if(this.corRandom == 0){
             this.corRan = "VERMELHO";
         }else{
             this.corRan = "PRETO";
         }
        //Verifica se o Numero Sortiado Randomico é 0 e se Numero Apostado é 0
        if((this.aposta == 0)&&( this.numeroRandom == 0)||(this.aposta == this.numeroRandom)){
            this.resultado = valorAposta * 5;// Se for 0 ganha 5x o valor apostado.
            this.corEsc = "";
            this.corRan = "";
            System.out.println("Ganhou 5x o Valor da Aposta R$"+resultado);
        }
        else if((cor == corRandom)||(numeroRandom != aposta)){
                resultado = valorAposta - valorAposta ; //Perde Valor Apostado
            System.out.println("Perdeu Playboy !!!");
        }
        else if((cor == corRandom)||(numeroRandom == aposta)){
                resultado = valorAposta * 3; //se for Numero igual ganha 3x o Valor Apostado.  
             System.out.println("Ganhou 3x o Valor R$"+resultado);
        }
        else if((cor != corRandom)&&(numeroRandom != aposta)){
                resultado = valorAposta - valorAposta ; //Perde Valor Apostado
            System.out.println("Perdeu Playboy !!!");
        }
        else if((cor != corRandom)||(numeroRandom == aposta)){
                resultado = valorAposta + valorAposta; //se for Numero igual ganha 1x o Valor Apostado.  
             System.out.println("Ganhou 1x o Valor R$"+resultado);
        }
        return resultado;
    }
    public void Imprimir(){
        System.out.println("");
 System.out.println("************************************************************");
        System.out.println("");
        System.out.println("Cor Apostada => "+corEsc+"    Cor Aleatorio   => "+corRan);
        System.out.println("Valor Apostado=> "+aposta+"        Valor Aleatorio => "+numeroRandom);
        System.out.println("");
 System.out.println("************************************************************");
    }
}
