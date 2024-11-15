
package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class BuzzNumber {
    public static void main(String args[]){
        
        int num,first,last ;
        
        System.out.print("Enter first number: ");
        Scanner input=new Scanner(System.in);
        last=input.nextInt() ;
        System.out.print("Enter last number: ");
        first=input.nextInt();
        
        System.out.println("Yes, the Buzz number is: ");
        for(num=last; num<=first;num++) {
        
        if(num % 10 == 7 || num % 7 == 0){
           
            System.out.print("  "+num);
        }
       
    }
    System.out.println();
}
}
