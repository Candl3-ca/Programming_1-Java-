/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author f-sam
 */
import java.util.Scanner;
public class Number_converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Scanner input = new Scanner(System.in);
//      prompts the user to input a number  
     System.out.println("Please enter a 4-digit Octal number");
     int octal = input.nextInt();

     String num = "" + octal; //turning it to a string
        String[] numbers = num.split(""); // splitting the string into an array

        int sum = 0; // where you store the sum
        int numLen = num.length(); //length of the number referring to line 25

//      Math equation here
        for(int i=0; i<numLen;i++){
            int number = Integer.parseInt(numbers[numLen-1-i]); // the number goes from right to left (-1 because  lenth =! length)
            sum += ( Math.pow(8,i) * number);
        }
//    printing an output with the data
        System.out.printf("The Octal number is " + octal + 
                        "%nThe Decimal number is " + sum + "%n");
    }
}
 
