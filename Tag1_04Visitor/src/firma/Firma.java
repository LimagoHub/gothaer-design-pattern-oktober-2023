package firma;

import mitarbeiter.AbstractMitarbeiter;
import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;
import mitarbeiter.visitors.MitarbeiterVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Firma {

    private List<AbstractMitarbeiter> mitarbeiters = new ArrayList<>();

    public boolean add(final AbstractMitarbeiter abstractMitarbeiter) {
        return mitarbeiters.add(abstractMitarbeiter);
    }

    public boolean remove(final AbstractMitarbeiter abstractMitarbeiter) {
        return mitarbeiters.remove(abstractMitarbeiter);
    }

    public void print() {
        mitarbeiters.forEach(c->System.out.println(c));
    }

    public void iterate(MitarbeiterVisitor visitor) {

        try(visitor) {
            visitor.init();
            mitarbeiters.forEach(m -> m.accept(visitor));
        }
    }
}
