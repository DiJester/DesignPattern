package observer;

//Obeserver模式往往和责任链共同负责对于事件的处理
public class ObserverTest {
	
	public static void main(String[] args) {
		Child c = new Child();
		c.addObserver(new Dad());
		c.addObserver(new Dog());
		c.addObserver(new Mum());
		c.wakeUp();
	} 

}
