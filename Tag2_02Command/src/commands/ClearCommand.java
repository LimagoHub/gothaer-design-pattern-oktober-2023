package commands;

import math.Calculator;
import math.CalculatorMemento;

public class ClearCommand extends AbstractCommand{

    private CalculatorMemento memento;
    @Override
    public void execute() {
        memento = Calculator.getInstance().getMemento();
        Calculator.getInstance().clear();
    }

    @Override
    public void undo() {
        Calculator.getInstance().setMemento(memento);
    }

    @Override
    public boolean isQuery() {
        return false;
    }
}
