/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;

import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerferson
 */
public class SerialRxTx implements SerialPortEventListener{
  private BufferedReader input=null;
  private OutputStream output;
  private static final int TIME_OUT=1000;
  private static final int DATA_RATE=9600;
  private String portaCOM;
  private Object palavra;
  private String serialPortName= "COM4";
  private String appName;
  private InputStream serialInput;
  
  
  SerialPort serialPort=null;
  private Protocolo protocolo=new Protocolo();
  
  public boolean iniciaSerial(){
      try{
        CommPortIdentifier portId=null; 
        Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();
      
       while(portId==null && portEnum.hasMoreElements()){
           CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
           if(currPortId.getName().equals(serialPortName) ||currPortId.getName().startsWith(serialPortName)){
               serialPort=(SerialPort) currPortId.open(appName, TIME_OUT);
               portId = currPortId;
               System.out.println("conectado em "+ currPortId.getName() );
               break;
           }
       }
       if(portId ==null || serialPort==null){
           System.out.println("Placa não conectado");
           return false;
        }
        serialPort.setSerialPortParams(DATA_RATE,
                               SerialPort.DATABITS_8, //taxa de 10 bits 8 (envio)
                               SerialPort.STOPBITS_1, //taxa de 10 bits 1 (recebimento)
                               SerialPort.PARITY_NONE);
        serialPort.addEventListener(this);
        serialPort.notifyOnDataAvailable(true);
        try{
            Thread.sleep(1000);
        
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return true;
      
      
  }catch(Exception e){
          e.printStackTrace();
      }
      
      
  
  return false;
  
  }
  
  public void sendData(char data){
      try{
          output=serialPort.getOutputStream();
          output.write(data);
      
      }catch(Exception e){
       System.err.println(e.toString());
      
      }
  
  
  }
  
  public synchronized void close(){
      if(serialPort !=null){
          serialPort.removeEventListener();
          serialPort.close();
      
      }
  }
  
  @Override
  public  void serialEvent(SerialPortEvent spe){
      try{
          switch (spe.getEventType()){
              case SerialPortEvent.DATA_AVAILABLE:
                  if(input == null ){
                      input = new BufferedReader(
                              new InputStreamReader(
                                      serialPort.getInputStream()));
                  }
                  
                  String in = input.readLine();
                  System.out.println("Antes "+ in);
                   //if(input.ready()){
                        //String inputLine = input.readLine();
                        //protocolo.setLeituraComando(input.readLine());
                        //System.out.println("Chegou "+ protocolo.getLeituraComando());
                        //System.out.println("Chegou "+ input.readLine());
                   //}
                    break;
              default:
                    break;
            }
          
          
          }catch(Exception e){
              //System.out.println("chegou no if ");
              //System.out.println("Chegou"+ protocolo.getLeituraComando());
              //e.printStackTrace();
              
              
              
          
          
          }
      
      
  
  }
    
    public Protocolo getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Protocolo protocolo) {
        this.protocolo = protocolo;
    }

    public String getSerialPortName() {
        return serialPortName;
    }

    public void setSerialPortName(String serialPortName) {
        this.serialPortName = serialPortName;
    }
    
    
    
    
}
