/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;
import java.util.*;
/**
 *You require an algorithm that will read in a tax rate (as a percentage) and the
 * prices of five items. The program is to calculate the total price of the items
 * before tax and then the tax payable on those items. The tax payable is calculated
 * by applying the tax rate percentage to the total price. Print the total price
 * and the tax payable as output.
 * @author Marc Owen Rentap
 */
public class Question14 {
    public static void main(String[] args){
        // The scanner object for input
        Scanner in = new Scanner(System.in);
        
        // Declare the variables to be used
        double taxRate, price1, price2, price3, price4, price5, totalPrice, taxPayable;
        
        // Prompt for and get the tax rate and the five prices
        System.out.println("Please enter the tax rate: ");
        taxRate = in.nextDouble();
        System.out.println("Please enter the price of the first item: ");
        price1 = in.nextDouble();
        System.out.println("Please enter the price of the second item: ");
        price2 = in.nextDouble();
        System.out.println("Please enter the price of the third item: ");
        price3 = in.nextDouble();
        System.out.println("Please enter the price of the fourth item: ");
        price4 = in.nextDouble();
        System.out.println("Please enter the price of the fifth item: ");
        price5 = in.nextDouble();
        
        // Calculate the total price and the tax payable
        totalPrice = price1 + price2 + price3 + price4 + price5;
        taxPayable = totalPrice * (taxRate / 100);
        
        // Display the total price and the tax payable
        System.out.println("The total price is " + totalPrice);
        System.out.println("The tax payable is " + taxPayable);
    }
}
