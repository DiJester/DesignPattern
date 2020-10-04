package singleton;

/*枚举式单例
最完美的单例，不仅可以解决线程同步，还可以防止反序列化*/

public enum EnumSingleton {
    INSTANCE;
	public void m() {};
}
