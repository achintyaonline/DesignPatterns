package singleton;

import java.util.concurrent.CompletableFuture;

public class TestSingleton {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton1.hashCode());

        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton2.hashCode());
        System.out.println("--------------------------------------------");
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println(lazySingleton1.hashCode());

        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton2.hashCode());

        System.out.println("--------------------------------------------");
        ThreadSafeLazySingleton threadSafeLazySingleton3 = ThreadSafeLazySingleton.getInstance();
        ThreadSafeLazySingleton threadSafeLazySingleton4 = ThreadSafeLazySingleton.getInstance();
        System.out.println(threadSafeLazySingleton3.hashCode());
        System.out.println(threadSafeLazySingleton4.hashCode());

        System.out.println("--------------------------------------------");
        LazyInnerClassSingleton lazyInnerClassSingleton1 = LazyInnerClassSingleton.getInstance();
        LazyInnerClassSingleton lazyInnerClassSingleton2 = LazyInnerClassSingleton.getInstance();
        System.out.println(lazyInnerClassSingleton1.hashCode());
        System.out.println(lazyInnerClassSingleton2.hashCode());

        System.out.println("--------------------------------------------");
        PureSingleton singleton1 = PureSingleton.getInstance();
        PureSingleton singleton2 = PureSingleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

    }

}
