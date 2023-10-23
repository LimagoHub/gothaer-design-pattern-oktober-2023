package singleton;

import java.lang.ref.WeakReference;

public class Singleton {

    private static WeakReference<Singleton> instance = new WeakReference<>(new Singleton());

    public  static Singleton getInstance() {
        if(instance.get() == null)
            instance = new WeakReference<>(new Singleton());
        return instance.get();
    }

    private Singleton() {

    }

    public void log(String message) {
        System.out.println(message);
    }
}
