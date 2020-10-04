package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import proxy.Movable;
import proxy.Tank;

public class DynamicProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//如果不实现接口，jdk的动态代理实现不了
        Tank t = new Tank();
        
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(), 
        		new Class[] {Movable.class}, new LogHandler(t));
        
        m.move();
        
        Movable m1 = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(), 
        		new Class[] {Movable.class}, new TimeHandler(t));
        
        m1.move();
        
	}

}

class LogHandler implements InvocationHandler{

	Movable movable;
	
	public LogHandler(Movable m)
	{
		movable = m;
	}
	void before() {
		System.out.println("Logging start...");
	}
	void after() {
		System.out.println("Logging end...");
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		before();
		Object o = method.invoke(movable, args);
		//method是move()方法，传的是tank的引用因此是tank.move()
		                                         
		after();
		return o;
	}
	
}
class TimeHandler implements InvocationHandler{
	Movable movable;

	public TimeHandler(Movable m)
	{
		movable = m;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Long t1 = System.currentTimeMillis();
		Object o = method.invoke(movable, args);
		Long t2 = System.currentTimeMillis();
	    System.out.println("The tank has moved "+(t2-t1)+" ms.");
		return o;
	}
	
}
