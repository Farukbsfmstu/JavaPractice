
package practicejava;

/**
 *
 * @author Faruk Ahmad
 */
public class Arrayrowonly {
    public static void main(String[] args){
        
        int row ,col, F=0;
        int[][] A=new int[4][];
        A[0]=new int[1];
        A[1]=new int[2];
        A[2]=new int[3];
        A[3]=new int[4];
        
        for(row=0;row<4;row++){
            for(col=0;col<row+1;col++){
                
                A[row][col] = F  ;
                F++ ;
            }
        }
        for(row=0;row<4;row++){
            for(col=0;col<row+1;col++){
                
                System.out.print("  "+A[row][col]);
                
            }
            System.out.println();
        }
    }
    
}
