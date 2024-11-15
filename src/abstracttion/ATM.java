package abstracttion;

import java.util.Scanner;

/**
 *
 * @author Faruk Ahmad
 */
public class ATM {

    public static void main(String args[]) {
        int ballence = 1000, choice, deposite, withdrow, password = 123, pin;
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome to Rocket");
            System.out.println("choose 1 For Deposite");
            System.out.println("choose 2 for Withdrow");
            System.out.println("choose 3 for cheak ballence");
            System.out.println("choose 4 for exit");

            choice = input.nextInt();
            switch (choice) {

                case 1:
                    System.out.print("Enter the money for deposite ");
                    deposite = input.nextInt();
                    ballence = ballence + deposite;
                    System.out.print("new ballence: " + ballence);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter your withdrow money: ");
                    withdrow = input.nextInt();

                    if (ballence >= withdrow) {
                        ballence = ballence - withdrow;
                        System.out.print("collect your money ");
                        System.out.println();
                    } else {
                        System.out.print("Insufficient your ballence");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter your pin: ");
                    pin = input.nextInt();
                    if (password == pin) {
                        System.out.print("Your ballence is: " + ballence);
                    } else {
                        System.out.print("Sorry your pin is not valid");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.exit(0);
            }
            System.out.println();
        }

    }

}
