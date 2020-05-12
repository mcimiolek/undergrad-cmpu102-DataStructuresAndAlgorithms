package priorityqueuesort;
import acm.program.*;
import utilities.*;

public class PriorityQueueSort extends ConsoleProgram { 
   
    public void run() {
        PriorityQueueListSL<String> strings = new PriorityQueueListSL<String>();
        String string;
        do {
            string  = readLine("Please enter a string:");
            if(string.equals("")) {
                break;
            }
            else {
                strings.insert(string);
            }
        } while(true);
    
        while (!(strings.isEmpty())) {
            System.out.println(strings.min());
            strings.delete();
        }
    }

    
    public static void main(String[] args) {
        new PriorityQueueSort().start();
    }
    
}
