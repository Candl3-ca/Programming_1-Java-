/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @f-sam
 */
public class Tax {
    
    /* Data Members */
    private double fedTax;
    private double proTax;
    private double totalTax;
    
    /* Default Constructor */
    public Tax() {
        
        /* Setting all data members */
        this.fedTax = 0;
        this.proTax = 0;
        this.totalTax = 0;
        
    }
    
    /* Constructor with parameters */
    public Tax(double fed, double pro, double total) {
        
        /* Setting all data members */
        this.fedTax = fed;
        this.proTax = pro;
        this.totalTax = total;
        
    }
    
    /* Copy Constructor */
    public Tax(Tax t) {
        
        /* Copying all data members */
        this.fedTax = t.getFed();
        this.proTax = t.getPro();
        this.totalTax = t.getTotal();
        
    }
    
    /* Equals */
    public boolean equals(Tax t) {
        
        boolean equals = false;
        if (this.fedTax == t.getFed() && this.proTax == t.getPro() && this.totalTax == t.getTotal()) {
            equals = true;
        }
        
        return equals;
        
    }
    
    /* Getters */
    public double getFed() {
        return this.fedTax;
    }
    public double getPro() {
        return this.proTax;
    }
    public double getTotal() {
        return this.totalTax;
    }
    
    /* Setters */
    public void setFed(double tax) {
        this.fedTax = tax;
    }
    public void setPro(double tax) {
        this.proTax = tax;
    }
    public void setTotal(double tax) {
        this.totalTax = tax;
    }
    
    /* Overriding toString() */
    @Override
    public String toString() {
        
        String s = "Fed Tax          : " + this.fedTax +
                 "\nPro Tax          : " + this.proTax +
                 "\nTotal Tax        : " + this.totalTax;
        
        return s;
        
    }
    
}
