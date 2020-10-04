package singleton;

/*��̬�ڲ���ʽ����
JVM��֤����
�����ⲿ��ʱ��������ڲ��࣬��������ʵ��������
�����ĵ���֮һ*/


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
