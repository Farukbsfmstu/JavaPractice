
package javapractice;

/**
 *
 * @author Faruk Ahmad
 */
public class jpatterm {
    public static void main(String args[]){
        
       int i, j, row = 6;
 //Outer loop work for rows
 for (i=1; i<row; i++)
 {
//inner loop work for space
 
 //inner loop for columns
 for (j=1; j<=i; j++ )
 {
 int v =64+j ;
 System.out.print(" "+(char)v);
 }
 //throws the cursor in a new line after printing each line
 System.out.println();
 }
}
}