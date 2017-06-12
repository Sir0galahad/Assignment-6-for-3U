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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //making a new scanner
        Scanner in = new Scanner(System.in);
        int n[] = new int[2];
        System.out.println("please input the numbers");
        //populating the array
        for (int i = 0; i < 2; i++) {
            n[i] = in.nextInt();
        }
        //swapping the numbers if the second one is smaller
        if (n[1] < n[0]) {
            int temp1 = n[1];
            int temp2 = n[0];
            n[1] = temp2;
            n[0] = temp1;
        }
        //outputting numbers in the new order
        System.out.println("in ascending order it is " + n[0] + " " + n[1]);
    }
}
