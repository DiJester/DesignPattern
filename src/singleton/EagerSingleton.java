package singleton;

/*����ʽ����
����ص��ڴ�󣬾�ʵ����һ������JVM��֤�̰߳�ȫ
��ʵ�ã��Ƽ�ʹ��
Ψһȷ��������ʹ����������ʱ�����ʵ����*/


public class EagerSingleton {

	private static final EagerSingleton INSTANCE= new EagerSingleton();
	
	private EagerSingleton() {};
	
	public static EagerSingleton getInstance() {
		return INSTANCE;
	};
	public void m() {};
}
