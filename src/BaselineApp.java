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
        String[] inputDetails = tokenise(input);
        int i;
        String name = "";
        for(i = 1; i < inputDetails.length-2; i++) {
            name = name+inputDetails[i]+" ";
        }
        return name;
    }

    public double extractPrice(String input) {
        String[] inputDetails = tokenise(input);
        int index = inputDetails.length - 1;
        return Double.parseDouble(inputDetails[index]);
    }

    public String[] tokenise(String input) {
        return input.split(" ");
    }

    public boolean isExemptedItem(String itemName) {
        if(itemName.contains("usic") || itemName.contains("erfume"))
            return false;
        return true;
    }
}
