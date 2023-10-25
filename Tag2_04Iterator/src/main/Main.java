package main;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var liste = List.of("eins","Zwei","drei","vier");

        for( var item: liste)
            System.out.println(item);

        liste.forEach(System.out::println);

        for(Iterator<String> it = liste.iterator();it.hasNext();)
            System.out.println(it.next());

    }
}