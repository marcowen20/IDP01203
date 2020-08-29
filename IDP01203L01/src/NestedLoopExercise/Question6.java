/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NestedLoopExercise;

/**
 * Produce the java code:
 * 1
 * 12
 * 123
 * 1234
 * 
 * @author Marc Owen Rentap anak Dineal Gumis
 */
public class Question6 {
    public static void main(String[] args){
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            } System.out.println();
        } 
    }
}
