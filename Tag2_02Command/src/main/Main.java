package main;

import commands.Command;
import commands.CommandFactory;
import commands.CommandHistory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final CommandHistory history = new CommandHistory();

        while(true) {
            System.out.print("#>");
            String zeile = scanner.nextLine();
            if("ende".equals(zeile)) break;
            if("undo".equals(zeile)) {
                history.undo();
                continue;
            }
            if("redo".equals(zeile)) {
                history.redo();
                continue;
            }

            Command command = CommandFactory.create(zeile);
            if(command == null) continue;
            command.execute();
            history.addCommand(command);
        }
    }
}