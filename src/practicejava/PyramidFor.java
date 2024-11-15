
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class PyramidFor {
    public static void main(String[] args){
        int row,col,n;
        System.out.print("Enter the number: ");
        Scanner input=new Scanner (System.in);
        n=input.nextInt();
        
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++)
            {
             System.out.print(" "+col);
            }
          System.out.println( );
        }
        
    }
    
}
