/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurant;

/**
 *
 * @f-sam
 */
public class Restaurant {

    public static void main(String[] args) {
        
        /* Creating a Beverage and a Dish */
        Beverage b = new Beverage("Cola", 30, 600);
        Dish d = new Dish("Hamburger", 'x', 15, false);
        
        /* Adding them to a new Combo and printing the infos */
        Combo c = new Combo(d, b);
        System.out.println("Infos of the new combo:\n" + c.toString());
        
        /* Creating a new Customer */
        Customer cus = new Customer("Daniel", 1, 90);
        
        /* Printing Customer infos before updating Vip Level */
        System.out.println("\nCustomer before updating:\n" + cus.toString());
        
        /* Updating Vip Level */
        cus.updateVip();
        
        /* Printing Customer infos after updating Vip Level */
        System.out.println("\nAfter updating:\n" + cus.toString());
        
        /* Creating a new Bill associated to the Customer and the Combo
        already created using the d*/
        Bill bill = new Bill(d, b, cus);
        
        /* Printing the infomrations of the Bill */
        System.out.println("\nBill infos:\n" + bill.toString());
        
        /* Updating Customer Points after his bill */
        bill.updatePoints();
        
        /* Printing Customer infos after updating Vip Level */
        System.out.println("\nAfter  a second update:\n" + cus.toString());
        
    }
    
}
