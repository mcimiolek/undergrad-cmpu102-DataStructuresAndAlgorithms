package utilities;
import acm.program.*;
import associativemapdemo.Association;
import utilities.*;

public class AssociativeMapDemo extends ConsoleProgram {
    
    public void run() {
        AssociativeMap<String,Integer> map = new AssociativeMapBST<String,Integer>();
        printMap(map);
        do {
            String command = readLine("Enter INSERT, DELETE or LOOKUP : ");
            command = command.trim().toUpperCase();
            if (command.equals("INSERT")) processInsert(map);
            else if (command.equals("DELETE")) processDelete(map);
            else if (command.equals("LOOKUP")) processLookup(map);
            else continue;
            printMap(map);
        } while (true);        
    }

    public void printMap(AssociativeMap<String,Integer> map) {
        println("Contents of map: ");
        Queue<Association<String,Integer>> queue = map.elements();
        while (!queue.isEmpty()) {
            println(queue.front());
            queue.deQueue();
        }
    }
    
    public void processInsert(AssociativeMap<String,Integer> map) {
        String key = readLine("Enter the key: ");
        Integer data = Integer.parseInt(readLine("Enter the data: "));
        map.insert(key,data);
    }    
    
    public void processDelete(AssociativeMap<String,Integer> map) {
        String key = readLine("Enter the key: ");
        map.delete(key);
    }     
    
     public void processLookup(AssociativeMap<String,Integer> map) {
        String key = readLine("Enter the key: ");
        println(map.lookUp(key));
    }     
    
    public  static void main(String[] args) {
        new AssociativeMapDemo().start();
    }
    
}
