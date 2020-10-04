package factory.factoryMethod;

import factory.factoryProduct.Plane;

public class PlaneFactory {
	public Plane create() {
		System.out.println("A plane is created.");
		return new Plane();
	}
}
