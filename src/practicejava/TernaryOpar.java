
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class TernaryOpar {
    public static void main(String[] args){
        while(true){
        int a,b ,condition;
        System.out.println("enter the value of a:");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        
        System.out.println("Enter the value of b:");
        b=input.nextInt();
        
        
        condition=(a>b)?a:b;
        
        System.out.println("Large number:"+condition);
    }
    }
    
}
