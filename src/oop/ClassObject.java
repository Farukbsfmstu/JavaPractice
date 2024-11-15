package oop;

/**
 *
 * @author Faruk Ahmad
 */
public class ClassObject {

    public static void main(String[] args) {
    Teacher teacher1=new Teacher() ;
    
    teacher1.inputinfo("Faruk ahmad","Unmarrid","Male",21);
    teacher1.displayinfo();
    
    Teacher teacher2=new Teacher();
     
    teacher2.name="Graphics Foisal";
    teacher2.marrid="unmarrid" ;
    teacher2.gendre="Male";
    teacher2.age=20;
    
    teacher2.displayinfo();
     
    }
}
