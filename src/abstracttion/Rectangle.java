package abstracttion;

/**
 *
 * @author Faruk Ahmad
 */
public class Rectangle extends Super {

    double a, b;

    Rectangle(double a, double b) {

        this.a = a;
        this.b = b;

    }

    @Override
    void area() {
        double result = a * b;
        System.out.println("the area of Rectangle is:" + result);

    }

}
