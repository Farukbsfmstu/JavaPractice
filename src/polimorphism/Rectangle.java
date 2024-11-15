
package polimorphism;

/**
 *
 * @author Faruk Ahmad
 */
public class Rectangle extends PolyDemo {
    double length,weigth;
    
    Rectangle(double length,double weigth){
        this.length=length;
        this.weigth=weigth;
    }
    
    @Override
    double area(){
        
        return length*weigth;
        
    }
    
}
