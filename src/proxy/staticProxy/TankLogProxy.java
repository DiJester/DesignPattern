package proxy.staticProxy;

import proxy.Movable;

public class TankLogProxy implements Movable {

	//����Ķ���ĳ�Movable������ģʽԽ��Խ��decoratorģʽ��
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
