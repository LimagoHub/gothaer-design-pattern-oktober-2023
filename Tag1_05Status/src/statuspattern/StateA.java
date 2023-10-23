package statuspattern;

public class StateA extends AbstractState{
    public StateA(final Front front) {
        super(front);
    }

    @Override
    public void drucken() {
        System.out.println("Hier druckt A");
    }

    @Override
    public void changeToB() {
        getFront().current = getFront().stateB;
    }
}
