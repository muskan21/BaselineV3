//Parses The Input To Return Item Object
public class Parser {
    String input;

    public Parser(String input) {
        this.input = input;
    }

    public String extractItem() {
        String[] inputDetails = tokenise();
        int i;
        String name = "";
        for(i = 0; i < inputDetails.length-2; i++) {
            name = name+inputDetails[i]+" ";
        }
        return name;
    }

    public String[] tokenise() {
        return input.split(" ");
    }


    public double extractPrice() {
        String[] inputDetails = tokenise();
        int index = inputDetails.length - 1;
        return Double.parseDouble(inputDetails[index]);
    }

    public boolean isExemptedItem(String itemName) {
        if(itemName.contains("book") || itemName.contains("hocolate") || itemName.contains("ill"))
            return true;
        return false;
    }

    public boolean isImportedItem() {
        if(input.contains("mported"))
            return true;
        return false;
    }
}
