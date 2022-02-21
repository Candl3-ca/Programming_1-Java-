/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author f-sam
 */
import java.util.Scanner;
public class BMI_calculator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the body mass index (BMI) calculator");
        
//      prompts the user to input their height and weight
        
        System.out.println("Enter your height in meters:");
        double height = scanner.nextDouble();
        
        System.out.println("Enter your weight in kilograms:");
        double weight = scanner.nextDouble();
        
//      Math equations here
        
        float BMI = (float) ((weight)/(height * height));
        double d = BMI;
                
//      Printing an  output and a result here
        

        System.out.printf("Your BMI is: %.2f", d);
        System.out.println("");
                
        System.out.printf("BMI values" +
                        "%nUnderweight: Less than 18.5" +
                        "%nNormal:      between 18.5 and 24.9" +
                        "%nOverweight:  between 25 and 29.9" + 
                        "%nObese:       30 or greater" +
        "%n");
    }
}