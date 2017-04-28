
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author millc9988
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //setting up array that is the size of the class
        System.out.println("How many people are in your class?");
        int p = in.nextInt();
        int[] marks = new int[p];
        for (int i = 0; i < p; i++) {
            marks[i] = in.nextInt();
        }
        //sorting array actually in the right order this time
        for (int m = 0; m < p; m++) {
            for (int i = 0; i < p - 1; i++) {
                if (marks[i] > marks[i + 1]) {
                    int temp2 = marks[i + 1];
                    int temp1 = marks[i];
                    marks[i] = temp2;
                    marks[i + 1] = temp1;
                }
            }
        }
        //little bit of math to find average
        int sum = 0;
        for (int i = 0; i < p; i++) {
            sum = sum + marks[i];
        }
        double average = sum / p;
        System.out.println("The lowest mark is " + marks[0] + "%, the Average is " + average + "% and the highest mark is " + marks[p - 1]);
    }
}
