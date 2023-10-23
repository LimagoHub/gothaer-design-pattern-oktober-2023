package gothaer.math;

public class CalculatorImpl implements Calculator {

    /* default */ CalculatorImpl() {
    }

    @Override
    public double add(double a, double b) {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return this.add(a, -b);
    }
}
