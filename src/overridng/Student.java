
package overridng;

/**
 *
 * @author Faruk Ahmad
 */
public class Student extends Teacher {
    
    int id,heigth;
    
    @Override
    void Display(){
        System.out.println("name: "+name);
        System.out.println("village: "+vill);
        System.out.println("age: "+age);
        System.out.println("Id: "+id);
        System.out.println("heigth: "+heigth);
    }
    
}
