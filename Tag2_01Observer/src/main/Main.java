package main;

import de.tiere.PigTooFatListener;
import de.tiere.Schwein;

public class Main {
    public static void main(String[] args) {

       new Main().run();
    }

    private Metzger metzger = new Metzger();
    private Spediteur spediteur = new Spediteur();

    private void run() {
        Schwein piggy = new Schwein ("Miss Piggy");
        piggy.addPigTooFatListener(new SchweineMetzgerAdapter());
        piggy.addPigTooFatListener(s->spediteur.fahren(s));
        piggy.addPigTooFatListener(spediteur::fahren);
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