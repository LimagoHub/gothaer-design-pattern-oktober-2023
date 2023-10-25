package main;

import de.composite.AbstractNode;
import de.composite.Leaf;
import de.composite.Node;

public class Main {
    public static void main(String[] args) {

        Node root = new Node("root");

        Node e1 = new Node("E1");
        root.append(e1);

        Node e2 = new Node("E2");
        root.append(e2);

        Node e1_1 = new Node("E1_1");
        e1.append(e1_1);

        Leaf l1_2 = new Leaf("L1_2");
        e1.append(l1_2);

        Leaf l1_3 = new Leaf("L1_3");
        e1.append(l1_3);

        travers(root);


    }

    static void travers(AbstractNode node) {
        System.out.println(node);
        for(var child: node.getChildren()) {
            travers(child);
        }
    }
}