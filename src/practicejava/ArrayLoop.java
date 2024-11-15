
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class ArrayLoop {
    public static void main(String[] args){
        double sum=0;
        double[] number=new double[5];
        System.out.print("Enter the number: ");
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++){
            
        number[i]=input.nextDouble();
       
        }
        
        for(int i=0;i<5;i++)
        sum=sum+number[i];
        
        System.out.println("the sum is: "+sum);
        double ave=sum/5 ;
        System.out.println("Average is: "+ave);
        
    }
}
