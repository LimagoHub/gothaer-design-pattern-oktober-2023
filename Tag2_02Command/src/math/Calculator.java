package math;
public class Calculator {

    private final static Calculator INSTANCE = new Calculator();

    public static Calculator getInstance() {
        return INSTANCE;
    }

    private double memory;

    private Calculator() {
        memory = 0.0;
    }


    public void add(double value) {
        memory += value;
    }
    public void sub(double value) {
        memory -= value;
    }
    public void mult(double value) {
        memory *= value;
    }
    public void div(double value) {
        memory /= value;
    }
    public void print() {
        System.out.println(memory);
    }
    public void clear() {
        memory = 0;
    }
}
