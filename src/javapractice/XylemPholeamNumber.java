package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class XylemPholeamNumber {

    public static void main(String args[]) {

        int num, mod, count = 0, temp, midsum = 0;

        System.out.println("Enter any number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        temp = num;
        String s = Integer.toString(temp);

        int len = s.length();
        int[] a = new int[len];

        while (num != 0) {
            mod = num % 10;
            a[count] = mod;

            num = num / 10;

            //System.out.println(+count + "elemennt= " + a[count]);
            count++;
        }

        int sum = a[0] + a[len - 1];
       // System.out.println("first and last digit sum= " + sum);

        for (int j = 1; j < len - 1; j++) {
            midsum = midsum + a[j];
        }

      //  System.out.println("middle sum = " + midsum);

        if (midsum == sum) {
            System.out.println("Yes, this is Xylem number");
        } else {
            System.out.println("OH !! this is Pholeam number");
        }
    }
}
