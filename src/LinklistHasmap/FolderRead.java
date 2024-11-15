package LinklistHasmap;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class FolderRead {

    public static void main(String args[]) {
      
        try{
       File file=new File("");
       Scanner input=new Scanner(file);
       
       while(input.hasNext()){
           String id=input.next();
           String name=input.next();
           System.out.println("id"+id);
          
       }
       
       input.close();
        }catch(Exception e){
            System.out.println("Exception"+e);
        }
        
    }

}
