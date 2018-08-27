/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocess;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xcwilliams
 */
public class StringProcess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       String [] records= new String [100];
        try{
            Scanner reader = new Scanner(new File(args[0]));
            int currentIndex=0;
            while (reader.hasNext()){
                
                String[] line= reader.nextLine().split(",");
                String firstName=line [0];
                String lastName=line[1];
                String age=line [2];
                String gender=line [3];
                String phoneNumber=line [4];
                String email=line [5];
                
                records[currentIndex]= String.format("%-20s%-20s%-10s%10s%-10s%15s", firstName,lastName,gender,age, phoneNumber,email );
                System.out.println(records[currentIndex]);
                currentIndex ++;
                
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Could not find the input file");
        }



// TODO code application logic here
    }
  
}
