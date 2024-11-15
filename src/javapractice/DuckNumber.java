
package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class DuckNumber {
    public static void main(String args[]){
        
        int a,num ;
        
        System.out.print("Enter any number ");
        Scanner input=new Scanner (System.in);
        num=input.nextInt();
        
        while(num != 0){
            
            if(num % 10 == 0 ){
                System.out.print("The number is DUCK ") ; 
                break;
            }
           
            num=num/10 ;
          
        }
        System.out.println("num= "+num);
        if(num==0 )
             System.out.print("Not a duck number ");
              
    }
    
}
