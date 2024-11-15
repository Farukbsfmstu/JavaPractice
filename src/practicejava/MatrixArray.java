
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class MatrixArray {
    public static void main(String[] args){
      int row,col = 0,f=0;
      int[][] A=new int[3][3];
      
      for(row=0;row<3;row++){
          for(col=0;col<3;col++){
            
              A[row][col] = f ;
              f++ ;
              
          }
      }
     
      for(row=0;row<3;row++){
          for(col=0;col<3;col++){
               
           System.out.print("  "+A[row][col]);
              
          }
          System.out.println();
      }
       
    }
    
}
