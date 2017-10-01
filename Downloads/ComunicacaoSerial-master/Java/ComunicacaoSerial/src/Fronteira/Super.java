/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fronteira;


import Entidade.SerialRxTx;
import Entidade.SerialRxTx;
import static java.lang.Thread.sleep;

/**
 *
 * @author Gerferson
 */
public class Super {
    
    public static synchronized void main(String[] args) {
    SerialRxTx serial= new SerialRxTx();
   
   if(serial.iniciaSerial()){
       System.out.println("enviando dados ");
       serial.sendData('L');
       //serial.sendData('\n');
       serial.sendData('D');
       serial.sendData('T');
       //serial.sendData('\n');
       
       //serial.sendData("meu");
       //serial.sendData("\n");
       //System.out.println("enviando dados ");
       //serial.sendData("d");
       //System.out.println("enviando dados ");
       
       
       
       
       
    
       
       
   }else{


   }
   
   
   
   }
    
    
    
    
}
