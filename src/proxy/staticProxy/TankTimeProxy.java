package proxy.staticProxy;

import proxy.Movable;

public class TankTimeProxy implements Movable {

	Movable m;
	public TankTimeProxy(Movable m) {
		this.m = m;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		Long t1 = System.currentTimeMillis();
		m.move();
		Long t2 = System.currentTimeMillis();
		System.out.println("The tank has moved "+(t2-t1)+" ms");
	}

}
