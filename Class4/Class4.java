/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class4;

/**
 *
 * @author lkhan
 */
public class Class4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //type casting
        int c = 22;
        byte b = 0;
        short a = 18;
        //we are type casting the sum of a which is a short and c which is an int
        b = (byte)(a+c);
        
        System.out.println("The value of b: " + b);
    }
    
}
