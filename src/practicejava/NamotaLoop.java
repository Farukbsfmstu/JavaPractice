
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class NamotaLoop {
    public static void main(String[] args){
        
       int i ,j,k,l,namota;
       
       System.out.print("enter the initial number:");
       Scanner input=new Scanner(System.in);
       i=input.nextInt();
       
       System.out.print("Enter the final value:");
       j=input.nextInt();
       for(int a=i;a<=j;a++){
           
           for(k=1;k<=10;k++){
               System.out.println(a+ "X" +k + "=" +a*k);
               
           }
           System.out.println("\n\n");
           
       }
        
    
    }
}
