
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class TemparatureDemo {
    public static void main(String[] args){
        
        double celcious,f ;
        
        System.out.println("Enter the value of celcious:");
        
        Scanner input=new Scanner(System.in);
        celcious=input.nextDouble();
        
        f=1.8*celcious+32 ;
        
       System.out.println("temparature in farenheigth is:"+f);
        
    }
    
}
