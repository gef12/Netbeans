package VerTemperaturaArduino;


import TerGrafico.ThermometerDemo1;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerferson
 */
public class Temp {
    public static void main(String[] args) {

  ObterTemperaturaMSP430 n=new ObterTemperaturaMSP430();
  n.setVisible(true);
 
    
}
}
