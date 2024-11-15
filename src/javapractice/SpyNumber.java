package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class SpyNumber {

    public static void main(String args[]) {
        int num, temp, r, mul, sum = 0, summ = 1;

        System.out.println("Enter any number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        temp = num;

        while (temp != 0) {
            r = temp % 10;
            sum = sum + r;
            summ = summ * r;
            temp = temp / 10;

        }
        System.out.println("Sum of each number " + sum);
        System.out.println("Multiple of each number " + summ);

        if (sum == summ) {
            System.out.println("the enter number is SPY");
        } else {
            System.out.println("the number is NOT spy ");
        }
    }

}
