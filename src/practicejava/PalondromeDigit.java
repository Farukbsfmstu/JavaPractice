
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class PalondromeDigit {
 public static void main(String[] args){
     
     int i,d,temp ,sum=0;
     
    System.out.print("Enter the number:");
    Scanner input=new Scanner (System.in);
     d=input.nextInt();
     temp=d;
     
    while(temp !=0){  
      i=temp%10;
      sum=sum*10+i ;
     temp= temp/10 ;
    } 
    if(sum==d){
        System.out.println("The number palindrome: ");
    }
    else{
         
        System.out.println("The number is NOT palindrome");
    }
 }
    
}
