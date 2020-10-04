package observer;

import java.util.ArrayList;
import java.util.List;

public class Child {
	
	private List<Observer> list;
	private boolean isCrying;
	public Child() {
		isCrying =false;
		list = new ArrayList<Observer>(10); 
	}
	public void addObserver(Observer o) {
		list.add(o);
	}
	public void wakeUp() {
		System.out.println("Crying...");
		isCrying =true;
		WakeupEvent event = new WakeupEvent("bed",this);
		for(Observer o :list) {
			o.onWakeupAction(event);
		}
		
	}
}
