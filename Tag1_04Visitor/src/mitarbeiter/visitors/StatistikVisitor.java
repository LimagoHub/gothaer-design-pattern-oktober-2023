package mitarbeiter.visitors;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public class StatistikVisitor extends AbstractMitarbeiterVisitor{


    private int leCounter;
    private int geCounter;


    @Override
    public void init() {
        leCounter = 0;
        geCounter = 0;
    }

    @Override
    public void close() {
        System.out.println(toString());
    }

    public int getLeCounter() {
        return leCounter;
    }

    public int getGeCounter() {
        return geCounter;
    }

    public int getGesamtCounter() {
        return leCounter + geCounter;
    }

    @Override
    public void visit(final Lohnempfaenger lohnempfaenger) {
        leCounter ++;
    }

    @Override
    public void visit(final Gehaltsempfaenger gehaltsempfaenger) {
        geCounter ++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatistikVisitor{");
        sb.append("leCounter=").append(leCounter);
        sb.append(", geCounter=").append(geCounter);
        sb.append(", gesamtCounter=").append(getGesamtCounter());
        sb.append('}');
        return sb.toString();
    }
}
