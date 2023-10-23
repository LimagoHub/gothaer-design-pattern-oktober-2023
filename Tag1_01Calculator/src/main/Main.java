package main;

import gothaer.client.CalcClient;
import gothaer.math.*;

import java.time.Duration;
import java.time.Instant;


public class Main {
    public static void main(String[] args) throws Exception{

        var start = Instant.now();
        //... do something
        Thread.sleep(100);
        var end = Instant.now();
        var duration = Duration.between(start,end);
        System.out.println("Duration = " + duration.toMillis());

        CalculatorFactory.setSecure(false);
        new CalcClient(CalculatorFactory.createInstance()).go();
    }
}