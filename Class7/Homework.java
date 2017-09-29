/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class7;

/**
 *
 * @author lkhan
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int value1 = 6700;
        short value2 = 3200;
        long value3 = 20000000000000L;
        float value4 = 25142.1324f;
        double value5 = 12330234151.0;
        byte value6 = 127;
        
        //2
        double doubleCastedValue1 = (double)value1;
        float floatCastedValue2 = (float)value2;
        int intCastedValue3 = (int)value3;
        double doubleCastedValue4 = (double)value4;
        long longCastedValue5 = (long)value5;
        
        //3
        String textual = "2.78182818281828";
        int intTextual = (int) Double.parseDouble(textual);
        double doubleTextual = Double.parseDouble(textual);
        float floatTextual = Float.parseFloat(textual);
        //alligator doesn't exist or maybe in chapter 6.
        //Alligator alligatorTextual = new Alligator(textual);
        
        //4
        System.out.println("23 mod 7 is " + 23 % 7);
        //5
        long fiftythree = 5323L;
        long eight = 8L;
        System.out.println("53 divided by 8 = "+ (double)fiftythree/eight);
        
        
        
        
    }
    
}
