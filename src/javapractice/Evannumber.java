
package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class Evannumber {
    public static void main(String args[]){
        
       int num ;
       
       System.out.println("Enter any number: ");
       Scanner input=new Scanner(System.in);
       num=input.nextInt();
       
       System.out.println("List of Even number: ");
       for(int i=1;i<=num;i=i+2){
           System.out.print(" "+i);
       }
        
    }
   
}
