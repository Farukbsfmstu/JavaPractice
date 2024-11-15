package LinklistHasmap;

import java.util.LinkedList;

/**
 *
 * @author Faruk Ahmad
 */
public class Linklist2 {

    public static void main(String args[]) {

        LinkedList<String> country = new LinkedList<>();

        country.add("Faruk Ahmad");
        country.add("Faisal chircut");
        country.add("Ganja Setu");
        country.add("PC Faruk");
        country.add("M Item");
        country.addFirst("Telcura");
        country.removeFirst();
        

        for (String countrylist : country) {
            System.out.println(countrylist);
        }
    }

}
