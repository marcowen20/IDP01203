/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;

import java.util.*;

/**
 *
 * @author Miit
 */
public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base, height;
        double area;

        System.out.println("Please enter base :");

        //get  base
        base = scanner.nextInt();

        //prompt for height
        System.out.println("Please enter height:");

        //get height
        height = scanner.nextInt();

        //calculate the area
        area = 0.5 * base * height;
        //display the area
        System.out.println("The area is: " + area);

    }// end main
}// end class
