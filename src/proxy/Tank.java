package proxy;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Tank implements Movable{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		try {
			TimeUnit.SECONDS.sleep(new Random().nextInt(5));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Tank moving...");
	}

}
