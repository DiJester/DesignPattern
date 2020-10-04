package factory.simpleFactory;

import factory.factoryProduct.Car;
import factory.factoryProduct.Plane;

//简单工厂的可扩展性不好
public class SimpleVehicleFactory {
     public Car createCar() {
    	 return new Car();
     };
     
     public Plane createPlane() {
    	 return new Plane();
     };
}
