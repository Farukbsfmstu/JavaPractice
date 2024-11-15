
package superkeyword;

/**
 *
 * @author Faruk Ahmad
 */
public class Constractor {
    String name ,gendre;
    int id;
    
    Constractor(String s, String g,int i){
        name=s;
        gendre=g;
        id=i;
    }
    
    void display(){
        System.out.println("name: "+name);
        System.out.println("gndre :"+gendre);
        System.out.println("id: "+id);
                
    }
    
}
