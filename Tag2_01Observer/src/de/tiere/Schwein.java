package de.tiere;

import de.events.PropertyChangedEvent;
import de.events.PropertyChangedListener;

import java.util.ArrayList;
import java.util.List;

/*
    1. Event (PropertyChangedEvent) Immutable Object source, name , oldValue, newValue
    2. PropertyChangedListener
    3. Im Schwein verbauen
 */


public class Schwein {

    private final List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();
    private final List<PropertyChangedListener> propertyChangedListeners = new ArrayList<>();

    public void addPigTooFatListener(final PigTooFatListener listener) {
        pigTooFatListeners.add(listener);
    }
    public void removePigTooFatListener(final PigTooFatListener listener) {
        pigTooFatListeners.remove(listener);
    }

    public void addPropertyChangedListener(PropertyChangedListener listener) {
        propertyChangedListeners.add(listener);
    }

    public void removePropertyChangedListener(PropertyChangedListener listener) {
        propertyChangedListeners.remove(listener);
    }

    private void firePigTooFatEvent() {
        pigTooFatListeners.forEach(listener -> listener.pigTooFat(this));
    }

    private void firePropertyChangedEvent(PropertyChangedEvent event) {
        propertyChangedListeners.forEach(listener -> listener.propertyChanged(event));
    }

    private void firePropertyChangedEvent(String propertyName, Object oldValue, Object newValue) {
        firePropertyChangedEvent(new PropertyChangedEvent(this, propertyName, oldValue, newValue));
    }




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
        if(name == this.name) return;
        PropertyChangedEvent event = new PropertyChangedEvent(this, "name", this.name, name);
        //firePropertyChangedEvent("name", this.name, this.name = name);
        this.name =name;
        firePropertyChangedEvent(event);
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        firePropertyChangedEvent("gewicht", this.gewicht, this.gewicht = gewicht);
        if(this.gewicht > 20) firePigTooFatEvent();
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
