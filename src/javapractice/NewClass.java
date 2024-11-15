
package javapractice;

/**
 *
 * @author Faruk Ahmad
 */
public class NewClass {
    public static void main(String args[]){
       int[][] name=new int[3][] ;
       int  h=0 ;
        
        name[0] = new int[1];
        name[1] = new int[2];
        name[2] = new int[3];
        
        
        for(int i=0;i<3;i++){
            for(int j=0;j<i+1;j++){
              name[i][j]=h;
              h++ ;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<i+1;j++){
             System.out.print("\t"+name[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
