/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;
import java.util.*;
/**
 * An architect’s fee is calculated as a percentage of the cost of a building. The fee is made up as follows:
 * 8% of the first $5,000.00 of the cost of a building and 
 * 3% on the remainder if the remainder is less than or equal to 
 * 2.5% of the remainder if the remainder is more than $80,000.00.
 *
 * @author Marc Owen Rentap
 */
public class Tutorial2Question6 {
    public static void main(String[] args){
        double buildingCost, first5k, additionalCost, remainder, architectFee;
        
        // The scanner object for input
        Scanner in = new Scanner(System.in);
        
        // Prompt for and get the building cost
        System.out.println("Please enter the building cost");
        buildingCost = in.nextDouble();
        
        // Calculate the first 5k
        if (buildingCost < 5000) {
            first5k = 0.08 * buildingCost;
        } else {
            first5k = 0.08 * 5000;
        }
        
        // Calculate the remaining buliding cost
        remainder = buildingCost - first5k;
        
        // Calculate the additional cost
        if (remainder <= 80000) {
            additionalCost = 0.03 * remainder;
        } else {
            additionalCost = 0.025 * remainder;
        }
        
        // Calculate the architect fee
        architectFee = first5k + additionalCost;
        System.out.println("The architect fee is " + architectFee);
    }
}
