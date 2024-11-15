
package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class Naturalsum {
    
     static int sum(int num){
        int sum=0;
        for(int i=0;i<=num;i++)
          sum=sum+i ; 
          return sum ;
        
     }
    
    
    public static void main(String args[]){
        int num ;
        System.out.println("Enter any numbner: ");
        Scanner input=new Scanner(System.in);
        num=input.nextInt();
        //using short function
        int temp=num ;
        int function=temp*(temp+1)/2 ;
        System.out.println("using function: "+function);
        
         System.out.println("sum of natural number: "+sum(num));
       
    }
    
}
