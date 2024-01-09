package singleton;

public class EagerInitializationDBConnection {
    private static final EagerInitializationDBConnection instance = new EagerInitializationDBConnection();

    private EagerInitializationDBConnection() {}

    public static EagerInitializationDBConnection getInstance() {

        return instance;
    }
}
//objects will be created at the time of class loading
//if the object is not a heavy object, then this is the best approach
//if the object is a heavy object, then this is not the best approach
//because the object will be created even if it is not used
//this is not a thread safe approach
