/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;
import java.util.*;
/**
 * Write a program to convert the temperature in Fahrenheit into Celsius.
 * @author Marc Owen Rentap
 */
public class Question1 {
    public static void main(String[] args){
        // The scanner class for input
        Scanner in = new Scanner(System.in);
        
        // Declare variables to be used
        double fahrenheit, celcius;
        
        // Prompt for and get the fahrenheit
        System.out.println("Please enter the temperature in Fahrenheit");
        fahrenheit = in.nextDouble();
        
        // Calculates the temperature in Celcius
        celcius = (5.0/9.0) * (fahrenheit - 32.0);
        
        // Display the celcius
        System.out.println("The temperature in Celsius is " + celcius);
    }
}
