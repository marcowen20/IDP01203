/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NestedLoopExercise;

/**
 * Produce the java code:
 * ***
 * **
 * *
 * **
 * *
 * 
 * @author Marc Owen Rentap
 */

public class Question8 {
    public static void main(String[] args){
        for(int i = 3; i >= 2; i--){
            for(int j = i; j >= 1; j--){
                for (int k = 1; k <= j; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
