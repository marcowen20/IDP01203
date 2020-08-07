/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;
import java.util.*;
/**
 * Analyze the following calculation of  the total coursework (50%)of a student
 * in PoP class. The user will input all the assessment marks and the system will
 * calculate and display the coursework and total mark. 
 * @author Marc Owen Rentap
 */
public class Question18 {
    public static void main(String[] args){
        // The scanner object for input
        Scanner in = new Scanner(System.in);
        
        // Declare the variables to be used
        double testMark, quizMark, assignmentMark, projectMark, examMark;
        double testPercentage, quizPercentage, assignmentPercentage, projectPercentage, examPercentage, totalCoursework, totalMark;
        
        // Prompt for and get the marks
        System.out.println("Please enter the test mark: ");
        testMark = in.nextDouble();
        System.out.println("Please enter the quiz mark: ");
        quizMark = in.nextDouble();
        System.out.println("Please enter the assignment mark: ");
        assignmentMark = in.nextDouble();
        System.out.println("Please enter the project mark: ");
        projectMark = in.nextDouble();
        System.out.println("Please enter the exam mark: ");
        examMark = in.nextDouble();
        
        // Calculate the total mark
        testPercentage = (testMark / 50) * 15;
        quizPercentage = (quizMark / 20) * 5;
        assignmentPercentage = (assignmentMark / 40) * 10;
        projectPercentage = (projectMark / 40) * 20;
        examPercentage = (examMark / 100) * 50;
        totalCoursework = testPercentage + quizPercentage + assignmentPercentage + projectPercentage;
        totalMark = totalCoursework + examPercentage;
        
        // Display the total coursework and total mark
        System.out.println("The total coursework percentage is " + totalCoursework);
        System.out.println("The total mark is " + totalMark);
        
    }
}
