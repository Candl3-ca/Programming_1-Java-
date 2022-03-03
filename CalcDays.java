/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author f-sam
 */
    import java.util.Scanner;

    public class CalcDays {

        /**
         * @param args the command line arguments
         */
    //    IF ... ELSE structure
        public static void main(String[] args) {
            // TODO code application logic here

            Scanner input = new Scanner(System.in);

            System.out.println("Please input a year");
            int year = input.nextInt();

            System.out.println("Please input a month from 1-12");
            int month = input.nextInt();

            Switchcase(month, year);
            intCalcDays(month, year);
            
        }
    
        public static void Switchcase(int month, int year){
    switch(month) {
    case 1:
         System.out.printf("There are 31 days in the " + month + " month and the year " + year );
            break;
    case 3:
         System.out.printf("There are 31 days in the " + month + " month and the year " + year );
            break;
    case 5:
        System.out.printf("There are 31 days in the " + month + " month and the year " + year );
            break;
    case 7:
         System.out.printf("There are 31 days in the " + month + " month and the year " + year );
            break;
    case 8:
        System.out.printf("There are 31 days in the " + month + " month and the year " + year );
            break;
    case 10:
          System.out.printf("There are 31 days in the " + month + " month and the year " + year );
             break;
    case 12:
         System.out.printf("There are 31 days in the " + month + " month and the year " + year );
             break;
    case 4:
        System.out.println("There are 30 days in the " + month + " month and the year " + year);
            break;
    case 9:
        System.out.println("There are 30 days in the " + month + " month and the year " + year);
            break;
    case 6:
        System.out.println("There are 30 days in the " + month + " month and the year " + year);
             break;
    case 11:
         System.out.println("There are 30 days in the " + month + " month and the year " + year);
            break;
    case 2:
        if(isLeapYear(year) == true){
            System.out.println("There are 29 days in the " + month + " month and the year " + year);
        } else{
            System.out.println("There are 28 days in the " + month + " month and the year " + year);
        }
    break;
    }
            
   
    public static int intCalcDays(int month, int year) {
                
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.printf("There are 31 days in the " + month + " month and the year " + year);
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("There are 30 days in the " + month + " month and the year " + year);
            } else if (month == 2 || isLeapYear(year) == true) {
                System.out.println("There are 29 days in the " + month + " month and the year " + year);
            } else {
                System.out.println("There are 28 days in the " + month + " month and the year " + year);
            }
     return 0;
    }
    
    
            
       
    public static boolean isLeapYear(int year) {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else {
                return false;
            }
        }
    }
    