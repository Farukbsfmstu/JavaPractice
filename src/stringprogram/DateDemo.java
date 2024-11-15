package stringprogram;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Faruk Ahmad
 */
public class DateDemo {

    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);

        DateFormat f = new SimpleDateFormat("dd/MM/YY");
        String s = f.format(d);
        System.out.println("format date: " + s);

    }

}
