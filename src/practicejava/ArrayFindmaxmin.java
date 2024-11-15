package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class ArrayFindmaxmin {

    public static void main(String[] args) {

        int i;
        double[] number = new double[5];
        System.out.println("Enter The number: ");
        Scanner input = new Scanner(System.in);

        for (i = 0; i < 5; i++) {

            number[i] = input.nextDouble();
        }

        double max = number[0];
        double min = number[0];
        for (i = 0; i < 5; i++) {
            if (max < number[i]) {
                max = number[i];
            }
            if (min > number[i]) {
                max = number[i];
            }

        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minium number is: " + min);

    }
}
