/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class5;

import java.util.Scanner;

/**
 *
 * @author Lawrence
 */

public class Class5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String str = "Today is Thursday";
        
        System.out.println("The length of str is "+str.length());
        System.out.println("The character at 7th location is " + str.charAt(7));
        System.out.println("I think the letter u appears at "+str.indexOf("u"));
        System.out.println("I think the word 'is' appears at "+str.indexOf("is"));
        System.out.println("I think the firt 5 letter word is "+ str.substring(0,5));
        System.out.println("I think the firt 5 letter word is "+ str.substring(4));
        str = "   " + str + "   ";
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println("To lowercase everything I should use str.lower()"+str.toLowerCase());
        System.out.println("Everything uppercase " + str.toUpperCase());
        System.out.println("Does this sentence have the word Monday "+str.contains("Monday"));
        System.out.println("Does this sentence have the word Thursday "+str.contains("Thursday"));
        System.out.println("Does this sentence have the word Thursday "+str.indexOf("Monday"));
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("What day is today?");
        String today = "";
        today = kb.nextLine();
        System.out.println("You typed in " + today);
        System.out.println("Does this sentence have "+str.contains(today));
        System.out.println("Hey give me an integer");
        int anInteger = kb.nextInt();
        System.out.println("You typed 1/4 of this value" + 4*anInteger);
        
        
        
        
    }
    
}
