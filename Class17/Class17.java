/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class17;

import java.util.Random;

/**
 *
 * @author Lawrence
 */
public class Class17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //firstGuess();
        secondGuess();
    }
    public static void firstGuess(){
        
        long timer = System.currentTimeMillis();
        int multiplier = 1000000000;
        long counter=0L;
        //1 we are guessing a value
        long firstGuess = Math.round(Math.random()*multiplier);
        long secondGuess;
        do{
            secondGuess = Math.round(Math.random()*multiplier);
            counter++;
            //System.out.println(counter+")"+secondGuess+" trying to guess "+ firstGuess);
        }while(secondGuess != firstGuess);
        
        System.out.println(counter+") "+secondGuess+" trying to guess "+ firstGuess);
        System.out.println("It took "+ (System.currentTimeMillis()-timer)+" seconds");
    }
    public static void secondGuess(){
        
        long timer = System.currentTimeMillis();
        int multiplier = 1000000000;
        long counter=0L;
        //1 we are guessing a value
        long firstGuess;
        long secondGuess;
        do{
            firstGuess = Math.round(Math.random()*multiplier);
            secondGuess = Math.round(Math.random()*multiplier);
            counter++;
            //System.out.println(counter+")"+secondGuess+" trying to guess "+ firstGuess);
        }while(secondGuess != firstGuess);
        
        System.out.println(counter+") "+secondGuess+" trying to guess "+ firstGuess);
        System.out.println("It took "+ (System.currentTimeMillis()-timer)+" seconds");
    }
    
    
}
