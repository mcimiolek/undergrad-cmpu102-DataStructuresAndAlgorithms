package superheroes;
import acm.program.*;
import acm.io.*;
import acm.graphics.*;
import java.awt.*;

public class SuperHeroes extends GraphicsProgram {

    public void run() {
        GRect firstHeroL1 = new GRect(150, 150, 200, 200);
        firstHeroL1.setFilled(true);
        firstHeroL1.setColor(Color.RED);
        
        GOval firstHeroL2 = new GOval(162.5, 150, 175, 200);
        firstHeroL2.setFilled(true);
        firstHeroL2.setColor(Color.YELLOW);
        
        GPolygon firstHeroL3 = new GPolygon();
        firstHeroL3.addVertex(200, 150);
        firstHeroL3.addVertex(300, 150);
        firstHeroL3.addVertex(290, 225);
        firstHeroL3.addVertex(210, 225);
        firstHeroL3.setFilled(true);
        firstHeroL3.setColor(Color.RED);
        
        GArc firstHeroL4 = new GArc(110, 275, 100, 150, 0, 90);
        firstHeroL4.setFilled(true);
        firstHeroL4.setColor(Color.RED);
        
        GArc firstHeroL5 = new GArc(290, 275, 100, 150, 90, 90);
        firstHeroL5.setFilled(true);
        firstHeroL5.setColor(Color.RED);
        
        GLine firstHeroL6 = new GLine(150, 320, 300, 320);
        firstHeroL6.setColor(Color.RED);
        
        GPolygon firstHeroL7 = new GPolygon();
        firstHeroL7.addVertex(200, 245);
        firstHeroL7.addVertex(230, 250);
        firstHeroL7.addVertex(230, 265);
        firstHeroL7.addVertex(200, 260);
        firstHeroL7.setFilled(true);
        firstHeroL7.setColor(Color.BLUE);
        
        GPolygon firstHeroL8 = new GPolygon();
        firstHeroL8.addVertex(300, 245);
        firstHeroL8.addVertex(270, 250);
        firstHeroL8.addVertex(270, 265);
        firstHeroL8.addVertex(300, 260);
        firstHeroL8.setFilled(true);
        firstHeroL8.setColor(Color.BLUE);
        
        add(firstHeroL1);
        add(firstHeroL2);
        add(firstHeroL3);
        add(firstHeroL4);
        add(firstHeroL5);
        add(firstHeroL6);
        add(firstHeroL7);
        add(firstHeroL8);
        
        GOval secondHeroL1 = new GOval(400, 150, 200, 200);
        secondHeroL1.setFilled(true);
        secondHeroL1.setColor(Color.GREEN);
        
        GOval secondHeroL2 = new GOval(405, 155, 190, 190);
        secondHeroL2.setFilled(true);
        secondHeroL2.setColor(Color.WHITE);
        
        GRect secondHeroL3 = new GRect(440, 175, 120, 30);
        secondHeroL3.setFilled(true);
        secondHeroL3.setColor(Color.GREEN);
        
        GRect secondHeroL4 = new GRect(440, 295, 120, 30);
        secondHeroL4.setFilled(true);
        secondHeroL4.setColor(Color.GREEN);
        
        GOval secondHeroL5 = new GOval(450, 200, 100, 100);
        secondHeroL5.setFilled(true);
        secondHeroL5.setColor(Color.GREEN);
        
        GOval secondHeroL6 = new GOval(480, 230, 40, 40);
        secondHeroL6.setFilled(true);
        secondHeroL6.setColor(Color.WHITE);
        
        add(secondHeroL1);
        add(secondHeroL2);
        add(secondHeroL3);
        add(secondHeroL4);
        add(secondHeroL5);
        add(secondHeroL6);
        
        IODialog dialog = getDialog();
        String firstName = dialog.readLine("Guess who is the first super-hero? ");
        String secondName = dialog.readLine("Guess who is the second super-hero? ");
        GLabel firstLabel = new GLabel(firstName, 150, 450);
        add(firstLabel);
        GLabel secondLabel = new GLabel(secondName, 400, 450);
        add(secondLabel);
        //dialog.print("Wow! " + maleHero + " and " + femaleHero + "!");
        dialog.println("I hope you like my drawings!");
    }
    public static void main(String[] args) {
        new SuperHeroes().start(args);
    }

    private GPoint GPoint(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
