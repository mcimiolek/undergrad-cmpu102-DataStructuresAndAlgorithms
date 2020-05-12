package easyinteraction;
import acm.*;
import java.lang.*;

import static java.sql.DriverManager.println;

public class EasyInteraction extends ConsoleProgram {
 
   public void run() {      
      println("Welcome to CMPU102: Topics in Computer Science");
      String firstName = readLine("Please enter your first name: ");
      String lastName = readLine("Please enter your last name: ");
      println("Hello, " + firstName + " " + lastName + "." );
      println("It's a pleasure to have you with us!");
   }
 
/* Standard Java entry point */
/* This method can be eliminated in most Java environments */
   public static void main(String[] args) {
      new EasyInteraction().start(args);
   }
} 
