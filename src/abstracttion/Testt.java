
package abstracttion;

/**
 *
 * @author Faruk Ahmad
 */
public class Testt {
    public static void main(String args[]){
        
        Super S ;
        S=new Rectangle(10,20);
        S.area();
        
        S=new Triangle(5,5);
        S.area();
        
        S=new Circle(2);
        S.area();
        
        
    }
}
