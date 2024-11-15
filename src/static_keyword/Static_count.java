
package static_keyword;

/**
 *
 * @author Faruk Ahmad
 */
public class Static_count {
  static  int count=0;
    
    Static_count(){
        count++;
    }
    
    void display(){
        
        System.out.println("Count student object: "+count);
        
    }
}
