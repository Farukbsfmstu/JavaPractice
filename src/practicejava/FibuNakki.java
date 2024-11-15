
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class FibuNakki {
    public static void main(String[] args){
        int first=0,second=1,fibonakki,j;
        
        System.out.print("Enter the number:");
         Scanner input=new Scanner (System.in);
         j=input.nextInt();
         
        System.out.print(first+ " "+second);
        
        for(int i=3;i<=j;i++){
            fibonakki=first+second;
            first=second;
            second=fibonakki;
            System.out.print("  "+fibonakki);
            
             
            
        }
            
       System.out.println();
        
    }
    
}
