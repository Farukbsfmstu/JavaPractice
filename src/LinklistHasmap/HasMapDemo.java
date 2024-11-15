package LinklistHasmap;

import java.util.HashMap;

/**
 *
 * @author Faruk Ahmad
 */
public class HasMapDemo {

    public static void main(String agrs[]) {

        HashMap<Integer, String> customer = new HashMap<Integer, String>();

        customer.put(101, "Madina");
        customer.put(102, "Macca");
        customer.put(103, "Karbala");

        System.out.println(customer.get(102));

    }

}
