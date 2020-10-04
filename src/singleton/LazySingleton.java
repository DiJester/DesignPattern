package singleton;

/*懒汉式单例（Lazy Singleton）
采用Synchronized解决了线程同步问题
但是锁的粒度太大，无论是否需要创建
实例都加锁，效率低*/

public class LazySingleton {
	private static volatile LazySingleton INSTANCE;
	
	private LazySingleton() {};
	
	public static synchronized LazySingleton getInstance() {
				if(INSTANCE==null) {
					INSTANCE =new LazySingleton();
				}
		return INSTANCE;
	};
	
	public void m() {};
	
	
}
