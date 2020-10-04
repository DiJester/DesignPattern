package observer;

public class Dad extends Observer{

	public void feed() {
		System.out.println("Feeding....");
	}
	@Override
	public void onWakeupAction(Event e) {
		// TODO Auto-generated method stub
		feed();
	}

}
