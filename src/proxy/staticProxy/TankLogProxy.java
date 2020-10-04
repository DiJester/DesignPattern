package proxy.staticProxy;

import proxy.Movable;

public class TankLogProxy implements Movable {

	//代理的对象改成Movable，代理模式越来越像decorator模式了
	Movable m;
	public TankLogProxy(Movable m) {
		this.m = m;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Start logging...");
		m.move();
		Long t2 = System.currentTimeMillis();
		System.out.println("End logging...");
	}

}
