package factory.factoryMethod;

import factory.factoryProduct.Car;
import factory.factoryProduct.Movable;
import factory.factoryProduct.Plane;
import factory.simpleFactory.SimpleVehicleFactory;

public class FactoryMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      
	       Movable  m  = new CarFactory().create();
	       m.move();
	       m  = new PlaneFactory().create();
	       m.move();
	}

}
