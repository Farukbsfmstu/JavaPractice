
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class CircleArea {
    public static void main(String[] args){
        
     double r, area;
     System.out.println("Enter the value of r :");
     
     Scanner input=new Scanner(System.in);
     r=input.nextDouble();
     
     area=3.1416*r*r ;
     
     System.out.println("the area of circle is:"+area);
     
        
    }
            
    
}
