/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TempoNTP;

import java.text.SimpleDateFormat; 
import java.util.Date;  

public class TempoNtp { 
    public static void main(String[] args) { 
        //Generamos un objeto de la clase ObtenerFecha. 
       
        ObterTempo objFecha=new ObterTempo(); 
        //Generamos otro objeto de la clase SimpleDateFormat para darle formato a la fecha 
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //Creamos una variable de tipo String para almacenar la fecha 
        String fecha =""; 
        //Asignamos a la varible el valor recibido al instaciar el metodo getNTPDate por medio del objeto 
        
        fecha=formato.format(objFecha.getNTPDate()); 
        //Imprimimos la fecha en consola. 
        
            
        System.out.println(fecha); 
        System.out.println(objFecha.getNTPDate().getTime());
    } 
}
