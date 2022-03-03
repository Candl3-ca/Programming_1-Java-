/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grades;

/**
 *
 * @author f-sam
 */
import java.util.Scanner;
public class Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Grade :");
        double digitScore = input.nextDouble();
        char letterScore = toLetterScore(digitScore);
        printMessageIfElse(letterScore);
        printMessageSwitch(letterScore);

    }

    public static char toLetterScore(double digitScore) {

        if (digitScore >= 90 && digitScore <= 100) {
            return 'A';
        } else if (digitScore >= 80 && digitScore < 90) {
            return 'B';
        } else if (digitScore >= 70 && digitScore < 80) {
            return 'C';
        } else if (digitScore >= 60 && digitScore < 70) {
            return 'D';
        } else {
            return 'F';
        } 
    }

    public static void printMessageIfElse(char letterScore) {

        System.out.println("Your score is:" + letterScore);
        if (letterScore == 'A') {
            System.out.println("Excellent");
        } else if (letterScore == 'B') {
            System.out.println("Well Done");
        } else if (letterScore == 'C') {
            System.out.println("Well Done");
        } else if (letterScore == 'D') {
            System.out.println("Passed");
        } else if (letterScore == 'F') {
            System.out.println("Better try again");
        }

    }

    public static void printMessageSwitch(char letterScore) {

        switch (letterScore) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Well Done");
                break;
            case 'C':
                System.out.println("Well Done");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
        }
    }
}
