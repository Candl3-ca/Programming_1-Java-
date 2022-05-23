/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @f-sam
 */
public class Beverage {
    
    /* Data Members */
    private String beverageId;
    private String beverageName;
    private double price;
    private int volume; // mL
    
    /* Static Data Member */
    private static int nextId = 1;
    
    /* Default constructor */
    public Beverage() {
        
        /* Setting all data members */
        beverageId = generateId();
        beverageName = "";
        price = 0;
        volume = 0;
        
    }
    
    /* Constructor with parameters */
    public Beverage(String beverageName, double price, int volume) {
        
        /* Setting all data members */
        beverageId = generateId();
        this.beverageName = beverageName;
        this.price = price;
        this.volume = volume;
        
    }
    
    /* Copy Constructor */
    public Beverage(Beverage b) {
        
        /* Copying all data members */
        this.beverageId = b.getBeverageId();
        this.beverageName = b.getBeverageName();
        this.price = b.getPrice();
        this.volume = b.getVolume();
        
    }
    
    /* Method to generate ID */
    protected final String generateId() {
        
        /* Generating the next ID for the beverage */
        String s = "B";
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
    
    /* Method to calculate the price of the beverage
    multiply *0.6 if the volume is less or equal than 500ml */
    public double calcPrice() {
        
        double finalPrice = this.price;
        if (this.volume <= 500) {
            finalPrice = this.price * 0.6;
        }
        
        return finalPrice;
        
    }
    
    /* Equals: two beverage are equals if all data members are equals */
    public boolean equals(Beverage b) {
        
        boolean equals = false;
        if (this.beverageId.equals(b.getBeverageId()) && this.beverageName.equals(b.getBeverageName())
            && this.price == b.getPrice() && this.volume == b.getVolume()) {
            
            equals = true;
        }
        
        return equals;
        
    }
    
    /* Getters */
    public String getBeverageId() {
        return this.beverageId;
    }
    public String getBeverageName() {
        return this.beverageName;
    }
    public double getPrice() {
        return this.price;
    }
    public int getVolume() {
        return this.volume;
    }
    
    /* Setters */
    public void setBeverageId(String id) {
        this.beverageId = id;
    }
    public void setBeverageName(String name) {
        this.beverageName = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setVolume(int vol) {
        this.volume = vol;
    }
    
    /* Overriding toString() */
    @Override
    public String toString() {
        
        String s = "Beverage ID      : " + this.beverageId +
                 "\nBeverage Name    : " + this.beverageName +
                 "\nBeverage Price   : " + this.price +
                 "\nBeverage         : " + this.volume;
        return s;
        
    }
    
}
