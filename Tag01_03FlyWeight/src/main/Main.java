package main;

import flyweight.AttributedCharacter;

public class Main {
    public static void main(String[] args) {

        var first = AttributedCharacter.getInstance('A', false);
        var second = AttributedCharacter.getInstance('B', false);
        var third = AttributedCharacter.getInstance('A', false);;

        System.out.println(first == second);
        System.out.println(first == third);


        System.out.println("Hello world!");
    }
}