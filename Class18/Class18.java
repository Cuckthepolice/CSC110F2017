/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Lawrence
 */
public class Class18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        FileReader fileReader = new FileReader("/Users/Lawrence/Downloads/MSFT.csv");
        Scanner reader = new Scanner(fileReader);
        
//        System.out.println(reader.nextLine());
//        System.out.println(reader.nextLine());
//        System.out.println(reader.nextLine());
//        System.out.println(reader.nextLine());
        int counter = 0;
        while(reader.hasNextLine()){
            System.out.println(reader.nextLine());
            reader.nextLine();
            counter++;
        }
        System.out.println("We have read "+counter+" lines");
        
    }
    
}
