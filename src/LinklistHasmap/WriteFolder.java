
package LinklistHasmap;

import java.util.Formatter;

/**
 *
 * @author Faruk Ahmad
 */
public class WriteFolder {
    public static void main(String args[]){
      
        try{
        Formatter input=new Formatter("C:/Users/Faruk Ahmad/Desktop/Faruk");
        input.format("%s %s /r/n",101,"Plus");
        input.format("%s %s /r/n",1111,"Spring ");
        
        }catch(Exception e){
            System.out.println("Exception"+e);
        } 
    }
    
}
