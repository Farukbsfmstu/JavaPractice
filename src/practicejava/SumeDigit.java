
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class SumeDigit {
    public static void main(String[] args){
        
        int i,j,temp,sum=0;
        
       System.out.println("Enter he vlaue :");
       Scanner input=new Scanner (System.in);
       j=input.nextInt();
       
       temp=j;
       while(temp!=0){
           i=temp%10;
           sum=sum+i;
           temp=temp/10;
       }
               
       System.out.println("the sum of the number is: "+sum);
    }
    
}
