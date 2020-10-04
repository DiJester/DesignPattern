package singleton;

/*静态内部类式单例
JVM保证单例
加载外部类时不会加载内部类，这样可以实现懒加载
完美的单例之一*/


public class StaticInnerClassSingleton {

	private StaticInnerClassSingleton() {};
	
	static class SingletonHolder{
		private static final StaticInnerClassSingleton INSTANCE = 
				new StaticInnerClassSingleton();
	};
	public static StaticInnerClassSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	};
	
	public void m() {};
}
