
package stringprogram;

import java.util.Random;

/**
 *
 * @author Faruk Ahmad
 */
public class RandomNumber {
    public static void main(String[] args){
        
      Random rand =new Random();
      int randnumber=rand.nextInt(10);
      
      System.out.println("random number is :"+randnumber);
      
    }
}
