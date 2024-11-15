
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class FactorialLoo {
    public static void main(String[] args){
        
        int a,b,factorial=1;
        System.out.print("Enter the value:");
        
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        
        for(b=1;b<=a;b++){
            
            factorial=factorial * b;
            
        }
        
       System.out.println("The factorial of "+a + " = " +factorial); 
    }
    
}
