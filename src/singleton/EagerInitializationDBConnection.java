package singleton;

public class EagerInitializationDBConnection {
    private static final EagerInitializationDBConnection instance = new EagerInitializationDBConnection();

    private EagerInitializationDBConnection() {}

    public static EagerInitializationDBConnection getInstance() {

        return instance;
    }
}
