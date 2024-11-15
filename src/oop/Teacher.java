
package oop;

/**
 *
 * @author Faruk Ahmad
 */
public class Teacher {
 
  String name,gendre,marrid ;
  int age;
  
  void inputinfo(String n,String m,String p,int a){
      
      name=n;
      gendre=m;
      marrid=p;
      age=a;
    
  }
  
  void displayinfo(){
      
      System.out.println("Name="+name);
      System.out.println("marrid="+marrid);
      System.out.println("gendre="+gendre);
      System.out.println("age="+age);
      
  
  }
  
    
}
