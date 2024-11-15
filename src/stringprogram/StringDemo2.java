
package stringprogram;

/**
 *
 * @author Faruk Ahmad
 */
public class StringDemo2 {
    public static void main(String[] args){
        
        String S="Faruk" ;
        String P="Ahmad" ;
        
        String add= S+P;
        System.out.println("Addition S and P string:"+add);
        
        String addition= S.concat(P);
        System.out.println("Addition of string A and P is:"+addition);
        
        String uppercase=add.toUpperCase();
        System.out.println("all uppercase= "+uppercase);
        
        String lowercase=add.toLowerCase();
        System.out.println("lowercase all= "+lowercase);
        
        boolean startwith= S.startsWith("F");
        System.out.println("Start S string's letter:"+startwith);
        
        boolean endwith=P.endsWith("af");
        System.out.println("end P string is= "+endwith) ;
        
        String[] name={"madina","macca","Bagdad","karbala"};
        for(String x : name)
        {
        System.out.println(x);
        } 
        
        
    }
    
}
