package observer;

//Obeserverģʽ��������������ͬ��������¼��Ĵ���
public class ObserverTest {
	
	public static void main(String[] args) {
		Child c = new Child();
		c.addObserver(new Dad());
		c.addObserver(new Dog());
		c.addObserver(new Mum());
		c.wakeUp();
	} 

}
