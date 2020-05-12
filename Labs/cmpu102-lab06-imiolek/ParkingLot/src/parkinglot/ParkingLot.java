package parkinglot;
import acm.program.*;


public class ParkingLot extends ConsoleProgram{
    
    public void run() {
        ListDL free = initializeResources();
        ListDL rented = new ListDL();
        println("Three Brothers Parking Lot");
        printStatus(free,rented);
        do {
            String command = readLine("Enter RENT or RETURN : ");
            command = command.trim().toUpperCase();
            if (command.equals("RENT")) {
                processRent(free,rented);
            } else if (command.equals("RETURN")) {
                processReturn(free,rented);
            } else break;
            printStatus(free,rented);
        } while (true);
    }
    
    private static ListDL initializeResources() {
        ListDL free = new ListDL();
        for (int number = 0; number < 10; number++) {
            if (number < 3)
                free.add(new ParkingSpace(number,ParkingSpace.SMALL));
            else if (number < 9)
                free.add(new ParkingSpace(number,ParkingSpace.MEDIUM));
            else
                free.add(new ParkingSpace(number,ParkingSpace.LARGE));
        }
        return free;
    }
    
    private void processRent(ListDL free, ListDL rented) {
        String size = readLine("Enter SMALL, MEDIUM or LARGE : ");
        size = size.trim().toUpperCase();
        String renter = readLine("Enter your name: ").trim();
        ParkingSpace request;
        if (size.equals("SMALL"))
            request = new ParkingSpace(ParkingSpace.SMALL);
        else if (size.equals("MEDIUM"))
            request = new ParkingSpace(ParkingSpace.MEDIUM);
        else request = new ParkingSpace(ParkingSpace.LARGE);
        if (free.contains(request)) {
            ParkingSpace location = (ParkingSpace)free.remove(request);
            rented.add(new Association(renter,location));
            println("ParkingSpace "+location.number+" rented.");
        } else {
            println("No ParkingSpace available. Sorry.");
        }
    }
    
    private void processReturn(ListDL free, ListDL rented) {
        String renter = readLine("Enter your name: ").trim();
        Association query = new Association(renter);
        if (rented.contains(query)) {
            Association contract = (Association) rented.remove(query);
            ParkingSpace location = (ParkingSpace) contract.data();
            free.add(location);
            println("ParkingSpace "+location.number+" is now free.");
        } else {
            println("No ParkingSpace rented to "+renter+".");
        }
    }
    
    private void printStatus(ListDL free,ListDL rented) {
        
        if (free.isEmpty()) println("Free Parking ParkingSpaces: None.");
        else {
            println("Free Parking ParkingSpaces: ");
            println(free.toString());            
        }
        if (rented.isEmpty()) println("Rented Parking ParkingSpaces: None.");
        else {
            println("Rented Parking ParkingSpaces: ");
            println(rented.toString()); 
        }
    }
    
    public static void main(String[] args) {
        new ParkingLot().start();
    }
    
}
