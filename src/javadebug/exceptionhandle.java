package javadebug;

/**
 *
 * @author Faruk Ahmad
 */
public class exceptionhandle {

    public static void main(String args[]) {
       try{
        int[] a=new int[4];
        a[5]=10;
       }catch(Exception e){
           System.out.println("Exception "+e);
       }
    }

}
