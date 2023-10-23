package gothaer.math;

public class CalculatorFactory {

    private static boolean logger = true;
    private static boolean secure = true;

    public static boolean isLogger() {
        return logger;
    }

    public static void setLogger(final boolean logger) {
        CalculatorFactory.logger = logger;
    }

    public static boolean isSecure() {
        return secure;
    }

    public static void setSecure(final boolean secure) {
        CalculatorFactory.secure = secure;
    }

    public static Calculator createInstance() {
        Calculator calculator = new CalculatorImpl(); // 1000
        if(logger) calculator = new CalculatorLogger(calculator);// 2000
        if(secure) calculator = new CalculatorSecure(calculator) ; // 3000
        return calculator;
    }
}
