/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week7;
import java.util.*;
/**
 * Design an algorithm that will prompt for and receive the time expressed in
 * 2400 format, (e.g. 2305 hours), convert it to 12-hour format (e.g. 11.05 p.m.)
 * and display the new time to the screen. Your program is to repeat the
 * processing until a sentinel time of 9999 is entered
 * 
 * @author Marc Owen Rentap
 */
public class Tutorial3Question5 {
    public static void main(String[] args) {
        int stop = 0;
        int time24, hour24, hour12, minutes;
        String meridiem, minuteString;
        
        // The scanner object for input
        Scanner in = new Scanner(System.in);
        
        while (stop == 0) {
            // Prompt for and get the time in 24 hour
            System.out.println("Please enter the time in 24-hour format");
            time24 = in.nextInt();
            
            if (time24 == 9999) {
                stop = 1;
            } else {
                hour24 = time24 / 100;
                
                if (hour24 < 12) {
                    meridiem = "a.m.";
                    hour12 = hour24;
                } else {
                    meridiem = "p.m.";
                    hour12 = hour24 - 12;
                }
                minutes = time24 - (hour24 * 100);
                // Format the minutes
                if (minutes < 10) {
                    minuteString = "0" + minutes;
                } else {
                    minuteString = String.valueOf(minutes);
                }
                System.out.println("The time in 12-hour format is " + hour12 + "." + minuteString + " " + meridiem);
            }
        }
    }
}
