import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BaselineApp {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        String input = getInput();
    }

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String extractItem(String input) {
        return "book";
    }
}
