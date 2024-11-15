
package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class array {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
     
        int[][] A=new int[3][3] ;
        int[][] B=new int[3][3] ;
        int[][] C=new int[3][3] ;
         System.out.println("Enter the matrix A: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               A[i][j]=input.nextInt();
               
            }
        }
         System.out.println("Matrix of A is: ");
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
             System.out.print(" "+A[i][j]);
            }
            System.out.println();
         }
         //B matrix 
            System.out.println("Enter the matrix B: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               B[i][j]=input.nextInt();
               
            }
        }
         System.out.println("Matrix of B is: ");
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
             System.out.print(" "+B[i][j]);
            }
            System.out.println();
         }
    }  
}
