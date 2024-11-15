
package oop;

/**
 *
 * @author Faruk Ahmad
 */
public class ConstractureExample {
    double heigth,weigth,dept;
    
    ConstractureExample(double h, double w, double d){
        
        heigth =h;
        weigth =w;
        dept =d;
        
        
    }
    
    void display(){
        
        double val= heigth*weigth*dept;
        System.out.println("Value of box is; "+val);
    }
    
    
}
