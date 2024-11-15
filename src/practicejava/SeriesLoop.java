
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class SeriesLoop {
    public static void main(String[] args){
        
       int i,j, fact=1;
       
       System.out.print("Enter the last value :");
       Scanner input=new Scanner(System.in);
        j=input.nextInt();
        
        for(i=1; i<=j;i=i+2){
            
          fact=fact*i;
          System.out.print(i+" ,");
            
          
        }
        System.out.println( );
            
         System.out.println("The series multiple sum is:"+fact);
            
    }
    
}
