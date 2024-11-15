
package overloading;

/**
 *
 * @author Faruk Ahmad
 */
public class Overloading {
String name ,gendre,marrid;
int contact;

Overloading(){
    
    System.out.println("No information");
}
Overloading(String s,String p){
    name=s;
    gendre=p;
   
}
Overloading(String s, String p,String d,int a){
    name=s;
    gendre=p;
    marrid=d;
    contact=a;
    
}

void display(){
    
    System.out.println("Name="+name);
    System.out.println("gendre="+gendre);
    System.out.println("marrid"+marrid);
    System.out.println("contact="+contact);
    
}

}
