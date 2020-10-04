package singleton;

/*饿汉式单例
类加载到内存后，就实例化一个对象，JVM保证线程安全
简单实用，推荐使用
唯一确定，不管使用与否，类加载时就完成实例化*/


public class EagerSingleton {

	private static final EagerSingleton INSTANCE= new EagerSingleton();
	
	private EagerSingleton() {};
	
	public static EagerSingleton getInstance() {
		return INSTANCE;
	};
	public void m() {};
}
