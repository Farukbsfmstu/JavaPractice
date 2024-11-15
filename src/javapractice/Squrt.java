package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class Squrt {

    public static void main(String args[]) {

        double sqrt, num, temp;

        System.out.println("Enter any number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextDouble();

        sqrt = num / 2;

        do {
            temp = sqrt;
            sqrt = (temp + (num / temp)) / 2;
        } while ((sqrt - temp) != 0);

        System.out.println("sqrt: " + sqrt);
        double floor = Math.floor(sqrt);
        System.out.println("floor" + floor);

        if (sqrt - floor == 0) {
            System.out.println("Yes, Prefect Squre");
        } else {
            System.out.println("Not perfect sqrt");
        }
    }
}
