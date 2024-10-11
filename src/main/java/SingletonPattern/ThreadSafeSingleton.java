package SingletonPattern;

/**
 * 多线程安全的单例模式，体现在volatile 和synchronized关键字上
 * synchronized 只有一个线程可进入临界区
 * volatile 关键字 可以阻止 JVM的指令重排，new一个对象的代码是无法保证顺序性的，保证对象实例化过程的顺序性
 */
public class ThreadSafeSingleton {
    private static volatile Singleton instance = null;
    private ThreadSafeSingleton() {
    };
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
