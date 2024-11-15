package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class Emripnumber {

    public static void main(String args[]) {
        while(true){

        int num, temp, r, sum = 0, prime = 0, count = 0, summ;
        System.out.print("Enter any number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime++;
                break;

            }

        }

        if (prime == 0) {
            temp = num;

            while (temp != 0) {

                r = temp % 10;
                sum = sum * 10 + r;

                temp = temp / 10;
            }

        } 
           else 
        {
            System.out.println("NOT EMRIP NUMBER ");
        }
        summ = sum;

        if (summ != 0) {
            for (int i = 2; i < summ; i++) {
                if (summ % i == 0) {
                    count++;
                }
                break;
            }
            if (count == 0) {
                System.out.println("The Emrip Number ");
            } else {
                System.out.println("Not Emrip number ");
            }
            
            
        }
        
    }
}
}