/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pythagorean;

/**
 *
 * @author f-sam
 */

public class Pythagorean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int x1, x2, x3;

        for (x1 = 1; x1 <= 500; x1++) {
            for (x2 = x1; x2 <= 500; x2++) {
                for (x3 = x2; x3 <= 500; x3++) {
                    int a = x1, b = x2, c = x3;

                    if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }
}

