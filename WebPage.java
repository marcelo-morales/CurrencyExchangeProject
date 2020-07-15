import static spark.Spark.*;


public class WebPage {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}

