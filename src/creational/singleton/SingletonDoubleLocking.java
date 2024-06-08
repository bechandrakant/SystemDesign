package creational.singleton;

public class SingletonDoubleLocking {
    private SingletonDoubleLocking() {
    }

    private static SingletonDoubleLocking instance;

    public static SingletonDoubleLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleLocking.class) {
                if (instance == null) {
                    instance = new SingletonDoubleLocking();
                }
            }
        }
        return instance;
    }
}
