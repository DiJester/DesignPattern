package flyweight;

import java.util.UUID;

import flyweight.observer.BulletObserver;
import flyweight.observer.BulletUseEvent;
import flyweight.observer.Observer;

public class Bullet {
	  public static Observer bulletObserver = new BulletObserver();
      public UUID id;
      public boolean isAlive;
      public Bullet() {
    	  id = UUID.randomUUID();
    	  isAlive = false;
    	  System.out.println("Bullet:"+id+" produced.");
      }
      public String toString(){
    	  return "UUID: "+id+" isAlive: "+isAlive;
      }
      public boolean useBullet(){
    	  if(this.isAlive==false)
    	  {
    		  this.isAlive=true;
    		  BulletUseEvent useEvent = new BulletUseEvent("AK-47",this);
    		  bulletObserver.onBulletUseAction(useEvent);
    		  return true;
    	  }
    	  else
    		  return false;
      }
      public boolean getStatus() {
    		  return isAlive;
      }
      public void setStatus(boolean b) {
    		 isAlive = b;
      }
      public UUID getUUID() {
    		  return id;
      }
}
