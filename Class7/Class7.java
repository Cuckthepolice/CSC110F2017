/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class7;

/**
 *
 * @author lkhan
 */
import java.util.Scanner;
public class Class7 {
    
    public static void main(String[] args){
    //Decision
    Scanner kb  = new Scanner(System.in);
        System.out.println("Please enter your grade");
        int x = kb.nextInt();
        if(x >=93){
            System.out.println("You got an A");
        }
        else if(x >=90){
            System.out.println("You got an A-");
        }
        else if(x >=87){
            System.out.println("You got an B+");
        }
        else if(x >=83){
            System.out.println("You got an B");
        }
        else if(x >=80){
            System.out.println("You got an B-");
        }
        else if(x >=77){
            System.out.println("You got an C+");
        }
        else if(x >=73){
            System.out.println("You got an C");
        }
        else if(x >=70){
            System.out.println("You got an C-");
        }
        else if(x >=67){
            System.out.println("You got an D+");
        }
        else if(x >=63){
            System.out.println("You got an D");
        }
        else if(x >=60){
            System.out.println("You got an D-");
        }
        else if(x <=59){
            System.out.println("You got an F");
        }
        
//Old days
//        if(x >=93){
//            System.out.println("You got an A");
//        }
//        else if(x >=90 && x<=92){
//            System.out.println("You got an A-");
//        }
//        else if(x >=87 && x<=89){
//            System.out.println("You got an B+");
//        }
//        else if(x >=82 && x<=86){
//            System.out.println("You got an B");
//        }
//        else if(x >=80 && x<=82){
//            System.out.println("You got an B-");
//        }
//        else if(x >=77 && x<=79){
//            System.out.println("You got an C+");
//        }
//        else if(x >=73 && x<=76){
//            System.out.println("You got an C");
//        }
//        else if(x >=70 && x<=72){
//            System.out.println("You got an C-");
//        }
//        else if(x >=67 && x<=69){
//            System.out.println("You got an D+");
//        }
//        else if(x >=63 && x<=66){
//            System.out.println("You got an D");
//        }
//        else if(x >=60 && x<=62){
//            System.out.println("You got an D-");
//        }
//        else if(x <=59){
//            System.out.println("You got an F");
//        }
    }
}
