package main;

import gothaer.client.CalcClient;
import gothaer.math.*;


public class Main {
    public static void main(String[] args) {


        CalculatorFactory.setSecure(false);
        new CalcClient(CalculatorFactory.createInstance()).go();
    }
}