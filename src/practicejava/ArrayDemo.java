
package practicejava;

/**
 *
 * @author Faruk Ahmad
 */
public class ArrayDemo {
    public static void main(String[] args){
        
        int[] number=new int[9] ;
        number[0]=4;
        number[1]=8;
        number[2]=6;
        number[3]=7;
        number[4]=9;
        
        
        int sum=number[0]+number[1]+number[3];
        
       System.out.println("sum of :"+sum);
       
       int len=number.length ;
       System.out.println("the size of array: "+len);
               
        
    }
    
}
