/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author f-sam
 */
import java.util.Scanner;
public class PriceCalucator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner pepega = new Scanner(System.in);
         
//      prompts the user to input a price then a discount ratio

        System.out.println("Please enter the item price:");
        double price = pepega.nextDouble();
        
        System.out.println("Please enter the discount ratio in %:");
        double discount_ratio = pepega.nextDouble();
        
//      Math equations go here
        
        double discounted_price = (price - (price * (discount_ratio / 100)));
        
        double federal_tax = discounted_price * 0.05;
        double provincial_tax = discounted_price * 0.09975;
        
        double all_in_all = discounted_price + federal_tax + provincial_tax;
        
//     prints an output with the result
        
        System.out.printf("Original Price :" + price +
                        "%nDiscount ratio :" + discount_ratio + "%%" +
                        "%nPrice Before Tax :" + discounted_price +
                        "%n-----------------------------------------" +
                        "%nFederal Tax :" + federal_tax +
                        "%nProvincial Tax :" + provincial_tax +
                        "%nFinal Price :" + all_in_all +
                        "%n");
    }
}