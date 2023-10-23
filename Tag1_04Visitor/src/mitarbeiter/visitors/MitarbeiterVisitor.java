package mitarbeiter.visitors;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public interface MitarbeiterVisitor extends AutoCloseable {

    void init();

    void visit(Lohnempfaenger lohnempfaenger);
    void visit(Gehaltsempfaenger gehaltsempfaenger);

    @Override
    void close() ;
}
