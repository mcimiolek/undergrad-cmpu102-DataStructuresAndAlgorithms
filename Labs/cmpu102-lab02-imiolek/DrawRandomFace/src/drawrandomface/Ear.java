package drawrandomface;
import acm.graphics.*;
import java.awt.*;

public class Ear extends GCompound {
    
    public Ear(double xCenter, double yCenter, 
               double width, double height, Color color) {
        
        GOval ear = new GOval(xCenter-width/2,yCenter-height/2,width,height);
        ear.setFilled(true);
        ear.setColor(color);
        add(ear);
        
        GOval earRing = new GOval((xCenter-width/2)+(width/2.5),(yCenter-height/2)+(height),5,5);
        
        if(Utility.CoinToss()){
            earRing.setFilled(true);
            earRing.setColor(Utility.randomColor());
            add(earRing);
        }
    }
    
}
