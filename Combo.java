/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @f-sam
 */
public class Combo {
    
    /* Data Members */
    private Dish dish;
    private Beverage beverage;
    
    /* Default Constructor */
    public Combo() {
        
        /* Calling default constructors of dish and beverage */
        dish = new Dish();
        beverage = new Beverage();
        
    }
    
    /* Constructor with Dish and Beverage as argument */
    public Combo (Dish d, Beverage b) {
        
        /* Using the copy constructor */
        dish = new Dish(d);
        beverage = new Beverage(b);
        
    }
    
    /* Copy Constructor */
    public Combo (Combo c) {
        
        /* Copying all data members */
        dish = c.getDish();
        beverage = c.getBeverage();
        
    }
    
    /* Method to calculate combo price: the price of the dish and 
    beverage should be multiplied by 0.9 */
    public double calcComboPrice() {
        
        double finalPrice = (dish.getPrice() * 0.9) + (beverage.getPrice() * 0.9);
        
        return finalPrice;
        
    }
    
    /* Equals: combo is equal to another if both dish and beverage are the same */
    public boolean equals(Combo c) {
        
        return (dish.equals(c.getDish()) && beverage.equals(c.getBeverage()) );
        
    }
    
    /* Getters */
    public Dish getDish() {
        return this.dish;
    }
    public Beverage getBeverage() {
        return this.beverage;
    }
    
    /* Setters */
    public void setDish(Dish d) {
        dish = new Dish(d);
    }
    public void setBeverage(Beverage b) {
        beverage = new Beverage(b);
    }
    
    /* Overriding toString() */
    @Override
    public String toString() {
        
        /* Using toString methods of Dish and Beverage classes */
        /* Also using "indent()" method to move text to the right */
        String s = "Dish:\n" + dish.toString().indent(8) + "\nBeverage:\n" + beverage.toString().indent(8);
        
        return s;
        
    }
    
}
