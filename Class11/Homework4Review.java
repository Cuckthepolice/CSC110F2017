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
        System.out.printf("Area of a circle with radius %d = %.2f m%c \n",radius,Math.PI*radius*radius,(char)178);
        //Circumference of the circle
        System.out.printf("%25s %.2f m \n","Circumference",2*Math.PI*radius);
        //Question #3
        short base  = 4;
        double height = 7.3;
        System.out.printf("Area of triangle %.2f m%c \n", .5*base*height,(char)178);
        
        //Question #4
        byte x = 8;
        byte y = 9;
        System.out.printf("Radius of a unit circle %.2f m \n" , Math.sqrt(x*x+y*y));
        
        //Question #5
        double celsius = 6;
        System.out.printf("Fahrenheit %.2f %cF \n" , (celsius*9/5+32),(char)176);
        //Question #6
        short fahrenheit = 212;
        System.out.printf("Celsius %.2f %cC \n", (double)(fahrenheit-32)*5/9,(char)176);
        
        //Question 7
        short futureValue = 100;
        double rate = 0.05;
        byte n = 5;
        System.out.printf("Present value is $%,.2f \n",(futureValue/Math.pow((1+rate), n)));
        
        //Question 8
        double gravity = 6.67408E-11;
        double massE = 5.972E24;
        double massM = 7.34767309E22;
        int distance = (int)3.844E8;
        double forceDuetoGravity = (gravity*massE*massM)/Math.pow(distance, 2);
      
        System.out.printf("Force due to gravity between mooon and earth %,10.0f newtons.\n", forceDuetoGravity);
        
        //Question #9
        int mass = 3000;
        short velocity = 60;
        System.out.printf("Kinetic energy = %,.0f lbs%cmph%c \n", (0.5*mass*velocity*velocity),(char)215,(char)178);
        
        //Question 10
        double upProbability = 0.7;
        double downProbability = 0.3;
        int upValue = 80;
        int downValue = 40;
        double rfr = 0.05;
        double stockValue = (upProbability*upValue+downProbability*downValue)/(1+rfr);
       
        System.out.printf("The expected value of my stock is $%.4f\n", stockValue);
                
        
        
              
        
                
        
    }
    
}
