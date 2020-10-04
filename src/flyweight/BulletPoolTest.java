package flyweight;

public class BulletPoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         BulletPool bp = new BulletPool();
         while(true) {
         for(int i=0;i<10;i++)
         {
        	 bp.getBullet().useBullet();
        	 try {
				Thread.currentThread().sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }
         }
	}

}
