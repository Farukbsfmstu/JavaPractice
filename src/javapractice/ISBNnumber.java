
package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class ISBNnumber {  
    
    public static void main(String args[]){
        
       long a=1,num, rem,temp, sum ,SUMM=0 ;
       
       System.out.println("Enter any ten digit: ");
       Scanner input=new Scanner (System.in);
       num=input.nextLong();
       temp=num ;
       while(temp != 0){
           rem=temp % 10 ;
           temp=temp / 10 ;
          // System.out.println("digit is: "+rem);
           sum=rem * a ;
           //System.out.println("mul ="+sum);
           SUMM=SUMM + sum ;
           a++ ;
       }
       
      // System.out.println("total= "+SUMM);
       if(SUMM % 11==0){
           System.out.println("Legal ISBN number");
       }
       else
           System.out.println("NOT legal ISBN number");
    }
    
}
