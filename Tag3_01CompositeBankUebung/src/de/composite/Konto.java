package de.composite;

import de.composite.visitor.BankItemVisitor;

public class Konto extends AbstractBankItem {

    private double saldo;
    public Konto(final String label) {
        super(label);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(final double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void accept(final BankItemVisitor visitor) {
        visitor.visit(this);
    }
}
