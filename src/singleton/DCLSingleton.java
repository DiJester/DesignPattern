package singleton;

/*DCL单例（Double Check Lock）
使用了双层检查，确保不会生成多个实例，保证了线程安全
使用volatile修饰INSTANCE实例是为了禁止指令重排序
若不加volatile，在多线程访问时，会产生线程拿到的实例是
空对象的问题。*/



public class DCLSingleton {
	
	private static volatile DCLSingleton INSTANCE;
	
	private DCLSingleton() {};
	
	public static DCLSingleton getInstance() {
		if(INSTANCE==null) {
			synchronized(DCLSingleton.class) {
				if(INSTANCE==null) {
					INSTANCE =new DCLSingleton();
				}
			}
		}
		return INSTANCE;
	};
	
	public void m() {};
	
	

}
