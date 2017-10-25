/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class14;

/**
 *
 * @author Lawrence
 */
public class Class14 {

    /**
     * @param args the command line arguments
     */
    //global variables
    private static int base = 5;
    private static int height = 6;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //printAreaOfTraiangle(computeArea(4, 4));
        
        int base = 7;
        int height = 8;
        
        printAreaOfTriangle2(Class14.base,Class14.height);
    }
    
    //method1
    public static double computeArea(int base, int height){
        return base*height*.5;
    }
    
      //method2
    public static void printAreaOfTraiangle(double area){
        System.out.println("Area of a triangle "+ area);
    }
    //rewrite method2 as
    public static void printAreaOfTriangle2(int base, int height){
        System.out.println("Area of a triangle "+computeArea(base, height));
    }
    
}   
    

