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
//objects will be created only when it is required
//this is a thread safe approach in single threaded environment
//if two threads are trying to access the same object at the same time, then two objects will be created
//this is not a thread safe approach in multithreaded environment




