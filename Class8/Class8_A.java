/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8;

/**
 *
 * @author lkhan
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Class8_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Please enter a value");
        if(kb.hasNextInt()){
            int i  = kb.nextInt();
            System.out.println("You entered "+ i);
        }else{
            System.out.println("You did not enter a integer value");
        }
        
        String str  = JOptionPane.showInputDialog("Please enter a value");
        System.out.println("You entered half the value of "+Double.parseDouble(str)*2);
        
        System.out.println("Please enter a value");
        String str1 = kb.next();
        System.out.println("You entered half the value of "+Double.parseDouble(str1)*2);
        
        
    }
    
}
