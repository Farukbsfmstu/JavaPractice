
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class ReverseNUmber {
    public static void main(String[] args){
        
        int i,j,sum=0,temp;
        System.out.print("Enter the number: ");
        Scanner input=new Scanner (System.in);
        j=input.nextInt();
        
        temp=j;
        
        while(temp!=0){
            i=temp%10;
            sum=sum*10+i;
            temp=temp/10;
            
        }
        System.out.println("the reverse number is :"+sum);
    }
    
    
}
