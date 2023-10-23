package statuspattern;

public abstract class AbstractState implements State{

    private final Front front;

    public AbstractState(final Front front) {
        this.front = front;
    }

    public final Front getFront() {
        return front;
    }

    @Override
    public void drucken() {
        throw new  UnsupportedOperationException("Diese Methode macht hier keinen Sinn");
    }

    @Override
    public void changeToA() {
        throw new  UnsupportedOperationException("Diese Methode macht hier keinen Sinn");
    }

    @Override
    public void changeToB() {
        throw new  UnsupportedOperationException("Diese Methode macht hier keinen Sinn");
    }
}
