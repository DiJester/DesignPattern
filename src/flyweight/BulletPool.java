package flyweight;

import java.util.ArrayList;
import java.util.List;

public class BulletPool {
  
	public List<Bullet> list;
	
	public BulletPool() {
		list = new ArrayList<Bullet>();
		for(int i = 0; i<5 ;i++)
		{
			list.add(new Bullet());
		}
	}
	public Bullet getBullet()
	{
		for(Bullet bullet:list)
		{
			if(!bullet.isAlive)
			{
				return bullet;
			}
		}
		Bullet b = new Bullet();
		list.add(b);
		return b;
	}
	
	public void updateBulletsStatus()
	{
		for(Bullet bullet:list)
		{
			if(bullet.isAlive)
				bullet.isAlive=false;
		}
	}
}
