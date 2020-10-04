package observer;

public class WakeupEvent extends Event {
	public WakeupEvent(String loc, Child source) {
		this.timestamp = System.currentTimeMillis();
		this.loc = loc;
		this.source = source;
	}
	

}
