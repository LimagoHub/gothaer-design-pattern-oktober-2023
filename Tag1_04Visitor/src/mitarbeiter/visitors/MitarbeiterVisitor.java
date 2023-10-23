package mitarbeiter.visitors;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public interface MitarbeiterVisitor {

    void visit(Lohnempfaenger lohnempfaenger);
    void visit(Gehaltsempfaenger gehaltsempfaenger);
}
