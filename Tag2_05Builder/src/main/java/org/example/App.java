package org.example;

import java.awt.*;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var johns = List.of(
                Person.builder().nachname("Rambo").build(),
                Person.builder().nachname("McClain").build(),
                Person.builder().nachname("Wayne").build(),
                Person.builder().nachname("Wick").build()
) ;
        johns.forEach(System.out::println);


    }
}
