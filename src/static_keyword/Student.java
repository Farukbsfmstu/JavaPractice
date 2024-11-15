
package static_keyword;

/**
 *
 * @author Faruk Ahmad
 */
public class Student {
    String name,gendre;
    int roll;
    static String universityname ="BSFMSTU" ;
    
    Student(String n, String m,int r){
        
        name=n;
        gendre=m;
        roll=r;
       
    }
    
    void display(){
        
        System.out.println("Name: "+name);
        System.out.println("gendre "+gendre);
        System.out.println("roll "+roll);
        System.out.println("university name: "+universityname);
        
    }
}
