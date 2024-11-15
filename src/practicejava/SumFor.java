
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class SumFor {
    public static void main(String[] args){
        
        int i, j,k,sum=0;
        
        System.out.print("Enter the initial number: ");
        Scanner input=new Scanner(System.in);
        j=input.nextInt();
        
        System.out.print("Enter the final number :");
        k=input.nextInt();
        
        for(i=j;i<=k;i++){
            if(i%2 != 0){
                continue;
            }
            
            sum=sum+i;
            System.out.print(" "+i);
           }
         System.out.println();
         System.out.println("The sum of up even number is:"+sum);
    }
}
