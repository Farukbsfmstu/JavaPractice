
package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class StrontioNumber {
    
   public static void main(String args[]){
       while(true){
       int num,mod,div1,div2,mod2,mul,mod3;
       System.out.println("Enter minimum four digit number: ");
       Scanner input=new Scanner (System.in);
       num=input.nextInt();
       if(num>999) {
       mul=num * 2 ;
       mod=mul % 1000;
       div1 =mod / 10 ;
       div2 =div1 / 10 ;
       mod3 =div1 % 10 ;
       
       if(mod3 == div2 ){
          System.out.println("Yes, the number is Stronio");
       }
       else{
           System.out.println("Sorry,not a stronio number");
       }
   }
       else{
       System.out.println("You Must entire four digit's ");
}        }
}
}