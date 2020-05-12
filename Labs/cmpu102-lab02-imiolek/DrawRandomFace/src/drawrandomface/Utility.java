/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawrandomface;

import java.awt.*;
import java.util.Random;

/**
 *
 * @author mcimiolek
 */
public class Utility {
    
    public static boolean CoinToss(){
        Random randomInts = new Random();
        int face = Math.abs(randomInts.nextInt());
        int remainder = (face % 2);
        
        if(remainder==1){
            return true;
        }
        else {
            return false;
        }
    }
    
    public static int dieRoll(int numSides){
        Random randomInts = new Random();
        int side = Math.abs(randomInts.nextInt());
        int remainder = (side % numSides);
        
        return remainder;
    }
    
    public static Color randomColor(){
        Color color;
        
        switch(dieRoll(8)){
            case 0: color = Color.BLACK; break;
            case 1: color = Color.BLUE; break;
            case 2: color = Color.RED; break;
            case 3: color = Color.GREEN; break;
            case 4: color = Color.CYAN; break;
            case 5: color = Color.YELLOW; break;
            case 6: color = Color.ORANGE; break;
            case 7: color = Color.PINK; break;
            default: color = Color.BLACK;
        }
        
        return color;
    }
    
    public static double randomDouble(double LBound, double UBound){
        double dbl = (LBound + (Math.random() * (UBound - LBound)));
        
        return dbl;
    }
}
