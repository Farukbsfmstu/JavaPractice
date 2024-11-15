
package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class series {
    public static void main(String args[]){
        
        int L;
        double sum=0 ;
        double i ;
        System.out.println("Enter the number");
        Scanner input=new Scanner(System.in);
        L=input.nextInt();
        
        for(i=1.5;i<=L;i++){
          
             sum=sum+i ;
            System.out.print("+"+i);
        }
       
        System.out.println("Sum of series: "+sum);
    }
    
}
