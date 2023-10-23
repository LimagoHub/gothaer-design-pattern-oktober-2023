package mitarbeiter.visitors;

import mitarbeiter.AbstractMitarbeiter;
import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public class ResetArbeitszeitVisitor extends AbstractMitarbeiterVisitor {


    @Override
    public void visit(final Lohnempfaenger lohnempfaenger) {
        lohnempfaenger.setArbeitszeit(0);
    }

}
