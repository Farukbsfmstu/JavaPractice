
package polimorphism;

/**
 *
 * @author Faruk Ahmad
 */
public class Triangle extends PolyDemo {
    
    double heigth, weigth;
    
    Triangle(double heigth, double weigth){
        this.heigth=heigth;
        this.weigth=weigth;
        
    }
    
    @Override
    double area(){
        return heigth*weigth;
    }
    
    
}
