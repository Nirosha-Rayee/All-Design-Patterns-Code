package singleton;

public class LazyInitializationDBConnection {
    private static LazyInitializationDBConnection instance = null;

    private LazyInitializationDBConnection() {}

    public static LazyInitializationDBConnection getInstance() {
        if(instance == null) {
            instance = new LazyInitializationDBConnection();
        }
        return instance;
    }
}
