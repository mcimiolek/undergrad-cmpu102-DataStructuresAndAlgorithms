/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawrandomface;
import acm.graphics.*;
import java.awt.*;
/**
 *
 * @author mcimiolek
 */
public class Glasses extends GCompound{
    
    public Glasses(double xCenter, double yCenter, 
               double size, Color lensColor, Color frameColor){
        GOval lLens = new GOval(xCenter - 25 -(size/2),yCenter-(size/2),size,size);
        lLens.setFilled(true);
        lLens.setColor(lensColor);
        
        GOval rLens = new GOval(xCenter + 25-(size/2),yCenter-(size/2),size,size);
        rLens.setFilled(true);
        rLens.setColor(lensColor);
        
        GOval lFrame = new GOval(xCenter - 25-(size/2),yCenter-(size/2),size,size);
        lFrame.setFilled(false);
        lFrame.setColor(frameColor);
        
        GOval rFrame = new GOval(xCenter + 25-(size/2),yCenter-(size/2),size,size);
        rFrame.setFilled(false);
        rFrame.setColor(frameColor);
        
        GLine connector = new GLine(2, yCenter, xCenter*2 - 2, yCenter);
        connector.setColor(frameColor);
        
        if(Utility.CoinToss()){
            add(connector);
            add(lLens);
            add(rLens);
            add(lFrame);
            add(rFrame);
        }
    }
}

