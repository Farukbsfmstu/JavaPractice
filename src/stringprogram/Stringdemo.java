
package stringprogram;

/**
 *
 * @author Faruk Ahmad
 */
public class Stringdemo {
    public static void main(String[] args){
        
      String A="Faruk Ahmad" ;
       String B=new String("Faruk Ahmad");
       char[] C={'a','h','m','a','d'} ;
       
       System.out.println("string A is:"+A) ;
       System.out.println("string b is"+B);
       System.out.println("char string is:"+C);
       
       int len=A.length();
       System.out.println("Length of stering A :"+len);
       
       if(A.equalsIgnoreCase(B))
       {
         System.out.println("Equal");
       }
      else
       {
           System.out.println("Not equal");
       }
       
       boolean con=A.contains("Ahmad") ;
       System.out.println(con);
       
       boolean emp=B.isEmpty() ;
       System.out.println(emp);
       
    }
    
}
