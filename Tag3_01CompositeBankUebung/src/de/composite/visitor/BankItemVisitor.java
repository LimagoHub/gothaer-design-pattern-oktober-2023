package de.composite.visitor;

import de.composite.Konto;
import de.composite.KontoGruppe;

public interface BankItemVisitor {

    void init();
    void close();

    void visit(Konto konto);
    void visit(KontoGruppe kontoGruppe);
}
