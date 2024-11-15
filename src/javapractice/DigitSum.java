
package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class DigitSum {
    public static void main(String args[]){
        
        int num,a,sum=0,temp;
        
       System.out.println("Enter any number: ");
       Scanner input=new Scanner(System.in);
       num=input.nextInt();
       
       temp=num;
       
       while(temp!=0){
           
          a=temp%10 ;
           sum=sum*10+a ;
           
           temp=temp/10 ;
       }
       System.out.println("Sum of digit: "+sum);
       if(num==sum){
           System.out.println("Plindrome");
       }
       else{
           System.out.println("Not palindrome");
       }
    }
    
}
