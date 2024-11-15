package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class SmithNumber {

    public static void main(String args[]) {

        int num, sum = 0, primesum = 0, mod, temp, primefactor, last, modulation, lastmod, lastsum = 0, pera = 0;

        System.out.println("Enter any number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        temp = num;
        while (num != 0) {

            mod = num % 10;
            sum = sum + mod;
            num = num / 10;
        }

        System.out.println("number sum= " + sum);

        System.out.println("temp " + temp);

        for (int i = 2; i < temp; i++) {
            while (temp % i == 0) {

                System.out.println("i= " + i);

                int item = i;
                while (item != 0) {
                    modulation = item % 10;
                    pera = pera + modulation;
                    item = item / 10;

                }

                primesum = (primesum + pera);
                temp = temp / i;
                pera = 0;
                System.out.println("jontrona " + primesum);
                System.out.println("temp value " + temp);

            }

        }
        System.out.println("only sum(i) prime " + primesum);

        last = temp;
        System.out.println("last Number " + last);

        if (last > 1) {

            while (last != 0) {
                lastmod = last % 10;
                lastsum = lastsum + lastmod;
                last = last / 10;
            }
        }
        System.out.println("last mod sum is :" + lastsum);
        primefactor = (primesum + lastsum);

        System.out.println("prime factor sum= " + primefactor);

        if (primefactor == sum) {
            System.out.println("Yes , this is Smith number ");
        } else {
            System.out.println("Sorry , Not Smith number");
        }

    }

}
