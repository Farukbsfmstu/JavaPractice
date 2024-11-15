
package javapractice;

import java.util.Random;

/**
 *
 * @author Faruk Ahmad
 */
public class Ramdom {
    public static void main(String args[]){
       
        System.out.println(" random number 1 "+Math.random()) ;
        System.out.println(" random number 2 "+Math.random()) ;
        System.out.println(" random number 3 "+Math.random()) ;
        System.out.println(" random number 4 "+Math.random()) ;
        System.out.println(" random number 5 "+Math.random()) ;
        System.out.println(" random number 6 "+Math.random()) ;
        //According to method 
         Random random=new Random() ; 
        int x= random.nextInt(10) ;
        int y = random.nextInt(10) ;
        System.out.println(" integer  random number "+x);
        System.out.println(" integer  random number "+y);
        
        double a= random.nextDouble(); 
        double b =random.nextDouble();
        System.out.println("double random number "+a);
        System.out.println("double random number "+b);   
        
        long c =random.nextLong() ;
        long d =random.nextLong() ;
        System.out.println(" long random number "+c) ;
        System.out.println(" long random number "+d);
        
        boolean f =random.nextBoolean();
        boolean l =random.nextBoolean() ;
        System.out.println("boolean random "+f);
        System.out.println("boolean random "+l);
    }
    
}
