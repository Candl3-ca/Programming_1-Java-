/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author f-sam
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.*;
public class Reading_a_file {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) throws IOException{
//        // TODO code application logic here
//        int number;
//        
//        File inputFile = new File("input.txt");
//        Scanner file = new Scanner(inputFile);
//        
//        while(file.hasNext()){
//            
////            read next integer
//        number = file.nextInt();
////            process the value read
//        System.out.println(number);
//        
//        }
////        printing the ending statement
//        System.out.println("End of the file detected, goodbye!");
//    }
//

 public static void main(String[] args) throws IOException{
    int maxGrade;
    int grade;
    

    
    System.out.println("This program finds the maximum grade "
                        + "for a class");
     
    Scanner file = new Scanner(new File("grades.txt"));
         
         
     if (! file.hasNext()){
         System.out.println("No test grades are in the file");
     } else {
         maxGrade = file.nextInt(); // makes the first grade the max grade
            while (file.hasNext());{
            grade = file.nextInt(); //reads the next grade
        if  (grade > maxGrade); {
                maxGrade = grade; // save as a current max
            }
     }
         System.out.println("The maximum grade is " + maxGrade);
     }
         
 }
}