package commands;

import math.Calculator;

public class ClearCommand extends AbstractCommand{

    private double oldvalue;
    @Override
    public void execute() {
        oldvalue = Calculator.getInstance().getMemory();
        Calculator.getInstance().clear();
    }

    @Override
    public void undo() {
        Calculator.getInstance().setMemory(oldvalue);
    }

    @Override
    public boolean isQuery() {
        return false;
    }
}
