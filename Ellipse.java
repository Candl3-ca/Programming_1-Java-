package task1and2;

    public class Ellipse {
        
        //Variables that live inside the class
        private double majorAxis;
        private double minorAxis;
        
    public Ellipse() {
        //Constructor to give value to the private variables at random
        this.majorAxis = (double) ((Math.random() * (10 - 5)) + 5);
        this.minorAxis = (double) ((Math.random() * (10 - 5)) + 5);
       
    }

    public Ellipse(double majorAxisParam ,double minorAxisParam) {
        //Constructor to set values manually
        this.minorAxis = minorAxisParam;
        this.majorAxis = majorAxisParam;
    }
    
    public Ellipse(Ellipse anotherEllipse) {
        //constructor to set the values using another object of the same class
        this.majorAxis = anotherEllipse.majorAxis;
        this.minorAxis = anotherEllipse.minorAxis;
    }
    
    public double calcArea() {
        //Function to calculate the Area
        double area = majorAxis * minorAxis * Math.PI;
        return area;
    }
    
    public double calcPerimeter() {
        //Function to calculate the Perimeter
        double majorAxisSquare = majorAxis * majorAxis;
        double minorAxisSquare = minorAxis * minorAxis;
        double sumOfSquareAxis = (minorAxisSquare + majorAxisSquare) / 2; // sum and divided by 2
        double perimeter = (Math.sqrt(sumOfSquareAxis)) * (Math.PI * 2);
        return perimeter;
    }
    
    public boolean isCircle() {
        //Function to check it it's a circle or not
        if (minorAxis == majorAxis) {
            return true;
        }
        else 
            return false;
    }
    
    public boolean isAxisValid() {
        //Function to validate the Major and minor axis given
        if (majorAxis <= 0 || minorAxis <= 0) {
        return false;
    }
        else
            return true;
    }
    
    @Override
    public String toString() {
        //toString() function to be used by default in the object to print in the console
        String str = String.format("%-10s:%.2f\n","Major Axis",majorAxis);
        str += String.format("%-10s:%.2f\n","Minor Axis",minorAxis);
        str += String.format("%-10s:%.2f\n","Area",this.calcArea());
        str += String.format("%-10s:%.2f\n","Perimeter",this.calcPerimeter());
        str += String.format("%-10s",this.isCircle() ? ("This ellipse is a circle") : ("This ellipse is not a circle"));
        return str;  
    }
    
    public boolean equals(Ellipse anotherEllipse) {
        //function to compare 2 objects
        //will return true if the minor and major axis are the same on the 2 given Ellipse objects
        return minorAxis == anotherEllipse.minorAxis && majorAxis == anotherEllipse.majorAxis;
    }
    
    public double getMinorAxis() {
        //funtion to call the value of the minorAxis of the object
        return minorAxis;
    }
    
    public double getMajorAxis() {
        //funtion to call the value of the majorAxis of the object
        return majorAxis;
    }
    
    public boolean setMajorAxis(double majorAxis) {
        //function to set major axis
        
        double copyMajorAxis = this.majorAxis;
        this.majorAxis = majorAxis;
        
        if (isAxisValid() == true) {
            return true;
        }
        else {
            this.majorAxis = copyMajorAxis;
            System.out.println("The new value must be a positive value");
            return false;
        }
        
    }
    
    public boolean setMinorAxis(double minorAxis) {
        //function to set minor axis
        double copyMinorAxis = this.minorAxis;
        this.minorAxis = minorAxis;
        
        if (isAxisValid() == true) {
            return true;
        }
        else {
            this.minorAxis = copyMinorAxis;
            System.out.println("The new value must be a positive value");
            return false;
        }
    }
    
}   