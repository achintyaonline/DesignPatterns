package singleton;

import java.io.Serializable;

public class PureSingleton implements Serializable {
    private static PureSingleton instance = null;

    private PureSingleton(){
        if(instance!=null){
            throw new IllegalStateException("Object cant be created as this is a singleton");
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Can not clone singleton Object");
    }

    protected Object readResolve(){
        return instance;
    }

    public static PureSingleton getInstance(){
        if(instance==null){
            synchronized (PureSingleton.class){
                if(instance==null){
                    instance = new PureSingleton();
                }
            }
        }
        return instance;
    }
}
