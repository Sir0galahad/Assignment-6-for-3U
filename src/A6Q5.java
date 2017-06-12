
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author millc9988
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        Scanner in = new Scanner(System.in);
        //setting the size of the array based on the size of the class
        System.out.println("how many people are in the class?");
        int p = in.nextInt();
        int n[] = new int[p];
        //populating the array
        System.out.println("please input " + p + " marks");
        for (int i = 0; i < p; i++) {
            n[i] = in.nextInt();
        }
        //sorting in order
        for (int m = 0; m < p; m++) {
            for (int i = 0; i < p - 1; i++) {
                if (n[i] < n[i + 1]) {
                    int temp2 = n[i + 1];
                    int temp1 = n[i];
                    n[i] = temp2;
                    n[i + 1] = temp1;
                }
            }

        }
        //outputting the array backwards due to previously mentioned incompetence
        for (int i = p - 1; i > -1; i--) {
            System.out.print(n[i] + ", ");
        }
        //finding the midpoint
        System.out.println("");
        if ((p % 2) == 0) {
            int u = (p / 2);
            double q = (n[u] + n[u - 1]);
            double w = q / 2;
            System.out.println("the average is " + w + "%.");
        } else {
            int u = p / 2;
            System.out.println("The average is " + n[u] + "%.");
        }
    }
}
