package commands;

public abstract class AbstractCommand implements Command{
    @Override
    public void parse(final String[] tokens) {
        // Ok
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Undo nicht moeglich!");
    }

    @Override
    public boolean isQuery() {
        return true;
    }
}
