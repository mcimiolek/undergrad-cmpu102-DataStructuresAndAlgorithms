package vehiclesapplication;
import acm.program.*;

public class VehiclesApplication extends GraphicsProgram {
    
    public void run() {        
      Vehicle sedan = new Sedan(150,100,300,125);
      add(sedan);
      Vehicle truck = new Truck(150,300,300,125);
      add(truck);
    }
    
   
   public static void main(String[] args) {
      new VehiclesApplication().start(args);
   }
}
