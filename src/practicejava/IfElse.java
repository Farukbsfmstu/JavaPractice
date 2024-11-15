
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class IfElse {
    public static void main(String [] args){
        
        int number;
        System.out.println("Enter any number:");
        Scanner input=new Scanner(System.in) ;
        number=input.nextInt();
        
        if(number>0)
        {
            System.out.println("the NUMBER is positive:");
        }
        else{
            System.out.println("The number is Negetive");
        }
        
        
        
    }
    
}
