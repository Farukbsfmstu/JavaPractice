
package stringprogram;

import java.util.Arrays;

/**
 *
 * @author Faruk Ahmad
 */
public class StringDemo4 {
     public static void main(String[] args){
         
         String value="Every Muslim want to going Macca" ;
         System.out.println(value);
     
         String rep=value.replace('t','f') ;
         System.out.println("String replace: "+rep);
         
         String[] spl=value.split(" ");
         for(String x : spl)
         {
             System.out.println(x);
         }
        
     }
    
}
