
package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class EvilNumber {
    public static void main(String args[]){
        
        int num,count=0;
        
        System.out.print("Enter any number ");
        Scanner input=new Scanner (System.in);
        num=input.nextInt();
        
       
       String   Bainary=Integer.toBinaryString(num);
     
       int bainary=Integer.parseInt(Bainary);
       
       while(bainary !=0){
         
           if(bainary % 10 ==1)
              count++ ;
             
           bainary=bainary / 10 ;
       }
        System.out.println("count value "+count);
        
        if(count % 2 == 0)
            System.out.println("EVIN NUMBER ");
        else
            System.out.println("NOT Evin number ");
    }
    
}
