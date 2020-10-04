package factory.simpleFactory;

import factory.factoryProduct.Car;
import factory.factoryProduct.Plane;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SimpleVehicleFactory factory = new SimpleVehicleFactory();
       Car  c  = factory.createCar();
       Plane p = factory.createPlane();
       c.move();
       p.move();
	}

}
