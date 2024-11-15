
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class ArmStrong {
    public static void main(String[] args){
        
        int i,j,temp,sum=0;
        System.out.print("enter the number: ");
        Scanner input=new Scanner (System.in);
        j=input.nextInt();
        
        temp=j;
        
        while(temp !=0){
            i=temp%10;
            sum=sum+i*i*i ;
            temp=temp/10 ;
        }
        if(j==sum)
          System.out.println("The number is armstrong");
        
        else
            System.out.println("The number is NOT armstrong");
        
    }
    
}
