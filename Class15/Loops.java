/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class15;

/**
 *
 * @author Lawrence
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //while loop
        //infinite loop
//        while(true){
//            System.out.println("y");
//        }

        for(int i=1;i<=10;i++){
            if(i % 2 ==0){
                System.out.println("I am number "+i+" from the for loop");
            }
            
        }
               
        
        //for loop converted to a while loop
        
        int j=1;
        while(j<=10){
            if (j % 2 == 1){
                System.out.println("I am number "+j+" from the while loop");
            }           
            j++;
        }
        
        byte cars;
        int counter = 0;
//        do{
//            counter++; 
//            cars = (byte)Math.floor(Math.random()*10);
//            System.out.println("I am crossed the street"+counter +"  times and checked for cars after "+cars);
//        }while(cars < 5);
        
        cars = (byte)Math.floor(Math.random()*10);
        while(cars < 5){
            counter++; 
            System.out.println(" I am checking for cars first " + cars+" and then crossing the road "+counter);
            cars = (byte)Math.floor(Math.random()*10);            
        }
        System.out.println("I saw "+cars+" cars so I didn't cross the road");
        
        double truck  = Math.random()*100;
        System.out.println(truck);
        System.out.println(Math.round(truck));
        System.out.println(Math.floor(truck));
    }
    
}
