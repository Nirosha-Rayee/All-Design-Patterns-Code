package singleton;

public class DoubleCheckingDBConnection {
    private static  DoubleCheckingDBConnection instance = null;

    private DoubleCheckingDBConnection() {}
//T1,T2,T3,T4 ---TN
    public static DoubleCheckingDBConnection getInstance() {//T1
        if(instance == null) {
            synchronized (DoubleCheckingDBConnection.class) {
                if (instance == null) {
                    instance = new DoubleCheckingDBConnection();
                }
            }
        }
        return instance;
    }
}
//objects will be created only when it is required
//this is a thread safe approach in multithreaded environment
//if two threads are trying to access the same object at the same time, then only one object will be created
//it will take less time to create the object
// and will not affect the performance of the application
//this is the best approach
//this is the best approach in multithreaded environment
