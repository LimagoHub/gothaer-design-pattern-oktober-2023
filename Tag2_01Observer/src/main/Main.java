package main;

import de.events.PropertyChangedEvent;
import de.events.PropertyChangedListener;
import de.tiere.PigTooFatListener;
import de.tiere.Schwein;

public class Main  {
    public static void main(String[] args) {

       new Main().run();
    }

    private Metzger metzger = new Metzger();
    private Spediteur spediteur = new Spediteur();

//    private PropertyChangedListener propertyChangedListener = new PropertyChangedListener() {
//        @Override
//        public void propertyChanged(final PropertyChangedEvent event) {
//
//            ausgabe(event);
//        }
//    };

    private void ausgabe(Object object) {
        System.out.println(object);
    }

    private void run() {
        Schwein piggy = new Schwein ("Miss Piggy");
        piggy.addPigTooFatListener(new SchweineMetzgerAdapter());
        piggy.addPigTooFatListener(s->spediteur.fahren(s));
        piggy.addPigTooFatListener(spediteur::fahren);
        piggy.addPropertyChangedListener(this::ausgabe);
        for (int i = 0; i < 11; i++) {
            piggy.futtern();
        }
    }

    class SchweineMetzgerAdapter implements PigTooFatListener {

        @Override
        public void pigTooFat(final Schwein schwein) {
            metzger.schlachten(schwein);
        }
    }
}

class Metzger  {


    public void schlachten(final Object tier) {
        System.out.println("Messer wetz!");
    }
}

class Spediteur {


    public void fahren(final Object ware) {
        System.out.println("Wir fahren auf der Autobahn");
    }
}