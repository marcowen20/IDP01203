/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;
import java.util.*;
/**
 * Design an algorithm that will prompt an operator for a student’s serial number
 * and the student’s exam score out of 100. Your program is then to match the
 * exam score to a letter grade and print the grade to the screen
 * 
 * @author  Marc Owen Rentap
 */
public class Tutorial2Tutorial3 {
    public static void main(String[] args) {
        // The scanner object for input
        Scanner in = new Scanner(System.in);

        // Declare the variables to be used
        double serialNumber, examScore;
        String grade;
        
        // Prompt for and get serialNumber and examScore
        System.out.println("Please enter the serial number");
        serialNumber = in.nextDouble();
        System.out.println("Please enter the exam score");
        examScore = in.nextDouble();
        
        if (examScore >= 90) {
            grade = "A";
        } else if (examScore >= 80) {
            grade = "B";
        } else if (examScore >= 70) {
            grade = "C";
        } else if (examScore >= 60) {
            grade =  "D";
        } else {
            grade = "E";
        }
        
        System.out.println("The grade is " + grade);
        
    }
}
