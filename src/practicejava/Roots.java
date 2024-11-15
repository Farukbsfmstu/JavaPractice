
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class Roots {
    public static void main(String args[]){
        
        double num, i,roots=0,j ;
        System.out.println("Enter any number");
        Scanner input=new Scanner (System.in);
        num=input.nextDouble();
        
        i= num/2 ;
        j=i ;
        while(i-roots != 0)
        {
            roots =(j+(num/j))/2 ;
        }
        System.out.println("roots "+roots);
    }
    
}
