package main;

import commands.Command;
import commands.CommandFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("#>");
            String zeile = scanner.nextLine();
            if("ende".equals(zeile)) break;
            Command command = CommandFactory.create(zeile);
            if(command == null) continue;
            command.execute();
        }
    }
}