
package practicejava;

import java.util.Arrays;

/**
 *
 * @author Faruk Ahmad
 */
public class Arraysort {
    public static void main(String[] args){
        
      int[] A={-4,-7,-9,5,9,4,6};
      
      Arrays.sort(A);
      
      System.out.print("Acending of this element:");
      for(int i=0;i<7;i++){
          
          System.out.print("  "+A[i]);
      }
      System.out.println();
      System.out.print("Decending of this number: ");
      for(int i=6;i>0;i--){
          
          System.out.print("  "+A[i]) ;
      }
       System.out.println();
    }
    
}
