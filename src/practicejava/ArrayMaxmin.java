package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class ArrayMaxmin {

    public static void main(String[] args) {

        double sum = 0;
        int i;
        double[] number = new double[5];
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            number[i] = input.nextDouble();
        }

        for (i = 0; i < 5; i++) {

            sum = sum + number[i];
           
        }
         System.out.println("The sum of all number is: " + sum);
         double max = number[0];
         double min=number[0];
        for (i = 0; i < 5; i++) {
            if (max < number[i]) 
                max = number[i];
            if(min>number[i])
                min=number[i] ;
            
        }
        
        System.out.println("The maximum number is: " + max);
        System.out.println("The minium number is: "+min);
    }
}
