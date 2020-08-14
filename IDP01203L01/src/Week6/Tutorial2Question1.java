/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;
import java.util.*;
/**
 * Design an algorithm that will receive two integer items from a terminal
 * operator, and display to the screen their sum, difference, product and
 * quotient. Note that the quotient calculation (first integer divided by second
 * integer is only to be performed if the second integer does not equal zero.
 * 
 * @author Marc Owen Rentap
 */
public class Tutorial2Question1 {
    public static void main(String[] args) {
        // The scanner object for input
        Scanner in = new Scanner(System.in);
        
        // Declare the variables to be used       
        double integer1, integer2, sum, difference, product, quotient;
        
        // Prompt for and get integer1, integer2
        System.out.println("Please enter integer1");
        integer1 = in.nextDouble();
        System.out.println("Please enter integer2");
        integer2 = in.nextDouble();
        
        // Calculate the integer operations
        sum = integer1 + integer2;
        difference = integer1 - integer2;
        product = integer1 * integer2;
        
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The product is " + product);
        
        if (integer2 != 0) {
            quotient = integer1 / integer2;
            System.out.println("The quotient is " + quotient);
        }
        
    }
}
