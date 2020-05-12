package editorapplication;

import acm.io.*;
import utilities.*;

public class Editor {

    private ListDL text;
    private int current;
    private IOConsole console;

   public Editor(IOConsole console) {
       text = new ListDL();
       current = 0;
       this.console = console;
   }
   
   public void up() {
       if(current > 0) {
           this.current = current - 1;
           System.out.println(current + "" + text.size());
       }
       else {
           System.out.println("The editor cannot move up any more" + current + text.size());
       }
   }
   
   public void down() {
       if(current < text.size() - 1) {
           this.current = current + 1;
           System.out.println(current + "" + text.size());
       }
       else {
           System.out.println("The editior cannot move down any more" + current + text.size());
       }
   }
   
   public void insert(String newLine) {
       int temp = current;
       text.insert(newLine, current);
       current = temp++;
       
   }
   
   public void delete() {
       if(current < text.size()) {
           text.delete(current);
           if(current > 0) {
               this.current = current - 1;
           }
       }
       else {
           System.out.println("There is no line to delete");
       }
   }
   
   public void printCurrent() {
       if(current < text.size()) {
           System.out.println(text.elementAt(current));
       }
       else {
           System.out.println("There is no line to print");
       }
   }
   
   public void printAll() {
       
       for(int i = 0; i < text.size(); i++) {
           if(i == current && i < text.size()) {
               System.out.print(" > " + text.elementAt(i));
           }
           else if(i == text.size()){
               System.out.println(" > ");
           }
           else {
            System.out.print("  " + text.elementAt(i));
           }
       }
       System.out.println("");
   }
}