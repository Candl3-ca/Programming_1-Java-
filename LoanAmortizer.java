/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loanamortizer;

import java.util.Scanner;

/**
 *
 * @author
 */
public class LoanAmortizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Creating a new Scanner */
        Scanner kb = new Scanner(System.in);
        
        /* Char to be read from user to continue or not the cycle */
        String answer;
        
        do {
            
            /* Asking the loan amount */
            System.out.print("\nPlease insert the loan amount : ");
            double loanAmount = kb.nextDouble();
            
            /* Asking the annual interest rate */
            System.out.print("\nInsert the annual interest rate (8.25 for 8.25%) : ");
            double annualInterest = kb.nextDouble();
            
            /* Asking the loan duration */
            System.out.print("\nInsert the number of months for this loan : ");
            int months = kb.nextInt();
            
            /* Creating a new Loan */
            Loan loan = new Loan(loanAmount, annualInterest, months);
            
            /* Printing informations */
            System.out.println("\n" + loan + "\n\n" + loan.amoritze());
            
            /* Asking the user if he wants to wiew another report */
            System.out.print("\nWould you like to run another report?\n" +
                    "Enter Y or N : ");
            answer = kb.next();
            
        } while (answer.equals("y") || answer.equals("Y"));
        
        /* Goodbye to the user */
        System.out.println("\nGoodbye!");
        
    }
    
}
