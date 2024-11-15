
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class PrimeNthnumber {
    public static void main(String[]args){
        
        int i,j,k,count=0;
        
        System.out.print("Enter the initial number: ");
        Scanner input=new Scanner (System.in);
        i=input.nextInt();
        
        System.out.print("Enter the final number: ");
        j=input.nextInt();
        
        for(k=i;k<=j;k++){
            for(int h=2;h<=i-1;h++){
             if(i%h==0){
                 count++;
                 break;
             }
                 
                
            }
          if(count==0)
            System.out.println(i);
            
        
          
            
        }
        
            
        
    }
}
