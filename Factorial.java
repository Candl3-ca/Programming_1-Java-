/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

/**
 *
 * @author f-sam
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    static int factorial(int n) {
        long res = 1, i;
        for (i = 1; i <= n; i++) {
            res *= i;
            System.out.println("Factorial of " + i + " is " + res);
        }
        return 0;
    }

    // Driver method
    public static void main(String[] args) {
        factorial(20);
    }
}
