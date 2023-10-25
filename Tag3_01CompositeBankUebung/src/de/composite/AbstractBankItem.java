package de.composite;

import de.composite.visitor.BankItemVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractBankItem implements Iterable<AbstractBankItem>{

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

//        Iterator<AbstractBankItem> it = this.iterator();
//        while(it.hasNext())
//            System.out.println(it.next());
//
//        this.iterator().forEachRemaining(System.out::println);
//
//        for(var item: this){
//            System.out.println(item);
//        }

        this.forEach(System.out::println);


//        System.out.println(this);
//        for(var child: getChildren()){
//            child.print();
//        }
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + "{");
        sb.append(" label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void iterate(BankItemVisitor visitor) {
        visitor.init();
        forEach(k->k.accept(visitor));
        visitor.close();
    }

    @Override
    public Iterator<AbstractBankItem> iterator() {
        final List<AbstractBankItem> items = new ArrayList<>();
        iteratorImpl(items);
        return items.iterator();
    }

    private void iteratorImpl(final List<AbstractBankItem> itemsToBeFilled){
        itemsToBeFilled.add(this);
        getChildren().forEach(child->{child.iteratorImpl(itemsToBeFilled);});
    }

    public abstract void accept(BankItemVisitor visitor) ;
}
