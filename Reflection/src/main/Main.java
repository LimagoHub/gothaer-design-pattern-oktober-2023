package main;

import de.tiere.Schwein;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{

        Class clazz;

        // 1. Variante
        clazz = Schwein.class;

        // 2. Variante
        clazz = new Schwein().getClass();

        // 3. Variante
        clazz = Class.forName("de.tiere.Schwein");

        Method [] methods = clazz.getMethods();
        for(var method: methods) {
            System.out.println(method.getName());
        }

        System.out.println("----------------------");

        methods = clazz.getDeclaredMethods();
        for(var method: methods) {
            System.out.println(method.getName());
        }

        Object object = clazz.getConstructor().newInstance();
        System.out.println(object);

        var method = clazz.getMethod("futtern");
        method.invoke(object);

        System.out.println(object);

        method = clazz.getDeclaredMethod("setGewicht", int.class);
        method.setAccessible(true);
        method.invoke(object, -10);
        System.out.println(object);

    }
}