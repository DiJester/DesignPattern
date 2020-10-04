package singleton;

/*DCL������Double Check Lock��
ʹ����˫���飬ȷ���������ɶ��ʵ������֤���̰߳�ȫ
ʹ��volatile����INSTANCEʵ����Ϊ�˽�ָֹ��������
������volatile���ڶ��̷߳���ʱ��������߳��õ���ʵ����
�ն�������⡣*/



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
