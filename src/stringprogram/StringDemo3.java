

package stringprogram;

/**
 *
 * @author Faruk Ahmad
 */
public class StringDemo3 {
    public static void main(String[] args){
        
        String value="   I want to going madina   " ;
        System.out.println(value);
        
        char ch=value.charAt(10);
        System.out.println("ten index charecter:"+ch);
        
        int val=value.codePointAt(1);
        System.out.println("value of code is: "+val);
        
        int pos =value.indexOf("ma") ;
        System.out.println("ma position: "+pos);
        
        pos=value.lastIndexOf("ng");
        System.out.println("last index of ng: "+pos);
        
        String trim=value.trim();
        System.out.println("trim of sentemce: "+trim);
    }
    
}
