/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanamortizer;

/**
 *
 * @author
 */
public class Loan {
    
    /* Attributes */
    private double loanAmount;
    private double annualInterest;
    private int loanTerm;
    
    /* Constructor with arguments */
    public Loan(double amount, double annualInterest, int months) {
        
        /* Setting all the attributes */
        this.loanAmount = amount;
        this.annualInterest = annualInterest;
        this.loanTerm = months;
        
    }
    
    /* Setters (mutators) */
    public void setLoanAmount(double lam) throws IllegalArgumentException {
        
        /* If lam < 0, throwing an exception */
        if (lam < 0) {
            IllegalArgumentException e = new IllegalArgumentException("Loan.setLoanAmount : the loan amount must be non-negative");
            throw e;
        }
        
        /* Otherwise, setting the loan amount */
        this.loanAmount = lam;
        
    }
    public void setAnnualInterestRate(double air) {
        
        /* If air < 0, throwing an exception */
        if (air < 0) {
            IllegalArgumentException e = new IllegalArgumentException("Loan.setAnnualInterestRate : the annual interest rate must be non-negative");
            throw e;
        }
        
        /* Otherwise, setting the annual interest */
        this.annualInterest = air;
        
    }
    public void setLoanMonths(int months) {
        
        /* If months < 0, throwing an exception */
        if (months < 0) {
            IllegalArgumentException e = new IllegalArgumentException("Loan.setLoanMonths : the months in loan must be non-negative");
            throw e;
        }
        
        /* Otherwise, setting the attribute */
        this.loanTerm = months;
        
    }
    
    /* Getters (accessors) */
    public double getLoanAmount() {
        return this.loanAmount;
    }
    public double getAnnualInterestsRate() {
        return this.annualInterest;
    }
    public int getLoanMonths() {
        return this.loanTerm;
    }
    
    /* Facilitator Methods */
    public double getMonthlyInterestsRate() {
        return (this.getAnnualInterestsRate() / 1200 );
    }
    public double getMonthlyPayment() {
        /* Using the formula on page 1 */
        double monthlyPayment = ( this.getMonthlyInterestsRate() * this.getLoanAmount() ) / ( 1 - Math.pow( 1 + this.getMonthlyInterestsRate(), - this.getLoanMonths() ) ) ;
        return monthlyPayment;
    }
    public double getLoanCost() {
        /* What I've really spent - the loan amount */
        return (this.getMonthlyPayment() * this.getLoanMonths() - this.getLoanAmount() );
    }
    
    /* Overriding toString() method */
    @Override
    public String toString() {
        
        String s = "----------------------------------" +
                 "\n           Loan Report" +
                 "\n----------------------------------" +
                 "\n          Loan Amount:  $" + this.getLoanAmount() +
                 "\n Annual Interest Rate:  " + this.getAnnualInterestsRate() + "%" +
                 "\nLoan's term in months:  " + this.getLoanMonths() +
                 "\n      Monthly payment:  $" + Math.round(this.getMonthlyPayment() * 100.00) / 100.00 +
                 "\n  Total Interest Paid:  $" + Math.round(this.getLoanCost() * 100.00) / 100.00 + 
                 "\n----------------------------------";
        
        return s;
        
    }
    
    /* Method that returns a string representing this loan's amortization schedule */
    public String amoritze() {
        
        String s = "-----------------------------------------" +
                 "\n          Amortization Schedule" +
                 "\n             Monthly Payment" +
                 "\n                 $" + (Math.round(this.getMonthlyPayment()* 100.00) / 100.00) +
                 "\n-----------------------------------------" +
                 "\nMonth    Interest   Principal      Loan" +
                 "\n         Paid       Paid        Balance" +
                 "\n-----    --------   ---------   ---------" +
                 "\n                                ";
        
        /* Adding the loan amount */
        s = s + this.getLoanAmount() + "\n";
        
        /* For every month, printing a line */
        double previousBalance = this.getLoanAmount();
        double monthlyRate = this.getMonthlyInterestsRate();
        double payment = this.getMonthlyPayment();
        for (int i = 1; i <= this.getLoanMonths(); i++) {
            
            /* Adding the number of the month */
            String month = "" + i;
            
            double interest = Math.round(previousBalance * monthlyRate * 100.00) / 100.00;
            /* Just converting double to String */
            String interestS = "" + interest;
            
            month = month + this.spaces(9 - month.length()) + interestS;
            
            double principal = Math.round((payment - interest) * 100.00) / 100.00;
            /* Just converting double to String */
            String principalS = "" + principal;
            
            month = month + this.spaces(20 - month.length()) + principalS;
            
            double loanBalance = Math.round((previousBalance - principal) * 100.00) / 100.00 ;
            previousBalance = loanBalance;
            /* Just converting double to String */
            String loanBalanceS = "" + loanBalance;
            
            month = month + this.spaces(32 - month.length()) + loanBalanceS + "\n";
            
            s = s + month;
            
        }
        
        /* Adding last lines */
        s = s + "-----------------------------------------\n";
        
        String d = "Totals   " + Math.round(this.getLoanCost() * 100.00) / 100.00 ;
        String totalLoanS = "" + Math.round(this.getLoanAmount() * 100.00) / 100.00;
        d = d + this.spaces(20 - d.length()) + totalLoanS;
        
        s = s + d;
        
        return s;
        
    }
    
    /* Funciton to generate spaces, useful in amoritze() method */
    private String spaces(int num) {
        
        String s = "";
        for (int i = 0; i < num ; i++) {
            s = s + " ";
        }
        
        return s;
    }
}
