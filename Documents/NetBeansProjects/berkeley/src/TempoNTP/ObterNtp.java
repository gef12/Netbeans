/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TempoNTP;


import java.net.InetAddress;
import java.net.SocketException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;
/**
 *
 * @author Gerferson
 */
public class ObterNtp {
    
    
    public long TempoNTP(){
        long returnTime = 0;
        try {
        String ntpServer = "a.st1.ntp.br";

        NTPUDPClient timeClient = new NTPUDPClient();
        InetAddress inetAddress = InetAddress.getByName(ntpServer);
        TimeInfo timeInfo = timeClient.getTime(inetAddress);
        returnTime = timeInfo.getReturnTime();
        //System.out.println(returnTime);
        
        Date time = new Date(returnTime);
        //System.out.println("Hora para " + ntpServer + ": " + time);
        return returnTime;
    } catch (UnknownHostException ex) {
        ex.printStackTrace();
    }   catch (IOException ex) {
        ex.printStackTrace();
    }
        
        return returnTime;
    
    }
    
    
}
