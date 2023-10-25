package de.composite.visitor;

import de.composite.Konto;

public class SaldenVisitor extends AbstractBankItemVistor{

    private double summe;


    public double getSumme() {
        return summe;
    }

    @Override
    public void init() {
       summe = 0;
    }

    @Override
    public void close() {
        System.out.println(this);
    }

    @Override
    public void visit(final Konto konto) {
        summe += konto.getSaldo();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SaldenVisitor{");
        sb.append("summe=").append(summe);
        sb.append('}');
        return sb.toString();
    }
}
