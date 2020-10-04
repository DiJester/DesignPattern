package observer;

public class Dog extends Observer {

	public void bark() {
		System.out.println("Wang~Wang~....");
	}
	@Override
	public void onWakeupAction(Event e) {
		// TODO Auto-generated method stub
		bark();
	}

}
