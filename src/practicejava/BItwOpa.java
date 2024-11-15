
package practicejava;

/**
 *
 * @author Faruk Ahmad
 */
public class BItwOpa {
    public static void main(String[] args){
        
        int s=63 ,m=40 ,f,d ,p, k,r;
        
        f=s&m;
        d=s^m;
        p=s|m;
        
        k=m>>3;
        r=s<<3;
        
      System.out.println("and bitwise between:"+f);
      System.out.println("xor bitwise between:"+d);
      System.out.println("or biteise between:"+p);
      System.out.println("m>>3="+k);
      System.out.println("s<<="+r);
        
        
    }
    
}
