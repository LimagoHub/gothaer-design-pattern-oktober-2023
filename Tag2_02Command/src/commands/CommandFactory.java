package commands;

public class CommandFactory {

    public static Command create(String zeile) {
        Command result = null;
        String [] tokens = zeile.split(" ");
        switch (tokens[0]) {
            case "Add": result = new AddCommand();
            result.parse(tokens);
            break;
            case "Print":result = new PrintCommand();
                result.parse(tokens);
                break;
            default:
                System.out.println("Unbekannter Befehl");
        }
        return result;
    }
}
