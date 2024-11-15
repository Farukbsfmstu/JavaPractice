
package Arrayprogram;

/**
 *
 * @author Faruk Ahmad
 */
public class Arraycopy {
    public static void main(String args[]){
        
        int[] array=new int[]{1,2,3,4,5};
        int length=array.length ;
        int[] array2=new int[length] ;
         
        System.out.println("Before copy:");
        for(int i=0;i<length;i++){
           System.out.print(" "+array[i]);
        }
        System.out.println();
        
        
        System.out.println("After copy:");
        for(int i=0;i<length;i++){
            array2[i] = array[i] ;
            System.out.print(" "+array2[i]);
        }
         System.out.println();
       
        
    }
    
}
