
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class ArrayMatrix {
    public static void main(String[] args){
      int i=0,j=0,k=0,l=0;
      int[][] A = new int[3][3];
      int[][] B=new int[3][3];
      int[][]C=new int[3][3];
      
       Scanner  input = new Scanner (System.in);
      
       //input matrix A by user
       System.out.print("Enter the matrix of A: ");
       for(i=0;i<3;i++){
           for(j=0;j<3;j++){
               
               A[i][j]=input.nextInt();
           }
       }
       //print matrix B by user 
       System.out.print("Enter the matrix of B: ");
       for(i=0;i<3;i++){
           for(j=0;j<3;j++){
               
               B[i][j]=input.nextInt();
           }
       }
       //print matrix A
       System.out.println("the input matrix A is:");
       for(i=0;i<3;i++){
           for(j=0;j<3;j++){
               System.out.print("  "+A[i][j]);
           }
           System.out.println();
       }
       // print matrix B
       System.out.println("The input matrix B is:");
       for(i=0;i<3;i++){
           for(j=0;j<3;j++){
               System.out.print("  "+B[i][j]);
           }
           System.out.println();
       }
       //adding A and B matrix 
        System.out.println("A*B=");
              for(i=0;i<3;i++){              
           for(j=0;j<3;j++){
               C[i][j]=(A[i][j] * B[j][i]) ;
               System.out.print("  "+(C[i][j]));
           }
           System.out.println();
       }
    }
    
}

