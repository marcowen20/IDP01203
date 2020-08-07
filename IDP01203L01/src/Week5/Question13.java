/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;
import java.util.*;
/**
 * Construct an algorithm that will prompt an operator to input three characters,
 * receive those three characters, and display a welcoming message to the screen
 * such as ‘Hello xxx! We hope you have a nice day.’
 * @author Marc Owen Rentap
 */
public class Question13 {
    public static void main(String[] args){
        // The scanner class for input
        Scanner in = new Scanner(System.in);
        
        // Declare the variables to be used
        String char1, char2, char3;
        
        // Prompt for and get char1, char2 and char3
        System.out.println("Please enter char1: ");
        char1 = in.next();
        System.out.println("Please enter char2: ");
        char2 = in.next();
        System.out.println("Please enter char3: ");
        char3 = in.next();
        
        // Display the greeting message
        System.out.println("Hello " + char1 + char2 + char3 + "! We hope you have a nice day.");
    }
}
