package flyweight.observer;

import flyweight.Bullet;

public class BulletObserver extends Observer{

	@Override
   public void onBulletUseAction(BulletUseEvent e) {
		// TODO Auto-generated method stub
		new Thread(()->{
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Bullet b = (Bullet) e.getSource();
			System.out.println("Bullet:"+b.getUUID()+" has flown 0.5 second.");
			b.setStatus(false);
		}
			).start();
	}
	

}
