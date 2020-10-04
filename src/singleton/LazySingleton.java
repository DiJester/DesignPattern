package singleton;

/*����ʽ������Lazy Singleton��
����Synchronized������߳�ͬ������
������������̫�������Ƿ���Ҫ����
ʵ����������Ч�ʵ�*/

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
