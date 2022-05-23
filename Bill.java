/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @f-sam
 */
public class Bill {
    
    /* Data Members */
    private Combo combo;
    private Customer customer;
    private double originalPrice;
    private double discountedPrice;
    private Tax tax;
    private double finalPrice;
    
    /* Default Constructor */
    public Bill() {
        
        /* Setting all data members (using default constructors of objects) */
        this.combo = new Combo();
        this.customer = new Customer();
        this.originalPrice = 0;
        this.discountedPrice = 0;
        this.tax = new Tax();
        this.finalPrice = 0;
        
    }
    
    /* Constructor with parameters */
    public Bill(Dish dish, Beverage beverage, Customer customer) {
        
        /* Setting all data members */
        this.combo = new Combo(dish, beverage);
        this.customer = customer;
        this.originalPrice = this.combo.calcComboPrice();
        this.discountedPrice = this.calcPriceWithDiscount();
        this.tax = this.calcTax();
        this.finalPrice = this.calcFinalPrice();
        
    }
    
    /* Copy constructor */
    public Bill(Bill b) {
        
        /* Copying all data members */
        this.combo = b.getCombo();
        this.customer = b.getCustomer();
        this.originalPrice = b.getOriginalPrice();
        this.discountedPrice = b.getDiscountedPrice();
        this.tax = b.getTax();
        this.finalPrice = b.getFinalPrice();
        
    }
    
    /* Method to calculate discount price accordint to vip level of customer */
    public double calcPriceWithDiscount() {
        
        double returningPrice;
        if (customer.getVipLevel() == 0 || customer == null) {
            returningPrice = this.originalPrice;
        }
        else if (customer.getVipLevel() == 1) {
            returningPrice = this.originalPrice * 0.95;
        }
        else if (customer.getVipLevel() == 2) {
            returningPrice = this.originalPrice * 0.9;
        }
        else if (customer.getVipLevel() == 3) {
            returningPrice = this.originalPrice * 0.85;
        }
        else {
            /* just in case */
            returningPrice = this.originalPrice;
        }
        
        return returningPrice;
    }
    
    /* Calculating the tax of the meal */
    public Tax calcTax() {
        double newFederal, newProvincial, newTotal;
        newFederal = this.discountedPrice * 0.05;
        newProvincial = this.discountedPrice * 0.1;
        newTotal = newFederal + newProvincial;
        
        return (new Tax(newFederal, newProvincial, newTotal));
    }
    
    /* Method to calculate the final price that is discountedPrice + totalTax */
    public double calcFinalPrice() {
        
        double fPrice = this.discountedPrice + this.tax.getTotal();
        
        return fPrice;
    }
    
    /* Method to update points of customer: 1 point each 10$ spent */
    public void updatePoints() {
        
        int pointsToBeAdded = (int) (this.finalPrice / 10);
        
        int previousPoints = this.customer.getPoint();
        
        this.customer.setPoint(previousPoints + pointsToBeAdded);
        
    }
    
    /* Equals: two bills are equals if all data members are equals */
    public boolean equals (Bill b) {
        
        return ( combo.equals(b.getCombo()) && customer.equals(b.getCustomer()) &&
                originalPrice == b.getOriginalPrice() && discountedPrice == b.getDiscountedPrice()
                && tax.equals(b.getTax()) && finalPrice == b.getFinalPrice() );
        
    }
    
    /* Getters */
    public Combo getCombo() {
        return this.combo;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    public double getOriginalPrice() {
        return this.originalPrice;
    }
    public double getDiscountedPrice() {
        return this.discountedPrice;
    }
    public Tax getTax() {
        return this.tax;
    }
    public double getFinalPrice() {
        return this.finalPrice;
    }
    
    /* Setters */
    public void setCombo(Combo c) {
        this.combo = new Combo(c);
    }
    public void setCustomer(Customer c) {
        this.customer = c;
    }
    public void setOriginalPrice(double p) {
        this.originalPrice = p;
    }
    public void setDiscountedPrice(double p) {
        this.discountedPrice = p;
    }
    public void setTax(Tax t) {
        this.tax = new Tax(t);
    }
    public void setFinalPrice(double p) {
        this.finalPrice = p;
    }
    
    /* Overriding toString() */
    @Override
    public String toString() {
        
        String s = this.combo.toString() + 
                "\n************************************" +
                "\nCustomer         : " + customer.getName() +
                "\nOriginal Price   : " + originalPrice +
                "\nDiscounted Price : " + discountedPrice +
                "\n" + tax.toString() +
                "\n------------------------------------" +
                "\nTotal Price      : " + finalPrice;
        
        return s;
        
    }
    
}
