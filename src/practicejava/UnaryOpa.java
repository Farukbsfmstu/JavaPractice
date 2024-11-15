/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

/**
 *
 * @author Faruk Ahmad
 */
public class UnaryOpa {
    public static void main(String[] args){
        
        int a=5 ,b;
        
       b= --a + a-- +a-- + --a + ++a + a-- + a++ ;
       System.out.println("Value of B is:"+b);
        
        
        
    }
    
}
