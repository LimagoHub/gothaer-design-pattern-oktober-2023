package statuspattern;

public class StateB extends AbstractState {
    public StateB(final Front front) {
        super(front);
    }

    @Override
    public void drucken() {
        System.out.println("Hier druckt B");
    }

    @Override
    public void changeToA() {
        getFront().current = getFront().stateA;
    }
}
