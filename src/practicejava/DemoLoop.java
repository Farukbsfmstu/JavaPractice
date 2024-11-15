
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class DemoLoop {
     public static void main(String[] args){
        int a,b,c,d,namota;
        System.out.print("Enter the number:");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        
        for(b=1;b<=10;b++){
            System.out.println(a+ "X"+b + "=" +a*b);
        }
        
        
    }
    
    
}
