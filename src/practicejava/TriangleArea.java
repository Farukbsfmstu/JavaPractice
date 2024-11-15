
package practicejava;

import java.util.Scanner;


public class TriangleArea {

    public static void main(String[] args) {
        
     double b, h,area ;
     
     System.out.println("Enter the ground length:");
     Scanner input=new Scanner(System.in);
        
     b=input.nextDouble();
     
     System.out.println("Enter the triangle heigth:");
     
      h=input.nextDouble();
     
     area=0.5*b*h ;
     System.out.println("triangle area is:"+area);
        
    }
            
           
}
