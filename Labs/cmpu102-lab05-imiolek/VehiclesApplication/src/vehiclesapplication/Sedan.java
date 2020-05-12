package vehiclesapplication;
import acm.program.*;
import acm.graphics.*;

public class Sedan extends Vehicle {
    public Sedan(int left, int top, int width, int height){
        super(left, top, width, height);
    }
    
    protected GObject makeCanopy(int left, int top, int width, int height){
        GPolygon canopy= new GPolygon();
        canopy.addVertex(left+width/2, top);
        canopy.addVertex(left+width, top);
        canopy.addVertex(left+width, top+height);
        canopy.addVertex(left, top+height);
        return canopy;
    }
}
