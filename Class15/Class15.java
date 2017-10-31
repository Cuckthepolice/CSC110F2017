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
public class Class15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The difference between x and y " + difference(4, 5, true));

        int integer_x = 4;
        int integer_y = 5;

        double double_x = 6.0;
        double double_y = 7.0;
        System.out.println("The difference between x & y " + difference(double_x, double_y));
        
        
        
    }

    //method overloading
    public static int difference(int x, int y) {
        return x - y;
    }
    public static float difference(float x, short y){
        return x-y;
    }
    public static double difference(double x, double y){
        return x-y;
    }
    public static double difference(double x, int y){
        return x-y;
    }
    public static double difference(int x, double y){
        return x-y;
    }
    
    public static int difference(int x, int y, boolean absolute) {
        if (absolute) {
            return Math.abs(x - y);
        } else {
            return x - y;
        }
    }

}
