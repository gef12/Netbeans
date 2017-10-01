/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author Gerferson
 */
public class Protocolo {

    

    
    private String tipoDados;
    private String temperatura;
    private String umidade;
    private String luminosidade;
    private String distancia;
    private String led;
    private String botao;
    private String potenciometro;
    
    private String leituraComando;
   
    
    private void interpretaComando(){
        String aux[]= leituraComando.split(",");
        //String aux[]= this.leituraComando;
        System.out.println("protocolo 1");
        //System.out.println(aux[0]);
        if(aux.length==8){
            tipoDados=aux[0];
            temperatura=aux[1];
            umidade=aux[2];
            distancia=aux[3];
            luminosidade=aux[4];
            led=aux[5];
            botao=aux[6];
            potenciometro=aux[7];
        }
    
    }
    public String getTipoDados() {
        return tipoDados;
    }

    public void setTipoDados(String tipoDados) {
        this.tipoDados = tipoDados;
    }
    
    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getUmidade() {
        return umidade;
    }

    public void setUmidade(String umidade) {
        this.umidade = umidade;
    }

    public String getLuminosidade() {
        return luminosidade;
    }

    public void setLuminosidade(String luminosidade) {
        this.luminosidade = luminosidade;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getLed() {
        return led;
    }

    public void setLed(String led) {
        this.led = led;
    }

    public String getBotao() {
        return botao;
    }

    public void setBotao(String botao) {
        this.botao = botao;
    }

    public String getLeituraComando() {
        return leituraComando;
    }

    public void setLeituraComando(String leituraComando) {
        this.leituraComando = leituraComando;
        this.interpretaComando();
    }

    public String getPotenciometro() {
        return potenciometro;
    }

    public void setPotenciometro(String potenciometro) {
        this.potenciometro = potenciometro;
    }
    
}
