/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fronteira;

import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

/**
 *
 * @author Gerferson
 */
public class rotacionar {
    
    
    
    public static  void main(String[] args) {
      
    
    
    
    }
    
    public  static BufferedImage rotateImage(BufferedImage rotateImage, double angle) {
    angle %= 360;
    if (angle < 0) angle += 360;

    AffineTransform tx = new AffineTransform();
    tx.rotate(Math.toRadians(angle), rotateImage.getWidth() / 2.0, rotateImage.getHeight() / 2.0);

    double ytrans = 0;
    double xtrans = 0;
    if( angle <= 90 ){
        xtrans = tx.transform(new Point2D.Double(0, rotateImage.getHeight()), null).getX();
        ytrans = tx.transform(new Point2D.Double(0.0, 0.0), null).getY();
    }
    else if( angle <= 180 ){
        xtrans = tx.transform(new Point2D.Double(rotateImage.getWidth(), rotateImage.getHeight()), null).getX();
        ytrans = tx.transform(new Point2D.Double(0, rotateImage.getHeight()), null).getY();
    }
    else if( angle <= 270 ){
        xtrans = tx.transform(new Point2D.Double(rotateImage.getWidth(), 0), null).getX();
        ytrans = tx.transform(new Point2D.Double(rotateImage.getWidth(), rotateImage.getHeight()), null).getY();
    }
    else{
        xtrans = tx.transform(new Point2D.Double(0, 0), null).getX();
        ytrans = tx.transform(new Point2D.Double(rotateImage.getWidth(), 0), null).getY();
    }

    AffineTransform translationTransform = new AffineTransform();
    translationTransform.translate(-xtrans, -ytrans);
    tx.preConcatenate(translationTransform);

    return new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR).filter(rotateImage, null);
}
    
}
