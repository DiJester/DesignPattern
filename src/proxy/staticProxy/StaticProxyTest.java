package proxy.staticProxy;

import proxy.Tank;

public class StaticProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Tank t = new Tank();
        TankTimeProxy timeproxy  = new TankTimeProxy(t);
        TankLogProxy logproxy  = new TankLogProxy(timeproxy);
        logproxy.move();
	}

}
