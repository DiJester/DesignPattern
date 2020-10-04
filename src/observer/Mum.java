package observer;

public class Mum extends Observer{

	public void hug() {
		System.out.println("Hug and kiss....");
	}
	@Override
	public void onWakeupAction(Event e) {
		// TODO Auto-generated method stub
		hug();
		
	}

}
