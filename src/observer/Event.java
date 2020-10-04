package observer;

import java.security.Timestamp;

public abstract class Event {
     long timestamp;
     String loc;
     Object source;
    
    public Object getSource() {
    	return source;
    };
    public long getTimeStamp() {
    	return timestamp;
    }
    public String getLoc() {
    	return loc;
    }
    public void setSource(Object source) {
    	this.source = source;
    };
    public void setTimeStamp(long timeStamp) {
    	this.timestamp=timeStamp;
    }
    public void setLoc(String loc) {
    	this.loc=loc;
    }
}
