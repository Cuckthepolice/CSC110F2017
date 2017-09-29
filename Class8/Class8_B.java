/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8;

import java.util.Scanner;

/**
 *
 * @author lkhan
 */
public class Class8_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        int x = 5;
        int y = 6;
        System.out.println("The area of a rectangle with x = 5 and y = 6:"+x*y);
        x = 7;
        y = 8;
        System.out.println("The area of a rectangle with x = 7 and y = 8:"+x*y);
        x = 10;
        y = 10;
        System.out.println("The area of a rectangle with x = 10 and y = 10:"+x*y);
        
        //The proper way to do the above exercise is to create a method so that we can repurpose our code
        //we are using the rectangle method
        System.out.println("The area of rectangle x and y :"+rectangle(5, 6));
        System.out.println("The area of rectangle x and y :"+rectangle(7, 8));
        System.out.println("The area of rectangle x and y :"+rectangle(10, 10));
        
        //we can combine both our computing and printing in one method
        //we are using the rectangleAndPrint method
        rectangleAndPrint(5.0, 6);
        rectangleAndPrint(7.0, 8);
        System.out.println("Please enter length");
        int length = kb.nextInt();
        System.out.println("Please enter width");
        int width = kb.nextInt();
        rectangleAndPrint(length, width);
    }
    //This method is good computing only
    public static int rectangle(int length, int width){
        return length * width;
    }
    public static void rectangleAndPrint(double length, int width){
        System.out.println("The area of rectangle where x = "+length+" and y = "+width+" : "+(length*width));
    }
    
    
    
}
