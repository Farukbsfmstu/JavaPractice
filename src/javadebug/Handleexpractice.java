package javadebug;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class Handleexpractice {
    
    public static void main(String args[]) {
        while (true) {
            try {
                double num1, num2, result;
                Scanner input = new Scanner(System.in);
                
                System.out.println("Enter the num1");
                num1 = input.nextInt();
                System.out.println("Enter the num2");
                num2 = input.nextInt();
                
                result = num1 / num2;
                DecimalFormat ob = new DecimalFormat("0.00");
                
                System.out.println("result: " + num1 + "/" + num2 + "=" + ob.format(result));
                
            } catch (Exception e) {
                System.out.println("Exception" + e);
                System.out.println("You must enter the integer");
            }
        }
    }
}
