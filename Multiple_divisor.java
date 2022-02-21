/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author f-sam
 */
import java.util.Scanner;
public class Multiple_divisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
//      prompts the user to input both a multiplier and a divisor
        System.out.println("Please input a number");
        int multiple = input.nextInt();
        
        System.out.println("Please input a divisor");
        int divisor = input.nextInt();
//        Defines what an answe is (Has to be 0)
        int answer =(multiple%divisor);
//       a small loop that prints an output based on the answer obtained
        if (answer == 0){
            System.out.println(divisor + " is a multiple of " + multiple);
        } else {
            System.out.println( divisor + " is not a multiple of " + multiple);
                                        
        }
        
        
    }
    
}
