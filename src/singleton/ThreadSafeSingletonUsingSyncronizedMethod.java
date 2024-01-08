package singleton;

public class ThreadSafeSingletonUsingSyncronizedMethod {
    private static ThreadSafeSingletonUsingSyncronizedMethod instance = null;

    private ThreadSafeSingletonUsingSyncronizedMethod() {}

    public static synchronized ThreadSafeSingletonUsingSyncronizedMethod getInstance() {
        if(instance == null) {
            instance = new ThreadSafeSingletonUsingSyncronizedMethod();
        }
        return instance;
    }
}
