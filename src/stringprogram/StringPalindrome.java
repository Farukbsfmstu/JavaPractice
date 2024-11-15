
package stringprogram;

/**
 *
 * @author Faruk Ahmad
 */
public class StringPalindrome {
    public static void main(String[] args){
        
     String s1="Madam";
     StringBuffer s2=new StringBuffer(s1) ;
     
     String fa=s2.reverse().toString();
     
     if(s1.equalsIgnoreCase(fa))
     {
         System.out.println("The string is palindrome");
     }
    else
     {
         System.out.println("Not palindrome");
     }
    }
    
}
