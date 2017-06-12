
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author millc9988
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //new array
        int n[] = new int[10];
        //populating the array
        System.out.println("please input 10 marks");
        for (int i = 0; i < 10; i++) {
            n[i] = in.nextInt();
        }
        //checking if the next number is smaller and if it is swapping them
        for (int m = 0; m < 10; m++) {
            for (int i = 0; i < 9; i++) {
                if (n[i] > n[i + 1]) {
                    int temp1 = n[i + 1];
                    int temp2 = n[i];
                    n[i + 1] = temp2;
                    n[i] = temp1;
                }
            }
        }
        //outputting the marks
        for (int i = 0; i < 10; i++) {
            System.out.print(n[i] + "%, ");
        }
        System.out.println("");
    }
}
