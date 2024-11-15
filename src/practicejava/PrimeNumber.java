



package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class PrimeNumber {
    public static void main(String[] args){
        
        int i,j,count=0;
        
        System.out.println("Enter any integer number:");
        Scanner input=new Scanner(System.in);
        i=input.nextInt();
        
        for(j=2;j<i;j++){
            if(i%j==0){
                count++;
                break;
            }
           
        }
        
        
        
        if(count==0)
            {
            System.out.println("The prime number");
            }
        
        else{
            System.out.println("Not prime number");
            }
    }
    
}
