/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16;

/**
 *
 * @author Lawrence
 */
public class Class16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Loop 1a. Incrementing");
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is "+i);
        }
        System.out.println("Loop 1b. Incrementing");
        for (int i = 0; i <= 9; i++) {
            System.out.println("This is "+(i+1));
        }
        
        System.out.println("Loop 2a. Decrementing");
        for (int i = 10; i >=1; i--) {
            System.out.println("This is "+ i);
        }
        System.out.println("Loop 2b. Decrementing");
        for (int i = 9; i >=0; i--) {
            System.out.println("This is "+ (i+1));
        }
        
        System.out.println("Loop 3. Up and down");
        for (int i = 0; i <=9; i++) {
            System.out.println("This is "+ (10-i));
        }
        
        System.out.println("Hacking while to behaving like a for loop");
        int i=1;
        while(i<=10){            
            System.out.println("This is "+i++);
        }
        System.out.println("The value of i "+ i);
        System.out.println("The value of i printing it the second time "+ i);
        
        System.out.println("Hacking while loop to behaving like a for loop with prefix");
        i = 0;
        while(i<=9){            
            System.out.println("This is "+ ++i);
        }
        
        System.out.println("For loop 50 to 100 but print 1-10");
        for(i=50;i<=100;i++){
            
            if(i>=60){
                break;
            }
            if(i<60){
                System.out.println("This is "+(i-49));
                
            }else{
                System.out.println("I am still going on "+i);
                
            }
        }
        
        //times table
        for (int j = 1;j<=20;j++){            
            for(int k = 1;k<=20;k++){
                System.out.print(j*k+"      ");
                //use printf to control space
            }
            System.out.println(" ");
        }
        
    }
    
}
