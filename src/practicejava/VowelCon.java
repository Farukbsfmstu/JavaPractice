
package practicejava;


 
import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class VowelCon {
    public static void main(String[]args){
        
        char c ;
        System.out.println("Enter any character:");
        Scanner input=new Scanner(System.in);
        c=input.next().charAt(0);
        if(c == 'a' || c =='e' || c =='i' || c =='o' || c =='u'){
            
          System.out.println("The enter character is Vowel:");
        }
        else{
            System.out.println("Enter character is Consonent");
        }
        
        
    }
    
}
