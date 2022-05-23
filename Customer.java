/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @f-sam
 */
public class Customer {
    
    /* Data Members */
    private String customerId;
    private String name;
    private int vipLevel; // can be 0,1,2,3
    private int point;
    
    /* Static Data Member */
    private static int nextId = 1;
    
    /* Default Constructor */
    public Customer() {
        
        /* Setting all data members */
        this.customerId = generateId();
        this.name = "";
        this.vipLevel = 0;
        this.point = 0;
        
    }
    
    /* Constructor with arguments */
    public Customer(String name, int lvl, int point) {
        
        /* Setting all data members */
        this.customerId = generateId();
        this.name = name;
        this.vipLevel = lvl;
        this.point = point;
        
    }
    
    /* Copy Constructor */
    public Customer(Customer c) {
        
        /* Copying all data members */
        this.customerId = c.getCustomerId();
        this.name = c.getName();
        this.vipLevel = c.getVipLevel();
        this.point = c.getPoint();
        
    }
    
    /* Method to generate ID */
    protected final String generateId() {
        
        /* Generating the next ID for the beverage */
        String s = "C";
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
    
    /* Method to update Vip Level of customer using his points 
    ATTENTION: this method updates levels ONE BY ONE (1->2 , 2->3 are ok
    while 1->3 , 0->2 if there are sufficient points are not possibile with this method */
    public boolean updateVip() {
        
        boolean good = false; // true if updated, false otherwise
        if (this.vipLevel == 0) {
            if (this.point >= 50) {
                this.point -= 50;
                this.vipLevel = 1;
                good = true;
            }
        }
        else if (this.vipLevel == 1) {
            if (this.point >= 80) {
                this.point -= 80;
                this.vipLevel = 2;
                good = true;
            }
        }
        else if (this.vipLevel == 2) {
            if (this.point >= 100) {
                this.point -= 100;
                this.vipLevel = 3;
                good = true;
            }
        }
        
        /* In every other case, no updates are available */
        
        return good;
        
    }
    
    /* Equals */
    public boolean equals (Customer c) {
        
        boolean equals = false;
        if (this.customerId.equals(c.getCustomerId()) && this.name.equals(c.getName())
            && this.vipLevel == c.getVipLevel() && this.point == c.getPoint()) {
            
            equals = true;
        }
        
        return equals;
    }
    
    /* Getters */
    public String getCustomerId() {
        return this.customerId;
    }
    public String getName() {
        return this.name;
    }
    public int getVipLevel() {
        return this.vipLevel;
    }
    public int getPoint() {
        return this.point;
    }
    
    /* Setters */
    public void setCustomerId(String id) {
        this.customerId = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVipLevel(int lvl) {
        this.vipLevel = lvl;
    }
    public void setPoint(int point) {
        this.point = point;
    }
    
    /* Overriding toString() */
    @Override
    public String toString() {
        
        String s = "Customer ID      : " + this.customerId +
                 "\nName             : " + this.name +
                 "\nVip Level        : " + this.vipLevel +
                 "\nPoints           : " + this.point;
        
        return s;
        
    }
    
}
