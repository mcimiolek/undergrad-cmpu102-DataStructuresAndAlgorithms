package drawrandomface;
import acm.graphics.*;
import java.awt.*;

public class Mouth extends GCompound {
    
    public Mouth(double width, double height, Color color) {
        GArc mouth;
              
        
        if(Utility.CoinToss()){
            mouth = new GArc(50-width/2,70-height/2,width,height,200,140);
        }
        else{
            mouth = new GArc(50-width/2,70-height/4,width,height,20,140);
        }
        
        mouth.setColor(color);
        add(mouth);
    }    
}
