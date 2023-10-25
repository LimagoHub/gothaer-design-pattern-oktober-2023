package de.composite.visitor;

import de.composite.Konto;
import de.composite.KontoGruppe;

public class PrintVisitor extends AbstractBankItemVistor{

    @Override
    public void visit(final Konto konto) {
        System.out.println(konto);
    }

    @Override
    public void visit(final KontoGruppe kontoGruppe) {
        System.out.println(kontoGruppe);
    }
}
