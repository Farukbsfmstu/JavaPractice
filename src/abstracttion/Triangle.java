package abstracttion;

/**
 *
 * @author Faruk Ahmad
 */
public class Triangle extends Super {

    double c, d;

    Triangle(double c, double d) {

        this.c = c;
        this.d = d;
    }

    @Override
    void area() {

        double result = 0.5 * c * d;
        System.out.println("The area of triangle is:" + result);
    }

}
