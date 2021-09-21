import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        String welcome = ("Hallo dear user, i hope you will be happy converting your money intp crypto with us.");
        String firstnametext = ("First i would like to get your first name.");

        System.out.println(welcome + "\r\n" + firstnametext); //  /r/n virker kun på windows os, skulle bruge /n for linux og mac os.
        String firstname = scanner.nextLine();
        System.out.println("Thank you, and now your last name please");
        String lastname = scanner.nextLine();
        System.out.println("Thank you " + firstname + " " + lastname + ", I got this random letter from your name");

        int namelength = firstname.length() - 1;
        int random = rand.nextInt(namelength);
        System.out.println(firstname.charAt(random));
        System.out.println("Please type the amount of dkk you wanna convert to bitcoin");

        while (true) {
            String amount = scanner.nextLine();
            try {
                Integer.parseInt(amount);
                System.out.println("Wow, " + amount + ", that is is some money alright");
                System.out.println("Here is how much bitcoin you can get for " + amount);
                double conversion = 0.0000032 * Integer.parseInt(amount);
                System.out.format("%.6f", conversion);
                break;
            } catch (NumberFormatException e) {
                System.out.println(amount + " is not a number please try again");
            }
        }
        /*
        while (true) {
            try {
                int amount = scanner.nextInt();
                //Integer.parseInt(amount);
                System.out.println("Wow, " + amount + ", that is is some money alright");
                System.out.println("Here is how much bitcoin you can get for " + amount);
                double conversion = 0.0000032 * amount;
                System.out.format("%.6f", conversion);
            } catch (InputMismatchException e) {
                System.out.println("please try again");
                scanner.next();
            }
            }
         */

    }



/*
        public static void String (String amount) {
            int WhileCheck = 1;
            while (WhileCheck > 2) {
                if (isNumber(amount)) {
                    System.out.println("Wow, " + amount + ", that is is some money alright");
                    System.out.println("Here is how much bitcoin you can get for " + amount);
                    WhileCheck++;
                    //double conversion = 0.0000032 * amount;
                    //System.out.format("%.6f", conversion);
                } else
                    System.out.println("Please type a number");
            }
        }

 */
/*
    static boolean isNumber(String amount) {
        for (int i = 0; i < amount.length(); i++)
            if (!Character.isDigit(amount.charAt(i)))
                return false;

        return true;
    }

 */

    /*
    public static boolean CheckBitcoinAmount(int amount){
        try {
            Integer.parseInt(String.valueOf(amount));
            return true;
        } catch (NumberFormatException e) {
        System.out.println("That is not a number");
            return false;
        }
    }


     */
}

