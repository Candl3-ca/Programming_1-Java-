/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardid;

/**
 *
 * @author f-sam
 */
import java.util.Scanner;
public class CardID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaring Card Object, meaning multiple instances of this object can be declared
        Scanner cardObject = new Scanner(System.in); 

        System.out.println("Enter name"); //
        String name = cardObject.nextLine(); //
        System.out.println("Enter age"); //
        String age = cardObject.nextLine(); //
        System.out.println("Enter nationality"); //
        String nationality = cardObject.nextLine(); //
        System.out.println("Enter department"); //
        String department = cardObject.nextLine(); //
        System.out.println("Enter position"); //
        String position = cardObject.nextLine(); //



        System.out.printf("Name:        " + name + 
                        "%nAge:         " + age + 
                        "%nNationality: " + nationality +
                        "%nDepartment:  " + department +
                        "%nPosition:    " + position +
                "%n");
    }
    
}
