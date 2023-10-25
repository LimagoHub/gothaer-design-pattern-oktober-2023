package de.composite;

import java.util.Collections;
import java.util.List;

public abstract class AbstractBankItem {

    private AbstractBankItem parent = null;
    private String label;

    public AbstractBankItem(final String label) {
        this.label = label;
    }

    public AbstractBankItem getParent() {
        return parent;
    }

    public void setParent(final AbstractBankItem parent) {
        this.parent = parent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public List<AbstractBankItem> getChildren() {
        return Collections.emptyList();
    }


    public void print() {
        System.out.println(this);
        for(var child: getChildren()){
            child.print();
        }
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + "{");
        sb.append(" label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
