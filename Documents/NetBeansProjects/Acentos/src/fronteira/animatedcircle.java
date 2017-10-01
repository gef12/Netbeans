 package fronteira;
//import static fronteira.BouncingCircle.gt;
//import static fronteira.BouncingCircle.lt;
import static javax.management.Query.gt;
 import static javax.management.Query.lt;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.management.Query.*;
import static javax.management.Query.gt;
import static javax.management.Query.lt;
import javax.management.QueryExp;
import javax.management.ValueExp;
 



 
//circulos animados
import java.awt.*;
import java.applet.*;
 import java.util.*;
 import java.lang.*;
 /*
public class animatedcircle extends GBFrame
{
    public void paint(Graphics g)
    {
       int x = 50, y = 50, width = 50, height = 50; // we are using a circle
       int i;
       for (i = 1; i &lt;= 10; i++)
       {
            // draw the circle in red
            g.setColor(Color.red);
             g.drawOval(x, y, height, width);
             pause(200);
            // draw the circle in white to erase
            if (i == 10)
                     g.setColor(Color.red); // leaves a red circle when done
            else
                     g.setColor(Color.white);
            g.drawOval(x, y, height, width);
            //make adjustments to move the circle
            width = (int) (width*1.25);
             height = (int) (height*1.25);
      }
      Font ArialB16 = new Font(&quot;Arial&quot;, Font.BOLD, 16);
      g.setColor(Color.red);
      g.setFont(ArialB16);
      g.drawString(&quot;Java Moves!!!&quot;, 180, 240);
   }
   //Main
   public static void main (String[] args)
   {
      Frame frm = new animatedcircle();
      frm.setSize (440,440);
      frm.setVisible(true);
   }
   //Method to pause
   public static void pause (int time)
   {
      try
      {
            Thread.sleep(time);
      }
      catch(InterruptedException e)
      {
      }
   }
}
 */