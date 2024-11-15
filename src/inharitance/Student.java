package inharitance;

/**
 *
 * @author Faruk Ahmad
 */
public class Student extends Teacher {

    String degree;

    void display2() {
        display1();
        System.out.println("Qualification: " + degree);
    }

}
