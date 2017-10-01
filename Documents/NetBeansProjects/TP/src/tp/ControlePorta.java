/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp;

import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import static jdk.nashorn.tools.ShellFunctions.input;

public class ControlePorta  implements SerialPortEventListener{
  private OutputStream serialOut;
  private InputStream serialInput;
  private BufferedReader input;
  private OutputStream output;
  private static final int TIME_OUT=1000;
  private static final int DATA_RATE=9600;
  private int taxa;
  private String portaCOM;
  private Object palavra;
  private String serialPortName= "COM4";
  private String appName;
  
  
  
  
  /**
   * Construtor da classe ControlePorta
   * @param portaCOM - Porta COM que será utilizada para enviar os dados para o arduino
   * @param taxa - Taxa de transferência da porta serial geralmente é 9600
   */
  public ControlePorta(String portaCOM, int taxa) {
    this.portaCOM = portaCOM;
    this.taxa = taxa;
    this.initialize();
  }     
 
  /**
   * Médoto que verifica se a comunicação com a porta serial está ok
   */
  private void initialize() {
    try {
      //Define uma variável portId do tipo CommPortIdentifier para realizar a comunicação serial
      CommPortIdentifier portId = null;
      try {
        //Tenta verificar se a porta COM informada existe
        portId = CommPortIdentifier.getPortIdentifier(this.portaCOM);
      }catch (NoSuchPortException npe) {
        //Caso a porta COM não exista será exibido um erro 
        JOptionPane.showMessageDialog(null, "Porta COM não encontrada.",
                  "Porta COM", JOptionPane.PLAIN_MESSAGE);
      }
      //Abre a porta COM 
      SerialPort port = (SerialPort) portId.open("Comunicação serial", this.taxa);
      serialOut = port.getOutputStream();
      serialInput =port.getInputStream();
      port.setSerialPortParams(this.taxa, //taxa de transferência da porta serial 
                               SerialPort.DATABITS_8, //taxa de 10 bits 8 (envio)
                               SerialPort.STOPBITS_1, //taxa de 10 bits 1 (recebimento)
                               SerialPort.PARITY_NONE); //receber e enviar dados
        port.addEventListener(this);
        port.notifyOnDataAvailable(true);
    
    }catch (Exception e) {
      e.printStackTrace();
    }
}

  /**
   * Método que fecha a comunicação com a porta serial
   */
  public void close() {
    try {
        serialOut.close();
    }catch (IOException e) {
      JOptionPane.showMessageDialog(null, "Não foi possível fechar porta COM.",
                "Fechar porta COM", JOptionPane.PLAIN_MESSAGE);
    }
  }

  /**
   * @param opcao - Valor a ser enviado pela porta serial
   */
  public void enviaDados(char opcao){
    try {
        
      serialOut.write(opcao);//escreve o valor na porta serial para ser enviado
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Não foi possível enviar o dado. ",
                "Enviar dados", JOptionPane.PLAIN_MESSAGE);
    }
  }
  public void recebeDados(){
    try {
      //escreve o valor na porta serial para ser enviado
      
    
    
     InputStreamReader isr = new InputStreamReader(serialInput);
     BufferedReader br = new BufferedReader(isr);
     String s = br.readLine();
     palavra =s;
     while (s != null) {
       System.out.println(s);
       s = br.readLine();
     }
    
    
    
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, palavra, (String) palavra, JOptionPane.PLAIN_MESSAGE);
    }
  }

    @Override
    public void serialEvent(SerialPortEvent spe) {
         try{
          switch (spe.getEventType()){
              case SerialPortEvent.DATA_AVAILABLE:
                  if(input == null ){
                      InputStreamReader isr = new InputStreamReader(serialInput);
                      BufferedReader br = new BufferedReader(isr);
                      String s = br.readLine();
                      palavra =s;
                        while (s != null) {
                          System.out.println(s);
                          s = br.readLine();
                        }
                    }
                   break;
              default:
                    break;
          }
          }catch(Exception e){
             
        
          }
    }

   
  
      
      
  
  
  }
  

