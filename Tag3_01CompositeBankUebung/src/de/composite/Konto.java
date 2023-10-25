package de.composite;

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
}
