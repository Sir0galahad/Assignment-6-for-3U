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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //finding out how many people are there
        System.out.println("How many people are in your sample.");
        int p = in.nextInt();
        //setting up an array to store their heights
        double heights[] = new double[p];
        System.out.println("please enter in the heights in CM.");
        //filling the array
        for (int i = 0; i < p; i++) {
            heights[i] = in.nextDouble();
        }
        //creating an accumulator
        double sum = 0;
        for (int i = 0; i < p; i++) {
            sum = sum + heights[i];
        }
        //determining the average and telling them what it is to one decimal place
        double average = sum / p;
        average = Math.round(average * 10) / 10.0;
        System.out.println("The average height is " + average + " CM");
        //outputting all of the heights that are larger than the average on the same line
        System.out.println("the ones that are above average are:");
        for (int i = 0; i < p; i++) {
            if (heights[i] > average) {
                System.out.print(heights[i] + ", ");
            }
        }
        //putting in a space at the end so the build success runs on a different line than the heights
        System.out.println("");
    }
}
