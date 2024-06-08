package creational.singleton;

public class SingletonThreadSafe {
    private SingletonThreadSafe(){}

    private static SingletonThreadSafe instance;

    public static SingletonThreadSafe getInstance() {
        synchronized (SingletonThreadSafe.class) {
            if (instance == null) {
                instance = new SingletonThreadSafe();
            }
        }
        return instance;
    }
}
