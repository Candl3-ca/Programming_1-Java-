/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author f-sam
 */
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Arrays;

public class lab {
    /** Main method */
  public static void main(String[] args) {
    // Check number of strings passed
    Scanner input = new Scanner(System.in);
      System.out.println("Enter the first number");
//      args[0] = input.next
      
    
    if (args.length != 3) {
      System.out.println(
        "Usage: java Calculator operand1 operator operand2");
      System.exit(1);
    }

    // The result of the operation
    int result = 0;

    // Determine the operator
    switch (args[1].charAt(0)) { 
      case '+': result = Integer.parseInt(args[0]) + 
                         Integer.parseInt(args[2]);
                break;
      case '-': result = Integer.parseInt(args[0]) -
                         Integer.parseInt(args[2]);
                break;
      case '.': result = Integer.parseInt(args[0]) *
                         Integer.parseInt(args[2]);
                break;
      case '/': result = Integer.parseInt(args[0]) /
                         Integer.parseInt(args[2]);
                break;
      case '%': result = Integer.parseInt(args[0]) %
                         Integer.parseInt(args[2]);
    }

    // Display result
    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
      + " = " + result);
  }
}
 
// int binarySearch(ArrayList<Integer> arr, int x)
//	{
//		int left = 0, right = arr.size() - 1;
//		
//		while (left <= right)
//		{
//			int mid = left + (right - left) / 2;
//	
//			// Check if x is present at mid
//			if (arr.get(mid) == x)
//				return mid;
//	
//			// If x greater, ignore left half
//			if (arr.get(mid) < x)
//				left = mid + 1;
//	
//			// If x is smaller, ignore right half
//			else
//				right = mid - 1;
//		}
//	
//		// if we reach here, then element was
//		// not present
//		return -1;
//	}
//	
//	// Driver method to test above
//	public static void main(String args[])
//	{
//		BinarySearch ob = new BinarySearch();
//		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		arr.add(5);
//		arr.add(10);
//		arr.add(15);
//		arr.add(20);
//		arr.add(25);
//		arr.add(30);
//		arr.add(35);
//		
//		int x = 10;
//		
//		// Printing elements of array list
//		System.out.println("The elements of the arraylist are: "+arr);
//		
//		int result = ob.binarySearch(arr, x);
//		
//		if (result == -1)
//			System.out.println("Element not present");
//		
//		else
//			System.out.println("The Element " + x + " is found at "
//							+ "index " + result);
//	}
//}




// new updated calc
      System.out.println("Choose an operator: +, -, *, /, or %");
//      char operator = input.next().charAt(0);
//      
//      System.out.println("Enter the first number: ");
//      int num1 = input.nextInt();
//      
//      System.out.println("Enter the second number: ");
//      int num2 = input.nextInt();
//      
// 
//
//    switch (operator) { 
//      case '+': 
//        int result = num1 + num2;
//                  System.out.println(num1 + " + " + num2 + " = " + result);
//                  break;
//      case '-': 
//        int result2 = num1 - num2;
//                  System.out.println(num1 + " - " + num2 + " = " + result2);
//                break;
//      case '*': 
//          int result3 = num1 * num2;
//                  System.out.println(num1 + " * " + num2 + " = " + result3);
//                break;
//      case '/': 
//         double result4 = num1 / num2;
//                  System.out.println(num1 + " / " + num2 + " = " + result4);
//                break;
//      case '%':
//          int result5 = num1 % num2;
//                  System.out.println(num1 + " % " + num2 + " = " + result5);
//                  break;
//      default:
//          System.out.println("Invalid operator");
//          break;
//    }
//
//  }
//}
