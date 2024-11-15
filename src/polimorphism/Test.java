package polimorphism;

/**
 *
 * @author Faruk Ahmad
 */
public class Test {

    
    public static void main(String args[]) {
        
        
        PolyDemo[] a = new PolyDemo[3];

        a[0] = new PolyDemo();
        a[1] = new Rectangle(10, 20);
        a[2] = new Triangle(10, 10);

        for(int i=0;i<3;i++){
          System.out.println(a[i].area());   
        }
       
    }

}
