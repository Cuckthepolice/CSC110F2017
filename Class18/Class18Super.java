/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class18;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Lawrence
 */
public class Class18Super {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            FileReader fileReader = new FileReader("/Users/Lawrence/Downloads/MSFT.csv");
            BufferedReader buffReader = new BufferedReader(fileReader);
            
            int counter=0;
            String line="";
            while((line=buffReader.readLine())!= null){                
                System.out.println(line);
                counter++;
            }
            System.out.println("I have read "+counter+" lines");
            
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        
        
    }
    
}
