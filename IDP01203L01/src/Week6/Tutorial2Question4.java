/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;
import java.util.*;
/**
 * Design an algorithm that will receive the weight of a parcel and determine the
 * delivery charge for that parcel
 * @author Marc Owen Rentap
 */
public class Tutorial2Question4 {
    public static void main(String[] args){
        // The scanner object for input
        Scanner in = new Scanner(System.in);
        
        // Initialize the variables to be used
        double parcelWeight, deliveryCharge, chargeRate;
        
        // Prompt for and get the parcel weight
        System.out.println("Please enter the parcel weight");
        parcelWeight = in.nextDouble();
        
        // Determine the chargeRate
        if (parcelWeight < 2.5){
            chargeRate = 3.5;
        } else if (parcelWeight <= 5) {
            chargeRate = 2.85;
        } else {
            chargeRate = 2.45;
        }
        
        // Calculate the delivery rate
        deliveryCharge = chargeRate * parcelWeight;
        System.out.println("The delivery chargte is " + deliveryCharge);
    }
}
