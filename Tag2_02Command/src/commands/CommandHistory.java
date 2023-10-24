package commands;

public class CommandHistory {

    public CommandHistory() {
    }

    public void addCommand(Command command) {
        if(command.isQuery()) return;
        // .. eigentlicher Code
    }

    public void undo() {
        System.out.println("can't undo");
    }

    public void redo() {
        System.out.println("can't redo");
    }
}
