/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;
import java.util.*;
/**
 * Design an algorithm that will receive weight in kilogram and height in meters
 * Determine the weight status according to table below:
 * @author Marc Owen Rentap
 */
public class Tutorial2Question8 {
    public static void main(String[] args){
        // The scanner object for input
        Scanner in = new Scanner(System.in);
        
        double height, weight, bmi;
        String weightStatus;
        
        // Prompt for and get the height and weight
        System.out.println("Please enter the height");
        height = in.nextDouble();
        System.out.println("Please enter the weight");
        weight = in.nextDouble();
        
        // Calculate the BMI
        bmi = weight / (height * height);
        
        // Determine the weight status
        if (bmi < 18.5) {
            weightStatus = "Underweight";
        } else if (bmi < 25) {
            weightStatus = "Normal";
        } else if (bmi < 30) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }
        
        System.out.println("The weight status is " + weightStatus);
    }
}
