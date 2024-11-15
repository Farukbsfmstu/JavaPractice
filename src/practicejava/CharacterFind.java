
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class CharacterFind {
 public static void main(String [] args){
     
     char ch ;
     
     System.out.println("Enter any character:");
      Scanner input=new Scanner(System.in);
              ch=input.next().charAt(0);
              
              if(ch>='a' && ch<='z')
              {
                  System.out.println("Enter character is small letter:");
              }
              else if(ch>='A' && ch<='Z'){
                  System.out.println("Enter character is Capital letter:");
              }
              else{
                  System.out.println("NOT A LETTER ");
              }
     
 }   
    
}
