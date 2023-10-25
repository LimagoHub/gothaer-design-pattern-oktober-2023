package de.processors;

public abstract class AbstractCounter implements FileHandler{

    protected int counter;
    @Override
    public void init() {
        counter = 0;
    }



    @Override
    public void close() {
        System.out.println(getClass().getSimpleName() + ": " + counter);
    }
}
