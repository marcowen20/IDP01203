/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;
import java.util.*;
/**
 * Design an algorithm that will read two numbers and an integer code from the
 * screen. The value of the integer code should be 1, 2, 3 or 4.
 * If the value of the code is 1, compute the sum of the two numbers.
 * If the code is 2, compute the difference (first minus second).
 * If the code is 3, compute the product of the two numbers.
 * If the code is 4, and the second number is not zero, compute the quotient
 * (first divided by second).
 * If the code is not equal to 1, 2, 3 or 4, display an error message.
 * The program is then to display the two numbers, the integer code and the
 * computed result to the screen.

 * @author Marc Owen Rentap
 */
public class Tutorial2Question2 {
    public static void main(String[] args){ 
        // The scanner object for input
        Scanner in = new Scanner(System.in);

        // Initialize the variables to be used
        String message = "";
        double integer1,integer2, result;
        int intCode;
        
        // Prompt for and get the integer1, integer2 and intCode
        System.out.println("Please enter integer1");
        integer1 = in.nextDouble();
        System.out.println("Please enter integer2");
        integer2 = in.nextDouble();
        System.out.println("Please enter the integer code");
        intCode = in.nextInt();
        
        // Calculate the integer operations
        switch(intCode){
            case 0:
                result = integer1 + integer2;
                break;
            case 1:
                result = integer1 - integer2;
                break;
            case 3:
                result = integer1  * integer2;
                break;
            case 4:
                if (integer2 != 0) {
                    result = integer1 / integer2;
                } else {
                    result = 0;
                    message = "Cannot divide by 0";
                }
                break;
            default:
                result = 0;
                message = "invalid integer code";
        }
        
        if ("".equals(message)){
            System.out.println("The value of integer1 is " + integer1);
            System.out.println("The value of integer2 is " + integer2);
            System.out.println("The value of intCode is " + intCode);
            System.out.println("The value of result is " + result);
        } else {
            System.out.println("The value of integer1 is " + integer1);
            System.out.println("The value of integer2 is " + integer2);
            System.out.println("The value of intCode is " + intCode);
            System.out.println(message);
        }
    }
    
}
