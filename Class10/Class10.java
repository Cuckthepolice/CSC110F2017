/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class10;

/**
 *
 * @author lkhan
 */
public class Class10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        ! is an unary operator so are
        + in front of an value to indicate positive values like +10
        + in front of an value to indicate negative values like +10
        ++ increment
        -- decrement
        we have seen everything above so far but not the use of ! except for
        comparing when not equal to something.
        */
        
        boolean value1  = true;
        boolean value2 = false;
        //ways to compare when they are not equal to each other
        if(value1!=value2){
            System.out.println("They are unrelated");
        }
        //the other way to write above senence.
        if(!(value1==value2)){
            System.out.println("They are unrelated");
        }
        if(!value1!=value2){
            System.out.println("They are unrelated");
        }else{
            System.out.println("They are not unrelated. Franks says they related");
        }
        //how to check boolean values
        if(value1==true){
            System.out.println("Value 1 true");
        }else{
            System.out.println("Value 1 false");
        }
        //you don't have to check with == for boolean
        if(!value2){ //!value2 is like saying value2 == false
            System.out.println("Value 2 false");
        }else{
            System.out.println("Value 2 true");
        }
        
        //comparing two strings Algorithmic workbench#9
        //following
        String a = "title1";
        String b = "title2";
        if(a.equalsIgnoreCase(b)){
            System.out.println("They are equal to each other");
        }else{
            System.out.println("They are not equal to each other");
        }
        /*Console output
        *    They are not equal to each other
        */
        /*
        * To compare two string to determine how they are ordered then we use the compare method.
        * Compare method returns either -1 or 0 or 1
        * -1 means a is left hand side of b or above b
        * 0 means a and b are equal to eachother
        * 1 means a is on the right hand side or below b
        */
        System.out.println(a.compareTo(b));
        
        //ternary system
        byte x = 1;
        byte y = 2;
        byte aa = 10;
        byte bb = 20;
        //the long way
        if(x<y){
            y = (byte)(aa+bb);
        }else{
            y = (byte)(x*2);
        }
        System.out.println("Value of y = " + y);
        
        //ternary statement
        y = x<y? (byte)(aa+bb):(byte)(x*2);
        System.out.println("Value of y with a ternary statement = " + y);
    }
    
}
