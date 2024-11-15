
package accessmodifire;

/**
 *
 * @author Faruk Ahmad
 */
public class Test {
    public static void main(String args[]){
        
         Super S=new Typecusstingnon(); 
         S.message();
         
         Typecusstingnon T= (Typecusstingnon) new Super();   //it show runtime error
         T.message();
    }
    
}
