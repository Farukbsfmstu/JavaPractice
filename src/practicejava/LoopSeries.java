
package practicejava;

/**
 *
 * @author Faruk Ahmad
 */
public class LoopSeries {
    public static void main(String[] args){
        
        int i,j;
         float sum=0.5f;
        
      for(i=1 ;i<=10;i++){
          sum=sum+i;
        System.out.print(sum+" ,");
          
      }
      System.out.println();
         
       System.out.println("The sum of this series:"+sum);
     
    }
    
}
