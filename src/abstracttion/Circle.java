package abstracttion;

/**
 *
 * @author Faruk Ahmad
 */
public class Circle extends Super {

    double r;

    Circle(double r) {

        this.r = r;

    }

    @Override
    void area() {

        double result = 3.1416 * r * r;
        System.out.println("The area of circle is:" + result);

    }

}
