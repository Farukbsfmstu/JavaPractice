
package practicejava;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class SwitchLoop {
    public static void main(String[] args){
        
        int number ;
        System.out.println("Enter the digit 0 to 9 :");
        
        Scanner input=new Scanner(System.in);
          number=input.nextInt();
          
          switch(number){
              
              case 0:
                  System.out.println("zero");
                   break ;
              case 1:
                  System.out.println("one");
                  break ;
              case 2:
                  System.out.println("two");
                  break ;
              case 3:
                  System.out.println("three");
              case 4 :
                  System.out.println("four");
                  break;
              case 5:
                  System.out.println("five");
                  break;
              case 6 :
                      System.out.println("six");
                      break;
              case 7:
                  System.out.println("seven");
                  break;
              case 8:
                  System.out.println("eight");
                  break;
              case 9:
                  System.out.println("nine");
                  break;
              default :
                 System.out.println("out of area ");
                  
                        
          }
        
        
    }
    
}
