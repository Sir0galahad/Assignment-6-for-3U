/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author millc9988
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //setting up an array so that the numbers in the array will actually corrospond with the math
        int[] num = new int[1001];
        int q = 0;
        //populating the array
        for (int i = 2; i < 1001; i++) {
            num[i] = i;
        }
        //multiplying every number in the array by every number up to 500 and then setting those positions in the array to 0
        for (int i = 0; i < 500; i++) {

            for (int j = 0; j < 1000; j++) {
                if (i * num[j] < 1000) {
                    q = i * num[j];
                }
                if (i > 1) {
                    num[q] = 0;
                }
            }
        }
        //outputting all the numbers that were not set to zero
        for (int i = 0; i < 1000; i++) {
            if ((num[i] != 0)) {
                System.out.println(num[i]);
            }
        }
    }
}
