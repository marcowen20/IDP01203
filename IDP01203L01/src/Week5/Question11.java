/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;
import java.util.*;
/**
 * A program is required to prompt the terminal operator for the maximum and
 * minimum temperature readings on a particular day, accept those readings as integers,
 * and calculate and display to the screen the average temperature, calculated by
 * (maximum temperature + minimum temperature) / 2
 * @author Marc Owen Rentap
 */
public class Question11 {
    public static void main(String[] args){
        // The scanner class for input
        Scanner in = new Scanner(System.in);
        
        // Declases the variables to be used
        double maxTemp, minTemp, avgTemp;
        
        // Prompt for and get the max temperature and minimum temperature
        System.out.println("Please enter the max temperature");
        maxTemp = in.nextDouble();
        System.out.println("Please enter the minimum temperature");
        minTemp = in.nextDouble();
        
        // Calculates the average temperature
        avgTemp = (maxTemp + minTemp) / 2;
        
        // Displays the average temperature
        System.out.println("The average temperature is " + avgTemp);
    }
}
