/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp;

import javax.swing.JButton;


public class Arduino {
  private ControlePorta arduino;
  
  /**
   * Construtor da classe Arduino
   */
  public Arduino(){
      arduino = new ControlePorta("COM4",9600);
  }    

  /**
   * Envia o comando para a porta serial
   * @param button - Botão que é clicado na interface Java
   */
  public void comunicacaoArduino(char dado) {        
    if(dado=='L'){
      arduino.enviaDados('L');
      //arduino.recebeDados();
     
    }
    else if(dado=='D'){
      arduino.enviaDados('D');
      //arduino.recebeDados();
      
      
    }
    else{
      arduino.close();
      //Imprime o nome do botão pressionado
    }
  }
}
