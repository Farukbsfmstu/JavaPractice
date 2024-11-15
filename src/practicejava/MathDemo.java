
package practicejava;

import java.util.Scanner;


public class MathDemo {
    public static void main(String[] args){
        int x ,b;
        float v ;
        System.out.println("Enter the value of x:");
        Scanner input=new Scanner(System.in);
         x=input.nextInt();
         
         System.out.println("Enter the value of b:");
         b=input.nextInt();
         
         System.out.println("enter the float number:");
         v=input.nextFloat();
        
        int max,min,absolute,round;
        
        max=Math.max(x,b);
        System.out.println("the maximum number is:"+max);
        
        min=Math.min(x, b);
        System.out.println("the minum number is:"+min);
        
        absolute=Math.abs(b);
        System.out.println("The absolute number is:"+absolute);
        
        round=Math.round(v);
        System.out.println("the round number is:"+round);
       
       
       
      
    }
    
}
