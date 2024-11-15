
package javapractice;

/**
 *
 * @author Faruk Ahmad
 */
public class StarPattern { 
    public static void main(String args[]){
        
        int x ,y ,c,z ,k;
        
       for(x=1;x<=8;x++){
           
           for(z=1;z<=8-x;z++){
               System.out.print(" ");
           }
           
           for(y=1;y<=x;y++){
               System.out.print(""+y);
           }
           System.out.println();
       }
       
        for(x=8-1;x>=1;x--){
           
           for(z=1;z<=8-x;z++){
               System.out.print(" ");
           }
           
           for(y=1;y<=x;y++){
               System.out.print(""+y);
           }
           System.out.println();
       }
    }
    
  
}
