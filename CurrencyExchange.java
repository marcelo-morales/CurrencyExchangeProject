import java.sql.DriverManager;
import java.util.Currency;
import java.util.Scanner;

/*

this is the driver program
 */

//Spark will be used for the web application
import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}


public class CurrencyExchange {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Hello, what is your input currency?");
            String input_currency = scanner.nextLine();
            System.out.println("How much money do you want to convert?");
            int money_in = scanner.nextInt();

            if (money_in < 0) {
                throw new IllegalArgumentException("Cannot convert a negative amount of currency");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("What currency do you want to convert to?");
        String output_currency = scanner.nextLine();

        /*
        Connecting to the currency-exchange database
        Where do I find the JDBC URL?


        String url = "";
        String user = ;
        String password = ;
        Connection myConn = DriverManager.getConnection(url, user, password);
*/




    }
}

