package commands;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandHistory {

    private Deque<Command> undos = new ArrayDeque<>();
    private Deque<Command> redos = new ArrayDeque<>();

    public CommandHistory() {
    }

    public void addCommand(Command command) {
        if(command.isQuery()) return;
        redos.clear();
        undos.push(command);
    }

    public void undo() {
        if(undos.isEmpty())
            System.out.println("can't undo");
        else {
            Command command = undos.pop();
            command.undo();
            redos.push(command);
        }

    }

    public void redo() {
        if(redos.isEmpty())
            System.out.println("can't redo");
        else {
            Command command = redos.pop();
            command.execute();
            undos.push(command);
        }
    }
}
