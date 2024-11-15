
package static_keyword;

/**
 *
 * @author Faruk Ahmad
 */
public class StaticBlock {
    static int id;
    static String name;
    
    static {

      id=19111123;
      name="Faruk ahmad";
        

    }
    
  static  void DisplayBlock(){
        
        System.out.println("Id= "+id);
        System.out.println("Name="+name);
        
    }
            
    
}
