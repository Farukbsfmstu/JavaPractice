
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class MatrixAddition {
    public static void main(String[] args){
        
        int i=0,j=0;
        int[][] A=new int[3][3];
        int[][] B=new int[3][3];
        int[][] C=new int[3][3];
        Scanner input=new Scanner (System.in);
         System.out.println("Enter the element of A: ");
         //input A
         for(i=0;i<3;i++){
             for(j=0;j<3;j++){
                 A[i][j]=input.nextInt();
             }
            System.out.println();
         }
        //input B
        System.out.println("Enter the elemant of B: ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                B[i][j]=input.nextInt();
            }
            System.out.println();
        }
        //print A matrix
        System.out.println("The matrix of A is :");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print("  "+A[i][j]);
            }
            System.out.println();
        }
        //print B matrix 
        System.out.println("The matrix of B is: ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print("  "+B[i][j]);
            }
            System.out.println();
        }
        //adding A and B matrix
        System.out.println("Matrix  A+B is: ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                C[i][j]=A[i][j] + B[i][j] ;
                System.out.print("  "+C[i][j]) ;
            }
           System.out.println();
        }
        
    }
            
    
}
