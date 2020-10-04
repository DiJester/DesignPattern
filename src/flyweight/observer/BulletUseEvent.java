package flyweight.observer;

import flyweight.Bullet;
import observer.Child;
import observer.Event;

public class BulletUseEvent extends Event{
	public BulletUseEvent(String loc, Bullet source) {
		this.setTimeStamp(System.currentTimeMillis());
		this.setLoc(loc);
		this.setSource(source);
	}

}
