
package javapractice;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class prime {
    public static void main(String args[]){
       int a,b,c,d ,count=0,totalprime=0;
       Scanner input=new Scanner(System.in);
       System.out.println("Enter initial number: ");
       a=input.nextInt();
       
       System.out.println("Enter final number: ");
       b=input.nextInt();
       
       for(c=a;c<=b;c++){
        for(d=2;d<c-1;d++){
            
            if(c%d==0){
                count++;
                break ;
            }
          
        }
        if(count==0){
           System.out.println(c);
           totalprime++ ;
        }
           count=0 ;
       }
       System.out.println("totalprime "+totalprime);
       } 
       
    }
    

