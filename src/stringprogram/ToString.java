
package stringprogram;

/**
 *
 * @author Faruk Ahmad
 */
public class ToString {
    
   String name; int age;
   
   ToString(String name,int age){
       this.age=age;
       this.name=name ;
   }
   @Override
  public String toString(){
    return "Name " +name +" age "+age ;  
  } 
   
}
