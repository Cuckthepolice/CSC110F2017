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
        boolean value1  = true;
        boolean value2 = false;
        //ways to compare
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
            System.out.println("They are no unrelated. Franks says they related");
        }
        //how to check boolean values
        if(value1==true){
            System.out.println("Value 1 true");
        }else{
            System.out.println("Value 1 false");
        }
        //you don't have to check with == for boolean
        if(!value2){
            System.out.println("Value 2 false");
        }else{
            System.out.println("Value 2 true");
        }
        
        //comparing two strings Algorithmic workbench#9
        String a = "khan";
        String b = "lawrence";
        if(a.equalsIgnoreCase(b)){
            System.out.println("They are equal to each other");
        }else{
            System.out.println("They are not equal to each other");
        }
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
