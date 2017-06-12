/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a6;

import java.util.Scanner;

/**
 *
 * @author millc9988
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //asking how many people are in the class
        System.out.println("how many people are in the class?");
        //setting the length of the array based on number of people
        int p = in.nextInt();
        //making new array
        double[] marks = new double[p];
        //asking them to enter the marks
        System.out.println("please enter the marks.");
        //assigning each mark to a position on the array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = in.nextInt();
        }
        //telling them they are done entering numbers
        System.out.println("Thank you I am now calculating the average.");
        //setting up an accumulator
        double sum = 0;
        //starting the math
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        //finishing the math
        double average = sum / marks.length;
        //outputting the average

        average = Math.round(average * 100) / 100.0;
        System.out.println("The class average is " + average + "%.");
    }
}
