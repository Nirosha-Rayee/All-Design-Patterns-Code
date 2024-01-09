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
//objects will be created only when it is required
//this is a thread safe approach in multithreaded environment
//if two threads are trying to access the same object at the same time, then only one object will be created
//it will take more time to create the object
// and affect the performance of the application

