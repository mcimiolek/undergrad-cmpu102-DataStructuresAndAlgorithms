package vehiclesapplication;
import acm.program.*;
import acm.graphics.*;

public class Truck extends Vehicle {
    public Truck(int left, int top, int width, int height){
        super(left, top, width, height);
    }
    
    protected GObject makeCanopy(int left, int top, int width, int height){
        return new GRect(left, top, width, height);
    }
}
