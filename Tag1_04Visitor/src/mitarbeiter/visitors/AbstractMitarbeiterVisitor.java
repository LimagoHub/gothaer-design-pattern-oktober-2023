package mitarbeiter.visitors;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public class AbstractMitarbeiterVisitor implements MitarbeiterVisitor{
    @Override
    public void visit(final Lohnempfaenger lohnempfaenger) {
        // Ok
    }

    @Override
    public void visit(final Gehaltsempfaenger gehaltsempfaenger) {
        // Ok
    }
}
