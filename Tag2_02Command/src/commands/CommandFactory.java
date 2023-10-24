package commands;

import java.lang.reflect.InvocationTargetException;

public class CommandFactory {

    private final static String PREFIX = "commands.";
    private final static String SUFFIX = "Command";

    public static Command create(String zeile) {

        try {
            var tokens = zeile.split(" ");
            var result = (Command) Class.forName(PREFIX + tokens[0] + SUFFIX).getConstructor().newInstance();
            result.parse(tokens);
            return result;
         } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }

    }
}
