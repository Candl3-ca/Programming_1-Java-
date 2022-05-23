/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @f-sam
 */
public class Dish {
    
    /* Data Members */
    private String dishId;
    private String dishName;
    private char size; // can be 'x', 'l', 'm', 's'
    private double price;
    private boolean spicy;
    
    /* Static Data Member */
    private static int nextId = 1;
    
    /* Default Constructor */
    public Dish() {
        
        /* Setting all data members can be set */
        dishId = this.generateId();
        dishName = "";
        size = 's'; // SMALL BY DEFAULT (supposing)
        price = 0;
        spicy = false; // NOT SPICY BY DEFAULT (supposing)
        
    }
    
    /* Constructor with arguments */
    public Dish(String name, char size, double price, boolean spicy) {
        
        /* Setting all data members*/
        dishId = this.generateId();
        this.dishName = name;
        this.size = size;
        this.price = price;
        this.spicy = spicy;
        
    }
    
    /* Copy Constructor */
    public Dish(Dish d) {
        
        /* Copying all data members */
        this.dishId = d.getDishId();
        this.dishName = d.getDishName();
        this.size = d.getSize();
        this.price = d.getPrice();
        this.spicy = d.getSpicy();
        
    }
    
    /* Method to generate ID */
    protected final String generateId() {
        
        /* Generating the next ID for the beverage */
        String s = "D";
        if (nextId < 10) {
            s = s + "00" + nextId;
        }
        else if (nextId < 100) {
            s = s + "0" + nextId;
        }
        else {
            s = s + nextId;
        }
        
        /* Incresing nextId before ending */
        nextId++;
        /* If 4 digit number is reached, restart from 1 */
        if (nextId == 1000)
            nextId = 1;
        
        return s;
        
    }
    
    /* Method to calcultate the price of the dish */
    public double calcDishPrice() {
        
        /* If the size is 'l' the finalPrice is the current price */
        double finalPrice = this.price;
        if (this.size == 'x') {
            finalPrice = this.price * 1.2;
        }
        else if (this.size == 'm') {
            finalPrice = this.price * 0.6;
        }
        else if (this.size == 's') {
            finalPrice = this.price * 0.4;
        }
        
        return finalPrice;
        
    }
    
    /* Equals: two dishes are equals if every data member is equal */
    public boolean equals (Dish d) {
        
        boolean equals = false;
        if (this.dishId.equals(d.getDishId()) && this.dishName.equals(d.getDishName()) 
            && this.size == d.getSize() && this.price == d.getPrice() && this.spicy == d.getSpicy()) {
            
            equals = true;
        }
        
        return equals;
    }
    
    /* Getters */
    public String getDishId() {
        return this.dishId;
    }
    public String getDishName() {
        return this.dishName;
    }
    public char getSize() {
        return this.size;
    }
    public double getPrice() {
        return this.price;
    }
    public boolean getSpicy() {
        return this.spicy;
    }
    
    /* Setters */
    public void setDishId(String id) {
        this.dishId = id;
    }
    public void setDishName(String name) {
        this.dishName = name;
    }
    public void setSize(char size) {
        this.size = size;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setSpicy (boolean spicy) {
        this.spicy = spicy;
    }
    
    /* Overriding toString() */
    @Override
    public String toString() {
        
        String s = "Dish ID          : " + this.dishId +
                 "\nDish Name        : " + this.dishName +
                 "\nDish Sizen       : " + this.size +
                 "\nDish Price       : " + this.price +
                 "\nSpicy            : ";
        
        /* Adding the last word according to "spicy" boolean value */
        if (this.spicy == true) {
            s = s + "Spicy";
        }
        else {
            s = s + "Not Spicy";
        }
        
        return s;
    }
    
}
