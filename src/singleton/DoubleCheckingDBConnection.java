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
