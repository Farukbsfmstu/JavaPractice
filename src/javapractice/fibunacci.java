
package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class fibunacci {
    public static void main(String args[]){
        
        int first=0,secound=1,fibo=0;
       
        System.out.print("Enter any number: ");
        
        Scanner input=new Scanner(System.in);
        int j=input.nextInt();
         System.out.print(first+ " "+secound);
        
        for(int i=3;i<=j;i++){
            fibo=first+secound ;
            System.out.print(" "+fibo);
            first=secound ;
            secound=fibo ;
        }
        System.out.println();
    }
    
}
