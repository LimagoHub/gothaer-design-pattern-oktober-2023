package de.composite;

import de.composite.visitor.BankItemVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KontoGruppe extends AbstractBankItem {

    private List<AbstractBankItem> children = new ArrayList<>();
    public KontoGruppe(final String label) {
        super(label);
    }


    @Override
    public List<AbstractBankItem> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void append(AbstractBankItem child) {
        child.setParent(this);
        children.add(child);
    }

    public void remove(AbstractBankItem child) {
        child.setParent(null);
        children.remove(child);
    }

    @Override
    public void accept(final BankItemVisitor visitor) {
        visitor.visit(this);
    }
}
