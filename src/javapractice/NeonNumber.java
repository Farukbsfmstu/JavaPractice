package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class NeonNumber {

    public static void main(String args[]) {
        while (true) {

            int a;
            int b, sum = 0;
            System.out.print("Enter any number: ");
            Scanner input = new Scanner(System.in);
            a = input.nextInt();

            int v = a * a;
            int temp = v;

            while (temp != 0) {
                b = temp % 10;
                sum = sum + b;
                temp = temp / 10;
            }

            if (a == sum) {
                System.out.println("the enter number is neon number ");
            } else {
                System.out.println("The enter number is NOT Neon number ");
            }
        }
    }
}
