package stringprogram;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class vowelconconent {

    public static void main(String args[]) {

        int count = 0, con = 0;
        String i;

        System.out.print("Enter the string: ");
        Scanner input = new Scanner(System.in);
        i = input.nextLine();

        System.out.println("string =" + i);

        for (int j = 0; j < i.length(); j++) {
            if (i.charAt(j) == 'A' || i.charAt(j) == 'E' || i.charAt(j) == 'I' || i.charAt(j) == 'O' || i.charAt(j) == 'U'
                    || i.charAt(j) == 'a' || i.charAt(j) == 'e' || i.charAt(j) == 'i' || i.charAt(j) == 'o' || i.charAt(j) == 'u') {
                count++;
            } else if (i.charAt(j) >= 'A' && i.charAt(j) <= 'Z' || i.charAt(j) >= 'a' && i.charAt(j) <= 'z') {
                con++;
            } else {
                System.out.println("NOT a charater");
            }
        }
        System.out.println("Total vowel =" + count); 
        System.out.println("Total conconent =" + con);
    }

}
