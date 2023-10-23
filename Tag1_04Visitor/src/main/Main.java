package main;

import firma.Firma;
import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;
import mitarbeiter.visitors.PrintVisitor;
import mitarbeiter.visitors.ResetArbeitszeitVisitor;
import mitarbeiter.visitors.StatistikVisitor;

public class Main {
    public static void main(String[] args) {

        Firma firma = new Firma();
        firma.add(new Gehaltsempfaenger("Schmitt", 1000));
        firma.add(new Lohnempfaenger("Hinz", 20, 10));
        firma.add(new Lohnempfaenger("Kunz", 15, 10));
        firma.add(new Gehaltsempfaenger("Mueller", 2000));
        firma.add(new Gehaltsempfaenger("Mayer", 3000));

        //firma.print();

        firma.iterate(new PrintVisitor());
        firma.iterate(new ResetArbeitszeitVisitor());
        firma.iterate(new PrintVisitor());

        firma.iterate(new StatistikVisitor());

    }
}