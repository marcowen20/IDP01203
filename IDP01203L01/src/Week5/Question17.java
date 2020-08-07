/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;
import java.util.*;
/**
 * You require an algorithm that will read in the values from an employee’s timesheet,
 * and calculate and print the weekly pay for that employee. The values read in
 * are the total number of regular hours worked, the total overtime hours and the
 * hourly wage rate. Weekly pay is calculated as payment for regular hours worked,
 * plus payment for overtime hours worked. Payment for regular hours is calculated
 * as (wage rate times regular hours worked); payment for overtime hours worked
 * is calculated as (wage rate times overtime hours worked times 1.5).
 * @author Marc Owen Rentap
 */
public class Question17 {
    public static void main(String[] args){
        // The scanner object for input
        Scanner in = new Scanner(System.in);
        
        // Declare the variables to be used
        double regularHours, overtimeHours, hourlyRate, regularPay, overtimePay, weeklyPay;
        
        // Prompt for and get the regular and overtime hours, as well as the hourly rate
        System.out.println("Please enter the regular hours worked: ");
        regularHours = in.nextDouble();
        System.out.println("Please enter the overtime hours worked: ");
        overtimeHours = in.nextDouble();
        System.out.println("Please enter the hourly wage rate: ");
        hourlyRate = in.nextDouble();
        
        // Calculate the regular pay, overtime pay and weekly pay
        regularPay = regularHours * hourlyRate;
        overtimePay = overtimeHours * hourlyRate * 1.5;
        weeklyPay = regularPay + overtimePay;
        
        // Display the weekly pay
        System.out.println("The weekly pay is " + weeklyPay);
    }
}
