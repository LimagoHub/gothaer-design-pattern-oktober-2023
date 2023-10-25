package main;

import de.composite.AbstractBankItem;
import de.composite.Konto;
import de.composite.KontoGruppe;
import de.composite.visitor.PrintVisitor;
import de.composite.visitor.SaldenVisitor;

public class Main {
    public static void main(String[] args) {

        KontoGruppe root = new KontoGruppe("root");

        KontoGruppe e1 = new KontoGruppe("E1");
        root.append(e1);

        KontoGruppe e2 = new KontoGruppe("E2");
        root.append(e2);

        KontoGruppe e1_1 = new KontoGruppe("E1_1");
        e1.append(e1_1);

        Konto l1_2 = new Konto("L1_2");
        l1_2.setSaldo(10);
        e1.append(l1_2);

        Konto l1_3 = new Konto("L1_3");
        l1_3.setSaldo(100);
        e1.append(l1_3);

        //root.print();


//        for(var item : root){
//            System.out.println(item);
//        }

        root.iterate(new PrintVisitor());
        e2.iterate(new SaldenVisitor());

    }


}