
package task1and2;

/**
 *
 * @author f-sam
 */
public class Task1And2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Task 1 Ellipse Class
        //Printing using a random value using the Ellipse() constructor
        System.out.println("\n***************************************");
        System.out.println("************** Task 1 *****************");
        System.out.println("***************************************\n");

        //Printing using a random value using the Ellipse() constructor
        Ellipse e1 = new Ellipse();
        System.out.println("---------------------------------------");
        System.out.println("---------------Auto Run----------------");
        System.out.println("---------------------------------------");
        if (e1.isCircle() == true) {System.out.println("Is it a circle? Yes");}
        else {System.out.println("Is it a circle? No");}
        if (e1.isAxisValid() == true) {System.out.println("Is axis valid? Yes");}
        else {System.out.println("Is axis valid? No");}
        System.out.println(e1);


        //Printing using a value using the Ellipse(double double) constructor
        Ellipse e2 = new Ellipse(-10,10);
        System.out.println("---------------------------------------");
        System.out.println("-Setting Major and Minor Axis manually-");
        System.out.println("---------------------------------------");
        if (e2.isCircle() == true) {System.out.println("Is it a circle? Yes");}
        else {System.out.println("Is it a circle? No");}
        if (e2.isAxisValid() == true) {System.out.println("Is axis valid? Yes");}
        else {System.out.println("Is axis valid? No");}
        System.out.println(e2);


        //Printing using an object as a parameter
        Ellipse e3 = new Ellipse(e1);
        System.out.println("---------------------------------------");
        System.out.println("----Ellipse Object as a parameter------");
        System.out.println("---------------------------------------");
        if (e3.isCircle() == true) {System.out.println("Is it a circle? Yes");}
        else {System.out.println("Is it a circle? No");}
        if (e3.isAxisValid() == true) {System.out.println("Is axis valid? Yes");}
        else {System.out.println("Is axis valid? No");}
        System.out.println(e3);


        //Printing using an object as a parameter
        Ellipse e4 = new Ellipse();
        System.out.println("---------------------------------------");
        System.out.println("--Giving parameters by class fuctions--");
        System.out.println("---------------------------------------");
        if (e4.setMajorAxis(10) == true && e4.setMinorAxis(10) == true){
            if (e4.isCircle() == true) {System.out.println("Is it a circle? Yes");}
            else {System.out.println("Is it a circle? No");}
            if (e4.isAxisValid() == true) {System.out.println("Is axis valid? Yes");}
            else {System.out.println("Is axis valid? No");}
            System.out.println(e4);
        }

            
        System.out.println("\n***************************************");
        System.out.println("************** Task 2 *****************");
        System.out.println("***************************************\n");

        Calendar c1 = new Calendar();
        Calendar c2 = new Calendar(2025,1,30);
        Calendar c3 = new Calendar(c1);

        System.out.println("---------------------------------------");
        System.out.println("---Print with Values in Constructor----");
        System.out.println("---------------------------------------");
        System.out.println("Date: " + c1);
        System.out.println("Days in month: " + c1.getDaysInMonth());
        System.out.println("Is leap year: " + c1.isLeapYear());
        c1.increaseDays();
        c1.increaseMonth();
        c1.increaseYear();
        System.out.println("Date after the increase : " + c1);

        System.out.println("---------------------------------------");
        System.out.println("-----Print Calendar with date given----");
        System.out.println("---------------------------------------");
        System.out.println("Date: " + c2);
        System.out.println("Days in month: " + c2.getDaysInMonth());
        System.out.println("Is leap year: " + c2.isLeapYear());
        c2.increaseDays();
        c2.increaseMonth();
        c2.increaseYear();
        System.out.println("Date after the increase : " + c2);

        System.out.println("---------------------------------------");
        System.out.println("---Print Calendar with Object Given----");
        System.out.println("---------------------------------------");
        System.out.println("Date: " + c3);
        System.out.println("Days in month: " + c3.getDaysInMonth());
        System.out.println("Is leap year: " + c3.isLeapYear());
        c3.increaseDays();
        c3.increaseMonth();
        c3.increaseYear();
        System.out.println("Date after the increase : " + c3);
    }
}
