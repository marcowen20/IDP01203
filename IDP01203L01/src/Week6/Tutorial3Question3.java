/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;
import java.util.*;
/**
 * Design an algorithm that will prompt for, receive and total a collection of
 * payroll amounts entered at the terminal until a sentinel amount of 999 is
 * entered. After the sentinel has been entered, display the total payroll
 * amount to the screen.
 * 
 * @author Marc Owen Rentap
 */
public class Tutorial3Question3 {
    public static void main(String[] args) {
        // The scanner object for input
        Scanner in = new Scanner(System.in);
        // Declare the variables to be used
        double totalPayroll, payrollAmount;
        int stop = 0;
        totalPayroll = 0;
        
        while (stop == 0){
            // Prompt for and get payroll amount
            System.out.println("Please enter the payroll amount");
            payrollAmount = in.nextDouble();
            
            if (payrollAmount == 999) {
                stop = 1;
            } else {
                totalPayroll += payrollAmount;
            }
        }
        System.out.println("The total payroll amount is " + totalPayroll);
    } 
}
