
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class ArrayUpperlowerttriangle {
    public static void main(String[] args ){
        
        int row ,col;
        int sumuppertriangle=0;
        int sumlowertriangle=0;
        int diagonal=0;
        int[][] A=new int[3][3] ;
        
        Scanner input=new Scanner(System.in);
        //input section
        System.out.println("Enter the matrix element: ");
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                
                A[row][col]=input.nextInt();
                
            }
        }
        //output section
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
               
                if(row==col)
                {
                   diagonal=diagonal + A[row][col];
                }
                if(row<col)
                {
                   sumlowertriangle=sumlowertriangle +A[row][col] ; 
                }
                if(row>col)
                {
                  sumuppertriangle = sumuppertriangle + A[row][col] ;  
                }
                
            }
        }
        System.out.println("The sum of Diagonal: "+diagonal);
        System.out.println("The sum of uper triangle : "+sumlowertriangle);
        System.out.println("The sum of lower triangle : "+sumuppertriangle);
    }
    
}
