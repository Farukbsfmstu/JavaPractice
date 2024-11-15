
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class SwitchVowel {
    public static void main(String[] args){
        char ch;
        
        System.out.println("Enter the character:");
        Scanner input=new Scanner(System.in);
         ch=input.next().charAt(0) ;
         
         switch(ch){
             
             case 'a' :
                 System.out.println("vowel");
                 break;
             case 'e' :
                 System.out.println("vowel");
                 break;
             case 'i' :
                 System.out.println("vowel");
                 break;
             case 'o' :
                 System.out.println("vowel");
                 break;
             case 'u' :
                 System.out.println("vowel");
                 break ;
             default :
                 System.out.println("coconent");
         }
        
        
    }
    
}
