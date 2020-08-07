/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;
import java.util.*;
/**
A program is required to read from the screen the length and width of a
* rectangular house block, and the length and width of the rectangular house
* that has been built on the block. The algorithm should then compute and
* display the mowing time required to cut the grass around the house, at the
* rate of two square metres per minute.
 * @author Marc Owen Rentap
 */
public class Question12 {
    public static void main(String[] args){
        // The scanner class for input
        Scanner in = new Scanner(System.in);
        
        // Declare the variables to be used
        double blockLength, blockWidth, houseLength, houseWidth, houseArea, grassArea, mowingTime;
        
        // Prompt for and get the block length and width; and house length and width
        System.out.println("Please enter the block length");
        blockLength = in.nextDouble();
        System.out.println("Please enter the block width");
        blockWidth = in.nextDouble();
        System.out.println("Please enter the house length");
        houseLength = in.nextDouble();
        System.out.println("Please enter the house width");
        houseWidth = in.nextDouble();
        
        // Calculat the mowing time
        houseArea = houseLength * houseWidth;
        grassArea = (blockWidth * blockLength) - houseArea;
        mowingTime = grassArea / 2;
        
        // Display the mowing time in minutes
        System.out.println("The mowing time in minutes is " + mowingTime);
    }
}
