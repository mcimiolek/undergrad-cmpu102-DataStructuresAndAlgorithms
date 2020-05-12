package vehiclesapplication;
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public abstract class Vehicle extends GCompound {
    protected GObject body;
    protected GObject fWheel;
    protected GObject bWheel;
    protected GObject canopy;
    
    public Vehicle(int left, int top, int width, int height){
        makeObjects(left, top, width, height);
        addObjects();
    }
    
    private void makeObjects(int left, int top, int width, int height){
        body = makeBody(left, top+height/2, width, height/4);
        fWheel = makeWheel(left+width/8, top+height/2+height/8, width/3);
        bWheel = makeWheel(left+width/2+width/8, top+height/2+height/8, width/3);
        canopy = makeCanopy(left+width/4, top, width/4, height/2);
    }
    
    private void addObjects(){

        add(fWheel);
        add(bWheel);
        add(canopy);
        add(body);
    }
    
    private GObject makeBody(int left, int top, int width, int height){
        GRect body = new GRect(left, top, width, height);
        body.setFilled(true);
        body.setFillColor(Color.WHITE);
        return body;
    }
    
    private GObject makeWheel(int left, int top, int diameter){
        return new GOval(left, top, diameter/2, diameter/2);
    }
    
    protected abstract GObject makeCanopy(int left, int top, int width, int height);
}
