package de.composite.visitor;

import de.composite.Konto;
import de.composite.KontoGruppe;

public abstract class AbstractBankItemVistor implements BankItemVisitor{
    @Override
    public void init() {
        // Ok
    }

    @Override
    public void close() {
        // Ok
    }

    @Override
    public void visit(final Konto konto) {
        // Ok
    }

    @Override
    public void visit(final KontoGruppe kontoGruppe) {
        // Ok
    }
}
