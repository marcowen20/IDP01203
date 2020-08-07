/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;
import java.util.*;
/**
 * You require an algorithm that will receive an integer from the screen, add 7
 * to it, triple it, subtract 5 from it, and display the final number to the screen.
 * @author Marc Owen Rentap
 */
public class Question16 {
    public static void main(String[] args){
        // The scanner object for input
        Scanner in = new Scanner(System.in);
        
        // Declare the variable to be used
        int integer, finalNumber;
        
        // Prompt for and get the integer
        System.out.println("Please enter an integer: ");
        integer = in.nextInt();
        
        // Calculate and display the final number
        finalNumber = ((integer + 7) * 3) - 5;
        System.out.println("The final number is " + finalNumber);
    }
}
