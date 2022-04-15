package singleton;

public class ThreadSafeLazySingleton {

    private ThreadSafeLazySingleton(){};

    private static ThreadSafeLazySingleton instance = null;

    public static ThreadSafeLazySingleton getInstance(){
        if(instance==null){
            synchronized (ThreadSafeLazySingleton.class){
                if(instance==null){
                    instance = new ThreadSafeLazySingleton();
                }
            }
        }
        return instance;
    }
}
