package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class BounceNumber {

    public static void main(String args[]) {

        long num, min = 0, count = 0, bounce = 0;
        System.out.println("Enter any number ");
        Scanner input = new Scanner(System.in);
        num = input.nextLong();

        String s = Long.toString(num);
        long max = s.charAt(0);
       
        long len = s.length();
        System.out.println("len " + len);
        for (int i = 0; i < len; i++) {

            if (s.charAt(i) >= max) {
                max = s.charAt(i);
                count++;
                // System.out.print("count= "+count);
            }

        }
        for (int j = 1; j < len; j++) {
            if (s.charAt(j) <= max) {
                max = s.charAt(j);
                bounce++;
                // System.out.print("Bounce=  "+bounce);
            }
        }

        if (count == len || bounce == len - 1) {
            System.out.println("Not Bounce Number");
        } else {
            System.out.println("BOUNCE NUMBER");
        }

    }

}
