
package stringprogram;

/**
 *
 * @author Faruk Ahmad
 */
public class StringBufer1 {
    public static void main(String[] args){
        
        StringBuffer fa=new StringBuffer("Faruk");
        System.out.println(fa);
        
        fa.append("Ahmad");
        fa.append("21");
        System.out.println(fa);
        
       
        
        fa.reverse();
        System.out.println(fa);
        
        fa.delete(0, 3);
        System.out.println(fa);
        
    }
    
}
