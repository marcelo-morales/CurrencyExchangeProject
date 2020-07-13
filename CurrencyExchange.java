import java.sql.DriverManager;
import java.util.Currency;
import java.util.Scanner;


public class CurrencyExchange {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Hello, what is your input currency?");
        String input_currency = scanner.nextLine();
        System.out.println("How much money do you want to convert?");
        int money_in = scanner.nextInt();

        if (money_in < 0) {
            System.out.println("Error, wrong value");
        }

        System.out.println("What currency do you want to convert to?");
        String output_currency = scanner.nextLine();



        String url = "";
        String user = ;
        String password = ;
        Connection myConn = DriverManager.getConnection(url, user, password);




    }
}

