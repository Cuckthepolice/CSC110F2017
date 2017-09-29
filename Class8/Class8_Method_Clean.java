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
public class Class8_Method_Clean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        rectangleAndPrint(5.0, 6);
        rectangleAndPrint(7.0, 8);
        System.out.println("Please enter length");
        int length = kb.nextInt();
        System.out.println("Please enter width");
        int width = kb.nextInt();
        rectangleAndPrint(length, width);
    }
    public static void rectangleAndPrint(double length, int width){
        System.out.println("The area of rectangle where x = "+length+" and y = "+width+" : "+(length*width));
    }
    
}
