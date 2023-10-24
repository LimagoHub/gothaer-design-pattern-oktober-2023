package de.tiere;



/*
    1. Event (PropertyChangedEvent) Immutable Object source, name , oldValue, newValue
    2. PropertyChangedListener
    3. Im Schwein verbauen
 */


public class Schwein {





    private String name;
    private int gewicht;


    public Schwein() {
        this("nobody");
    }

    public Schwein(final String name) {
        this.name = name;
        this.gewicht = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {

        this.name =name;

    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
       this.gewicht = gewicht;
    }

    public void futtern() {
        setGewicht(getGewicht() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }
}
