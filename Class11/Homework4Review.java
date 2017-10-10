/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class11;

/**
 *
 * @author Lawrence
 */
public class Homework4Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Question1 
        byte radius = 3;
        System.out.println("Area of a cir with radius "+Math.PI*radius*radius);
        //Circumference of the circle
        System.out.println("Circumference "+2*Math.PI*radius);
        //Question #3
        short base  = 4;
        double height = 7.3;
        System.out.println("Area of triangle "+ .5*base*height);
        
        //Question #4
        byte x = 8;
        byte y = 9;
        System.out.println("Radius of a unit circle " + Math.sqrt(x*x+y*y));
        
        //Question #5
        double celsius = 6;
        System.out.println("Fahrenheit " + (celsius*9/5+32));
        //Question #6
        short fahrenheit = 212;
        System.out.println("Celsius "+ (fahrenheit-32)*5/9);
        
        //Question 7
        short futureValue = 100;
        double rate = 0.05;
        byte n = 5;
        System.out.println("Present value "+(futureValue/Math.pow((1+rate), n)));
        
        //Question 8
        double gravity = 6.67408E-11;
        double massE = 5.972E24;
        double massM = 7.34767309E22;
        int distance = (int)3.844E8;
        System.out.println("Force due to gravity between mooon and earth " + 
         (gravity*massE*massM)/Math.pow(distance, 2)       );
        
        //Question #9
        int mass = 3000;
        short velocity = 60;
        System.out.println("Kinetic NRG = " + (0.5*mass*velocity*velocity)+(" lbs/mph^2"));
        
        //Question 10
        double upProbability = 0.7;
        double downProbability = 0.3;
        int upValue = 80;
        int downValue = 40;
        double rfr = 0.05;
        double stockValue = (upProbability*upValue+downProbability*downValue)/(1+rfr);
        System.out.println("The expected value of my stock $"+ stockValue);
        System.out.printf("The expected value of my stock is $%.4f\n", stockValue);
                
        
        
              
        
                
        
    }
    
}
